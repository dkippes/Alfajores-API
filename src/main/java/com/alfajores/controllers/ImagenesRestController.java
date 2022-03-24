package com.alfajores.controllers;

import com.alfajores.models.entities.Imagen;
import com.alfajores.services.ImagenService;
import lombok.AllArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/imagenes")
@AllArgsConstructor
public class ImagenesRestController {
    private ImagenService imagenService;

    @GetMapping
    public ResponseEntity<?> getImagenes() {
        return new ResponseEntity<List<Imagen>>(imagenService.getImagenes(), HttpStatus.OK);
    }
}
