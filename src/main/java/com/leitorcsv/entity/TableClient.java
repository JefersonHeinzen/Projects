package com.leitorcsv.entity;


import lombok.*;
import javax.persistence.*;


@Builder
@Getter
@Setter
@Entity
@NoArgsConstructor
@AllArgsConstructor

@Table(name = "Clients")
public class TableClient {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;

    private String nomeEmpresa;
    private String cnpj;
    private String motivoFechamento;
    private String tipo;
    private String valorMoeda;
    private String fiadorProposta;
    private String fonteRecente;
    private String etapaNegocio;
    private String valor;
    private String quantidadeParcela;

}
