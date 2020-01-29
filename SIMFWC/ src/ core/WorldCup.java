
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
