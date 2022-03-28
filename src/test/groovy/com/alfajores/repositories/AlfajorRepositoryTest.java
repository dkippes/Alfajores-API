package com.alfajores.repositories;

import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.orm.jpa.DataJpaTest;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.jupiter.api.Assertions.assertNotNull;

@RunWith(SpringRunner.class)
@DataJpaTest
class AlfajorRepositoryTest {
    
    @Autowired
    private AlfajorRepository alfajorRepository;

    @Test
    public void should_find_all_alfajores() {
        assertNotNull(alfajorRepository.findAlfajorByName("Jorgito"));
    }
}