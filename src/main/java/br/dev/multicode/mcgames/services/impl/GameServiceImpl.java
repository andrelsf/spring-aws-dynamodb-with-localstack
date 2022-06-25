package br.dev.multicode.mcgames.services.impl;

import br.dev.multicode.mcgames.api.http.requests.PostGameRequest;
import br.dev.multicode.mcgames.api.http.responses.GameResponse;
import br.dev.multicode.mcgames.entities.Game;
import br.dev.multicode.mcgames.mappers.DataMapper;
import br.dev.multicode.mcgames.repositories.GameRepository;
import br.dev.multicode.mcgames.services.GameService;
import com.amazonaws.services.kms.model.NotFoundException;
import java.util.UUID;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@RequiredArgsConstructor
public class GameServiceImpl implements GameService {

  private final GameRepository gameRepository;

  private Game getById(String gameId) {
    return gameRepository.findById(gameId)
      .orElseThrow(() ->
          new NotFoundException("Game not found by ID=".concat(gameId)));
  }

  @Override
  public GameResponse getGameById(UUID gameId) {
    return DataMapper.entityToResponse(getById(gameId.toString()));
  }

  @Override
  public String create(PostGameRequest postGameRequest) {
    return gameRepository.save(DataMapper.buildEntity(postGameRequest))
        .getGameId();
  }
}
