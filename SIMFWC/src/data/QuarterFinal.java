package data;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

import core.Match;

public class QuarterFinal {
	private Team team1A;
	private	Team team2A;
	private Team team1B;
	private Team team2B;
	
	
	private Team team1C;
	private Team team2C;
	private Team team1D;
	private Team team2D;
	
	
	private Team firstWiner ;
	
	private Team secondWiner ;

	private Team thirdWiner ;

	private Team fourthWiner ;

	
	public QuarterFinal(Team team1a, Team team2a, Team team1b, Team team2b, Team team1c, Team team2c, Team team1d,Team team2d) {
		
		this.team1A = team1a;
		this.team2A = team2a;
		this.team1B = team1b;
		this.team2B = team2b;
		this.team1C = team1c;
		this.team2C = team2c;
		this.team1D = team1d;
		this.team2D = team2d;
	}

	
	
	public void qualification() {
		System.out.println("6666666666666666666666666666666666666");
		
		Match firstTurn = new Match(team1A,team2B);
		
	//	System.out.println("equipe li rebhet : "+ firstTurn.getWinner().getCountry());
	//	System.out.println("equipe li khesret : "+ firstTurn.getLooser().getCountry());
	//	System.out.println("score houwa " + firstTurn.getScoreA() );

		Match firstTurn2 = new Match(team2A,team1B);
	//	System.out.println("equipe li rebhet : "+ firstTurn2.getWinner().getCountry());
	//	System.out.println("equipe li khesret : "+ firstTurn2.getLooser().getCountry());

	//	addPoints(firstTurn);
	//	addPoints(firstTurn2);
		
		
		
		
		Match secondTurn = new Match(team1C, team2D);
	//	System.out.println("equipe li rebhet : "+ secondTurn.getWinner().getCountry());
	//	System.out.println("equipe li khesret : "+ secondTurn.getLooser().getCountry());

		Match secondTurn2 = new Match(team2C, team1D);
	//	System.out.println("equipe li rebhet : "+ secondTurn2.getWinner().getCountry());
	//	System.out.println("equipe li khesret : "+ secondTurn2.getLooser().getCountry());

	//	addPoints(secondTurn);
	//	addPoints(secondTurn2);
		
		
		
		
		firstWiner =  firstTurn.getWinner();
		
		secondWiner =  firstTurn2.getWinner();
		
		thirdWiner = secondTurn.getWinner();
		
		fourthWiner =  secondTurn2.getWinner();

		
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
	
	
	
	
	
	
	
	
	
	
	
	public Team getTeam1A() {
		return team1A;
	}

	public void setTeam1A(Team team1a) {
		team1A = team1a;
	}

	public Team getTeam2A() {
		return team2A;
	}

	public void setTeam2A(Team team2a) {
		team2A = team2a;
	}

	public Team getTeam1B() {
		return team1B;
	}

	public void setTeam1B(Team team1b) {
		team1B = team1b;
	}

	public Team getTeam2B() {
		return team2B;
	}

	public void setTeam2B(Team team2b) {
		team2B = team2b;
	}

	public Team getTeam1C() {
		return team1C;
	}

	public void setTeam1C(Team team1c) {
		team1C = team1c;
	}

	public Team getTeam2C() {
		return team2C;
	}

	public void setTeam2C(Team team2c) {
		team2C = team2c;
	}

	public Team getTeam1D() {
		return team1D;
	}

	public void setTeam1D(Team team1d) {
		team1D = team1d;
	}

	public Team getTeam2D() {
		return team2D;
	}

	public void setTeam2D(Team team2d) {
		team2D = team2d;
	}



	public Team getFirstWiner() {
		return firstWiner;
	}



	public void setFirstWiner(Team firstWiner) {
		this.firstWiner = firstWiner;
	}



	public Team getSecondWiner() {
		return secondWiner;
	}



	public void setSecondWiner(Team secondWiner) {
		this.secondWiner = secondWiner;
	}



	public Team getThirdWiner() {
		return thirdWiner;
	}



	public void setThirdWiner(Team thirdWiner) {
		this.thirdWiner = thirdWiner;
	}



	public Team getFourthWiner() {
		return fourthWiner;
	}



	public void setFourthWiner(Team fourthWiner) {
		this.fourthWiner = fourthWiner;
	}
	
	
	

	
	
	

}