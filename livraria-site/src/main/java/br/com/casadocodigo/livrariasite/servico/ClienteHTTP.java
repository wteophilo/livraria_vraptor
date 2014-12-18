package br.com.casadocodigo.livrariasite.servico;

public interface ClienteHTTP {
	public String get(String url) throws ServidorIndisponivelException;
}
