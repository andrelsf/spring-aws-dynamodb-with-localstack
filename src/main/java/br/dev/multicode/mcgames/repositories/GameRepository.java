package br.dev.multicode.mcgames.repositories;

import br.dev.multicode.mcgames.entities.Game;
import org.socialsignin.spring.data.dynamodb.repository.EnableScan;
import org.springframework.data.repository.CrudRepository;

@EnableScan
public interface GameRepository extends CrudRepository<Game, String> {

}
