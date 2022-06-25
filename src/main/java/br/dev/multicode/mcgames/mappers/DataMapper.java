package br.dev.multicode.mcgames.mappers;

import br.dev.multicode.mcgames.api.http.requests.PostGameRequest;
import br.dev.multicode.mcgames.api.http.responses.GameResponse;
import br.dev.multicode.mcgames.entities.Game;
import br.dev.multicode.mcgames.entities.Platform;
import java.time.ZonedDateTime;
import java.util.UUID;
import org.apache.commons.lang3.NotImplementedException;

public class DataMapper {

  public DataMapper() {
    throw new NotImplementedException("Class only with methods static. :)");
  }

  public static GameResponse entityToResponse(Game game) {
    return GameResponse.builder()
      .gameId(game.getGameId())
      .name(game.getName())
      .description(game.getDescription())
      .platform(game.getDescription())
      .price(game.getPrice())
      .build();
  }

  public static Game buildEntity(PostGameRequest postGameRequest) {
    Game game = new Game();

    game.setGameId(UUID.randomUUID().toString());
    game.setName(postGameRequest.getName());
    game.setDescription(postGameRequest.getDescription());
    game.setPlatform(Platform.valueOf(postGameRequest.getPlatform()));
    game.setPrice(postGameRequest.getPrice());
    game.setCreatedAt(ZonedDateTime.now().toString());
    game.setUpdatedAt(ZonedDateTime.now().toString());

    return game;
  }
}
