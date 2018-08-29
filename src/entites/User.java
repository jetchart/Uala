package entites;

public class User {

	public final String emotionalStateSad = "sad";
	public final String emotionalStateHappy = "happy";
	public final String emotionalStateMelancholic = "melancholic";
	
	private Long id;
	private String name;
	private String surname;
	private Long credits;
	
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSurname() {
		return surname;
	}
	public void setSurname(String surname) {
		this.surname = surname;
	}
	public Long getCredits() {
		return credits;
	}
	public void setCredits(Long credits) {
		this.credits = credits;
	}
	
}
