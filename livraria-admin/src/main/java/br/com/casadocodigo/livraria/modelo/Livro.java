package br.com.casadocodigo.livraria.modelo;

import java.math.BigDecimal;
import java.util.Calendar;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.validation.constraints.DecimalMin;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Past;

import org.hibernate.validator.constraints.NotEmpty;

@Entity
public class Livro {
	@Id
	@GeneratedValue
	private Long id;

	@NotEmpty
	private String titulo;
	private String descricao;

	@Column(unique = true)
	@NotEmpty
	private String isbn;
	@NotNull
	@DecimalMin("0.0")
	private BigDecimal preco;
	@Past
	private Calendar dataPublicacao;

	private String editora;

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

	public String getEditora() {
		return editora;
	}

	public void setEditora(String editora) {
		this.editora = editora;
	}

	public Long getId() {
		return id;
	}

	public String getTitulo() {
		return titulo;
	}

}
