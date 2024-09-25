package com.projeto.manicure.entity;

import java.time.LocalDate;
import java.time.LocalTime;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;


@Entity
public class Cliente {

	
	@Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;
    private String telefone;
    private Double valorPagamento;
    private String descricaoAgendamento;
    private LocalDate dataAgendamento;
    private LocalTime horarioAgendamento;
    
    
    public Cliente() {}
    
    
	public Cliente(Long id, String nome, String telefone, Double valorPagamento, String descricaoAgendamento,
			LocalDate dataAgendamento, LocalTime horarioAgendamento) {
		super();
		this.id = id;
		this.nome = nome;
		this.telefone = telefone;
		this.valorPagamento = valorPagamento;
		this.descricaoAgendamento = descricaoAgendamento;
		this.dataAgendamento = dataAgendamento;
		this.horarioAgendamento = horarioAgendamento;
	}




	public Long getId() {
		return id;
	}




	public void setId(Long id) {
		this.id = id;
	}




	public String getNome() {
		return nome;
	}




	public void setNome(String nome) {
		this.nome = nome;
	}




	public String getTelefone() {
		return telefone;
	}




	public void setTelefone(String telefone) {
		this.telefone = telefone;
	}




	public Double getValorPagamento() {
		return valorPagamento;
	}




	public void setValorPagamento(Double valorPagamento) {
		this.valorPagamento = valorPagamento;
	}




	public String getDescricaoAgendamento() {
		return descricaoAgendamento;
	}




	public void setDescricaoAgendamento(String descricaoAgendamento) {
		this.descricaoAgendamento = descricaoAgendamento;
	}




	public LocalDate getDataAgendamento() {
		return dataAgendamento;
	}




	public void setDataAgendamento(LocalDate dataAgendamento) {
		this.dataAgendamento = dataAgendamento;
	}




	public LocalTime getHorarioAgendamento() {
		return horarioAgendamento;
	}




	public void setHorarioAgendamento(LocalTime horarioAgendamento) {
		this.horarioAgendamento = horarioAgendamento;
	}

    
    
    
}
