package com.alfajores.models.repositories;

import com.alfajores.models.entities.Alfajor;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface AlfajorRepository extends JpaRepository<Alfajor, Long> {
}
