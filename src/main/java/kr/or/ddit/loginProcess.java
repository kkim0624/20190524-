package kr.or.ddit;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Servlet implementation class loginProcess
 */
@WebServlet("/loginProcess")
public class loginProcess extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	private static final Logger logger = LoggerFactory
			.getLogger(loginProcess.class);
	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
	
	}
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String userId = request.getParameter("userId");
		String pass = request.getParameter("pass");
		
		if(userId.length() >= 5 && pass.length() >= 8 ){
			
			HttpSession session = request.getSession();
			
			session.setAttribute("SESSION_USER", new UserVo("kim52","김오이"));
			
			request.getRequestDispatcher("/main.jsp").forward(request, response);
			
		}else{
			response.sendRedirect(request.getContextPath() + "/loginView");
		}
		
	}

}
