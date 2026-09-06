package com.jjpublicidade.api.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjpublicidade.api.Entidades.Cliente;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {

}