package com.jjpublicidade.api.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jjpublicidade.api.Entidades.Anuncio;

public interface AnuncioRepository extends MongoRepository<Anuncio, String> {

}