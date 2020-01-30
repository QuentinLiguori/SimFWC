
package core;
import data.Player;
import data.Team;
import data.Coach;

public class WorldCup {

	public static void main(String[] args) {
//(String name, String firstName, int age, int weight, int height, String position, int speed, int center, int pass, int header, int shoot, int energy, int power, int tackle) {
		/***
		 * Bayo : chili et uruguay
		 */
		/** uruguay's players */
        //goal
		Player muslera = new Player("musler", "r", 25, 60, 170, "gardien", 70, 80, 88, 70, 65, 76, 88, 80);
        Player campana = new Player("campana", "c", 21, 60, 170, "gardien", 60, 50, 66, 44, 33, 12, 66, 90);
        Player conde   = new Player("conde", "c", 35, 60, 170, "gardien", 90, 80, 90, 70, 90, 89, 88, 70);
        //defense
        Player urretaviscaya = new Player("urretaviscaya", "u", 19, 60, 170, "defense", 90, 80, 90, 100, 90, 89, 88, 50);
        Player lodeiro = new Player("lodeiro", "l", 26, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 50);
        Player godin = new Player("godin", "g", 22, 60, 170, "defense", 88, 100, 100, 100, 90, 89, 99, 100);
        Player gimerez = new Player("gimerez", "g", 35, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 80);
        Player caceres = new Player("caceres", "c", 33, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 93);
        Player perirra = new Player("perirra", "p", 31, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 92);
        Player caceres2 = new Player("caceres", "c", 33, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 91);
        //milieu
        Player valverde = new Player("valverde", "v", 28, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 99);
        Player vecino = new Player("vecino", "v", 28, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 99);
        Player Nandez = new Player("Nandez", "n", 27, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 77);
        Player Lodeiro = new Player("Lodeiro", "l", 25, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 80);
        Player sanchez = new Player("sanchez", "s", 24, 60, 170, "milieu", 99, 100, 100, 100, 100, 99, 99, 99);
        Player Bentacur = new Player("Bentacur", "b", 29, 60, 170, "milieu", 90, 88, 88, 88, 90, 97, 97, 88);
        //attaque
        Player suarez = new Player("suarez", "s", 38, 60, 170, "attaquant", 99, 99, 100, 100, 100, 99, 100, 100);
        Player cavani = new Player("cavani", "c", 32, 60, 170, "attaquant", 98, 99, 98, 99, 98, 99, 100, 100);
        Player rodriguez = new Player("rodriguez", "r", 18, 60, 170, "attaquant", 90, 95, 95, 95, 90, 95, 95, 95);
        Player gomez = new Player("gomez", "g", 25, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
        Player urretaviscaya2 = new Player("urretaviscaya", "u", 24, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
        Player rolan = new Player("rolan", "r", 24, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 90);
        Player stuani = new Player("stuani", "s", 24, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
        //array payers
        Player uruguay_players [] = {muslera,campana,conde,urretaviscaya,lodeiro,godin,gimerez,caceres,perirra,caceres2,
        		valverde,vecino,Nandez,Lodeiro,sanchez,Bentacur,suarez,cavani,rodriguez,gomez,urretaviscaya2,rolan,stuani};
        Coach oscar = new Coach("Oscar","Tabanez",73,"uruguayen",2);
        Coach coach_uruguay [] = {oscar};
        Team uruguay = new Team("4-3-3","Uruguay",uruguay_players,coach_uruguay,"offensif");
        
        /** chili's players*/
        //goal
		Player bravo = new Player("bravo", "b", 25, 60, 170, "gardien", 90, 99, 90, 100, 90, 99, 90, 90);
        Player cortes = new Player("cortes", "c", 28, 60, 170, "gardien", 90, 80, 90, 70, 90, 89, 88, 50);
        Player herra   = new Player("herra", "h", 27, 60, 170, "gardien", 90, 80, 90, 70, 90, 89, 88, 50);
        //defense
        Player diaz = new Player("diaz", "d", 28, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
        Player roco = new Player("roco", "r", 23, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
        Player jara = new Player("jara", "j", 32, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 80);
        Player medel = new Player("medel", "m", 19, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 70);
        Player jara2 = new Player("jara", "j", 34, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
        Player isla = new Player("isla", "i", 36, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 100);
        Player beausejour = new Player("beausejour", "b", 31, 60, 170, "milieu", 100, 99, 98, 97, 100, 100, 100, 100);
        //milieu
        Player valdivia = new Player("valdivia", "v", 30, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
        Player vidal = new Player("vidal", "v", 18, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
        Player aranguiz = new Player("aranguiz", "a", 26, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
        Player puch = new Player("puch", "p", 22, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
        Player pulgar = new Player("pulgar", "p", 22, 60, 170, "milieu", 90, 90, 98, 99, 88, 100, 100, 100);
        Player silva = new Player("silva", "s", 23, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
        Player diaz2 = new Player("diaz", "d", 23, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
        //attaque
        Player vargas = new Player("vargas", "v", 25, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 96);
        Player sanchez2 = new Player("sanchez", "s", 25, 60, 170, "attaquant", 99, 99, 90, 90, 90, 98, 100, 100);
        Player castillo = new Player("castillo", "c", 28, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 88);
        Player fuenzalida = new Player("fuenzalida", "f", 29, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 99);
        Player paredes = new Player("paredes", "p", 29, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 100);
        Player valdivia2 = new Player("valdivia", "v", 33, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 88);
        
        //array chili's players
        Player chili_players [] = {bravo,cortes,herra,diaz,roco,jara,medel,jara2,isla,beausejour,valdivia,vidal,aranguiz,puch,pulgar,
        		silva,diaz2,vargas,sanchez2,castillo,fuenzalida,paredes,valdivia2};
        //Coach(String lastName, String firstName, int age, String nationality, int level)
        Coach rueda = new Coach("Reinaldo","Rueda",63,"colombien",3);
        Coach coach_chili [] = {rueda};
        //Team(String formation, String country, Player[] players, Coach[] coachs, String tactic)
        Team chili = new Team("5-3-1","Chili",chili_players,coach_chili,"defensif");
		
	/**
	* Poland ans Sweden's teams : Radolanirina
	*/
	/** Poland's players */
	        //goal
			Player szczesny = new Player("szczesny", "w", 29, 90, 195, "gardien", 47, 12, 34, 16, 14, 45, 55, 13);
	        Player majecki = new Player("majecki", "r", 20, 78, 191, "gardien", 31, 12, 22, 12, 16, 23, 45, 25);
	        Player skorupski   = new Player("skorupski", "l", 28, 84, 187, "gardien", 51, 19, 28, 10, 15, 31, 41, 12);
	        //defense
	        Player kedziora = new Player("kedziora", "t", 25, 77, 183, "defense", 79, 78, 67, 71, 51, 78, 56, 76);
	        Player glik = new Player("glik", "k", 31, 80, 190, "defense", 47, 29, 62, 79, 20, 63, 57, 77);
	        Player bednarek = new Player("bednarek", "j", 23, 77, 189, "defense", 68, 44, 66, 75, 23, 67, 25, 77);
	        Player rybus = new Player("rybus", "m", 30, 75, 173, "defense", 76, 74, 70, 47, 71, 74, 75, 70);
	        Player cionek = new Player("cionek", "t", 33, 80, 183, "defense", 62, 35, 53, 66, 26, 59, 31, 71);
	        Player reca = new Player("reca", "a", 24, 81, 187, "defense", 78, 67, 62, 62, 54, 68, 60, 63);
	        Player bereszynski = new Player("bereszynski", "b", 27, 77, 183, "defense", 86, 68, 65, 60, 60, 78, 64, 70);
	        //Middle
	        Player klich = new Player("klich", "m", 29, 82, 183, "milieu", 68, 67, 73, 48, 73, 83, 70, 50);
	        Player frankowski = new Player("frankowski", "p", 24, 70, 173, "milieu", 92, 66, 68, 57, 56, 83, 58, 50);
	        Player krychowiak = new Player("krychowiak", "g", 29, 85, 186, "milieu", 69, 63, 80, 75, 73, 75, 82, 75);
	        Player bielik = new Player("bielik", "k", 22, 78, 189, "milieu", 64, 49, 70, 68, 52, 64, 62, 68);
	        Player furman = new Player("furman", "d", 27, 71, 181, "milieu", 67, 72, 70, 60, 64, 72, 69, 64);
	        Player grosicki = new Player("grosicki", "k", 31, 78, 180, "milieu", 80, 72, 70, 69, 75, 64, 74, 25);
	        Player goralski = new Player("goralski", "j", 27, 66, 172, "attaquant", 73, 51, 70, 55, 46, 86, 50, 71);
	        //attack
	        Player zielinski = new Player("zielinski", "p", 25, 75, 180, "attaquant", 82, 77, 82, 52, 82, 73, 76, 71);
	        Player szymanski = new Player("szymanski", "s", 20, 58, 174, "attaquant", 79, 71, 62, 40, 67, 65, 67, 29);
	        Player lewandowski = new Player("lewandowski", "r", 31, 80, 184, "attaquant", 77, 71, 77, 85, 84, 78, 88, 35);
	        Player piatek = new Player("piatek", "k", 24, 77, 183, "attaquant", 75, 51, 56, 80, 69, 73, 80, 33);
	        Player kadzior = new Player("kadzior", "d", 27, 74, 175, "attaquant", 77, 58, 65, 89, 88, 73, 70, 46);
	        Player milik = new Player("milik", "a", 25, 78, 186, "attaquant", 71, 58, 66, 80, 82, 70, 86, 33);
	        
	        //array players
	        Player[] poland_players  = {szczesny, majecki, skorupski, kedziora, glik, bednarek, rybus, cionek, reca, bereszynski, klich, frankowski, krychowiak,
	        		bielik, furman, grosicki, goralski, zielinski, szymanski, lewandowski, piatek, kadzior, milik};
	        //array coachs	        
	        Coach jerzy = new Coach("Jerzy","Brzeczek",49,"polish",1);
	        Coach[] poland_coachs  = {jerzy};
			
	        Team poland = new Team("4-3-4","Poland", poland_players, poland_coachs,"offensif");
	        
	        
			/** Sweden's players */
	        //goal
			Player johnsson = new Player("johnsson", "kj", 29, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
	        Player nordfelt = new Player("nordfelt", "k", 30, 87, 188, "gardien", 49, 11, 35, 13, 12, 33, 50, 14);
	        Player olsen   = new Player("olsen", "r", 30, 86, 196, "gardien", 40, 20, 35, 16, 14, 37, 57, 14);
	        //defense
	        Player lustig = new Player("lustig", "m", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
	        Player lindelof = new Player("lindelof", "v", 25, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
	        Player granqvist = new Player("granqvist", "a", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
	        Player bengtsson = new Player("bengtsson", "p", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
	        Player augustinsson = new Player("augustinsson", "l", 25, 72, 181, "defense", 73, 79, 74, 56, 59, 88, 69, 75);
	        Player krafth = new Player("krafth", "e", 25, 72, 181, "defense", 77, 68, 66, 64, 58, 78, 70, 74);
	        Player helander = new Player("helander", "f", 26, 84, 192, "defense", 47, 30, 50, 74, 25, 59, 58, 74);
	        Player jansson = new Player("jansson", "p", 28, 86, 196, "defense", 65, 29, 65, 74, 50, 71, 68, 74);
	        //Middle
	        Player svensson = new Player("svensson", "g", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
	        Player sema = new Player("sema", "k", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
	        Player fransson = new Player("fransson", "a", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	        Player fosberg = new Player("fosberg", "e", 28, 76, 177, "milieu", 65, 84, 73, 45, 74, 69, 73, 25);
	        Player olsson = new Player("olsson", "k", 24, 69, 181, "milieu", 75, 65, 74, 52, 62, 78, 64, 57);
	        Player ekdal = new Player("ekdal", "a", 30, 82, 186, "milieu", 47, 67, 79, 62, 69, 72, 72, 68);
	        Player larsson = new Player("larsson", "s", 34, 70, 178, "attaquant", 55, 80, 77, 66, 72, 86, 77, 61);
	        //attack
	        Player quaison = new Player("quaison", "r", 26, 77, 183, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
	        Player berg = new Player("berg", "m", 33, 74, 184, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
	        Player andersson = new Player("andersson", "s", 28, 86, 190, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	        Player tankovic = new Player("tanovic", "m", 24, 74, 180, "attaquant", 73, 65, 65, 63, 66, 74, 68, 24);
	        Player isak = new Player("isak", "a", 20, 74, 190, "attaquant", 85, 51, 57, 68, 68, 68, 77, 20);
	       
	        //array players
	        Player[] sweden_players = {johnsson, nordfelt, olsen, lustig, lindelof, granqvist, bengtsson, augustinsson, krafth, helander, jansson, svensson,
	        		sema, fransson, fosberg, olsson, ekdal, larsson, quaison, berg, andersson, tankovic, isak};
	        
	        //array coachs	        
	        Coach janne = new Coach("Janne","Anderson", 57,"polish", 2);
	        Coach[] sweden_coachs  = {janne};
			
	        
	        Team sweden = new Team("4-4-2","Poland", sweden_players, sweden_coachs,"defensive");

		
		
		
        /**team */
		// TODO Auto-generated method stub
		Player b1 = new Player("kaka", "recardo", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b2 = new Player("robino", "tchiko", 29, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b3 = new Player("ronolado", "dalima", 25, 60, 170, "att", 90, 80, 90, 99, 99, 89,99, 99);
		Player b4 = new Player("alves", "daniel", 25, 60, 170, "att", 90, 90, 90, 70, 90, 89, 88, 50);
		Player b5 = new Player("adriono", "danielo", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b6 = new Player("allison", "teo", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b7 = new Player("dasilva", "santos", 25, 60, 170, "def", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b8 = new Player("ronaldinio", "kafo", 25, 60, 170, "def", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b9 = new Player("pele", "teo", 25, 60, 170, "def", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b10 = new Player("cotenio", "philipe", 25, 60, 170, "def", 90, 80, 90, 70, 90, 89, 88, 50);
		Player b11 = new Player("roberto", "roberto", 25, 60, 170, "def", 90, 80, 90, 70, 90, 89, 88, 50);
		
		
		
		
		
		
		Player f1 = new Player("mbape", "kilien", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f2 = new Player("giroud", "antoine", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f3 = new Player("grizman", "antoine", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f4 = new Player("paul", "pogba", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f5 = new Player("ngolo", "kante", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f6 = new Player("lucas", "vaskes", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f7 = new Player("zizo", "zidan", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f8 = new Player("theryy", "hanry", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f9 = new Player("samuel", "umtiti", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f10 = new Player("payet", "dimitri", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		Player f11 = new Player("kaka", "recardo", 25, 60, 170, "att", 90, 80, 90, 70, 90, 89, 88, 50);
		
		
		
		
		
		

	}

}
