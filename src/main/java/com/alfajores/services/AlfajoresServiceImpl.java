package com.alfajores.services;

import com.alfajores.models.dtos.request.RequestAlfajorDTO;
import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.entities.Categoria;
import com.alfajores.models.entities.Imagen;
import com.alfajores.models.repositories.AlfajorRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
@AllArgsConstructor
public class AlfajoresServiceImpl implements AlfajoresService {
    private AlfajorRepository alfajorRepository;
    private CategoriaService categoriaService;
    private ImagenService imagenService;

    @Override
    public List<Alfajor> getAllAlfajores() {
        return alfajorRepository.findAll();
    }

    @Override
    public Alfajor getFirstAlfajorByName(String alfajor) {
        List<Alfajor> alfajorInRep = alfajorRepository.findAlfajoresByName(alfajor);
        if (alfajorInRep.size() > 0 && !"".equals(alfajor.trim())) {
            return alfajorInRep.get(0);
        }
        return null;
    }

    @Override
    public Alfajor addAlfajor(RequestAlfajorDTO alfajorRequest) {
        Categoria categoria = categoriaService.getCategoria(alfajorRequest.getCategoria());
        List<Imagen> imagenes = imagenService.addImagen(alfajorRequest.getImagenes());
        Alfajor alfajor = Alfajor.builder()
                .name(alfajorRequest.getName())
                .description(alfajorRequest.getDescription())
                .price(alfajorRequest.getPrice())
                .weight(alfajorRequest.getWeight())
                .categoria(categoria)
                .imagenes(imagenes)
                .build();
        return alfajorRepository.save(alfajor);
    }
}
