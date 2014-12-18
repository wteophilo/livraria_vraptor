package br.com.casadocodigo.livrariasite.servico;

import java.util.List;

import com.thoughtworks.xstream.XStream;

import br.com.casadocodigo.livrariasite.modelo.Acervo;
import br.com.casadocodigo.livrariasite.modelo.Livro;

public class AcervoNoAdmin implements Acervo{
		
	private ClienteHTTP http;

	public AcervoNoAdmin(ClienteHTTP http) {
		this.http = http;
	}

	@Override
	public List<Livro> todosOsLivros() {
		 String xml = http.get("http://localhost:8080/livraria-admin"+
					"/integracao/listaLivros");
		 XStream stream = new XStream();
		 stream.alias("livros",List.class);
		 stream.alias("livro",Livro.class);
		 
		 List<Livro> livros = (List<Livro>) stream.fromXML(xml);
		 return livros;
	}

}
