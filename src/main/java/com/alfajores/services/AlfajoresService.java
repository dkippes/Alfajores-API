package com.alfajores.services;

import com.alfajores.models.entities.Alfajor;

import java.util.List;

public interface AlfajoresService {
    List<Alfajor> getAllAlfajores();

    Alfajor getAlfajorByName(String alfajor);
}
