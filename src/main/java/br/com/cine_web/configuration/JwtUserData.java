package br.com.cine_web.configuration;

import lombok.Builder;

@Builder
public record JwtUserData(
        Long id,
        String name,
        String email
) {
}
