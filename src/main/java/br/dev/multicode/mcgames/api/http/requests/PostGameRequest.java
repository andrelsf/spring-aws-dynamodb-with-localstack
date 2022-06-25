package br.dev.multicode.mcgames.api.http.requests;

import java.math.BigDecimal;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@AllArgsConstructor
@NoArgsConstructor
public class PostGameRequest {

  private String name;
  private String description;
  private String platform;
  private BigDecimal price;

}
