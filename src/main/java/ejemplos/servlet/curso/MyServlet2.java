package ejemplos.servlet.curso;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

@WebServlet(urlPatterns = "/myServlet2")
public class MyServlet2 extends HttpServlet {

	protected void doPost(HttpServletRequest request,
						  HttpServletResponse response) throws ServletException, IOException {

		// Obtener el nombre del formulario
		String nombre = request.getParameter("nombre");

		// Pasar el nombre como atributo a la JSP
		request.setAttribute("nombre", nombre);

		// Redirigir a la página JSP de bienvenida
		request.getRequestDispatcher("/bienvenida.jsp").forward(request, response);
	}
}
