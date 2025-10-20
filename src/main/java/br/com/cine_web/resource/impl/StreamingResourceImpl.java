package br.com.cine_web.resource.impl;

import br.com.cine_web.domain.Streaming;
import br.com.cine_web.resource.IStreamingResource;
import br.com.cine_web.usecase.impl.StreamingUsecaseImpl;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RestController;

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
}
