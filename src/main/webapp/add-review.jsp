<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>

<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Add review</title>
</head>
<body>



	<c:if test="${empty sessionScope.loggedInEmail}">
		<c:redirect url="login" />
	</c:if>

	<h1>Add Review for Book ID: ${param.bookId}</h1>

	<form action="add-review" method="post">

		<input type="hidden" name="bookId" value="${param.bookId}" />

		<label for="userName">user name:</label> <input type="text"
			name="userName" value="${sessionScope.loggedInEmail}" required /> <br />
		<br /> 
		
		<label for="reviewText">Review Comments:</label> <input
			type="text" name="reviewText" required /> <br /> <br /> 
			
			<label
			for="rating">Rating:</label> <select name="rating">
			<c:forEach var="i" begin="1" end="5">
				<option value="${i}">${i}Stars</option>
			</c:forEach>

		</select> <br /> <br />

		<button type="submit">Submit</button>

	</form>



</body>
</html>