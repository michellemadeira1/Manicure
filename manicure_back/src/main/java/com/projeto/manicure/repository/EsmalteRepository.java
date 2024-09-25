package com.projeto.manicure.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.projeto.manicure.entity.Esmalte;

@Repository
public interface EsmalteRepository extends JpaRepository<Esmalte, Long> {
 
	List<Esmalte> findAllByOrderByNumero();
	List<Esmalte> findAllByNomeIgnoreCase(String nome);
}
