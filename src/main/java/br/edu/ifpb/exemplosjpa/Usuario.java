package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;
import java.util.List;

@Entity
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    
    private String nome;
    private String cargo;
    private String telefone;
    private String perfil;

    // Getters e setters
}
