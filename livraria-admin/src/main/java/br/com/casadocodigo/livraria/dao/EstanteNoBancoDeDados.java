package br.com.casadocodigo.livraria.dao;

import java.util.List;

import br.com.caelum.vraptor.ioc.Component;
import br.com.casadocodigo.livraria.dao.LivroDAO;
import br.com.casadocodigo.livraria.modelo.Estante;
import br.com.casadocodigo.livraria.modelo.Livro;

@Component
public class EstanteNoBancoDeDados implements Estante {
	
	private LivroDAO livroDao;
	
	public EstanteNoBancoDeDados( LivroDAO livroDAO) {
		this.livroDao = livroDAO;
	}

	@Override
	public void guardar(Livro livro) {
		this.livroDao.adicionar(livro);
	}

	@Override
	public List<Livro> todosOsLivros() {
		return this.livroDao.todos();
	}

	@Override
	public Livro buscaPorIsbn(String isbn) {
		return this.livroDao.buscaPorIsb(isbn);
	}

}
