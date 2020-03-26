package data;

public class Ball {

	private Player holder;
	
	public Ball(Player first){
		setHolder(first);
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
