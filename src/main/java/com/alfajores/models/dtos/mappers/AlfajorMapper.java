package com.alfajores.models.dtos.mappers;

import com.alfajores.models.dtos.request.RequestAlfajorDTO;
import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.entities.Categoria;
import com.alfajores.models.entities.Imagen;

import java.util.List;

public class AlfajorMapper {
    public static Alfajor toEntity(RequestAlfajorDTO alfajorDTO, Categoria categoria, List<Imagen> imagenes) {
        return Alfajor.builder()
                .name(alfajorDTO.getName())
                .description(alfajorDTO.getDescription())
                .price(alfajorDTO.getPrice())
                .weight(alfajorDTO.getWeight())
                .categoria(categoria)
                .imagenes(imagenes)
                .build();
    }
}
