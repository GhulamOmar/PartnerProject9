package controller;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.EmployeeList;

/**
 * Servlet implementation class AddEmployeeServlet
 */
@WebServlet("/addEmployeeServlet")
public class AddEmployeeServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public AddEmployeeServlet() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		String deportment = request.getParameter("deportment");
		String empolyee = request.getParameter("empolyee");
		
		EmployeeList li = new EmployeeList(deportment, empolyee);
		EmloyeeListHelper dao = new EmloyeeListHelper();
		dao.insertEmployee(li);
		
		getServletContext().getRequestDispatcher("/index.html").forward(request, response);

	}

}
	


