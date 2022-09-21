package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class NovaEmpresaServlet
 */
@WebServlet("/novaEmpresa")
public class NovaEmpresaServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	System.out.println("cadastrando nova empresa");
	
	String nomeEmpresa = request.getParameter("nome");    //pega a requisiçao feita no navegador (na url) e devolve uma string. la no navegador tem "http://localhost:8080/gerenciador/novaEmpresa?nome=Alura"
	String paramDataEmpresa = request.getParameter("data");   //ps: esse metodo get parameter sempre devolve uma string
	
	
	Date dataAbertura = null;
	try {
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		dataAbertura = sdf.parse(paramDataEmpresa);  //dataAbertura é do tipo data,na classe empresa, aqui estamos transformando-o em string
	} catch (ParseException e) {
		throw new ServletException(e);
	}   
	
	Empresa empresa = new Empresa();
	empresa.setNome(nomeEmpresa);
	empresa.setDataAbertura(dataAbertura);
	
	Banco banco = new Banco();
	banco.adiciona(empresa);
	
	//chamar o JSP (interface HTML pro usuário ver na tela)
	RequestDispatcher rd = request.getRequestDispatcher("/novaEmpresaCriada.jsp");
	request.setAttribute("empresa", empresa.getNome());
	rd.forward(request, response);
	
	}
}
