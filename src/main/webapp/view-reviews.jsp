<%@ page language="java" contentType="text/html; charset=UTF-8"
	pageEncoding="UTF-8"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<!DOCTYPE html>
<html>
<head>
<title>View Reviews</title>
</head>
<body>
	<h1>Reviews for Book ID: ${param.bookId}</h1>
	<!-- Placeholder for reviews. Later, populate this section with actual reviews from the database. -->

	<c:choose>
		<c:when test="${empty reviews}">
			<p>No reviews available for this book.</p>
		</c:when>
		<c:otherwise>
			<table border="1">
				<tr>
					<th>Username</th>
					<th>Review</th>
					<th>Rating</th>
				</tr>
				<c:forEach var="review" items="${reviews}">
					<tr>
						<td>${review.userName}</td>
						<td>${review.reviewText}</td>
						<td>${review.rating}Stars</td>
					</tr>
				</c:forEach>
			</table>
		</c:otherwise>
	</c:choose>

	<a href="book-list">Back to Book List</a>
</body>
</html>
