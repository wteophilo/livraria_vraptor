<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Insert title here</title>
</head>
<body>

	<ul class="errors">
		<c:forEach items="${errors}" var="error">
			<li>
				<!-- o campo em que ocorreu o erro, ou o tipo do erro -->
				${error.category}: <!-- a mensagem de erro de valida��o -->
				${error.message}
			</li>
		</c:forEach>
	</ul>
	
	<form method="post" action="${linkTo[LivrosController].salva }">
		<h2>Formul�rio de cadastro de livros</h2>
		<ul>
			<li>ID <input type="hidden" name="livro.id" value="${livro.id}" /></li>

			<li>Titulo: <br /> <input type="text" name="livro.titulo"
				value="${livro.titulo}" />
			</li>

			<li>Descricao: <br /> <textarea name="livro.descricao"> ${livro.descricao}</textarea>
			</li>

			<li>ISBN: <br /> <input type="text" name="livro.isbn"
				value="${livro.isbn}" />
			</li>

			<li>Preco: <br /> <input type="text" name="livro.preco"
				value="${livro.preco}" />
			</li>

			<li>Data de publicacao: <br /> <input type="text"
				name="livro.dataPublicacao" value="${livro.dataPublicacao}" />
			</li>
		</ul>

		<input type="submit" value="Salvar">
	</form>
</body>
</html>