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

	/**
	 * this function Determined quarter final phase between 8 teams 
	 */
	
	public void qualificationToSemiFinal() {
		System.out.println("************************************************");
		System.out.println("Premier quart de final");

		Match firstQuarter = new Match(team1A,team2B);
		firstQuarter.matchFlowFinal();
		System.out.println(firstQuarter.getFinalScore() );
		
		System.out.println("************************************************");
		System.out.println("Deuxième quart de final");

		Match secondQuarter = new Match(team2A,team1B);
		secondQuarter.matchFlowFinal();
		System.out.println(secondQuarter.getFinalScore() );

	
		
		System.out.println("************************************************");
		System.out.println("Troisième quart de final");

		Match thirdQuarter = new Match(team1C, team2D);
		thirdQuarter.matchFlowFinal();

		System.out.println(thirdQuarter.getFinalScore() );
		
		System.out.println("************************************************");
		System.out.println("Quatrième quart de final");


		Match fourthQuarter = new Match(team2C, team1D);
		fourthQuarter.matchFlowFinal();
		System.out.println(fourthQuarter.getFinalScore() );


		System.out.println("************************************************");

		
		
		
		
		firstWinner =  firstQuarter.getWinner();
		
		secondWinner =  secondQuarter.getWinner();
		
		thirdWinner = thirdQuarter.getWinner();
		
		fourthWinner =  fourthQuarter.getWinner();

		
	}

	/**
	 * @return the team1A
	 */
	public Team getTeam1A() {
		return team1A;
	}

	/**
	 * @param team1a the team1A to set
	 */
	public void setTeam1A(Team team1a) {
		team1A = team1a;
	}

	/**
	 * @return the team2A
	 */
	public Team getTeam2A() {
		return team2A;
	}

	/**
	 * @param team2a the team2A to set
	 */
	public void setTeam2A(Team team2a) {
		team2A = team2a;
	}

	/**
	 * @return the team1B
	 */
	public Team getTeam1B() {
		return team1B;
	}

	/**
	 * @param team1b the team1B to set
	 */
	public void setTeam1B(Team team1b) {
		team1B = team1b;
	}

	/**
	 * @return the team2B
	 */
	public Team getTeam2B() {
		return team2B;
	}

	/**
	 * @param team2b the team2B to set
	 */
	public void setTeam2B(Team team2b) {
		team2B = team2b;
	}

	/**
	 * @return the team1C
	 */
	public Team getTeam1C() {
		return team1C;
	}

	/**
	 * @param team1c the team1C to set
	 */
	public void setTeam1C(Team team1c) {
		team1C = team1c;
	}

	/**
	 * @return the team2C
	 */
	public Team getTeam2C() {
		return team2C;
	}

	/**
	 * @param team2c the team2C to set
	 */
	public void setTeam2C(Team team2c) {
		team2C = team2c;
	}

	/**
	 * @return the team1D
	 */
	public Team getTeam1D() {
		return team1D;
	}

	/**
	 * @param team1d the team1D to set
	 */
	public void setTeam1D(Team team1d) {
		team1D = team1d;
	}

	/**
	 * @return the team2D
	 */
	public Team getTeam2D() {
		return team2D;
	}

	/**
	 * @param team2d the team2D to set
	 */
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
	

}
