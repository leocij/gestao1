package com.lemelo.gestao1.entity;

import java.io.Serializable;
import java.sql.Date;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.JoinTable;
import javax.persistence.ManyToMany;
import javax.persistence.ManyToOne;

@Entity
public class Nota implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	private String nomeQuemLancou;
	private Date dataLancamento;
	private String nomeQuemConfirmou;
	private Date dataConfirmacao;
	private String nomeQuemDevolveu;
	private String dataDevolucao;

	@ManyToOne
	@JoinColumn(name = "cliente_id")
	private Cliente cliente;

	@ManyToMany
	@JoinTable(name = "item", joinColumns = { @JoinColumn(name = "nota_id") }, inverseJoinColumns = {
			@JoinColumn(name = "produto_id") })
	private List<Produto> produtos;

	public Nota() {
		super();
	}

	public Nota(Long id, String nomeQuemLancou, Date dataLancamento, String nomeQuemConfirmou, Date dataConfirmacao,
			String nomeQuemDevolveu, String dataDevolucao, Cliente cliente, List<Produto> produtos) {
		super();
		this.id = id;
		this.nomeQuemLancou = nomeQuemLancou;
		this.dataLancamento = dataLancamento;
		this.nomeQuemConfirmou = nomeQuemConfirmou;
		this.dataConfirmacao = dataConfirmacao;
		this.nomeQuemDevolveu = nomeQuemDevolveu;
		this.dataDevolucao = dataDevolucao;
		this.cliente = cliente;
		this.produtos = produtos;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNomeQuemLancou() {
		return nomeQuemLancou;
	}

	public void setNomeQuemLancou(String nomeQuemLancou) {
		this.nomeQuemLancou = nomeQuemLancou;
	}

	public Date getDataLancamento() {
		return dataLancamento;
	}

	public void setDataLancamento(Date dataLancamento) {
		this.dataLancamento = dataLancamento;
	}

	public String getNomeQuemConfirmou() {
		return nomeQuemConfirmou;
	}

	public void setNomeQuemConfirmou(String nomeQuemConfirmou) {
		this.nomeQuemConfirmou = nomeQuemConfirmou;
	}

	public Date getDataConfirmacao() {
		return dataConfirmacao;
	}

	public void setDataConfirmacao(Date dataConfirmacao) {
		this.dataConfirmacao = dataConfirmacao;
	}

	public String getNomeQuemDevolveu() {
		return nomeQuemDevolveu;
	}

	public void setNomeQuemDevolveu(String nomeQuemDevolveu) {
		this.nomeQuemDevolveu = nomeQuemDevolveu;
	}

	public String getDataDevolucao() {
		return dataDevolucao;
	}

	public void setDataDevolucao(String dataDevolucao) {
		this.dataDevolucao = dataDevolucao;
	}

	public Cliente getCliente() {
		return cliente;
	}

	public void setCliente(Cliente cliente) {
		this.cliente = cliente;
	}

	public List<Produto> getProdutos() {
		return produtos;
	}

	public void setProdutos(List<Produto> produtos) {
		this.produtos = produtos;
	}

	@Override
	public String toString() {
		return "Nota [id=" + id + ", nomeQuemLancou=" + nomeQuemLancou + ", dataLancamento=" + dataLancamento
				+ ", nomeQuemConfirmou=" + nomeQuemConfirmou + ", dataConfirmacao=" + dataConfirmacao
				+ ", nomeQuemDevolveu=" + nomeQuemDevolveu + ", dataDevolucao=" + dataDevolucao + ", cliente=" + cliente
				+ ", produtos=" + produtos + "]";
	}

}
