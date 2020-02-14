package data;

import data.Coach;
import data.Player;

public class Team {
	
	private int groupStageScore = 0;
	

	/**
	 * Positions of the players on the soccer field
	 */
	private String formation;
	
	/**
	 * Country represented by the team
	 */
	private String country;
	
	/**
	 * Array of the players in the team
	 */
	private Player[] players;
	
	/**
	 * Array of the coachs of the team
	 */
	private Coach[] coachs;
	
	/**
	 * Game tactics of the team 
	 */
	private String tactic;

	/**
	 * Static score of the team
	 */
	private int scoreTeam;
	
	/**
	 * power of team
	 */
	private int powerTeam; 
	
	
	/**
	 * @return the scoreTeam
	 */
	public int getScoreTeam() {
		return scoreTeam;
	}
	
	/**
	 * Constructor of a team
	 * @param formation
	 * @param country
	 * @param players
	 * @param coachs
	 * @param tactic
	 */
	public Team(String formation, String country, Player[] players, Coach[] coachs, String tactic) {
		super();
		this.formation = formation;
		this.country = country;
		this.players = players;
		this.coachs = coachs;
		this.tactic = tactic;
		setScoreTeam(players);
		setPowerTeam(getScoreTeam());
	}

	/**
	 * Set the score of the team from the global score of each player
	 * @param players
	 */
	public void setScoreTeam(Player[] players) {
		int i=0, score=0;
		for (Player p : players){
			i++;
			score += p.getGlobalScore();
		}
		this.scoreTeam=score/i;
	}

	/**
	 * @return the powerTeam
	 */
	public int getPowerTeam() {
		return powerTeam;
	}

	/**
	 * @param powerTeam the powerTeam to set
	 */
	public void setPowerTeam(int power) {
		this.powerTeam = power;
	}
	
	/**
	 * @return the formation
	 */
	public String getFormation() {
		return formation;
	}

	/**
	 * @param formation the formation to set
	 */
	public void setFormation(String formation) {
		this.formation = formation;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Player[] players) {
		this.players = players;
	}

	/**
	 * @return the coachs
	 */
	public Coach[] getCoachs() {
		return coachs;
	}

	/**
	 * @param coachs the coachs to set
	 */
	public void setCoachs(Coach[] coachs) {
		this.coachs = coachs;
	}

	/**
	 * @return the tactic
	 */
	public String getTactic() {
		return tactic;
	}

	/**
	 * @param tactic the tactic to set
	 */
	public void setTactic(String tactic) {
		this.tactic = tactic;
	}
	/**
	 * @return the groupStageScore
	 */
	public int getGroupStageScore() {
		return groupStageScore;
	}

	/**
	 * @param groupStageScore the groupStageScore to set
	 */
	public void setGroupStageScore(int groupStageScore) {
		this.groupStageScore = groupStageScore;
	}

}
