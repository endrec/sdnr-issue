package example;

import org.neo4j.graphdb.GraphDatabaseService;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.neo4j.config.EnableNeo4jRepositories;
import org.springframework.data.neo4j.config.Neo4jConfiguration;
import org.springframework.data.neo4j.rest.SpringCypherRestGraphDatabase;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import java.io.IOException;

/**
 * @author Endre Czirbesz <endre.czirbesz@rungway.com>
 */
@Configuration
@EnableNeo4jRepositories(basePackages = "example")
@EnableTransactionManagement
public class Neo4JInitializer extends Neo4jConfiguration {


    public Neo4JInitializer() {
        setBasePackage("example");
    }

    @Bean
    public GraphDatabaseService graphDatabaseService() throws IOException {
        return new SpringCypherRestGraphDatabase("http://localhost:7474/db/data/", "neo4j", "1234"); // Change these parameters to your database settings
        // Embedded database works fine.
        // return new GraphDatabaseFactory().newEmbeddedDatabase(Files.createTempDirectory("graph").toString());
    }

}
