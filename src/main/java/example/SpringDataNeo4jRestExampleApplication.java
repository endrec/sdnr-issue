package example;

import de.svenjacobs.loremipsum.LoremIpsum;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.transaction.annotation.Transactional;

@SpringBootApplication
public class SpringDataNeo4jRestExampleApplication implements CommandLineRunner {

    @Autowired
    ExampleRepository exampleRepository;

    public static void main(String[] args) {
        SpringApplication.run(SpringDataNeo4jRestExampleApplication.class, args);
    }

    @Override
    @Transactional
    public void run(String... args) throws Exception {
        ExampleEntity example = new ExampleEntity();

        example.setDescription(new LoremIpsum().getWords(1));

        exampleRepository.save(example);
    }

}
