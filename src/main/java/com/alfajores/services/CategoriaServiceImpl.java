package com.alfajores.services;

import com.alfajores.models.entities.Categoria;
import com.alfajores.models.repositories.CategoriaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CategoriaServiceImpl implements CategoriaService {

    @Autowired
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria getCategoria(Long id) {
        return categoriaRepository.getById(id);
    }
}
