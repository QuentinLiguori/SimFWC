package data;
import data.Team;

public class Hat {
	
	private Team team1;
	private Team team2;
	private Team team3;
	private Team team4;
	
	
	
	public Hat(Team team1, Team team2, Team team3, Team team4) {
		
		setTeam1(team1);
		setTeam2(team2);
		setTeam3(team3);
		setTeam4(team4);

		
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
	
	
	
}
