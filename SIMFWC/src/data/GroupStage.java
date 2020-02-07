package data;
import data.Team;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import core.Match;

public class GroupStage {
	
	private Team team1;
	private Team team2;
	private Team team3;
	private Team team4;
	
	private Team first;
	private Team second;
	
	
	
	
	public GroupStage(Team team1, Team team2, Team team3, Team team4) {
		
		setTeam1(team1);
		setTeam2(team2);
		setTeam3(team3);
		setTeam4(team4);		
	}
	
	public void qualification() {
		System.out.println("**********************************");
		
		Match firstTurn = new Match(team1,team2);
		firstTurn.matchFlow();
		System.out.println(firstTurn.getFinalScore() );

		Match firstTurn2 = new Match(team3,team4);
		firstTurn2.matchFlow();

		System.out.println(firstTurn2.getFinalScore() );


		addPoints(firstTurn);
		addPoints(firstTurn2);
		
		Match secondTurn = new Match(team1, team3);
		secondTurn.matchFlow();

		System.out.println(secondTurn.getFinalScore() );


		Match secondTurn2 = new Match(team2, team4);
		secondTurn2.matchFlow();

		System.out.println(secondTurn2.getFinalScore() );


		addPoints(secondTurn);
		addPoints(secondTurn2);
		
		Match thirdTurn = new Match(team1, team4);
		thirdTurn.matchFlow();

		System.out.println(thirdTurn.getFinalScore() );
		
		Match thirdTurn2 = new Match(team2, team3);
		thirdTurn2.matchFlow();

		System.out.println(thirdTurn2.getFinalScore() );

		addPoints(thirdTurn);
		addPoints(thirdTurn2);		
		
		ArrayList<Team> arry = new ArrayList<Team>();
		arry.add(team1);
		arry.add(team2);
		arry.add(team3);
		arry.add(team4);
		System.out.println("");
		
		Collections.sort(arry, new Comparator<Team>() 
		{

			@Override
			public int compare( Team o1, Team o2) {
				// TODO Auto-generated method stub
				int x  =  (int) o1.getGroupStageScore()    ;
				int y  = (int) o2.getGroupStageScore()   ;
				return Integer.valueOf(y).compareTo(x);
			}
			
		});
		
		first =  arry.get(0);
		second =  arry.get(1);
		System.out.println("Résultat de la Poule");
		System.out.println(team1.getCountry() + " : " + team1.getGroupStageScore());
		System.out.println(team2.getCountry() + " : " + team2.getGroupStageScore());

		System.out.println(team3.getCountry() + " : " + team3.getGroupStageScore());
		System.out.println(team4.getCountry() + " : " + team4.getGroupStageScore());
		
	}
	
	public void addPoints(Match match) {
		
		if(match.getScoreA() == match.getScoreB() ) {
			match.getTeamA().setGroupStageScore(match.getTeamA().getGroupStageScore() +1);
			match.getLooser().setGroupStageScore(match.getTeamB().getGroupStageScore() +1);
		}
		else {
			match.getWinner().setGroupStageScore(match.getWinner().getGroupStageScore() +3);
		}
		
	}
	
	

	/**
	 * @return the team1
	 */
	public Team getTeam1() {
		return team1;
	}
	
	/**
	 * @param team1 the team1 to set
	 */
	public void setTeam1(Team team1) {
		this.team1 = team1;
	}
	
	/**
	 * @return the team2
	 */
	public Team getTeam2() {
		return team2;
	}
	
	/**
	 * @param team2 the team2 to set
	 */
	public void setTeam2(Team team2) {
		this.team2 = team2;
	}
	
	/**
	 * @return the team3
	 */
	public Team getTeam3() {
		return team3;
	}
	
	/**
	 * @param team3 the team3 to set
	 */
	public void setTeam3(Team team3) {
		this.team3 = team3;
	}
	
	/**
	 * @return the team4
	 */
	public Team getTeam4() {
		return team4;
	}
	
	/**
	 * @param team4 the team4 to set
	 */
	public void setTeam4(Team team4) {
		this.team4 = team4;
	}

	public Team getFirst() {
		return first;
	}

	public void setFirst(Team first) {
		this.first = first;
	}

	public Team getSecond() {
		return second;
	}

	public void setSecond(Team second) {
		this.second = second;
	}
	
}