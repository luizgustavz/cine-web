package br.com.cine_web.resource;

import br.com.cine_web.domain.Streaming;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

@RequestMapping("/api/streaming")
public interface IStreamingResource {

    @PostMapping("/register")
    ResponseEntity<Void> register(@RequestBody Streaming streaming);

    @GetMapping("/{id}")
    ResponseEntity<Streaming> findById(@PathVariable Long id);
}
