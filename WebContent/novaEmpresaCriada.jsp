<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
    
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Empresa criada (ou n�o)</title>
</head>
<body>
	
	<c:if test="${not empty empresa }">	<!-- esse � um if do JSTL que chega se nao esta vazia a variavel empresa -->	
		Empresa ${ empresa } cadastrada com sucesso!			
	</c:if>
	
	<c:if test="${empty empresa }">	<!-- esse � um if do JSTL que chega se esta vazia a variavel empresa -->	
		Nenhuma empresa cadastrada!			
	</c:if>
	
</body>
</html>

