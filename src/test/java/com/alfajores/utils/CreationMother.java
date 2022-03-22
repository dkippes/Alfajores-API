package com.alfajores.utils;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.entities.Categoria;

public class CreationMother {
    public static Alfajor createAlfajor() {
        return Alfajor.builder()
                .id(1L)
                .name("Jorgito")
                .description("Es muy rico")
                .weight(100)
                .price(150)
                .categoria(createCategoria(1L, "Dulce de leche", ""))
                .build();
    }

    public static Categoria createCategoria(Long id, String name, String description) {
        return Categoria.builder()
                .id(id)
                .name(name)
                .description(description)
                .build();
    }
}
