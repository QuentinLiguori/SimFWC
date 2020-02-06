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
		this.teamA.setPowerTeam(teamA.getScoreTeam()); 
		this.teamB.setPowerTeam(teamB.getScoreTeam());
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
		int eventOccured, teamChoosen;
		int nbEvent = (int) (Math.random() * 10);
		for (int i = 0; i < nbEvent; i++) {
			eventOccured = (int) (Math.random() * 6);
			teamChoosen  = (int) (Math.random() * 2);
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
	public void matchFlow() {
		//up the team's power
		int winningLuckA;
		int winningLuckB;
		randomEvents(teamA, teamB);

		winningLuckA = teamA.getPowerTeam();
		winningLuckB = teamB.getPowerTeam();
		
		if (winningLuckA<winningLuckB) {
			do {
				setScoreA((int)(Math.random() * 8));
				setScoreB((int)(Math.random() * 8));
			}while(scoreA >= scoreB);

		}
		
		else if (winningLuckA > winningLuckB) {
			do {
				setScoreA((int)(Math.random() * 8));
				setScoreB((int)(Math.random() * 8));
			}while(scoreA <= scoreB);
		}
		else {
			do {
				setScoreA((int)(Math.random() * 2));
				setScoreB((int)(Math.random() * 2));
			}while(scoreA == scoreB);
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
