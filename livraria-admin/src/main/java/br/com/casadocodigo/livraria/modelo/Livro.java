package br.com.casadocodigo.livraria.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class Livro {
	private String titulo;
	private String descricao;
	@Id @GeneratedValue
	private Long id;
	@Column(unique = true)
	private String isbn;
	private BigDecimal preco;
	private Calendar dataPublicacao;
	
	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

	public void setTitulo(String titulo) {
		this.titulo = titulo;
	}

	public String getDescricao() {
		return descricao;
	}

	public void setDescricao(String descricao) {
		this.descricao = descricao;
	}

	public String getIsbn() {
		return isbn;
	}

	public void setIsbn(String isbn) {
		this.isbn = isbn;
	}

	public BigDecimal getPreco() {
		return preco;
	}

	public void setPreco(BigDecimal preco) {
		this.preco = preco;
	}

	public Calendar getDataPublicacao() {
		return dataPublicacao;
	}

	public void setDataPublicao(Calendar dataPublicacao) {
		this.dataPublicacao = dataPublicacao;
	}

	public void setId(Long id) {
		this.id = id;
	}
	

}
