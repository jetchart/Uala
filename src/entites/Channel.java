package entites;

public abstract class Channel {
	
	protected Long id;
	protected String description;
	public abstract void notify(User user, Product product);
	
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
}
