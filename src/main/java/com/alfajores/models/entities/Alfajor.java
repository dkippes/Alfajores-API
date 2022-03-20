package com.alfajores.models.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "alfajores")
@Data
public class Alfajor {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String name;
    private String description;
    private Integer weight;
    private Integer price;

    @ManyToOne
    private Categoria categoria;
}
