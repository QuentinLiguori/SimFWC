package core;
import data.Team;

public class Match {
	
	private int scoreA;
	private int scoreB;
	private Team teamA;
	private Team teamB;
	
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

	public Match(Team teamA, Team teamB) {
		this.scoreA = 0;
		this.scoreB = 0;
		teamA.getScoreTeam();
		teamB.getScoreTeam();
	}
	
	public void matchFlow() {
		
		
	}
	
	public Team getWinner() {
		
		return teamA;
		}
	
	public Team getLooser() {
		return teamA;
		}
	
	public String getFinalScore() {
		return teamA.getCountry() + " : " +this.scoreA+"\n"+teamA.getCountry()+ " : " +this.scoreA+"\n";
	}
}
