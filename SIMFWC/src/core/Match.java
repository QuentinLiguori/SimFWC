package core;
import data.Team;

public class Match {
	
	private int scoreA;
	private int scoreB;
	private String winner;
	private String looser;
	
	public Match(Team teamA, Team teamB) {
		teamA.getScoreTeam();
		teamB.getScoreTeam();
	}
}
