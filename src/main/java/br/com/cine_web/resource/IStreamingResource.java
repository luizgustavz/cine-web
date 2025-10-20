package br.com.cine_web.resource;

import br.com.cine_web.domain.Streaming;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RequestMapping("/api/streaming")
public interface IStreamingResource {

    @PostMapping("/register")
    ResponseEntity<Void> register(@RequestBody Streaming streaming);

    @GetMapping("/{id}")
    ResponseEntity<Streaming> findById(@PathVariable Long id);

    @GetMapping
    ResponseEntity<List<Streaming>> findAll();

    @DeleteMapping("/{id}")
    ResponseEntity<Void> dropById(@PathVariable Long id);

}
