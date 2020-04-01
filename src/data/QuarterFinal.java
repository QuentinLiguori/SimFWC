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
	
	
	private Team firstWinner ;
	
	private Team secondWinner ;

	private Team thirdWinner ;

	private Team fourthWinner ;
        
        private ArrayList<Match> arry = new ArrayList<Match>();

	
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

	
	
	public void qualificationToSemiFinal() {
		System.out.println("************************************************");
		System.out.println("Premier quart de final");

		Match firstQuarter = new Match(team1A,team2B);
		firstQuarter.matchFlow();
		System.out.println(firstQuarter.getFinalScore() );
                arry.add(firstQuarter);
		
		System.out.println("************************************************");
		System.out.println("Deuxième quart de final");

		Match secondQuarter = new Match(team2A,team1B);
		secondQuarter.matchFlow();
		System.out.println(secondQuarter.getFinalScore() );
                arry.add(secondQuarter);

	
		
		System.out.println("************************************************");
		System.out.println("Troisième quart de final");

		Match thirdQuarter = new Match(team1C, team2D);
		thirdQuarter.matchFlow();

		System.out.println(thirdQuarter.getFinalScore() );
                
                arry.add(thirdQuarter);

		
		System.out.println("************************************************");
		System.out.println("Quatrième quart de final");


		Match fourthQuarter = new Match(team2C, team1D);
		fourthQuarter.matchFlow();
		System.out.println(fourthQuarter.getFinalScore() );
                
                
                arry.add(fourthQuarter);



		System.out.println("************************************************");

		
		
		
		
		firstWinner =  firstQuarter.getWinner();
		
		secondWinner =  secondQuarter.getWinner();
		
		thirdWinner = thirdQuarter.getWinner();
		
		fourthWinner =  fourthQuarter.getWinner();

		
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



	/**
	 * @return the firstWinner
	 */
	public Team getFirstWinner() {
		return firstWinner;
	}



	/**
	 * @param firstWinner the firstWinner to set
	 */
	public void setFirstWinner(Team firstWinner) {
		this.firstWinner = firstWinner;
	}



	/**
	 * @return the secondWinner
	 */
	public Team getSecondWinner() {
		return secondWinner;
	}



	/**
	 * @param secondWinner the secondWinner to set
	 */
	public void setSecondWinner(Team secondWinner) {
		this.secondWinner = secondWinner;
	}



	/**
	 * @return the thirdWinner
	 */
	public Team getThirdWinner() {
		return thirdWinner;
	}



	/**
	 * @param thirdWinner the thirdWinner to set
	 */
	public void setThirdWinner(Team thirdWinner) {
		this.thirdWinner = thirdWinner;
	}



	/**
	 * @return the fourthWinner
	 */
	public Team getFourthWinner() {
		return fourthWinner;
	}



	/**
	 * @param fourthWinner the fourthWinner to set
	 */
	public void setFourthWinner(Team fourthWinner) {
		this.fourthWinner = fourthWinner;
	}
        
        public ArrayList<Match> getArry(){
        return arry;
        }
        



}