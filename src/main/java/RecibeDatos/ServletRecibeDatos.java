package RecibeDatos;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class ServletRecibeDatos
 */
@WebServlet("/ServletRecibeDatos")
public class ServletRecibeDatos extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public ServletRecibeDatos() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.setContentType("text/html;charset:UTF-8");
		PrintWriter out = response.getWriter ();
		
			String nombre =request.getParameter("Nombre");
			String apellido =request.getParameter("Apellido");
			String nombreUsuario =request.getParameter("nomUsuario");
			String correo =request.getParameter("email");
			String contraseña =request.getParameter("contraseña");
			try {
				out.println("<!DOCTYPE html>");
				out.println("<html>");
				out.println("<head><title>Resumen de Datos</title></head>");
				out.println("<body>");
				out.println("<h2>Tu Nombre es: " +nombre+ "</h2>");
				out.println("<h2>Tu Apellido es: " +apellido+ "</h2>");
				out.println("<h2>Tu nombre de usuario es: " +nombreUsuario+ "</h2>");
				out.println("<h2>Tu correo es: " +correo+ "</h2>");
				out.println("<h2>Tu contraseña es: " +contraseña+ "</h2>");
				out.println("</body>");
				out.println("</html>");
		}finally {
			out.close();
		}	
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
