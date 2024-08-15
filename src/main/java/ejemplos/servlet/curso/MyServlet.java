package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

@WebServlet(urlPatterns = "/myServlet")
public class MyServlet extends HttpServlet {

	protected void doGet(HttpServletRequest request,
			HttpServletResponse response) throws ServletException, IOException {

		response.setContentType("text/html");
		PrintWriter out = response.getWriter();

		// Generar página HTML con formulario
		out.println("<html>");
		out.println("<head><title>Ejemplo HTML desde Servlet</title></head>");
		out.println("<head><h2>Formulario desde Servlet</h2></head>");
		out.println("<body>");
		out.println("<h3>Por favor, introduce tu nombre</h3>");
		out.println("<form action='/myServlet2' method='POST'>");
		out.println("Nombre: <input type='text' name='nombre'><br>");
		out.println("<input type='submit' value='Enviar'>");
		out.println("</form>");
		out.println("</body></html>");
	}

}