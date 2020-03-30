package core;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;

import data.Ball;
import data.Event;
import data.Player;
import data.Team;

public class Match {

	private int scoreA;
	private int scoreB;
	private Team teamA;
	private Team teamB;
	private HashMap<String,ArrayList<Player> > details_Team1 = new HashMap<String,ArrayList<Player> >();
	private HashMap<String,ArrayList<Player> > details_Team2 = new HashMap<String,ArrayList<Player> >();
	private Ball ball;
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
	 * 
	 * @param teamA
	 * @param teamB
	 * @return
	 */
	public ArrayList<Event> randomEvents(Team teamA, Team teamB) {
		//Number of Event in a Game
		int nbEventAdd = new Random().nextInt(60);
		int nbEvent = 450 +nbEventAdd;
		
		int changeTeamA = 3;
		int changeTeamB = 3;
		// Array of all Event that occured during the game
		ArrayList<Event> matchEvent = new ArrayList<>();
		//Set the first holder of the game to start the game
		ball = new Ball(teamA.getOnePlayer(),teamA);
		//First event, a pass(engagement)
		Event event = new Event("pass");
		event.firstPass(ball.getHolder(), teamA.getOnePlayer());
		matchEvent.add(event);
		
		
		for(int i = 0; i < nbEvent; i++) {
			Event eventi = new Event();
			int eventOccured = new Random().nextInt(10);
			switch(eventOccured) {
			case 0:
				//passe
				passes(eventi);
				matchEvent.add(eventi);
				break;
			case 1:
				//passe
				passes(eventi);
				//matchEvent.add("pass");
				break;
			case 2:
				//faute
				if(ball.getCountryHolder()==teamA) {
					eventi.fault(ball.getHolder(),teamB.getOnePlayer());
				}
				else {
					eventi.fault(ball.getHolder(), teamA.getOnePlayer());
				}
				
				//matchEvent.add("faute");
				break;
			case 3:
				//changement
				int teamChange = new Random().nextInt(2);
				if(teamChange==1) {
					/*if(changeTeamA!=0) {
						changeTeamA= changeTeamA-1;
						Player starterToBench = teamA.getOnePlayer();
						Player benchToStarter = teamA.changement(starterToBench);
						teamA.setPowerTeam(teamA.getStarterPlayers());
						eventi.setMatchDetail(String.format("Changement dans l'equipe %s, %s remplacé par %s",teamA.getCountry(),starterToBench.getName(),benchToStarter.getName()));
					}*/
				}
				else {
					/*if(changeTeamB!=0) {
						changeTeamB= changeTeamB-1;
						Player starterToBench = teamB.getOnePlayer();
						Player benchToStarter = teamB.changement(starterToBench);
						teamB.setPowerTeam(teamB.getStarterPlayers());
						eventi.setMatchDetail(String.format("Changement dans l'equipe %s, %s remplacé par %s",teamB.getCountry(),starterToBench.getName(),benchToStarter.getName()));
					}*/
				}
				//matchEvent.add("changement");
				break;
			case 4:
				//passe
				passes(eventi);
				//matchEvent.add("pass");
				break;
			case 5:
				//tir
				int regulShoot = new Random().nextInt(4);
				if(regulShoot == 1) {
					eventi.setType("shoot");
					if(ball.getCountryHolder() == teamA) {
						if(scoreA<=scoreB) {
							if(eventi.shoot(ball.getHolder(),teamA, teamB.getGoalPlayer(),teamB)) {
								scoreA+=1;
								teamA.setPowerTeam(teamA.getPowerTeam()-5);
								ball.setHolder(teamB.getAttackPlayer());
								ball.setCountryHolder(teamB);
								eventi.setType("pass");
								eventi.firstPass(ball.getHolder(), ball.getCountryHolder().getAttackPlayer());
							}
							else {
								teamB.setPowerTeam(teamB.getPowerTeam()-5);
								ball.setHolder(teamB.getGoalPlayer());
								ball.setCountryHolder(teamB);
								passes(eventi);
								
							}
						}
						else {
							int regulScore = new Random().nextInt(3);
							if(regulScore != 1) {
								if(eventi.shoot(ball.getHolder(),teamA, teamB.getGoalPlayer(),teamB)) {
									scoreA+=1;
									teamA.setPowerTeam(teamA.getPowerTeam()-5);
									ball.setHolder(teamB.getAttackPlayer());
									ball.setCountryHolder(teamB);
									eventi.setType("pass");
									eventi.firstPass(ball.getHolder(), ball.getCountryHolder().getAttackPlayer());
								}
								else {
									teamB.setPowerTeam(teamB.getPowerTeam()-5);
									ball.setHolder(teamB.getGoalPlayer());
									ball.setCountryHolder(teamB);
									passes(eventi);
									
								}
							}
						}
					}
					else {
						if(scoreB<=scoreA) {
							if(eventi.shoot(ball.getHolder(),teamB, teamA.getGoalPlayer(),teamA)) {
								scoreB+=1;
								teamB.setPowerTeam(teamB.getPowerTeam()-5);
								ball.setHolder(teamA.getAttackPlayer());
								ball.setCountryHolder(teamA);
								eventi.setType("pass");
								eventi.firstPass(ball.getHolder(), ball.getCountryHolder().getAttackPlayer());
							}
							else {
								teamA.setPowerTeam(teamA.getPowerTeam()-5);
								ball.setHolder(teamA.getGoalPlayer());
								ball.setCountryHolder(teamA);
								passes(eventi);
								
							}
						}
						else {
							int regulScore = new Random().nextInt(3);
							if(regulScore != 1) {
								if(eventi.shoot(ball.getHolder(),teamB, teamA.getGoalPlayer(),teamA)) {
									scoreB+=1;
									teamB.setPowerTeam(teamB.getPowerTeam()-5);
									ball.setHolder(teamA.getAttackPlayer());
									ball.setCountryHolder(teamA);
									eventi.setType("pass");
									eventi.firstPass(ball.getHolder(), ball.getCountryHolder().getAttackPlayer());
								}
								else {
									teamA.setPowerTeam(teamA.getPowerTeam()-5);
									ball.setHolder(teamA.getGoalPlayer());
									ball.setCountryHolder(teamA);
									passes(eventi);
								}
							}
						}
						
					}
				}
				
				
				//matchEvent.add(eventi);
				break;
			case 6:
				//passe
				passes(eventi);
				//matchEvent.add("pass");
				break;
			case 7:
				//tacle
				if(ball.getCountryHolder()==teamA) {
					Player tackleGuy = teamB.getOnePlayer();
					int result = eventi.tackle(ball.getHolder(), ball.getCountryHolder(),tackleGuy , teamB);
					if(result==2) {
						teamA.setPowerTeam(teamA.getPowerTeam()-4);
					}
					else if(eventi.tackle(ball.getHolder(), ball.getCountryHolder(), teamB.getOnePlayer(), teamB)==3) {
						ball.setHolder(tackleGuy);
						ball.setCountryHolder(teamB);
					}
				}
				else {
					Player tackleGuy = teamA.getOnePlayer();
					int result = eventi.tackle(ball.getHolder(), ball.getCountryHolder(),tackleGuy , teamA);
					if(result==2) {
						teamB.setPowerTeam(teamB.getPowerTeam()-4);
					}
					else if(eventi.tackle(ball.getHolder(), ball.getCountryHolder(), teamA.getOnePlayer(), teamA)==3) {
						ball.setHolder(tackleGuy);
						ball.setCountryHolder(teamA);
					}
				}
				//matchEvent.add("tacle");
				break;
			case 8:
				//passe
				passes(eventi);
				//matchEvent.add("pass");
				break;
			case 9:
				//passe
				passes(eventi);
				//matchEvent.add("pass");
				break;
				
			}
			//System.out.println(eventi.getMatchDetail());
		}
		
		return matchEvent;
	}

	/**
	 * Flow of the match
	 */
	public void matchFlow() {
		//up the team's power
		int winningLuckA, winningLuckB;
				
		randomEvents(teamA, teamB);
		
		/*winningLuckA = (teamA.getPowerTeam() + teamA.getScoreTeam())/2;
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
		}*/
	}
	
	/**
	 * Flow of the match
	 */
	public void matchFlowFinal() {
		//up the team's power
		int winningLuckA, winningLuckB;
		
		do {
			randomEvents(teamA, teamB);
		}while(scoreA==scoreB);
		
		
		/*winningLuckA = (teamA.getPowerTeam() + teamA.getScoreTeam())/2;
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
			do {
				setScoreA(new Random().nextInt(8));
				setScoreB(new Random().nextInt(8));
			} while(scoreA==scoreB);
		}*/
	}
	
	
	public void passes(Event eventi) {
		
		eventi.setType("pass");
		Player destination;
		do {
			destination = ball.getCountryHolder().getOnePlayer();
		}
		while(destination==ball.getHolder()); 
		if(teamA == ball.getCountryHolder()) {
			Player newHolder = eventi.pass(ball.getHolder(), destination, teamB.getOnePlayer());
			if(newHolder == destination) {
				ball.setHolder(newHolder);
			}
			else {
				ball.setHolder(newHolder);
				ball.setCountryHolder(teamB);
			}
		}
		else {
			Player newHolder = eventi.pass(ball.getHolder(), destination, teamA.getOnePlayer());
			if(newHolder == destination) {
				ball.setHolder(newHolder);
			}
			else {
				ball.setHolder(newHolder);
				ball.setCountryHolder(teamA);
			}
		}
		
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
