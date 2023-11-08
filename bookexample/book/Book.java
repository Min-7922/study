package book;

// 단일데이터를 필드와 getter/setter로 구성
// 책을 등록하고 검색하는 기능

public class Book {
	private String name;
	private int price;
	private String publisher;
	private String author;
	
	public Book(String name, int price) {	
		this.name = name;
		this.price = price;
	}
	
	// setter
	public void setName(String name) {
		this.name = name; 
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public void setPubliser(String publisher) {
		this.publisher = publisher;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	// getter
	public String getName() {
		return name;
	}
	public int getPrice() {
		return price;
	}
	public String getPublisher() {
		return publisher;
	}
	public String getAuthor() {
		return author;
	}

}
