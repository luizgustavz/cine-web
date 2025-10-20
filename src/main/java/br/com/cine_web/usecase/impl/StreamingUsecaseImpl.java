package br.com.cine_web.usecase.impl;

import br.com.cine_web.domain.Streaming;
import br.com.cine_web.domain.repository.IStreamingRepository;
import br.com.cine_web.usecase.IStreamingUsecase;
import org.springframework.stereotype.Service;

@Service
public class StreamingUsecaseImpl implements IStreamingUsecase {

    private final IStreamingRepository repository;

    public StreamingUsecaseImpl(IStreamingRepository repository) {
        this.repository = repository;
    }

    @Override
    public Streaming register(Streaming streaming) {
        return repository.save(streaming);
    }

    @Override
    public Streaming findById(Long id) {
        return repository.findById(id).orElse(null);
    }
}
