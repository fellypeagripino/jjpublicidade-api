package com.jjpublicidade.api.Entidades;

import java.time.LocalDate;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Document(collection = "anuncios")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class Anuncio {

    @Id
    private String id;

    private String texto;

    private LocalDate dataVeiculacao;

    private Double valor;

    private Cliente cliente;

}