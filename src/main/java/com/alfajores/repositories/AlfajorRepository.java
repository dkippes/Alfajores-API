package com.alfajores.repositories;

import com.alfajores.models.entities.Alfajor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface AlfajorRepository extends JpaRepository<Alfajor, Long> {

    @Query("SELECT a FROM Alfajor a WHERE a.name LIKE %?1%")
    List<Alfajor> findAlfajoresByName(String alfajor);
}
