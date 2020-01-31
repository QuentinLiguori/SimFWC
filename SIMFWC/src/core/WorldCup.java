package core;
import data.Player;
import data.Team;
import data.Coach;

public class WorldCup {

	public static void main(String[] args) {

		initTeams();
		
		
		

	}
	
	public static void initTeams() {
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

				// FRANCE
				// gardien
				Player lloris =  new  Player ( " Lloris " , " Hugo " , 33 , 82 , 188 , " gardien " ,  80,  85,  90,  75,  90,  80,  90,  80);
		        Player lecompte =  new  Player ( " Lecomte " , " Benjamin " , 28 , 78 , 186 , " gardien " ,  80,  80,  85,  75,  85,  75,  80,  80);
		        Player areola    =  new  Player ( " Areola " , " Alphonse " , 26 , 94 , 195 , " gardien " ,  80,  80,  85,  75,  85,  75,  85,  80);
		        // défense
		        Player hernandez =  new  Player ( " Hernandez " , " Lucas " , 23 , 76 , 182 , " défense " , 85 , 80 , 80 , 85 , 85 , 80 , 80 , 95 );
		        Player dubois =  new  Player ( " Dubois " , " Léo " , 25 , 73 , 178 , " défense " , 90 , 85 , 80 , 70 , 80 , 80 , 80 , 85 );
		        Player kimpembe =  new  Player ( " Kimpembe " , " Presnel " , 24 , 80 , 189 , " défense " , 80 , 80 , 80 , 80 , 80 , 80 , 80 , 85 );
		        Player lenglet =  new  Player ( " Lenglet " , " Clément " , 24 , 81 , 186 , " défense " , 80 , 85 , 85 , 85 , 85 , 80 , 80 , 95 );
		        Player mendy =  new  Player ( " Mendy " , " Benjamin " , 25 , 85 , 185 , " défense " , 85 , 90 , 85 , 80 , 80 , 80 , 80 , 85 );
		        Player pavard =  new  Player ( " Pavard " , " Benjamin " , 23 , 76 , 186 , " defense " , 80 , 80 , 80 , 80 , 80 , 80 , 80 , 90 );
		        Player varane =  new  Player ( " Varane " , " Raphael " , 26 , 81 , 191 , " défense " , 85 , 80 , 80 , 85 , 85 , 90 , 90 , 95 );
				Player zouma =  new  Player ( " Zouma " , " Kurt " , 25 , 95 , 190 , " défense " , 80 , 80 , 80 , 80 , 80 , 95 , 95 , 90 );
		        // milieu
		        Player pogba =  new  Player ( " Pogba " , " Paul " , 26 , 84 , 191 , " milieu " , 85 , 85 , 90 , 85 , 90 , 85 , 90 , 80 );
		        Player kanté =  new  Player ( " Kanté " , " N'Golo " , 28 , 70 , 168 , " milieu " , 85 , 85 , 90 , 75 , 80 , 100 , 90 , 95 );
		        Player ndombele  =  new  Player ( " Ndombele " , " Tanguy " , 23 , 76 , 181 , " milieu " , 85 , 80 , 85 , 80 , 85 , 80 , 85 , 80 );
		        Player matuidi  =  new  Player ( " Matuidi " , " Blaise " , 32 , 75 , 180 , " milieu " , 80 , 80 , 85 , 80 , 85 , 95 , 90 , 85 );
		        Player tolisso =  new  Player ( " Tolisso " , " Corentin " , 25 , 81 , 181 , " milieu " , 85 , 85 , 90 , 85 , 85 , 85 , 85 , 80 );
		        // attaque
		        Player dembele =  new  Player ( " Dembele " , " Ousmane " , 22 , 67 , 178 , " attaquant " , 95 , 85 , 85 , 85 , 85 , 85 , 80 , 80 );
		        Player coman =  new  Player ( " Coman " , " Kingsley " , 23 , 75 , 179 , " attaquant " , 95 , 80 , 80 , 80 , 85 , 80 , 80 , 80 );
		        Player nabil =  new  Player ( " Nabil " , " Fékir " , 26 , 75 , 173 , " attaquant " , 85 , 80 , 85 , 85 , 85 , 80 , 85 , 80 );
		        Player giroud =  new  Player ( " Giroud " , " Olivier " , 33 , 91 , 193 , " attaquant " , 75 , 75 , 80 , 95 , 85 , 80 , 90 , 80 );
		        Player griezmann =  new  Player ( " Griezmann " , " Antoine " , 28 , 73 , 176 , " attaquant " , 85 , 85 , 90 , 85 , 90 , 90 , 80 , 80 );
		        Player lemar =  new  Player ( " Lemar " , " Thomas " , 24 , 62 , 171 , " attaquant " , 85 , 85 , 85 , 80 , 90 , 85 , 85 , 80 );
		        Player mbappe =  new  Player ( " Mbappe " , " Kylian " , 21 , 73 , 178 , " attaquant " , 100 , 85 , 85 , 80 , 90 , 85 , 85 , 80 );
		        // tableau
		        Player france_players [] = {lloris, lecompte, areola, hernandez, dubois, kimpembe, lenglet, mendy, pavard, varane,
		        		zouma, pogba, kanté , ndombele , matuidi, tolisso , dembele, coman, nabil, giroud, griezmann, lemar, mbappe};
		        Coach didier =  new  Coach ( " Didier " , " Deschamps " , 51 , " française " , 5 );
		        Coach coach_france [] = {didier};
		        Team france =  new  Team ( " 4-2-3-1 " , " France " , france_players, coach_france, " équilibré " );
				
				// ARGENTINE																						Vitesse	Centre	Passe	Tête	Tir	Endurance	Puissance	Tacle
				// gardien
				Player marchesín =  new  Player ( " Marchesín " , " Agustín  " , 31, 85 , 188 , " gardien " ,  80,  80,  85,  75,  85,  75,  80,  80);
		        Player musso =  new  Player ( " Musso " , " Juan " , 25, 93	, 191 , " gardien " ,  75,  80,  82,  75,  85,  75,  80,  75);
		        Player martínez    =  new  Player ( " Martínez " , " Emiliano " , 27, 85, 193 , " gardien " ,  75,  80,  80,  75,  85,  75,  80,  75);
		        // défense
		        Player foyth =  new  Player ( " Foyth " , " Juan " , 22, 69, 187 , " défense " , 75 , 75 , 75 , 75 , 75 , 70 , 75 , 75 );
		        Player saravia =  new  Player ( " Saravia " , " Renzo " , 26, 75, 176 , " défense " , 91 , 73 , 73 , 70 , 70 , 76 , 70 , 75 );
		        Player otamendi =  new  Player ( " Otamendi " , " Nicolás " , 31, 81, 183 , " défense " , 70 , 75 , 75 , 84 , 75 , 70 , 80 , 85 );
		        Player pezzella =  new  Player ( " Pezzella " , " Germán " , 28, 81, 186 , " défense " , 70 , 70 , 70 , 82 , 70 , 70 , 79 , 82 );
		        Player rojo =  new  Player ( " Rojo " , " Marcos " , 29, 85, 187 , " défense " , 70 , 72 , 72 , 77 , 80 , 70 , 80 , 79 );
		        Player tagliafico =  new  Player ( " Tagliafico " , " Nicolás " , 27, 65, 172 , " defense " , 82 , 81 , 78 , 82 , 75 , 86 , 74 , 84 );
		        Player pérez =  new  Player ( " Pérez " , " Nehuén " , 19, 75, 186 , " défense " , 70 , 70 , 70 , 70 , 70 , 73 , 71 , 77 );
		        // milieu
		        Player rodríguez =  new  Player ( " Rodríguez " , " Guido " , 24 , 80 , 185 , " milieu " , 70 , 70 , 78 , 70 , 76 , 77 , 81 , 79 );
		        Player loCelso =  new  Player ( " Lo Celso " , " Giovani " , 23, 68, 177 , " milieu " , 78 , 78 , 83 , 70 , 82 , 76 , 70 , 70 );
		        Player paredesl  =  new  Player ( " Paredes " , " Leandro " , 25, 75, 180 , " milieu " , 70 , 76 , 82 , 70 , 82 , 79 , 70 , 75 );
		        // attaque
		        Player diMaria =  new  Player ( " Di Maria " , " Angel " , 31, 69, 180 , " attaquant " , 84 , 87 , 83 , 70 , 88 , 78 , 70 , 70 );
		        Player dePaul =  new  Player ( " De Paul " , " Rodrigo Javier " , 25, 70, 178, " attaquant " , 72 , 77 , 80 , 70 , 80 , 72 , 70 , 70 );
		        Player acuna =  new  Player ( " Acuña " , " Marcos " , 28, 69, 172 , " attaquant " , 75 , 87 , 81 , 70 , 88 , 90 , 81 , 82 );
		        Player pereyra =  new  Player ( " Pereyra " , " Roberto " , 29,	77, 182 , " attaquant " , 75 , 75 , 79 , 70 , 78 , 74 , 70 , 70 );
		        Player ocampos =  new  Player ( " Ocampos " , " Lucas " , 25, 84, 187 , " attaquant " , 83 , 76 , 77 , 77 , 82 , 91 , 81 , 70 );
		        Player messi =  new  Player ( " Messi " , " Lionel " , 32, 72, 170 , " attaquant " , 84 , 88 , 92 , 70 , 95 , 75 , 70 , 70 );
		        Player aguero =  new  Player ( " Agüero " , " Sergio " , 31, 70, 173 , " attaquant " , 78 , 70 , 83 , 78 , 94 , 79 , 74 , 70 );
				Player gonzalez =  new  Player ( " González " , " Nicolás " , 21, 72, 180 , " attaquant " , 79 , 70 , 70 , 70 , 73 , 78 , 70 , 70 );
				Player icardi =  new  Player ( " Icardi " , " Mauro " , 26, 75, 181 , " attaquant " , 75 , 70 , 74 , 88 , 90 , 70 , 73 , 70 );
				Player dybala =  new  Player ( " Dybala " , " Paulo " , 26, 75, 177 , " attaquant " , 82 , 82 , 87 , 80 , 88 , 79 , 70 , 70 );
		        // tableau
		        Player argentin_players [] = {marchesín, musso, martínez, foyth, saravia, otamendi, pezzella, rojo, tagliafico, pérez,
		        		rodríguez, loCelso, paredesl , diMaria , dePaul, acuna , pereyra, ocampos, messi, aguero, gonzalez, icardi, dybala};
		        Coach lionel =  new  Coach ( " Lionel " , " Scaloni " , 41 , " argentin " , 3 );
		        Coach coach_argentin [] = {lionel};
		        Team argentin =  new  Team ( " 4-3-3 " , " Argentine " , argentin_players, coach_argentin, " offensif " );
				
				
				/**
				 * 	Teams of Portugal and Italy : LIGUORI
				 */
				
				/**
				 * Portugal Players
				 */
				
				//goal
				Player patricio = new Player("Patricio", "R", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
				Player sa = new Player("sa", "J", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
				Player beto = new Player("Beto", "", 32, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);

				//defense
		        Player pepe = new Player("Pepe", "", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
		        Player dias = new Player("Dias", "R", 25, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
		        Player guerreiro = new Player("guerreiro", "", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
		        Player pereira = new Player("pereira", "R", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		        Player rui = new Player("Rui", "M", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		        Player fonte = new Player("Fonte", "J", 36, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		        Player cancelo = new Player("Cancelo", "J", 25, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);


		        //Middle
		        Player pereiraD = new Player("pereira", "D", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
		        Player moutinho = new Player("moutinho", "J", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
		        Player fernandes = new Player("fernandes", "B", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		        Player carvalho = new Player("carvalho", "W", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		        Player pizzi = new Player("Pizzi", "", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		        Player neves = new Player("Neves", "R", 22, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);


		        //attack
		        Player ronaldoC = new Player("Ronaldo", "C", 34, 83, 187, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
		        Player guedes = new Player("Guedes", "G", 23, 68, 179, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
		        Player silvaB = new Player("Silva", "B", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player felix = new Player("Felix", "J", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player jota = new Player("Jota", "D", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player silvaA = new Player("Silva", "A", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player bruma = new Player("Bruma", "", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);


		        //array players
		        Player[] portugal_players = {patricio, sa, beto, pepe, dias, guerreiro, pereira, rui, fonte, cancelo, pereiraD, moutinho,
		        		fernandes, carvalho, pizzi, neves, ronaldoC, guedes, silvaB, felix, jota, silvaA, bruma};
		        
		        //array coachs	        
		        Coach santosF = new Coach("Santos","Fernando", 66,"portugal", 2);
		        Coach[] portugal_coachs  = {santosF};
				
		        
		        Team portugal = new Team("4-4-2","Portugal", portugal_players, portugal_coachs,"offensif");

		        
		        
				/**
				 * Italy Players
				 */
				
				//goal
				Player donnarumma = new Player("Donnarumma", "G", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
				Player meret = new Player("meret", "A", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
				Player sirigu = new Player("Sirigu", "S", 33, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);

				

				//defense
		        Player florenzi = new Player("florenzi", "A", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
		        Player bonucci = new Player("bonucci", "L", 32, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
		        Player acerbi = new Player("acerbi", "F", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
		        Player biraghi = new Player("biraghi", "C", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		        Player romagnoli = new Player("Romagnoli", "A", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		        Player lorenzo = new Player("Lorenzo", "G", 36, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);


		        //Middle
		        Player emerson = new Player("emerson", "", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
		        Player barella = new Player("barella", "N", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
		        Player jorginho = new Player("Jorginho", "", 28, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		        Player verratti = new Player("Verratti", "M", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		        Player tonali = new Player("Tonali", "S", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		        Player sensi = new Player("Sensi", "S", 22, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		        Player zaniolo = new Player("Zaniolo", "N", 20, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);



		        //attack
		        Player bernardeschi = new Player("bernardeschi", "F", 34, 83, 187, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
		        Player immobile = new Player("Immobile", "C", 23, 68, 179, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
		        Player insigne = new Player("insigne", "L", 28, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player belotti = new Player("Belotti", "A", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player politano = new Player("Politano", "M", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player shaarawy = new Player("shaarawy", "S", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		        Player chiesa = new Player("Chiesa", "F", 22, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);


		        //array players
		        Player[] italy_players = {donnarumma, meret, sirigu, florenzi, bonucci, acerbi, biraghi, romagnoli, lorenzo, emerson, barella, jorginho,
		        		verratti, tonali, sensi, zaniolo, bernardeschi, immobile, insigne, belotti, politano, shaarawy, chiesa};
		        
		        //array coachs	        
		        Coach mancini = new Coach("Mancini","Roberto", 56,"italy", 2);
		        Coach[] italy_coachs  = {mancini};
				
		        
		        Team italy = new Team("4-4-2","Italy", italy_players, italy_coachs,"offensif");
		        
		        
		        /**
		         * Array of all the teams
		         */
		        Team[] participant = {chili, uruguay, italy, portugal, sweden, poland, france, argentin};
		        
		        
		        
	}
	
	public void initGroupStage() {
		
	}

}