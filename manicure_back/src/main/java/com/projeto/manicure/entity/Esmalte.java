package com.projeto.manicure.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;

@Entity
public class Esmalte {
	
	
	    @Id
	    @GeneratedValue(strategy = GenerationType.IDENTITY)
	    private Long id;

	    private String nome;
	    private String marca;
	    private int numero;
	    private String cor;
	    private String foto;
	    private int quantidade;
	    private String descricao;
	    
	    
	    
	    public Esmalte() {}
	    
		public Esmalte(Long id, String nome, String marca, int numero, String cor, String foto, int quantidade, String descricao) {
			super();
			this.id = id;
			this.nome = nome;
			this.marca = marca;
			this.numero = numero;
			this.cor = cor;
			this.foto = foto;
			this.quantidade = quantidade;
			this.descricao = descricao;
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



		public String getMarca() {
			return marca;
		}



		public void setMarca(String marca) {
			this.marca = marca;
		}



		public int getNumero() {
			return numero;
		}



		public void setNumero(int numero) {
			this.numero = numero;
		}



		public String getCor() {
			return cor;
		}



		public void setCor(String cor) {
			this.cor = cor;
		}



		public String getFoto() {
			return foto;
		}



		public void setFoto(String foto) {
			this.foto = foto;
		}



		public int getQuantidade() {
			return quantidade;
		}



		public void setQuantidade(int quantidade) {
			this.quantidade = quantidade;
		}

		public String getDescricao() {
			return descricao;
		}

		public void setDescricao(String descricao) {
			this.descricao = descricao;
		}
	    
	    
	    
	    
	    
	    
}
