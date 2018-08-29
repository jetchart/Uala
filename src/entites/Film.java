package entites;

public class Film extends Product {

	private Integer oscars;

	public Integer getOscars() {
		return oscars;
	}

	public void setOscars(Integer oscars) {
		this.oscars = oscars;
	}
	
	@Override
	public Boolean isInteresting() {
		return (oscars != null && oscars > 0);
	}
}
