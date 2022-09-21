<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<c:url value="/novaEmpresa" var="linkServletNovaEmpresa"/>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
</head>
<body>



	<form action="${linkServletNovaEmpresa}" method="post"> <!-- diz que esse forms ira apontar para o caminho 
	                                                            /gerenciamento/novaEmpresa, esta explicitando isso na 
	                                                            linha  2 e colocando numa var-->
		Nome: <input type="text" name="nome"/>
		Data de abertura: <input type="text" name="data"/>
		
		<input type="submit"/>
	
	</form>

</body>
</html>