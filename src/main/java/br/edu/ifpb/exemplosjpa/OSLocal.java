package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;

@Entity
public class OSLocal {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemDeServico ordemDeServico;

    @ManyToOne
    @JoinColumn(name = "local_id")
    private Local local;

    // Getters e setters
}
