package core;
import data.Team;

public class Match {

	private int scoreA;
	private int scoreB;
	private Team teamA;
	private Team teamB;

	/**
	 * Constructor of a match between two teams
	 * @param teamA
	 * @param teamB
	 */
	public Match(Team teamA, Team teamB) {
		this.scoreA = 0;
		this.scoreB = 0;
		this.teamA = teamA;
		this.teamB = teamB;
	}

	/**
	 * @return the scoreB
	 */
	public int getScoreB() {
		return scoreB;
	}

	/**
	 * @param scoreB the scoreB to set
	 */
	public void setScoreB(int scoreB) {
		this.scoreB = scoreB;
	}

	/**
	 * @return the scoreA
	 */
	public int getScoreA() {
		return scoreA;
	}

	/**
	 * @param scoreA the scoreA to set
	 */
	public void setScoreA(int scoreA) {
		this.scoreA = scoreA;
	}

	/**
	 * 
	 * @param teamA
	 * @param teamB
	 */
	public void randomEvents(Team teamA, Team teamB) {
		int deltaA = 0, deltaB = 0;
		
		//random events modify teamI.power
		
		teamA.setPowerTeam(teamA.getPowerTeam()-deltaA);
		teamB.setPowerTeam(teamB.getPowerTeam()-deltaB);
	}

	public void matchFlow() {
		//up the team's power
		int winningLuckA;
		int winningLuckB;
		randomEvents(teamA, teamB);

		winningLuckA = (teamA.getPowerTeam() + teamA.getScoreTeam())/2;
		winningLuckB = (teamB.getPowerTeam() + teamB.getScoreTeam())/2;

		if (winningLuckA>winningLuckB) {
			do {
				setScoreA((int)Math.random() * 8);
				setScoreB((int)Math.random() * 8);
			}while(scoreA<=scoreB);

		}
		else if (winningLuckA<winningLuckB) {
			do {
				setScoreA((int)Math.random() * 8);
				setScoreB((int)Math.random() * 8);
			}while(scoreA>=scoreB);
		}
		else {
			setScoreA((int)Math.random() * 8);
			setScoreB(scoreA);
		}
	}
	
	/**
	 * @return the teamA
	 */
	public Team getTeamA() {
		return teamA;
	}

	/**
	 * @return the teamB
	 */
	public Team getTeamB() {
		return teamB;
	}

	/**
	 * 
	 * @return
	 */
	public Boolean equality() {
		if (scoreA==scoreB) {
			return true;
		}
		else {
			return false;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Team getWinner() {
		if(scoreA<scoreB) {
			return teamB;
		}
		else {
		return teamA;
		}
	}

	/**
	 * 
	 * @return
	 */
	public Team getLooser() {
		if(scoreA>scoreB) {
			return teamB;
		}
		else {
		return teamA;
		}
	}

	/**
	 * 
	 * @return
	 */
	public String getFinalScore() {
		return teamA.getCountry() + " : " +this.scoreA+"\n"+teamA.getCountry()+ " : " +this.scoreA+"\n";
	}
}
