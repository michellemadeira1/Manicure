package com.projeto.manicure.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.projeto.manicure.entity.Esmalte;
import com.projeto.manicure.service.EsmalteService;

@RestController
@RequestMapping("/esmaltes")
@CrossOrigin("*")
public class EsmalteController {

    @Autowired
    private EsmalteService esmalteService;

    @GetMapping("/estoque")
    public List<Esmalte> listarEsmaltes() {
        return esmalteService.listarCatalogo();
    }

    @PostMapping("/cadastrar")
    public Esmalte salvarEsmalte(@RequestBody Esmalte esmalte) {
        return esmalteService.salvarEsmalte(esmalte);
    }

    @DeleteMapping("/{id}")
    public void deletarEsmalte(@PathVariable Long id) {
        esmalteService.deletarEsmalte(id);
    }

    @GetMapping("/catalogo")
    public List<Esmalte> listarCatalogo() {
        return esmalteService.listarCatalogo();
    }
}
