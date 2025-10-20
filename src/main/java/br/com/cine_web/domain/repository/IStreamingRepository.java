package br.com.cine_web.domain.repository;

import br.com.cine_web.domain.Streaming;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IStreamingRepository extends JpaRepository<Streaming, Long> {
}
