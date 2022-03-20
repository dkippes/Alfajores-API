package com.alfajores.services;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.repositories.AlfajorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AlfajoresServiceImpl implements AlfajoresService {

    @Autowired
    private AlfajorRepository alfajorRepository;

    @Autowired
    private CategoriaService categoriaService;

    @Override
    public List<Alfajor> getAllAlfajores() {
        return alfajorRepository.findAll();
    }
}
