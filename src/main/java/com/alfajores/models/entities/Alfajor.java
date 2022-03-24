package com.alfajores.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;
import java.util.List;

@Entity
@Table(name = "alfajores")
@Data
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class Alfajor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer weight;
    private Integer price;

    @ManyToMany
    @JoinTable(name = "alfajores_imagenes",
            joinColumns = @JoinColumn(name = "alfajor_id"),
            inverseJoinColumns = @JoinColumn(name = "imagen_id"),
            uniqueConstraints = @UniqueConstraint(columnNames = {"alfajor_id", "imagen_id"}))
    private List<Imagen> imagenes;

    @ManyToOne
    private Categoria categoria;
}
