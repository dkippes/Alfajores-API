package com.alfajores.services;

import com.alfajores.models.dtos.request.RequestAlfajorDTO;
import com.alfajores.models.entities.Alfajor;

import java.util.List;

public interface AlfajoresService {
    List<Alfajor> getAllAlfajores();
    Alfajor getFirstAlfajorByName(String alfajor);
    Alfajor addAlfajor(RequestAlfajorDTO alfajor);
}
