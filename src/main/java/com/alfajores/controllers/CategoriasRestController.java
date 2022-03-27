package com.alfajores.controllers;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.models.entities.Categoria;
import com.alfajores.services.AlfajoresService;
import com.alfajores.services.CategoriaService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping("/{id}")
    public ResponseEntity<?> getCategoria(@PathVariable Long id) {
        return new ResponseEntity<Categoria>(categoriaService.getCategoria(id), HttpStatus.OK);
    }
}
