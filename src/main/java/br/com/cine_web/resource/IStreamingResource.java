package br.com.cine_web.resource;

import br.com.cine_web.domain.Streaming;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

@RequestMapping("/api/streaming")
public interface IStreamingResource {

    @PostMapping("/register")
    ResponseEntity<Void> register(@RequestBody Streaming streaming);
}
