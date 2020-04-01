package core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import data.Player;
import data.Team;

public class Match {

	private int scoreA;
	private int scoreB;
	private Team teamA;
	private Team teamB;
	private HashMap<String,ArrayList<Player> > details_Team1 = new HashMap<String,ArrayList<Player> >();
	private HashMap<String,ArrayList<Player> > details_Team2 = new HashMap<String,ArrayList<Player> >();
	private static int value_random = 5;

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
		int nbEvent = new Random().nextInt(15);
		
		/*initialization of event lists for both teams */
		
		ArrayList<Player> yellow_card1 = new ArrayList<Player>();
		ArrayList<Player> red_card1 = new ArrayList<Player>();
		ArrayList<Player> injury1 = new ArrayList<Player>();
		ArrayList<Player> change1 = new ArrayList<Player>();
		
		ArrayList<Player> yellow_card2 = new ArrayList<Player>();
		ArrayList<Player> red_card2 = new ArrayList<Player>();
		ArrayList<Player> injury2 = new ArrayList<Player>();
		ArrayList<Player> change2 = new ArrayList<Player>();
		
		/**end**/
		
		/** To avoid duplicates in the choice of players */
		ArrayList<Player> yellow_registre1 = new ArrayList<Player>();
		ArrayList<Player> red_card_registre1 = new ArrayList<Player>();
		ArrayList<Player> injury_registre1 = new ArrayList<Player>();
		ArrayList<Player> change_registre1 = new ArrayList<Player>();
		
		ArrayList<Player> yellow_card_registre2 = new ArrayList<Player>();
		ArrayList<Player> red_card_registre2 = new ArrayList<Player>();
		ArrayList<Player> injury_registre2 = new ArrayList<Player>();
		ArrayList<Player> change_registre2 = new ArrayList<Player>();
		/** end **/
		for (int i = 0; i < nbEvent; i++) {
			eventOccured = new Random().nextInt(6);
			teamChoosen = new Random().nextInt(2);
			
			if (teamChoosen==0) {
				event(eventOccured, teamA);
				if(eventOccured == 0 ) {
					//injury
					Player player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					while(injury_registre1.contains(player)) {
						player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					}
					injury1.add(player);
					injury_registre1.add(player);
				} 
				else if( eventOccured == 1 ||  eventOccured == 2 ){
					//yellow_card
					Player player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					while(yellow_registre1.contains(player)) {
						player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					}
					yellow_card1.add(player);
					yellow_registre1.add(player);
				}
				else if( eventOccured == 3 || eventOccured == 4 ) {
					//echange
					Player player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					while(change_registre1.contains(player)) {
						player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					}
					change1.add(player);
					change_registre1.add(player);
				}
				 else {
					//red_card for team A
					Player player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					while(red_card_registre1.contains(player)) {
						player =  teamA.getPlayers()[(int)(Math.random() * teamA.getPlayers().length)];
					}
					red_card1.add(player);
					red_card_registre1.add(player);
				}
				
			}
			else {
				event(eventOccured, teamB);
				if(eventOccured == 0 ) {
					//injury  for team B
					Player player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					while(injury_registre2.contains(player)) {
						player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					}
					injury2.add(player);
					injury_registre2.add(player);
				} 
				else if( eventOccured == 1 ||  eventOccured == 2 ){
					//yellow card  for team B
					Player player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					while(yellow_card_registre2.contains(player)) {
						player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					}
					yellow_card2.add(player);
					yellow_card_registre2.add(player);
				}
				else if( eventOccured == 3 || eventOccured == 4 ) {
					//echange  for team B
					Player player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					while(change_registre2.contains(player)) {
						player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					}
					change2.add(player);
					change_registre1.add(player);
				}
				else {
					//red card for team B
					Player player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					while(red_card_registre2.contains(player)) {
						player =  teamB.getPlayers()[(int)(Math.random() * teamB.getPlayers().length)];
					}
					red_card2.add(player);
					red_card_registre2.add(player);
				}
			}
			
		}
		
		details_Team1.put("blessure", injury1);
		details_Team1.put("jaune", yellow_card1);
		details_Team1.put("rouge", red_card1);
		details_Team1.put("changement", change1);
		
		details_Team2.put("blessure", injury2);
		details_Team2.put("jaune", yellow_card2);
		details_Team2.put("rouge", red_card2);
		details_Team2.put("changement", change2);
		
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
			team.setPowerTeam(team.getPowerTeam()-15);
			break;
		
		case 1:
			//carton jaune
			team.setPowerTeam(team.getPowerTeam()-10);
			break;
		
		case 2:
			//carton jaune
			team.setPowerTeam(team.getPowerTeam()-10);
			break;
		case 3:
			//exchange player
			team.setPowerTeam(team.getPowerTeam()+10);
			break;
		
		case 4:
			//exchange player
			team.setPowerTeam(team.getPowerTeam()+10);
			break;
		
		default:
			//carton rouge
			team.setPowerTeam(team.getPowerTeam()-20);
			break;
		}
	}

	/**
	 * Flow of the match
	 */
	public void matchFlow() {
		//up the team's power
		int winningLuckA, winningLuckB;
				
		randomEvents(teamA, teamB);
		
		winningLuckA = (teamA.getPowerTeam() + teamA.getScoreTeam())/2;
		winningLuckB = (teamB.getPowerTeam() + teamB.getScoreTeam())/2;

		//The teamA won the match
		if (winningLuckA>winningLuckB) {
			do {
				setScoreA(new Random().nextInt(value_random));
				setScoreB(new Random().nextInt(value_random));
			}while(scoreA<=scoreB);

		}
		
		//The teamB won the match
		else if (winningLuckA<winningLuckB) {
			 do {
				setScoreA(new Random().nextInt(value_random));
				setScoreB(new Random().nextInt(value_random));
			} while(scoreA>=scoreB);
		}
		
		//The match was a draw
		else {
			setScoreA(new Random().nextInt(value_random));
			setScoreB(scoreA);
		}
	}
	
	/**
	 * Flow of the match
	 */
	public void matchFlowFinal() {
		//up the team's power
		int winningLuckA, winningLuckB;
				
		randomEvents(teamA, teamB);
		
		winningLuckA = (teamA.getPowerTeam() + teamA.getScoreTeam())/2;
		winningLuckB = (teamB.getPowerTeam() + teamB.getScoreTeam())/2;
		
		//The teamA won the match
		if (winningLuckA>winningLuckB) {
			do {
				setScoreA(new Random().nextInt(value_random));
				setScoreB(new Random().nextInt(value_random));
			}while(scoreA<=scoreB);

		}
		
		//The teamB won the match
		else if (winningLuckA<winningLuckB) {
			 do {
				setScoreA(new Random().nextInt(value_random));
				setScoreB(new Random().nextInt(value_random));
			} while(scoreA>=scoreB);
		}
		
		//The match was a draw
		else {
			do {
				setScoreA(new Random().nextInt(value_random));
				setScoreB(new Random().nextInt(value_random));
			} while(scoreA==scoreB);
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



	public HashMap<String, ArrayList<Player>> getDetails_Team1() {
		return details_Team1;
	}

	public HashMap<String, ArrayList<Player>> getDetails_Team2() {
		return details_Team2;
	}	
}
