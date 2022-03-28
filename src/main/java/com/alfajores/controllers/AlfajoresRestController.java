package com.alfajores.controllers;

import com.alfajores.exceptions.AlfajorNotFoundException;
import com.alfajores.models.dtos.request.RequestAlfajorDTO;
import com.alfajores.models.entities.Alfajor;
import com.alfajores.services.AlfajoresService;
import lombok.AllArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/api/alfajores")
@AllArgsConstructor
public class AlfajoresRestController {
    private AlfajoresService alfajoresService;

    @GetMapping
    public ResponseEntity<?> getAllAlfajores() {
        return new ResponseEntity<List<Alfajor>>(alfajoresService.getAllAlfajores(), HttpStatus.OK);
    }

    @GetMapping("/search")
    public ResponseEntity<?> getAlfajorByName(@RequestParam String alfajor) throws AlfajorNotFoundException {
        return new ResponseEntity<Alfajor>(alfajoresService.getFirstAlfajorByName(alfajor), HttpStatus.OK);
    }

    @PostMapping
    public ResponseEntity<?> addAlfajor(@Valid @RequestBody RequestAlfajorDTO alfajor) {
        return new ResponseEntity<Alfajor>(alfajoresService.addAlfajor(alfajor), HttpStatus.OK);
    }
}
