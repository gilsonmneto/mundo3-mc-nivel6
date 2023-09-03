package com.funcionarios.MissaoCertificacaoTeam4.entity.enums;

import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public enum Cargo {
    ANALISTA("Analista"),
    TECNICO("Técnico"),
    GERENTE("Gerente"),
    DIRETOR("Diretor");

    private final String value;
}
