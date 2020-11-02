

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Register
 */
//@WebServlet("/Register")
@WebServlet(name="reg", urlPatterns={"/Register"})
public class Register extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Register() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String barcode = request.getParameter("pbar");
		String name = request.getParameter("pname");
		String color = request.getParameter("pcolor");
		String description = request.getParameter("pdesc");
		        response.setContentType("text/html");
		Product product = new Product(barcode, name, color, description);
		
		RegisterClass rClass = new RegisterClass();
		String result = rClass.insert(product);
		//response.getWriter().print(result);
		response.getWriter().append("<html><body>").append(result)
			.append("<br><a href=" +"index.html" +">Return Back</a>").append("</body></html>");
	}

}
