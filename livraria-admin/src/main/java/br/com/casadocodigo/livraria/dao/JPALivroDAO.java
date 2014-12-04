package br.com.casadocodigo.livraria.dao;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.NoResultException;

import br.com.caelum.vraptor.ioc.Component;
import br.com.casadocodigo.livraria.modelo.Livro;

@Component
public class JPALivroDAO implements LivroDAO {

	private EntityManager manager;

	public JPALivroDAO(EntityManager entityManager) {
		this.manager = entityManager;
	}

	@Override
	public void adicionar(Livro livro) {
		this.manager.getTransaction().begin();
		this.manager.persist(livro);
		this.manager.getTransaction().commit();
	}

	@SuppressWarnings("unchecked")
	@Override
	public List<Livro> todos() {
		return this.manager.createQuery("select l from Livro l")
				.getResultList();
	}

	@Override
	public Livro buscaPorIsb(String isbn) {
		try {
			return this.manager
					.createQuery("select l from livro l where l.isb= :isbn",
							Livro.class).setParameter("isbn", isbn)
					.getSingleResult();

		} catch (NoResultException e) {
			return null;
		}
	}

}
