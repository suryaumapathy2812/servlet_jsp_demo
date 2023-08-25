<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<%@ taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Book List</title>
</head>
<body>

	<h1>List of Books</h1>

	<table border="1">

		<tr>
			<th>ID</th>
			<th>Title</th>
			<th>Author</th>
			<th>Actions</th>
		</tr>

		<c:forEach var="book" items="${books}">
			<tr>
				<td>${book.id}</td>
				<td>${book.title}</td>
				<td>${book.author}</td>
				<td><a href="view-reviews?bookId=${book.id}">View Reviews</a> |
					<a href="add-review.jsp?bookId=${book.id}">Add Review</a></td>
			</tr>
		</c:forEach>

	</table>


</body>
</html>