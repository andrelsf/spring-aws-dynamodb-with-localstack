package br.dev.multicode.mcgames.api.resources;

import br.dev.multicode.mcgames.api.http.requests.PostGameRequest;
import br.dev.multicode.mcgames.api.http.responses.GameResponse;
import br.dev.multicode.mcgames.services.GameService;
import java.net.URI;
import java.util.UUID;
import javax.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.util.UriComponentsBuilder;

@RestController
@RequestMapping(value = "/games",
    consumes = MediaType.APPLICATION_JSON_VALUE,
    produces = MediaType.APPLICATION_JSON_VALUE)
@RequiredArgsConstructor
public class GameResources {

  private final GameService gameService;

  @GetMapping("/{gameId}")
  public ResponseEntity<GameResponse> getGameById(@PathVariable UUID gameId)
  {
    return ResponseEntity.ok(gameService.getGameById(gameId));
  }

  @PostMapping
  public ResponseEntity<Void> postANewGame(@RequestBody @Valid PostGameRequest postGameRequest)
  {
    final String gameId = gameService.create(postGameRequest);
    final URI uriLocation = UriComponentsBuilder.fromUriString("/games/{gameId}")
        .buildAndExpand(gameId)
        .toUri();
    return ResponseEntity.status(HttpStatus.CREATED)
        .location(uriLocation)
        .build();
  }
}
