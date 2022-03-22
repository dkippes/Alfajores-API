package com.alfajores.services;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.repositories.AlfajorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlfajoresServiceImpl implements AlfajoresService {
    private AlfajorRepository alfajorRepository;
    private CategoriaService categoriaService;

    @Override
    public List<Alfajor> getAllAlfajores() {
        return alfajorRepository.findAll();
    }

    @Override
    public Alfajor getAlfajorByName(String alfajor) {
        return alfajorRepository.findAlfajorByName(alfajor);
    }
}
