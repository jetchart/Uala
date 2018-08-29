package entites;

public class Documentary extends Product {

	private final String unofficial = "unofficial";
	
	@Override
	public Boolean isInteresting() {
		if (title != null) {
			return title.contains(unofficial);
		}
		return Boolean.FALSE;
	}

}
