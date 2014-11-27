package br.com.casadocodigo.livraria.modelo;

import java.util.List;

public interface Estante {
	public void guardar(Livro livro);
	public List<Livro> todosOsLivros();
}
