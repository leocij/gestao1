package com.lemelo.gestao1.entity;

import java.io.Serializable;

import javax.persistence.Entity;

@Entity
public class Produto implements Serializable {

	private static final long serialVersionUID = 1L;

	private Long id;
	private String nomeProduto;
}
