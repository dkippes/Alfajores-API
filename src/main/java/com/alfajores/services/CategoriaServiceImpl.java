package com.alfajores.services;

import com.alfajores.models.entities.Categoria;
import com.alfajores.repositories.CategoriaRepository;
import com.alfajores.services.interfaces.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaServiceImpl implements CategoriaService {
    private CategoriaRepository categoriaRepository;

    @Override
    public Categoria getCategoria(Long id) {
        return categoriaRepository.findById(1L).orElse(null);
    }

    @Override
    public List<Categoria> getCategorias() {
        return categoriaRepository.findAll();
    }
}
