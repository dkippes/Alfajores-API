package com.alfajores.controllers;

import com.alfajores.models.entities.Alfajor;
import com.alfajores.services.AlfajoresService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/api/alfajores")
public class AlfajoresRestController {

    @Autowired
    private AlfajoresService alfajoresService;

    @GetMapping
    public ResponseEntity<?> getAllAlfajores() {
        return new ResponseEntity<List<Alfajor>>(alfajoresService.getAllAlfajores(), HttpStatus.OK);
    }
}
