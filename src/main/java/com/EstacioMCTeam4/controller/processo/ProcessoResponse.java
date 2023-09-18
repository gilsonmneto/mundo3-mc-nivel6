package com.EstacioMCTeam4.controller.processo;

import com.EstacioMCTeam4.controller.parte.ParteResponse;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import java.time.LocalDateTime;
import java.util.Set;
import lombok.*;

@NoArgsConstructor
@AllArgsConstructor
@Builder
@Getter
@Setter
public class ProcessoResponse {

  private Long id;

  private String numero;

  @JsonIgnoreProperties({"processo"})
  private Set<ParteResponse> partes;

  private LocalDateTime dataHoraCriacao;
}