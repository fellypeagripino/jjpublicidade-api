package com.jjpublicidade.api.Services;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.jjpublicidade.api.Entidades.Cliente;
import com.jjpublicidade.api.Repositorios.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> listarClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> retornarCliente(String id) {
        return clienteRepository.findById(id);
    }

    public Cliente criarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public Cliente atualizarCliente(String id, Cliente clienteNovo) {
        Cliente clienteAntigo = clienteRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("Cliente não encontrado"));

        if (clienteNovo.getNome() != null) {
            clienteAntigo.setNome(clienteNovo.getNome());
        }

        if (clienteNovo.getTelefone() != null) {
            clienteAntigo.setTelefone(clienteNovo.getTelefone());
        }

        if (clienteNovo.getEndereco() != null) {
            clienteAntigo.setEndereco(clienteNovo.getEndereco());
        }

        return clienteRepository.save(clienteAntigo);
    }

    public void deletarCliente(String id) {
        clienteRepository.deleteById(id);
    }

}
