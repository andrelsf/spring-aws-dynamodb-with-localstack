package br.dev.multicode.mcgames.api.http.responses;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class GameResponse {

  private String gameId;
  private String name;
  private String description;
  private String platform;
  private BigDecimal price;

}
