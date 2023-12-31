package com.EstacioMCTeam4.controller.parte;

import com.EstacioMCTeam4.controller.processo.ProcessoResponse;
import com.EstacioMCTeam4.entity.EnderecoBaseCep;
import com.EstacioMCTeam4.entity.Notificacao;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.*;

import java.time.LocalDateTime;
import java.util.Set;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ParteResponse {

    private Long id;

    private String nomeCompleto;

    private String documento;

    private String email;

    private String numeroEndereco;

    private String complementoEndereco;

    @JsonIgnoreProperties({"partes"})
    private EnderecoBaseCep enderecoBaseCEP;

    @JsonIgnoreProperties({"partes"})
    private ProcessoResponse processo;

    @JsonIgnoreProperties({"parte"})
    private Set<Notificacao> notificacoes;

    private LocalDateTime dataHoraCriacao;
}
