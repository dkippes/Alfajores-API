package com.alfajores.services.interfaces;

import com.alfajores.models.entities.Categoria;

import java.util.List;

public interface CategoriaService {
    Categoria getCategoria(Long id);
    List<Categoria> getCategorias();
}
