package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;

@Entity
public class OSFuncionario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemDeServico ordemDeServico;

    @ManyToOne
    @JoinColumn(name = "usuario_id")
    private Usuario usuario;

    // Getters e setters
}
