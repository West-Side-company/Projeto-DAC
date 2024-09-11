package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;

@Entity
public class Ferramenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String descricao;

    // Getters e setters
}
