package example;

import lombok.Data;
import org.springframework.data.neo4j.annotation.GraphId;
import org.springframework.data.neo4j.annotation.Indexed;
import org.springframework.data.neo4j.annotation.NodeEntity;
import org.springframework.data.neo4j.support.index.IndexType;

/**
 * @author Endre Czirbesz <endre.czirbesz@rungway.com>
 */
@Data
@NodeEntity
public class ExampleEntity {
    @GraphId
    private Long id;

    @Indexed(indexType = IndexType.FULLTEXT, indexName = "idx_desc")
    private String description;
}
