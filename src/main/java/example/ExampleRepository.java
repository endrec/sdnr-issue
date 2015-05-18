package example;

import org.springframework.data.neo4j.repository.GraphRepository;

/**
 * @author Endre Czirbesz <endre.czirbesz@rungway.com>
 */
public interface ExampleRepository extends GraphRepository<ExampleEntity> {
}
