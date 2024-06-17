package com.example.demo;


import org.springframework.data.jpa.repository.JpaRepository;
import java.util.List;

public interface DiscoRepository extends JpaRepository<Disco, Long> {
    List<Disco> findByArtista(String artista);
    List<Disco> findByAnoLancamento(int anoLancamento);
}
