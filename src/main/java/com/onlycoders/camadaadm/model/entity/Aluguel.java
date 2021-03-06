package com.onlycoders.camadaadm.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

@Entity
@Getter
@Setter
@NoArgsConstructor
public class Aluguel {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @ManyToOne
    private Usuario locatario;
    @ManyToOne
    private Produto produto;
    private Date dataInicio;
    private Date dataFim;
    private Date dataSaque;
}
