/* ########################## ENTIDADE DE USUÁRIO ##########################
 * Data Criação: 14/06/2020
 * Programador: Dilan Lima
 * Decrição: Entidade que mapea a tabela de usuários
 * #########################################################################
  */

package com.onlycoders.camadaadm.model.entity;

import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import javax.persistence.*;
import java.util.Date;

/*o @Entity diz que esta classe é uma entidade*/
/*o @Getter e @Setter gera automaticamente os métodos básicos em tempo de execução*/
/*o @NoArgsConstructor diz que o método construtor não possui parâmetros*/
@Entity
@Getter@Setter
@NoArgsConstructor
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    @Column
    private String login;

    @Column
    private String senha;

    @Column
    private String nome;

    @Column
    private String cpf;

    @Column
    private String logradouro;

    @Column
    private String numero;

    @Column
    private String cep;

    @Column
    private String email;


    @Column
    private Date data_nascimento;

    @Column
    private Boolean ativo;

}
