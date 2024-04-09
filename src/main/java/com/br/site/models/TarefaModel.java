package com.br.site.models;

import jakarta.persistence.*;
import lombok.Data;


@Entity
@Table(name = "tarefa")
@Data
public class TarefaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "nomeTarefa")
    private String nomeTarefa;

    @Column(name = "observacoes")
    private String observacoes;
}
