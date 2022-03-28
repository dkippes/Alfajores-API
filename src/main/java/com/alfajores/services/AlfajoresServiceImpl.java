package com.alfajores.services;

import com.alfajores.validations.exceptions.AlfajorNotFoundException;
import com.alfajores.models.dtos.mappers.AlfajorMapper;
import com.alfajores.models.dtos.request.RequestAlfajorDTO;
import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.entities.Categoria;
import com.alfajores.models.entities.Imagen;
import com.alfajores.repositories.AlfajorRepository;
import com.alfajores.services.interfaces.AlfajoresService;
import com.alfajores.services.interfaces.CategoriaService;
import com.alfajores.services.interfaces.ImagenService;
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
    public Alfajor getFirstAlfajorByName(String alfajor) throws AlfajorNotFoundException {
        List<Alfajor> alfajorInRep = alfajorRepository.findAlfajoresByName(alfajor);
        if (alfajorInRep.size() > 0 && !"".equals(alfajor.trim())) {
            return alfajorInRep.get(0);
        }
        throw new AlfajorNotFoundException("No se encontro el alfajor: " + alfajor);
    }

    @Override
    public Alfajor addAlfajor(RequestAlfajorDTO alfajorRequest) {
        Categoria categoria = categoriaService.getCategoria(alfajorRequest.getCategoria());
        List<Imagen> imagenes = imagenService.addImagen(alfajorRequest.getImagenes());
        Alfajor alfajor = AlfajorMapper.toEntity(alfajorRequest, categoria, imagenes);
        return alfajorRepository.save(alfajor);
    }
}
