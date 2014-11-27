package br.com.casadocodigo.livraria.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

public class Livro {
	private String titulo;
	private String descricao;
	private String isbn;
	private BigDecimal preco;
	private Calendar dataPublicao;

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

	public Calendar getDataPublicao() {
		return dataPublicao;
	}

	public void setDataPublicao(Calendar dataPublicao) {
		this.dataPublicao = dataPublicao;
	}

}
