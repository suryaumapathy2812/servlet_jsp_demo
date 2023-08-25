package in.suryaumapathy.servlet_jsp_demo.servlet;

import java.io.IOException;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.suryaumapathy.servlet_jsp_demo.model.MockData;
import in.suryaumapathy.servlet_jsp_demo.model.Review;

/**
 * Servlet implementation class ReviewServlet
 */
@WebServlet("/add-review")
public class ReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// Get data from form
		int bookId = Integer.parseInt(request.getParameter("bookId"));
		String userName = request.getParameter("userName");
		String reviewText = request.getParameter("reviewText");
		int rating = Integer.parseInt(request.getParameter("rating"));

		// For now, just printing the review. Later, save to DB.
		Review book = new Review(bookId, userName, reviewText, rating);
		System.out.println(MockData.bookReviews);
		MockData.bookReviews.add(book);

		response.sendRedirect("book-list");
	}

}
