package br.dev.multicode.mcgames.services;

import br.dev.multicode.mcgames.api.http.requests.PostGameRequest;
import br.dev.multicode.mcgames.api.http.responses.GameResponse;
import java.util.UUID;

public interface GameService {

  GameResponse getGameById(UUID gameId);
  String create(PostGameRequest postGameRequest);

}
