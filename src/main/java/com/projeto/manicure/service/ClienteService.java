package com.projeto.manicure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.projeto.manicure.entity.Cliente;
import com.projeto.manicure.repository.ClienteRepository;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public Cliente salvarAgendamento(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public List<Cliente> listarAgendamentos() {
        return clienteRepository.findAll();
    }

    public void deletarAgendamento(Long id) {
        clienteRepository.deleteById(id);
    }
}

