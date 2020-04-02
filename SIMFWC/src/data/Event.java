/**
 * 
 */
package data;

import java.util.Random;

/**
 * @author quentin
 *
 */
public class Event {

	private String type;
	private String matchDetail;
	/**
	 * @param type 
	 * 
	 */
	public Event(String type) {
		setType(type);
	}
	public Event() {
		
	}
	/**
	 * 
	 * @param ballHolder
	 * @param destination
	 */
	public void firstPass(Player ballHolder, Player destination) {
		//setMatchDetail("\nEngagement de "+ballHolder.getName());
		//setMatchDetail("\nJoueur ayant le ballon : "+destination.getName());
		//System.out.println("\nEngagement de "+ballHolder.getName());
		//System.out.println("\nJoueur ayant le ballon : "+destination.getName());
	}
	/**
	 * 
	 * @param ballHolder
	 * @param destination
	 * @param interception
	 * @return
	 */
	public Player pass(Player ballHolder, Player destination, Player interception) {
		if(ballHolder.getPass()>interception.getTackle()) {
			//System.out.println(String.format("\nPasse de %s à %s",ballHolder.getName(),destination.getName()));
			//setMatchDetail(String.format("\nPasse de %s à %s",ballHolder.getName(),destination.getName()));
			return destination;
		}
		else {
			//System.out.println(String.format("\nPasse de %s intercepté par %s",ballHolder.getName(),interception.getName()));
			//setMatchDetail(String.format("\nPasse de %s intercepté par %s",ballHolder.getName(),interception.getName()));
			return interception;
		}
		
	}
	/**
	 * 
	 * @param shooter
	 * @param shooterTeam
	 * @param goalKeeper
	 * @param goalTeam
	 * @return
	 */
	public Boolean shoot(Player shooter, Team shooterTeam, Player goalKeeper, Team goalTeam) {
		//System.out.println("\nTir de : "+shooter.getName());
		//setMatchDetail("\nTir de : "+shooter.getName());
		if(shooter.getShoot()+shooterTeam.getPowerTeam()>goalKeeper.getSpeed()+goalTeam.getPowerTeam()) {
			//System.out.println("\nBut de : "+shooter.getName());
			//setMatchDetail("\nBut de : "+shooter.getName());
			return true;
		}
		else {
			//System.out.println("\nArret de : "+goalKeeper.getName());
			//setMatchDetail("\nArret de : "+goalKeeper.getName());
			return false;
		}
	}
	/**
	 * 
	 * @param ballHolder
	 * @param faulter
	 */
	public void fault(Player ballHolder, Player faulter) {
		//System.out.println(String.format("\nFaute de %s sur %s",faulter.getName(),ballHolder.getName()));
		//setMatchDetail(String.format("\nFaute de %s sur %s",faulter.getName(),ballHolder.getName()));
	}
	/**
	 * 
	 * @param ballHolder
	 * @param holderTeam
	 * @param tackleGuy
	 * @param tackleTeam
	 * @return
	 */
	public int tackle(Player ballHolder, Team holderTeam, Player tackleGuy, Team tackleTeam) {
		//System.out.println(String.format("\nTacle de %s sur %s",tackleGuy.getName(),ballHolder.getName()));
		//setMatchDetail(String.format("\nTacle de %s sur %s",tackleGuy.getName(),ballHolder.getName()));
		if(ballHolder.getSpeed()+holderTeam.getPowerTeam()>tackleGuy.getTackle()+tackleTeam.getPowerTeam()) {
			//System.out.println(String.format("\n%s evite le tacle de %s",ballHolder.getName(),tackleGuy.getName()));
			//setMatchDetail(String.format("\n%s evite le tacle de %s",ballHolder.getName(),tackleGuy.getName()));
			return 1;
		}
		else {
			//System.out.println(String.format("\n%s perd le ballon qui est récupéré par %s",ballHolder.getName(),tackleGuy.getName()));
			//setMatchDetail(String.format("\n%s perd le ballon qui est récupéré par %s",ballHolder.getName(),tackleGuy.getName()));
			int regulHurt = new Random().nextInt(10);
			if(regulHurt == 1) {
				//System.out.println(String.format("\n%s est blessé par le tacle de %s",ballHolder.getName(),tackleGuy.getName()));
				//System.out.println(String.format("\n%s Récupère le ballon",ballHolder.getName()));
				//setMatchDetail(String.format("\n%s est blessé par le tacle de %s",ballHolder.getName(),tackleGuy.getName()));
				//setMatchDetail(String.format("\n%s Récupère le ballon",ballHolder.getName()));

				return 2;
			}
			else {
				return 3;
			}
		}
		
	}
	
	
	
	/**
	 * @return the type
	 */
	public String getType() {
		return type;
	}
	/**
	 * @param type the type to set
	 */
	public void setType(String type) {
		this.type = type;
	}
	/**
	 * @return the matchDetail
	 */
	public String getMatchDetail() {
		return matchDetail;
	}
	/**
	 * @param matchDetail the matchDetail to set
	 */
	public void setMatchDetail(String matchDetail) {
		if(matchDetail != "null") {
			this.matchDetail += matchDetail;
		}
		
		//System.out.println();
	}

}
