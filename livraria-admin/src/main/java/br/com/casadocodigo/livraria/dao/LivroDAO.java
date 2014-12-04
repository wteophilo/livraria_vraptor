package br.com.casadocodigo.livraria.dao;

import java.util.List;

import br.com.casadocodigo.livraria.modelo.Livro;

public interface LivroDAO {

	void adicionar(Livro livro);

	List<Livro> todos();
	
	Livro buscaPorIsb(String isb);

}
