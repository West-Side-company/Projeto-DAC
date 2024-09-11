package br.edu.ifpb.exemplosjpa;

import javax.persistence.*;
import java.util.Date;

@Entity
public class OSStatus {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @ManyToOne
    @JoinColumn(name = "ordem_servico_id")
    private OrdemDeServico ordemDeServico;

    @ManyToOne
    @JoinColumn(name = "status_id")
    private Status status;

    private Date data;
    private String descricao;

    // Getters e setters
}