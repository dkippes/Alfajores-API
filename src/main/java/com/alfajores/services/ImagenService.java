package com.alfajores.services;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.entities.Imagen;

import java.util.List;

public interface ImagenService {
    Imagen getImagen(Long id);
    List<Imagen> getImagenes();
}
