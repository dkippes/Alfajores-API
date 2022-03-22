package com.alfajores.services;

import com.alfajores.models.entities.Categoria;
import com.alfajores.models.repositories.CategoriaRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class CategoriaServiceImpl implements CategoriaService {
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria getCategoria(Long id) {
        return categoriaRepository.getById(id);
    }
}
