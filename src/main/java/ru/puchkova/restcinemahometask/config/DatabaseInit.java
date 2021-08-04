package ru.puchkova.restcinemahometask.config;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ru.puchkova.restcinemahometask.data.entity.MovieEntity;
import ru.puchkova.restcinemahometask.data.repository.MovieRepository;

@Configuration
public class DatabaseInit {

    private static final Logger log = LoggerFactory.getLogger(DatabaseInit.class);

    @Bean
    CommandLineRunner initDatabase(MovieRepository repository) {

        return args -> {
            log.info("Insert " + repository.save(
                        new MovieEntity("The Lord of the Rings: The Fellowship of the Ring", "2001", "First movie")
            ));
            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Two Towers", "2002", "Second movie")
            ));
            log.info("Insert " + repository.save(
                    new MovieEntity("The Lord of the Rings: The Return of the King", "2003", "Third movie")
            ));
        };
    }
}
