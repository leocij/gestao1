package com.lemelo.gestao1.entity;

import java.io.Serializable;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class Cliente implements Serializable {

	private static final long serialVersionUID = 1L;

	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;

	private String nome;

	@OneToOne(mappedBy = "cliente")
	private Nota nota;

	public Cliente() {
		super();
	}

	public Cliente(Long id, String nome, Nota nota) {
		super();
		this.id = id;
		this.nome = nome;
		this.nota = nota;
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

	public Nota getNota() {
		return nota;
	}

	public void setNota(Nota nota) {
		this.nota = nota;
	}

	@Override
	public String toString() {
		return "Cliente [id=" + id + ", nome=" + nome + ", nota=" + nota + "]";
	}

}
