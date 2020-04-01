package data;

public class Coach {
	/**
	 * Last name of a coach
	 */
	private String lastName;
	
	/**
	 * First name of a coach
	 */
	private String firstName;
	
	/**
	 * Age of a coach
	 */
	private int age;
	
	/**
	 * Nationality of a coach
	 */
	private String nationality;
	
	/**
	 * Level of a coach
	 */
	private int level;
	
	/**
	 *Constructor of a Coach
	 * @param lastName
	 * @param firstName
	 * @param age
	 * @param nationality
	 * @param level
	 */
	public Coach(String lastName, String firstName, int age, String nationality, int level) {
		setLastName(lastName);
		setFirstName(firstName);
		setAge(age);
		setNationality(nationality);
		setLevel(level);
		
	}

	/**
	 * @return the lastName
	 */
	public String getLastName() {
		return lastName;
	}
	/**
	 * @param lastName the lastName to set
	 */
	public void setLastName(String lastName) {
		this.lastName = lastName;
	}
	/**
	 * @return the firstName
	 */
	public String getFirstName() {
		return firstName;
	}
	/**
	 * @param firstName the firstName to set
	 */
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	/**
	 * @return the age
	 */
	public int getAge() {
		return age;
	}
	/**
	 * @param age the age to set
	 */
	public void setAge(int age) {
		this.age = age;
	}
	/**
	 * @return the nationality
	 */
	public String getNationality() {
		return nationality;
	}
	/**
	 * @param nationnality the nationality to set
	 */
	public void setNationality(String nationnality) {
		this.nationality = nationnality;
	}
	/**
	 * @return the level
	 */
	public int getLevel() {
		return level;
	}
	/**
	 * @param level the level to set
	 */
	public void setLevel(int level) {
		this.level = level;
	}

	@Override
	public String toString() {
		return "Coach [lastName=" + lastName + ", firstName=" + firstName + ", age=" + age + ", nationality="
				+ nationality + ", level=" + level + "]";
	}
	
	
}