package com.alfajores.models.repositories;

import com.alfajores.models.entities.Alfajor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

@Repository
public interface AlfajorRepository extends JpaRepository<Alfajor, Long> {

    @Query("SELECT a FROM Alfajor a WHERE a.name=?1")
    Alfajor findAlfajorByName(String alfajor);
}
