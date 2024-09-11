package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;

@Entity
public class OSTipo {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemDeServico ordemDeServico;

    @ManyToOne
    @JoinColumn(name = "tipo_servico_id")
    private TipoDeServico tipoDeServico;

    // Getters e setters
}