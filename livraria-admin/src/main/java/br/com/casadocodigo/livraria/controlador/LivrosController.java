package br.com.casadocodigo.livraria.controlador;

import java.util.List;

import br.com.caelum.vraptor.Resource;
import br.com.caelum.vraptor.Result;
import br.com.caelum.vraptor.Validator;
import br.com.casadocodigo.livraria.dao.UmaEstanteQualquer;
import br.com.casadocodigo.livraria.modelo.Estante;
import br.com.casadocodigo.livraria.modelo.Livro;

@Resource
public class LivrosController {
	
	private final Estante estante;
	private Result result;
	private Validator validator;
	
	public LivrosController(Estante estante,Result result,Validator validator) {
		this.estante = estante;
		this.result = result;
		this.validator = validator;
	}
	
	public void formulario(){}
	
	public void salva(Livro livro){
		validator.validate(livro);
		validator.onErrorRedirectTo(this).formulario();	
	    estante.guardar(livro);
		result.redirectTo(this).lista();
	}
	
	public List<Livro>lista(){
		try{
			return estante.todosOsLivros();
		}catch(NullPointerException ex){
			ex.printStackTrace();
			return null;
		}
	}

	public void edita(String isbn, Result result){
		Estante estante = new UmaEstanteQualquer();
		Livro livroEncontrado = estante.buscaPorIsbn(isbn);
		result.include(livroEncontrado);
		result.of(this).formulario();
	}
}
