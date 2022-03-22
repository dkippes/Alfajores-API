package com.alfajores.models.entities;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

import javax.persistence.*;

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

    @ManyToOne
    private Categoria categoria;
}
