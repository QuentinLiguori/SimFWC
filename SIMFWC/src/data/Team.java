package data;

import java.util.ArrayList;

import data.Coach;
import data.Player;

public class Team {
	
	private int groupStageScore = 0;
	
	
	private String flag;

	/**
	 * Positions of the players on the soccer field
	 */
	private String formation;
	
	/**
	 * Country represented by the team
	 */
	private String country;
	
	/**
	 * Array of the players in the team
	 */
	private Player[] players;
	
	/**
	 * Array of the coachs of the team
	 */
	private Coach[] coachs;
	
	/**
	 * Game tactics of the team 
	 */
	private String tactic;

	/**
	 * Static score of the team
	 */
	private int scoreTeam;
	
	/**
	 * score of the starter player of the team
	 */
	private int powerTeam; 
	/**
	 * players on the field
	 */
	private ArrayList<Player> starterPlayers;
	/**
	 * players on the bench
	 */
	private ArrayList<Player> benchPlayers;
	
	
	/**
	 * Constructor of a team
	 * @param formation
	 * @param country
	 * @param players
	 * @param coachs
	 * @param tactic
	 */
	public Team(String formation, String country, Player[] players, Coach[] coachs, String tactic, String flag) {
		super();
		this.flag = flag;
		this.formation = formation;
		this.country = country;
		this.players = players;
		this.coachs = coachs;
		this.tactic = tactic;
		setStarterBench(players);
		setScoreTeam(players);
		setPowerTeam(getStarterPlayers());
	}
	
	
	public void setStarterBench(Player[] players) {
		String[] formation = getFormation().split("-");
		int nbGoal = 1;
		int nbDefense = Integer.parseInt(formation[0]);
		int nbMiddle = Integer.parseInt(formation[1]);
		int nbAttack = Integer.parseInt(formation[2]);
		ArrayList<Player> starter = new ArrayList<>();
		ArrayList<Player> bench = new ArrayList<>();
		
		
		for (Player p : players){
			if(nbGoal!=0 && p.getPosition()=="gardien") {
				starter.add(p);
				nbGoal = nbGoal-1;
			}
			else if (nbGoal==0 && p.getPosition()=="gardien") {
				bench.add(p);
			}
			if(nbDefense!=0 && p.getPosition()=="defense") {
				starter.add(p);
				nbDefense=nbDefense-1;
			}
			else if(nbDefense==0 && p.getPosition()=="defense") {
				bench.add(p);
			}
			if(nbMiddle!=0 && p.getPosition()=="milieu") {
				starter.add(p);
				nbMiddle=nbMiddle-1;
			}
			else if(nbMiddle==0 && p.getPosition()=="milieu") {
				bench.add(p);
			}
			if(nbAttack!=0 && p.getPosition()=="attaquant") {
				starter.add(p);
				nbAttack=nbAttack-1;
			}
			else if(nbAttack==0 && p.getPosition()=="attaquant") {
				bench.add(p);
			}
		}
		setStarterPlayers(starter);
		setBenchPlayers(bench);
	}
	
	

	/**
	 * @return the starterPlayers
	 */
	public ArrayList<Player> getStarterPlayers() {
		return starterPlayers;
	}


	/**
	 * @param starterPlayers the starterPlayers to set
	 */
	public void setStarterPlayers(ArrayList<Player> starterPlayers) {
		this.starterPlayers = starterPlayers;
	}


	/**
	 * @return the benchPlayers
	 */
	public ArrayList<Player> getBenchPlayers() {
		return benchPlayers;
	}


	/**
	 * @param benchPlayers the benchPlayers to set
	 */
	public void setBenchPlayers(ArrayList<Player> benchPlayers) {
		this.benchPlayers = benchPlayers;
	}


	/**
	 * Set the score of the team from the global score of each player
	 * @param players
	 */
	public void setScoreTeam(Player[] players) {
		int i=0, score=0;
		for (Player p : players){
			i++;
			score += p.getGlobalScore();
		}
		this.scoreTeam=score/i;
	}
	
	/**
	 * @return the scoreTeam
	 */
	public int getScoreTeam() {
		return scoreTeam;
	}
	/**
	 * @return the powerTeam
	 */
	public int getPowerTeam() {
		return powerTeam;
	}

	/**
	 * @param powerTeam the powerTeam to set
	 */
	public void setPowerTeam(ArrayList<Player> players) {
		int i=0, score=0;
		for (Player p : players){
			i++;
			score += p.getGlobalScore();
		}
		this.powerTeam=score/11;
	}
	
	/**
	 * @return the formation
	 */
	public String getFormation() {
		return formation;
	}

	/**
	 * @param formation the formation to set
	 */
	public void setFormation(String formation) {
		this.formation = formation;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @return the players
	 */
	public Player[] getPlayers() {
		return players;
	}

	/**
	 * @param players the players to set
	 */
	public void setPlayers(Player[] players) {
		this.players = players;
	}

	/**
	 * @return the coachs
	 */
	public Coach[] getCoachs() {
		return coachs;
	}

	/**
	 * @param coachs the coachs to set
	 */
	public void setCoachs(Coach[] coachs) {
		this.coachs = coachs;
	}

	/**
	 * @return the tactic
	 */
	public String getTactic() {
		return tactic;
	}

	/**
	 * @param tactic the tactic to set
	 */
	public void setTactic(String tactic) {
		this.tactic = tactic;
	}
	/**
	 * @return the groupStageScore
	 */
	public int getGroupStageScore() {
		return groupStageScore;
	}

	/**
	 * @param groupStageScore the groupStageScore to set
	 */
	public void setGroupStageScore(int groupStageScore) {
		this.groupStageScore = groupStageScore;
	}
	/**
	 * @return the flag
	 */
	public String getFlag() {
		return flag;
	}

	/**
	 * @param flag the flag to set
	 */
	public void setFlag(String flag) {
		this.flag = flag;
	}

	/**
	 * @param scoreTeam the scoreTeam to set
	 */
	public void setScoreTeam(int scoreTeam) {
		this.scoreTeam = scoreTeam;
	}

}
