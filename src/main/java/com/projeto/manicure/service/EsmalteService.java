package com.projeto.manicure.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import com.projeto.manicure.entity.Esmalte;
import com.projeto.manicure.repository.EsmalteRepository;


@Service
	public class EsmalteService {

	    @Autowired
	    private EsmalteRepository esmalteRepository;

	    public ResponseEntity <List<Esmalte>> listarEsmaltes(Esmalte esmalte) {
	       List<Esmalte> esmalteExist = esmalteRepository.findAllByNomeIgnoreCase(esmalte.getNome());
	       if(esmalteExist.isEmpty()) {
				return ResponseEntity.status(406).build();
			}else {
				return ResponseEntity.status(200).body(esmalteExist);	
			}	 
	    }

	    
	    public Esmalte salvarEsmalte(Esmalte esmalte) {
	        return esmalteRepository.save(esmalte);
	    }
	    
	   
	    public void deletarEsmalte(Long id) {
	        esmalteRepository.deleteById(id);
	    }

            //Metodo para o catalogo
	    public List<Esmalte> listarCatalogo() {
	        return esmalteRepository.findAllByOrderByNumero();
	    }
	}


