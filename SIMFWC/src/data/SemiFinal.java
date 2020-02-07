package data;
import data.Team;

public class SemiFinal {
	
	private Team teamA;
	private Team teamB;
	private Team teamC;
	private Team teamD;
	
	public SemiFinal(Team teamA, Team teamB, Team teamC, Team teamD) {
		
		setTeamA(teamA);
		setTeamB(teamB);
		setTeamC(teamC);
		setTeamD(teamD);
	}

	/**
	 * @return the teamA
	 */
	public Team getTeamA() {
		return teamA;
	}

	/**
	 * @param teamA the teamA to set
	 */
	public void setTeamA(Team teamA) {
		this.teamA = teamA;
	}

	/**
	 * @return the teamB
	 */
	public Team getTeamB() {
		return teamB;
	}

	/**
	 * @param teamB the teamB to set
	 */
	public void setTeamB(Team teamB) {
		this.teamB = teamB;
	}

	/**
	 * @return the teamC
	 */
	public Team getTeamC() {
		return teamC;
	}

	/**
	 * @param teamC the teamC to set
	 */
	public void setTeamC(Team teamC) {
		this.teamC = teamC;
	}

	/**
	 * @return the teamD
	 */
	public Team getTeamD() {
		return teamD;
	}

	/**
	 * @param teamD the teamD to set
	 */
	public void setTeamD(Team teamD) {
		this.teamD = teamD;
	}
}

	