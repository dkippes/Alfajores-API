package com.alfajores.models.repositories;

import com.alfajores.models.entities.Categoria;
import com.alfajores.models.entities.Imagen;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ImagenRepository extends JpaRepository<Imagen, Long> {
}
