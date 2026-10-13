package com.jjpublicidade.api.Repositorios;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.jjpublicidade.api.Entidades.Cliente;

public interface ClienteRepository extends MongoRepository<Cliente, String> {

}