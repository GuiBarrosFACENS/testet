package com.devsuperior.myfirstproject.entities;

import java.io.Serializable;
import java.util.Objects;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Transacao implements Serializable{
	private static final long serialVersionUID = 1L;
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	private String cartoes;
	
	@ManyToOne
	@JoinColumn(name = "formaPagamento_id")
	private formaPagamento formaPagamento;
	
	@ManyToOne
	@JoinColumn(name = "descricao_id")
	private Descricao descricao;
	
	public Transacao() {
	}

	

	public Transacao(Long id, String cartoes, com.devsuperior.myfirstproject.entities.formaPagamento formaPagamento,
			Descricao descricao) {
		super();
		this.id = id;
		this.cartoes = cartoes;
		this.formaPagamento = formaPagamento;
		this.descricao = descricao;
	}



	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getCartoes() {
		return cartoes;
	}

	public void setCartoes(String cartoes) {
		this.cartoes = cartoes;
	}

	public formaPagamento getFormaPagamento() {
		return formaPagamento;
	}

	public void setFormaPagamento(formaPagamento formaPagamento) {
		this.formaPagamento = formaPagamento;
	}
	
	
	
	public Descricao getDescricao() {
		return descricao;
	}



	public void setDescricao(Descricao descricao) {
		this.descricao = descricao;
	}


	@Override
	public int hashCode() {
		return Objects.hash(id);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Transacao other = (Transacao) obj;
		return Objects.equals(id, other.id);
	}
		
}
