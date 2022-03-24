package com.alfajores.services;

import com.alfajores.models.entities.Imagen;
import com.alfajores.models.repositories.ImagenRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

@Service
@AllArgsConstructor
public class ImagenServiceImpl implements ImagenService {
    private ImagenRepository imagenRepository;

    @Override
    public Imagen getImagen(Long id) {
        return imagenRepository.getById(id);
    }
}
