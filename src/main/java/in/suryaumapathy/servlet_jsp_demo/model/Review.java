package in.suryaumapathy.servlet_jsp_demo.model;

public class Review {

	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public int getBookId() {
		return bookId;
	}

	public void setBookId(int bookId) {
		this.bookId = bookId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getReviewText() {
		return reviewText;
	}

	public void setReviewText(String reviewText) {
		this.reviewText = reviewText;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public Review(int id, int bookId, String userName, String reviewText, int rating) {
		this.id = id;
		this.bookId = bookId;
		this.userName = userName;
		this.reviewText = reviewText;
		this.rating = rating;
	}

	public Review(int bookId, String userName, String reviewText, int rating) {
		this.bookId = bookId;
		this.userName = userName;
		this.reviewText = reviewText;
		this.rating = rating;
	}

	private int id;
	private int bookId;
	private String userName;
	private String reviewText;
	private int rating;

}
