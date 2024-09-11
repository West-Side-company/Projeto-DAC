package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;

@Entity
public class Local {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String tipo;
    private String bloco;
    private String sala;
    private String endereco;
    private String pontoDeReferencia;

    // Getters e setters
}
