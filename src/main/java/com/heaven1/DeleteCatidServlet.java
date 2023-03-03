package com.heaven1;

import java.io.IOException;
import java.util.List;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

/**
 * Servlet implementation class DeleteCatidServlet
 */
@WebServlet("/DeleteCatidServlet")
public class DeleteCatidServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
	
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		
		String id = request.getParameter("catid");
		boolean isTrue;
		HttpSession session = request.getSession();
		RequestDispatcher dispatcher = null;
		int ID = (int)session.getAttribute("id");
		isTrue = CatidDBUtil.deleteCatid(ID,id); //assign boolean variable to check whether if data is retrieved
		if (isTrue == true) {
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("FinancialManageracc.jsp");
			dispatcher1.forward(request, response);
		}else {
			List<Catid> Cid = CatidDBUtil.getCatidDetails(ID);
			request.setAttribute("catDetails", Cid);
			
			RequestDispatcher dispatcher1 = request.getRequestDispatcher("Financialmanageracc.jsp");
			dispatcher1.forward(request, response);
			
		}
		
	}

}
