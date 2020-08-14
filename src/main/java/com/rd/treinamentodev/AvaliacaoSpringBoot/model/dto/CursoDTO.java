package com.rd.treinamentodev.AvaliacaoSpringBoot.model.dto;

import lombok.Data;

@Data
public class CursoDTO {

    private Long idCurso;

    private String nome;

    private Integer cargaHoraria;
}
