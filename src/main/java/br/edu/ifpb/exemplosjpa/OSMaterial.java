package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;

@Entity
public class OSMaterial {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemDeServico ordemDeServico;

    @ManyToOne
    @JoinColumn(name = "material_id")
    private Material material;

    private int quantidade;

    // Getters e setters
}