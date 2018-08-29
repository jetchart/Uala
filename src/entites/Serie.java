package entites;

public class Serie extends Product {

	private Integer seasons;

	public Integer getSeasons() {
		return seasons;
	}

	public void setSeasons(Integer seasons) {
		this.seasons = seasons;
	}
	
	/**
	 * Acá sigo estrictamente la parte donde indican que "tiene que tener 4 ó 5 temporadas", 
	 * aunque en la práctica alcanzaría con que sea > 3
	 */
	@Override
	public Boolean isInteresting() {
		return (seasons != null && seasons > 3 && seasons < 6);
	}
	
}
