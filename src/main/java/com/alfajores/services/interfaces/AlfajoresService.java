package com.alfajores.services.interfaces;

import com.alfajores.validations.exceptions.AlfajorNotFoundException;
import com.alfajores.models.dtos.request.RequestAlfajorDTO;
import com.alfajores.models.entities.Alfajor;

import java.util.List;

public interface AlfajoresService {
    List<Alfajor> getAllAlfajores();
    Alfajor getFirstAlfajorByName(String alfajor) throws AlfajorNotFoundException;
    Alfajor addAlfajor(RequestAlfajorDTO alfajor);
}
