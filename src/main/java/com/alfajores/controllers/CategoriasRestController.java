package com.alfajores.controllers;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.entities.Categoria;
import com.alfajores.services.AlfajoresService;
import com.alfajores.services.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/categorias")
@AllArgsConstructor
public class CategoriasRestController {
    private CategoriaService categoriaService;

    @GetMapping
    public ResponseEntity<?> getAllCategorias() {
        return new ResponseEntity<List<Categoria>>(categoriaService.getCategorias(), HttpStatus.OK);
    }
}
