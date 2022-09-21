package br.com.alura.gerenciador.servlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.ServletRequest;
import javax.servlet.ServletResponse;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;

@WebServlet(urlPatterns = "/oi") //dando nome ao servlet, que é /oi
public class OiMundoServlet extends HttpServlet {
	
	@Override
	public void service(ServletRequest req, ServletResponse res) throws IOException {
		PrintWriter out = res.getWriter();   //writer diz que a resposta são dados textuais/caracteres
		out.println("<html>");               //esse out nao imprime para o console, imprime no fluxo de respota para o navegador
		out.println("<body>");
		out.println("oi mundo parabens vc escreveu o primeiro servlets");
		out.println("</body>");
		out.println("</html>");
		
		System.out.println("o servlet foi chamado");
	}
}
