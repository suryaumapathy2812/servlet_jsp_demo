package in.suryaumapathy.servlet_jsp_demo.model;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class MockData {

	public static List<Book> bookList = Arrays.asList(new Book(1, "Harry Potter", "Author 1"),
			new Book(2, "Crazy rich asian", "Auhtor_2"), new Book(3, "Atomic Habits", "Authro_3"));

	public static List<Review> bookReviews = new ArrayList<>();


}
