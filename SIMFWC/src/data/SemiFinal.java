package data;
import core.Match;
import data.Team;

public class SemiFinal {
	
	private Team teamA;
	private Team teamB;
	private Team teamC;
	private Team teamD;
	
	private Team winnerA;
	private Team winnerB;
	private Team looserA;
	private Team looserB;
	
	
	public SemiFinal(Team teamA, Team teamB, Team teamC, Team teamD) {
		
		setTeamA(teamA);
		setTeamB(teamB);
		setTeamC(teamC);
		setTeamD(teamD);
	}

	
	
	public void play() {
		
		Match firstSemiFinal = new Match(teamA,teamB);
		firstSemiFinal.matchFlowFinal();
		
		setWinnerA(firstSemiFinal.getWinner());
		setLooserA(firstSemiFinal.getLooser());
		
		System.out.println("Resultats de la premiere demi-Finale");
		System.out.println(firstSemiFinal.getFinalScore() );
		
		Match secondSemiFinal = new Match(teamC,teamD);
		secondSemiFinal.matchFlowFinal();
		
		setWinnerB(secondSemiFinal.getWinner());
		setLooserB(secondSemiFinal.getLooser());

		
		System.out.println("Resultats de la deuxieme demi-Finale");
		System.out.println(secondSemiFinal.getFinalScore() );

		
		
	}
	/**
	 * @return the winnerA
	 */
	public Team getWinnerA() {
		return winnerA;
	}



	/**
	 * @param winnerA the winnerA to set
	 */
	public void setWinnerA(Team winnerA) {
		this.winnerA = winnerA;
	}



	/**
	 * @return the winnerB
	 */
	public Team getWinnerB() {
		return winnerB;
	}



	/**
	 * @param winnerB the winnerB to set
	 */
	public void setWinnerB(Team winnerB) {
		this.winnerB = winnerB;
	}



	/**
	 * @return the looserA
	 */
	public Team getLooserA() {
		return looserA;
	}



	/**
	 * @param looserA the looserA to set
	 */
	public void setLooserA(Team looserA) {
		this.looserA = looserA;
	}



	/**
	 * @return the looserB
	 */
	public Team getLooserB() {
		return looserB;
	}



	/**
	 * @param looserB the looserB to set
	 */
	public void setLooserB(Team looserB) {
		this.looserB = looserB;
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
