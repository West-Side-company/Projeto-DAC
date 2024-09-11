package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;

@Entity
public class OSFerramenta {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemDeServico ordemDeServico;

    @ManyToOne
    @JoinColumn(name = "ferramenta_id")
    private Ferramenta ferramenta;

    private int quantidade;

    // Getters e setters
}
