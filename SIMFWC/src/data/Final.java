package data;

import core.Match;

public class Final {
	
	private Team teamA;
	private Team teamB;
	private Team teamC;
	private Team teamD;
	
	private Team first;
	private Team second;
	private Team third;
	
	public Final(Team teamA, Team teamB, Team teamC, Team teamD) {
		
		setTeamA(teamA);
		setTeamB(teamB);
		setTeamC(teamC);
		setTeamD(teamD);
	}

	
	
	public void playFinal() {
		
		Match Final = new Match(teamA,teamB);
		Final.matchFlow();
		
		setFirst(Final.getWinner());
		setSecond(Final.getLooser());
		
		System.out.println("Résultats de la Finale");
		System.out.println(Final.getFinalScore() );
		
		Match playOff = new Match(teamC,teamD);
		playOff.matchFlow();
		
		setThird(playOff.getWinner());
		
		System.out.println("Résultats de la petite Finale");
		System.out.println(playOff.getFinalScore() );
		
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



	/**
	 * @return the first
	 */
	public Team getFirst() {
		return first;
	}



	/**
	 * @param first the first to set
	 */
	public void setFirst(Team first) {
		this.first = first;
	}



	/**
	 * @return the second
	 */
	public Team getSecond() {
		return second;
	}



	/**
	 * @param second the second to set
	 */
	public void setSecond(Team second) {
		this.second = second;
	}



	/**
	 * @return the third
	 */
	public Team getThird() {
		return third;
	}



	/**
	 * @param third the third to set
	 */
	public void setThird(Team third) {
		this.third = third;
	}
}