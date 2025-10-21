package br.com.cine_web.configuration;

import br.com.cine_web.domain.User;
import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;
import com.auth0.jwt.exceptions.JWTVerificationException;
import com.auth0.jwt.interfaces.DecodedJWT;
import org.springframework.stereotype.Component;

import java.time.Instant;
import java.util.Optional;

@Component
public class TokenConfiguration {

    private final String SECRET = "034dce3f7730ad7db77c40adcabd89102f60b10fcb167783f4e20e3ca2933582";

    public String generatedToken(User user){

        Algorithm algorithm = Algorithm.HMAC256(SECRET);
        return JWT
                .create()
                .withSubject(user.getEmail())
                .withClaim("userId", user.getId())
                .withExpiresAt(Instant.now().plusSeconds(80000))
                .withIssuedAt(Instant.now())
                .sign(algorithm);
    }

    public Optional<JwtUserData> validateToken(String token){

        try {
            Algorithm algorithm = Algorithm.HMAC256(SECRET);

            DecodedJWT jwt = JWT.require(algorithm)
                    .build()
                    .verify(token);

            return Optional.of(JwtUserData
                    .builder()
                    .id(jwt.getClaim("userId").asLong())
                    .email(jwt.getSubject())
                    .build());
        } catch (JWTVerificationException e){
            return Optional.empty();
        }


    }
}
