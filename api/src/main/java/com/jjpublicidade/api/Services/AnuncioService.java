package com.jjpublicidade.api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjpublicidade.api.Entidades.Anuncio;
import com.jjpublicidade.api.Entidades.Cliente;
import com.jjpublicidade.api.Repositorios.AnuncioRepository;
import com.jjpublicidade.api.Repositorios.ClienteRepository;

@Service
public class AnuncioService {

    @Autowired
    private AnuncioRepository anuncioRepository;

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Anuncio> listarAnuncios() {
        return anuncioRepository.findAll();
    }

    public Optional<Anuncio> retornarAnuncio(Long id) {
        return anuncioRepository.findById(id);
    }

    public Anuncio criarAnuncio(Anuncio anuncio) {
        Long idCliente = anuncio.getCliente().getId();
        Cliente cliente = clienteRepository.findById(idCliente)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        anuncio.setCliente(cliente);
        return anuncioRepository.save(anuncio);
    }

    public Anuncio atualizarAnuncio(Long id, Anuncio anuncioNovo) {
        Anuncio anuncioAntigo = anuncioRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Anúncio não encontrado"));

        if (anuncioNovo.getTexto() != null) {
            anuncioAntigo.setTexto(anuncioNovo.getTexto());
        }

        if (anuncioNovo.getDataVeiculacao() != null) {
            anuncioAntigo.setDataVeiculacao(anuncioNovo.getDataVeiculacao());
        }

        if (anuncioNovo.getValor() != null) {
            anuncioAntigo.setValor(anuncioNovo.getValor());
        }

        return anuncioRepository.save(anuncioAntigo);
    }

    public void deletarAnuncio(Long id) {
        anuncioRepository.deleteById(id);
    }

}