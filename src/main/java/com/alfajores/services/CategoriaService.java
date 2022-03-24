package com.alfajores.services;

import com.alfajores.models.entities.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria getCategoria(Long id);
    List<Categoria> getCategorias();
}
