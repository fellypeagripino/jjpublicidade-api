package com.jjpublicidade.api.Controladores;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.jjpublicidade.api.Entidades.Anuncio;
import com.jjpublicidade.api.Services.AnuncioService;

@RestController
@RequestMapping("/anuncios")
public class AnuncioController {

    @Autowired
    private AnuncioService anuncioService;

    @GetMapping
    public ResponseEntity<List<Anuncio>> listarAnuncios() {
        return ResponseEntity.ok(anuncioService.listarAnuncios());
    }

    @GetMapping("/{id}")
    public ResponseEntity<Anuncio> retornarAnuncio(@PathVariable Long id) {
        Optional<Anuncio> anuncioPorId = anuncioService.retornarAnuncio(id);

        if (anuncioPorId.isPresent()) {
            return ResponseEntity.ok(anuncioPorId.get());
        } else {
            return ResponseEntity.notFound().build();
        }
    }

    @PostMapping
    public ResponseEntity<Anuncio> criarAnuncio(@RequestBody Anuncio anuncio) {
        Anuncio anuncioNovo = anuncioService.criarAnuncio(anuncio);
        return ResponseEntity.status(201).body(anuncioNovo);
    }

    @PutMapping("/{id}")
    public ResponseEntity<Anuncio> atualizarAnuncio(@PathVariable Long id, @RequestBody Anuncio anuncio) {
        Anuncio anuncioAtualizado = anuncioService.atualizarAnuncio(id, anuncio);
        return ResponseEntity.status(200).body(anuncioAtualizado);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletarAnuncio(@PathVariable Long id) {
        anuncioService.deletarAnuncio(id);
        return ResponseEntity.noContent().build();
    }

}