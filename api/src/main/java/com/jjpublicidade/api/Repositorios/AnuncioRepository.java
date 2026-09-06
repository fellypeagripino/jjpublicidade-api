package com.jjpublicidade.api.Repositorios;

import org.springframework.data.jpa.repository.JpaRepository;

import com.jjpublicidade.api.Entidades.Anuncio;

public interface AnuncioRepository extends JpaRepository<Anuncio, Long> {

}