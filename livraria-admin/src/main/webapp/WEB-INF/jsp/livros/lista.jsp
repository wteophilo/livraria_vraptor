<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
	<head>
		<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
		<title>Lista Livros</title>
	</head>
	<body>
		<c:if test="${not empty mensagem}">
			<p class="mensagem">${mensagem}</p>
		</c:if>
	
		<h3>Lista de Livros</h3>
		<ul>
			<c:forEach items="${livroList}" var="livro">
				<li>${livro.titulo}- ${livro.descricao} <a
					href="${linkTo[LivrosController].edita}?isbn=${livro.isbn}">Modificar</a></li>
			</c:forEach>
		</ul>
	
	</body>
</html>