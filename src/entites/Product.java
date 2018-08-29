package entites;

public abstract class Product {
	
	protected Long id;
	protected String title;
	protected Integer releaseYear;
	protected Integer lenght;
	protected Long creditsToBuy;
	
	public abstract Boolean isInteresting();
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public Integer getReleaseYear() {
		return releaseYear;
	}
	public void setReleaseYear(Integer releaseYear) {
		this.releaseYear = releaseYear;
	}
	public Integer getLenght() {
		return lenght;
	}
	public void setLenght(Integer lenght) {
		this.lenght = lenght;
	}
	public Long getCreditsToBuy() {
		return creditsToBuy;
	}
	public void setCreditsToBuy(Long creditsToBuy) {
		this.creditsToBuy = creditsToBuy;
	}
	
}
