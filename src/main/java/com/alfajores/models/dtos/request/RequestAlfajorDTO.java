package com.alfajores.models.dtos.request;

import com.alfajores.models.entities.Categoria;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestAlfajorDTO {
    private String name;
    private String description;
    private Integer weight;
    private Integer price;
    private Long categoria;
    private List<String> imagenes;
}
