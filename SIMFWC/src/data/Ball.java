package data;

public class Ball {

	private Player holder;
	private Team countryHolder;
	
	public Ball(Player first, Team countryHolder){
		setHolder(first);
		setCountryHolder(countryHolder);
	}
	
	/**
	 * @return the countryHolder
	 */
	public Team getCountryHolder() {
		return countryHolder;
	}

	/**
	 * @param countryHolder the countryHolder to set
	 */
	public void setCountryHolder(Team countryHolder) {
		this.countryHolder = countryHolder;
	}

	/**
	 * @return the holder
	 */
	public Player getHolder() {
		return holder;
	}

	/**
	 * @param holder the holder to set
	 */
	public void setHolder(Player holder) {
		this.holder = holder;
	}

}
