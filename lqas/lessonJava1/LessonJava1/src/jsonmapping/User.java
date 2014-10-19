package jsonmapping;

public class User {
	
	private String firstName;
	private String lastName;
	private Join joined;
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastName() {
		return lastName;
	}
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	public Join getJoined() {
		return joined;
	}
	public void setJoined(Join joined) {
		this.joined = joined;
	}

}
