package com.example.biblioteca.model.entities;

import jakarta.persistence.*;
import lombok.*;

@Entity
@Table(name = "livro")
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
@EqualsAndHashCode(of = "id")
public class Livro {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    private String titulo;
    private String autor;
    private String editora;
    private Integer ano;
}
