package com.example;

import io.micronaut.data.annotation.GeneratedValue;
import io.micronaut.data.annotation.Id;
import io.micronaut.data.annotation.MappedEntity;
import io.micronaut.data.annotation.TypeDef;
import io.micronaut.data.jdbc.annotation.JdbcRepository;
import io.micronaut.data.model.DataType;
import io.micronaut.data.model.query.builder.sql.Dialect;
import io.micronaut.data.repository.PageableRepository;
import io.micronaut.test.extensions.junit5.annotation.MicronautTest;
import org.junit.jupiter.api.Test;

import static org.assertj.core.api.Assertions.assertThat;

@MicronautTest(startApplication = false, rollback = false)
class SomeTest {

    @Test
    void someTest(Repo repo) {

        // Succeeds!
        assertThat(repo.save(new Ent(null, new String[0])).getStrings())
            .isEmpty();

        // FIXME: Fails!!!
        assertThat(repo.findById(1L).orElse(null).getStrings())
            .withFailMessage("Empty array e.g. '{}' in 'strings' column should have been extracted as Java String[0], but instead interpreted as single value array with string '{}'")
            .isEmpty();
    }
}
