package com.alfajores.services;

import com.alfajores.models.entities.Imagen;
import com.alfajores.repositories.ImagenRepository;
import com.alfajores.services.interfaces.ImagenService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
@AllArgsConstructor
public class ImagenServiceImpl implements ImagenService {
    private ImagenRepository imagenRepository;

    @Override
    public Imagen getImagen(Long id) {
        return imagenRepository.getById(id);
    }

    @Override
    public List<Imagen> getImagenes() {
        return imagenRepository.findAll();
    }

    @Override
    public List<Imagen> addImagen(List<String> images) {
        List<Imagen> imagens = new ArrayList<>();
        images.forEach(i -> {
            Imagen im = new Imagen();
            im.setName(i);
            imagens.add(im);
        });
        return imagenRepository.saveAll(imagens);
    }
}
