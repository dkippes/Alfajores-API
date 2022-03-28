package com.alfajores.models.dtos.request;

import com.alfajores.models.entities.Categoria;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.validation.Valid;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import java.util.List;

@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class RequestAlfajorDTO {
    @NotNull(message = "El nombre del alfajor no puede ser nulo")
    private String name;

    @NotNull(message = "El nombre del alfajor no puede ser nulo")
    private String description;

    private Integer weight;
    private Integer price;
    private Long categoria;

    @NotEmpty(message = "Tiene que al menos 1 imagen")
    private List<String> imagenes;
}
