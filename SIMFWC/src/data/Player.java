package data;

public class Player {
	
	// Basic Info of the player //
	private String name;
	private String firstName;
	private int age;
	private int weight;
	private int height;
	private String position;
	
	// Statistics of the player //
	private int speed;
	private int center;
	private int pass;
	private int header;
	private int shoot;
	private int energy;
	private int power;
	private int tackle;
	
	// Global stats of the player // 
	
	private int globalScore;
	
	// Object's Constructor //
	
	public Player(String name, String firstName, int age, int weight, int height, String position, int speed, int center, int pass, int header, int shoot, int energy, int power, int tackle) {
		
		setName(name);
		setFirstName(firstName);
		setAge(age);
		setWeight(weight);
		setHeight(height);
		setPosition(position);
		setSpeed(speed);
		setCenter(center);
		setPass(pass);
		setHeader(header);
		setShoot(shoot);
		setEnergy(energy);
		setPower(power);
		setTackle(tackle);
		setGlobalScore(speed, center, pass, header, shoot, energy, power, tackle);
		
	}
	
	
	
	// Getter and Setter of each attribute //

	/**
	 * @return the name
	 */
	public String getName() {
		return name;
	}

	/**
	 * @param name the name to set
	 */
	public void setName(String name) {
		this.name = name;
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
	 * @return the weight
	 */
	public int getWeight() {
		return weight;
	}

	/**
	 * @param weight the weight to set
	 */
	public void setWeight(int weight) {
		this.weight = weight;
	}

	/**
	 * @return the height
	 */
	public int getHeight() {
		return height;
	}

	/**
	 * @param height the height to set
	 */
	public void setHeight(int height) {
		this.height = height;
	}

	/**
	 * @return the position
	 */
	public String getPosition() {
		return position;
	}

	/**
	 * @param position the position to set
	 */
	public void setPosition(String position) {
		this.position = position;
	}

	/**
	 * @return the speed
	 */
	public int getSpeed() {
		return speed;
	}

	/**
	 * @param speed the speed to set
	 */
	public void setSpeed(int speed) {
		this.speed = speed;
	}

	/**
	 * @return the center
	 */
	public int getCenter() {
		return center;
	}

	/**
	 * @param center the center to set
	 */
	public void setCenter(int center) {
		this.center = center;
	}

	/**
	 * @return the pass
	 */
	public int getPass() {
		return pass;
	}

	/**
	 * @param pass the pass to set
	 */
	public void setPass(int pass) {
		this.pass = pass;
	}

	/**
	 * @return the header
	 */
	public int getHeader() {
		return header;
	}

	/**
	 * @param header the header to set
	 */
	public void setHeader(int header) {
		this.header = header;
	}

	/**
	 * @return the shoot
	 */
	public int getShoot() {
		return shoot;
	}

	/**
	 * @param shoot the shoot to set
	 */
	public void setShoot(int shoot) {
		this.shoot = shoot;
	}

	/**
	 * @return the energy
	 */
	public int getEnergy() {
		return energy;
	}

	/**
	 * @param energy the energy to set
	 */
	public void setEnergy(int energy) {
		this.energy = energy;
	}

	/**
	 * @return the power
	 */
	public int getPower() {
		return power;
	}

	/**
	 * @param power the power to set
	 */
	public void setPower(int power) {
		this.power = power;
	}

	/**
	 * @return the tackle
	 */
	public int getTackle() {
		return tackle;
	}

	/**
	 * @param tackle the tackle to set
	 */
	public void setTackle(int tackle) {
		this.tackle = tackle;
	}

	/**
	 * @return the globalScore
	 */
	public int getGlobalScore() {
		return globalScore;
	}

	/**
	 * Calculation of the global stats
	 * @param globalScore the globalScore to set
	 */
	
	public void setGlobalScore(int speed, int center, int pass, int header, int shoot, int energy, int power, int tackle) {		
		this.globalScore = (speed + center + pass + header + shoot + energy + power + tackle)/8;
	}
	
	
	
	
	
}
