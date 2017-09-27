package com.lemelo.gestao1.entity;

import java.io.Serializable;
import java.math.BigDecimal;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;

@Entity
public class Item implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	@ManyToOne
	@JoinColumn(name = "nota_id")
	private Nota notaId;

	@ManyToOne
	@JoinColumn(name = "produto_id")
	private Produto produtoId;

	private Integer quantidade;

	private BigDecimal precoUnitario;

	public Item() {
		super();
	}

	public Item(Nota notaId, Produto produtoId, Integer quantidade, BigDecimal precoUnitario) {
		super();
		this.notaId = notaId;
		this.produtoId = produtoId;
		this.quantidade = quantidade;
		this.precoUnitario = precoUnitario;
	}

	public Nota getNotaId() {
		return notaId;
	}

	public void setNotaId(Nota notaId) {
		this.notaId = notaId;
	}

	public Produto getProdutoId() {
		return produtoId;
	}

	public void setProdutoId(Produto produtoId) {
		this.produtoId = produtoId;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public BigDecimal getPrecoUnitario() {
		return precoUnitario;
	}

	public void setPrecoUnitario(BigDecimal precoUnitario) {
		this.precoUnitario = precoUnitario;
	}

	@Override
	public String toString() {
		return "Item [notaId=" + notaId + ", produtoId=" + produtoId + ", quantidade=" + quantidade + ", precoUnitario="
				+ precoUnitario + "]";
	}

}
