package com.alfajores.services;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.repositories.AlfajorRepository;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Slice;
import org.springframework.data.domain.Sort;
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
    public Alfajor getFirstAlfajorByName(String alfajor) {
        List<Alfajor> alfajorInRep = alfajorRepository.findAlfajoresByName(alfajor);
        if (alfajorInRep.size() > 0 && !"".equals(alfajor.trim())) {
            return alfajorInRep.get(0);
        }
        return null;
    }
}
