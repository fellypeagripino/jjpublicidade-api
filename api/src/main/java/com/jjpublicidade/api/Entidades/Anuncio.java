package com.jjpublicidade.api.Entidades;

import java.time.LocalDate;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToOne;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anuncio {

    @Id @GeneratedValue
    private Long id;

    private String texto;

    private LocalDate dataVeiculacao;

    private Double valor;

    @ManyToOne
    private Cliente cliente;

}