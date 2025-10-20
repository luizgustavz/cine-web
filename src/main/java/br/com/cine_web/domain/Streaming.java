package br.com.cine_web.domain;

import jakarta.persistence.*;

@Entity
@Table(name = "tb_streaming")
public class Streaming {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
}
