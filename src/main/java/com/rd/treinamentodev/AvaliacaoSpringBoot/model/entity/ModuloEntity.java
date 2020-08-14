package com.rd.treinamentodev.AvaliacaoSpringBoot.model.entity;


import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name="TB_MODULO")
@Data
public class ModuloEntity {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "ID_MODULO")
    private Long idModulo;

    @Column(name = "DS_NOME")
    private String nome;

    @ManyToOne(cascade = CascadeType.ALL)
    @JoinColumn(name = "ID_INSTRUTOR")
    private Long idInstrutor;

}
