package br.com.cine_web.usecase;

import br.com.cine_web.domain.Streaming;

import java.util.List;

public interface IStreamingUsecase {

    Streaming register(Streaming streaming);

    Streaming findById(Long id);

    List<Streaming> findAll();

    void dropById(Long id);
}
