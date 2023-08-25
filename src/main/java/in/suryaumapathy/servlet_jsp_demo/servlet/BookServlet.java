package in.suryaumapathy.servlet_jsp_demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.suryaumapathy.servlet_jsp_demo.model.Book;
import in.suryaumapathy.servlet_jsp_demo.model.MockData;

/**
 * Servlet implementation class GetAllBookServlet
 */
@WebServlet("/book-list")
public class BookServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// For now, using static data. Later, fetch from DB.

		request.setAttribute("books", MockData.bookList);
		request.getRequestDispatcher("/book-list.jsp").forward(request, response);
	}

}
