package com.projeto.manicure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.projeto.manicure.entity.Cliente;
import com.projeto.manicure.service.ClienteService;

public class ClienteController {

	  @Autowired
	    private ClienteService clienteService;

	    @PostMapping("/agendar")
	    public Cliente salvarAgendamento(@RequestBody Cliente cliente) {
	        return clienteService.salvarAgendamento(cliente);
	    }
	    
	    @GetMapping("/agendamentos")
	    public List<Cliente> listarAgendamentos() {
	        return clienteService.listarAgendamentos();
	    }

	    @DeleteMapping("/{id}")
	    public void deletarAgendamento(@PathVariable Long id) {
	        clienteService.deletarAgendamento(id);
	    }
}
