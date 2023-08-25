package in.suryaumapathy.servlet_jsp_demo.servlet;

import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import in.suryaumapathy.servlet_jsp_demo.model.MockData;
import in.suryaumapathy.servlet_jsp_demo.model.Review;

/**
 * Servlet implementation class ViewBookServlet
 */
@WebServlet("/view-reviews")
public class ViewReviewServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub

		int bookId = Integer.parseInt(request.getParameter("bookId"));
		List<Review> allReviews = MockData.bookReviews;

		List<Review> reviews = new ArrayList<>();

		for (Iterator iterator = allReviews.iterator(); iterator.hasNext();) {
			Review review = (Review) iterator.next();

			if (review.getBookId() == bookId) {
				reviews.add(review);
			}

		}

		request.setAttribute("reviews", reviews);
		request.getRequestDispatcher("view-reviews.jsp").forward(request, response);

	}

}
