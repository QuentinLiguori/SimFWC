package core;
import java.util.Random;

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
		int eventOccured=0, teamChoosen=0;
		int nbEvent = new Random().nextInt(5);
		
		for (int i = 0; i < nbEvent; i++) {
			eventOccured = new Random().nextInt(6);
			teamChoosen = new Random().nextInt(2);
			if (teamChoosen==0) {
				event(eventOccured, teamA);
			}
			else {
				event(eventOccured, teamB);
			}
		}
		
	}
	
	/**
	 * Modify a team's power according to the event's type
	 * @param typeEvent
	 * @param team
	 */
	public void event(int typeEvent, Team team) {
		switch (typeEvent) {
		
		case 0:
			//blessure
			team.setPowerTeam(team.getPowerTeam()-5);
			break;
		
		case 1:
			//carton jaune
			team.setPowerTeam(team.getPowerTeam()-2);
			break;
		
		case 2:
			//carton jaune
			team.setPowerTeam(team.getPowerTeam()-2);
			break;
		case 3:
			//exchange player
			team.setPowerTeam(team.getPowerTeam()+2);
			break;
		
		case 4:
			//exchange player
			team.setPowerTeam(team.getPowerTeam()+2);
			break;
		
		default:
			//carton rouge
			team.setPowerTeam(team.getPowerTeam()-4);
			break;
		}
	}

	/**
	 * Flow of the match
	 */
	//ERROR HERE
	public void matchFlow() {
		//up the team's power
		int winningLuckA, winningLuckB;
				
		randomEvents(teamA, teamB);
		
		winningLuckA = (teamA.getPowerTeam() + teamA.getScoreTeam())/2;
		winningLuckB = (teamB.getPowerTeam() + teamB.getScoreTeam())/2;

		//The teamA won the match
		if (winningLuckA>winningLuckB) {
			do {
				setScoreA(new Random().nextInt(8));
				setScoreB(new Random().nextInt(8));
			}while(scoreA<=scoreB);

		}
		
		//The teamB won the match
		else if (winningLuckA<winningLuckB) {
			 do {
				setScoreA(new Random().nextInt(8));
				setScoreB(new Random().nextInt(8));
			} while(scoreA>=scoreB);
		}
		
		//The match was a draw
		else {
			setScoreA(new Random().nextInt(8));
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
	 * @return the team which has won the match
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
	 * @return the team which has loosed the match
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
	 * @return the finals score of the match
	 */
	public String getFinalScore() {
		return "\n*********\n Results \n*********\n" + teamA.getCountry() + " : " +this.scoreA+"\n"+teamB.getCountry()+ " : " +this.scoreB+"\n";
	}
}
