package br.com.cine_web.resource.impl;

import br.com.cine_web.domain.Streaming;
import br.com.cine_web.resource.IStreamingResource;
import br.com.cine_web.usecase.impl.StreamingUsecaseImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class StreamingResourceImpl implements IStreamingResource {

    private final StreamingUsecaseImpl usecase;

    public StreamingResourceImpl(StreamingUsecaseImpl usecase) {
        this.usecase = usecase;
    }

    @Override
    public ResponseEntity<Void> register(Streaming streaming) {
        usecase.register(streaming);
        return ResponseEntity
                .status(HttpStatus.CREATED)
                .build();
    }

    @Override
    public ResponseEntity<Streaming> findById(Long id) {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(usecase.findById(id));
    }

    @Override
    public ResponseEntity<List<Streaming>> findAll() {
        return ResponseEntity
                .status(HttpStatus.OK)
                .body(usecase.findAll());
    }

    @Override
    public ResponseEntity<Void> dropById(Long id) {
        usecase.dropById(id);
        return ResponseEntity
                .status(HttpStatus.NO_CONTENT)
                .build();
    }
}
