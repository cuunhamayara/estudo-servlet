<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ page import="java.util.List, br.com.alura.gerenciador.servlet.Empresa" %>
<!-- importando a biblioteca jstl -->    
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@taglib uri="http://java.sun.com/jsp/jstl/fmt" prefix="fmt" %>


<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Lista de Empresas</title>
</head>
<body>
Lista empresas
	<ul>
		<c:forEach items="${ empresas }" var="empresa"> <!-- var � um nome que eu dou -->
			<li> 
				${ empresa.nome } - <fmt:formatDate value="${ empresa.dataAbertura }" pattern="dd/MM/yyyy"/> 
				<a href="/gerenciador/mostraEmpresa?id=${ empresa.id }">edita</a>
				<a href="/gerenciador/removeEmpresa?id=${ empresa.id }">remove</a>
				
				
			</li>  <!-- mesma coisa de escrever empresa.getNome() -->
		</c:forEach>
	</ul>


</body>
</html>