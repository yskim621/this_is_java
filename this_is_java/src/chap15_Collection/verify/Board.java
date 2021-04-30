package chap15_Collection.verify;

public class Board {
	private String title;
	private String Content;
	
	public Board(String title, String content) {
		super();
		this.title = title;
		this.Content = content;
	}
	

	public Board() {
		super();
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}

	public String getContent() {
		return Content;
	}

	public void setContent(String content) {
		this.Content = content;
	}
}
