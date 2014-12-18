package br.com.casadocodigo.livrariasite.servico;

public class ServidorIndisponivelException extends RuntimeException {
	private static final long serialVersionUID = 1L;

	public ServidorIndisponivelException( String url, Exception exception) {
		super("Erro ao fazer requisição ao servidor na url" +url,exception);
	}

}
