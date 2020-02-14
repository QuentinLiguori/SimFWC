package core;

import data.Player;
import data.QuarterFinal;
import data.SemiFinal;
import data.Team;

import java.util.ArrayList;
import data.GroupStage;

import data.Coach;
import data.Final;
import data.Hat;

public class WorldCup {

	private static Hat hat1;
	private static Hat hat2;
	private static Hat hat3;
	private static Hat hat4;
	private static  GroupStage group1;
	private static  GroupStage group2;
	private static GroupStage group3;
	private static GroupStage group4;

	public static void main(String[] args) {

		initTeams();

		finalStage(initGroupStage());

	}
	/**
	 * Initialize all the teams and the players
	 */
	public static void initTeams() {
		
		/***
		 * Bayo : chili et uruguay
		 */
		/** uruguay's players */
		// goal
		Player muslera = new Player("musler", "r", 25, 60, 170, "gardien", 70, 80, 88, 70, 65, 76, 88, 80);
		Player campana = new Player("campana", "c", 21, 60, 170, "gardien", 60, 50, 66, 44, 33, 12, 66, 90);
		Player conde = new Player("conde", "c", 35, 60, 170, "gardien", 90, 80, 90, 70, 90, 89, 88, 70);
		// defense
		Player urretaviscaya = new Player("urretaviscaya", "u", 19, 60, 170, "defense", 90, 80, 90, 100, 90, 89, 88,
				50);
		Player lodeiro = new Player("lodeiro", "l", 26, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 50);
		Player godin = new Player("godin", "g", 22, 60, 170, "defense", 88, 100, 100, 100, 90, 89, 99, 100);
		Player gimerez = new Player("gimerez", "g", 35, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 80);
		Player caceres = new Player("caceres", "c", 33, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 93);
		Player perirra = new Player("perirra", "p", 31, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 92);
		Player caceres2 = new Player("caceres", "c", 33, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 91);
		// milieu
		Player valverde = new Player("valverde", "v", 28, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 99);
		Player vecino = new Player("vecino", "v", 28, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 99);
		Player Nandez = new Player("Nandez", "n", 27, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 77);
		Player Lodeiro = new Player("Lodeiro", "l", 25, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 80);
		Player sanchez = new Player("sanchez", "s", 24, 60, 170, "milieu", 99, 100, 100, 100, 100, 99, 99, 99);
		Player Bentacur = new Player("Bentacur", "b", 29, 60, 170, "milieu", 90, 88, 88, 88, 90, 97, 97, 88);
		// attaque
		Player suarez = new Player("suarez", "s", 38, 60, 170, "attaquant", 99, 99, 100, 100, 100, 99, 100, 100);
		Player cavani = new Player("cavani", "c", 32, 60, 170, "attaquant", 98, 99, 98, 99, 98, 99, 100, 100);
		Player rodriguez = new Player("rodriguez", "r", 18, 60, 170, "attaquant", 90, 95, 95, 95, 90, 95, 95, 95);
		Player gomez = new Player("gomez", "g", 25, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
		Player urretaviscaya2 = new Player("urretaviscaya", "u", 24, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88,
				50);
		Player rolan = new Player("rolan", "r", 24, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 90);
		Player stuani = new Player("stuani", "s", 24, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
		// array payers
		Player uruguay_players[] = { muslera, campana, conde, urretaviscaya, lodeiro, godin, gimerez, caceres, perirra,
				caceres2, valverde, vecino, Nandez, Lodeiro, sanchez, Bentacur, suarez, cavani, rodriguez, gomez,
				urretaviscaya2, rolan, stuani };
		Coach oscar = new Coach("Oscar", "Tabanez", 73, "uruguayen", 2);
		Coach coach_uruguay[] = { oscar };
		Team uruguay = new Team("4-3-3", "Uruguay", uruguay_players, coach_uruguay, "offensif");

		/** chili's players */
		// goal
		Player bravo = new Player("bravo", "b", 25, 60, 170, "gardien", 90, 99, 90, 100, 90, 99, 90, 90);
		Player cortes = new Player("cortes", "c", 28, 60, 170, "gardien", 90, 80, 90, 70, 90, 89, 88, 50);
		Player herra = new Player("herra", "h", 27, 60, 170, "gardien", 90, 80, 90, 70, 90, 89, 88, 50);
		// defense
		Player diaz = new Player("diaz", "d", 28, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
		Player roco = new Player("roco", "r", 23, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
		Player jara = new Player("jara", "j", 32, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 80);
		Player medel = new Player("medel", "m", 19, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 70);
		Player jara2 = new Player("jara", "j", 34, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
		Player isla = new Player("isla", "i", 36, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 100);
		Player beausejour = new Player("beausejour", "b", 31, 60, 170, "milieu", 100, 99, 98, 97, 100, 100, 100, 100);
		// milieu
		Player valdivia = new Player("valdivia", "v", 30, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player vidal = new Player("vidal", "v", 18, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player aranguiz = new Player("aranguiz", "a", 26, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player puch = new Player("puch", "p", 22, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player pulgar = new Player("pulgar", "p", 22, 60, 170, "milieu", 90, 90, 98, 99, 88, 100, 100, 100);
		Player silva = new Player("silva", "s", 23, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player diaz2 = new Player("diaz", "d", 23, 60, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		// attaque
		Player vargas = new Player("vargas", "v", 25, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 96);
		Player sanchez2 = new Player("sanchez", "s", 25, 60, 170, "attaquant", 99, 99, 90, 90, 90, 98, 100, 100);
		Player castillo = new Player("castillo", "c", 28, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 88);
		Player fuenzalida = new Player("fuenzalida", "f", 29, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 99);
		Player paredes = new Player("paredes", "p", 29, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 100);
		Player valdivia2 = new Player("valdivia", "v", 33, 60, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 88);

		// array chili's players
		Player chili_players[] = { bravo, cortes, herra, diaz, roco, jara, medel, jara2, isla, beausejour, valdivia,
				vidal, aranguiz, puch, pulgar, silva, diaz2, vargas, sanchez2, castillo, fuenzalida, paredes,
				valdivia2 };
		Coach rueda = new Coach("Reinaldo", "Rueda", 63, "colombien", 3);
		Coach coach_chili[] = { rueda };
		Team chili = new Team("5-3-1", "Chili", chili_players, coach_chili, "defensif");

		/**
		 * Poland ans Sweden's teams : Radolanirina
		 */
		/** Poland's players */
		// goal
		Player szczesny = new Player("szczesny", "w", 29, 90, 195, "gardien", 47, 12, 34, 16, 14, 45, 55, 13);
		Player majecki = new Player("majecki", "r", 20, 78, 191, "gardien", 31, 12, 22, 12, 16, 23, 45, 25);
		Player skorupski = new Player("skorupski", "l", 28, 84, 187, "gardien", 51, 19, 28, 10, 15, 31, 41, 12);
		// defense
		Player kedziora = new Player("kedziora", "t", 25, 77, 183, "defense", 79, 78, 67, 71, 51, 78, 56, 76);
		Player glik = new Player("glik", "k", 31, 80, 190, "defense", 47, 29, 62, 79, 20, 63, 57, 77);
		Player bednarek = new Player("bednarek", "j", 23, 77, 189, "defense", 68, 44, 66, 75, 23, 67, 25, 77);
		Player rybus = new Player("rybus", "m", 30, 75, 173, "defense", 76, 74, 70, 47, 71, 74, 75, 70);
		Player cionek = new Player("cionek", "t", 33, 80, 183, "defense", 62, 35, 53, 66, 26, 59, 31, 71);
		Player reca = new Player("reca", "a", 24, 81, 187, "defense", 78, 67, 62, 62, 54, 68, 60, 63);
		Player bereszynski = new Player("bereszynski", "b", 27, 77, 183, "defense", 86, 68, 65, 60, 60, 78, 64, 70);
		// Middle
		Player klich = new Player("klich", "m", 29, 82, 183, "milieu", 68, 67, 73, 48, 73, 83, 70, 50);
		Player frankowski = new Player("frankowski", "p", 24, 70, 173, "milieu", 92, 66, 68, 57, 56, 83, 58, 50);
		Player krychowiak = new Player("krychowiak", "g", 29, 85, 186, "milieu", 69, 63, 80, 75, 73, 75, 82, 75);
		Player bielik = new Player("bielik", "k", 22, 78, 189, "milieu", 64, 49, 70, 68, 52, 64, 62, 68);
		Player furman = new Player("furman", "d", 27, 71, 181, "milieu", 67, 72, 70, 60, 64, 72, 69, 64);
		Player grosicki = new Player("grosicki", "k", 31, 78, 180, "milieu", 80, 72, 70, 69, 75, 64, 74, 25);
		Player goralski = new Player("goralski", "j", 27, 66, 172, "attaquant", 73, 51, 70, 55, 46, 86, 50, 71);
		// attack
		Player zielinski = new Player("zielinski", "p", 25, 75, 180, "attaquant", 82, 77, 82, 52, 82, 73, 76, 71);
		Player szymanski = new Player("szymanski", "s", 20, 58, 174, "attaquant", 79, 71, 62, 40, 67, 65, 67, 29);
		Player lewandowski = new Player("lewandowski", "r", 31, 80, 184, "attaquant", 77, 71, 77, 85, 84, 78, 88, 35);
		Player piatek = new Player("piatek", "k", 24, 77, 183, "attaquant", 75, 51, 56, 80, 69, 73, 80, 33);
		Player kadzior = new Player("kadzior", "d", 27, 74, 175, "attaquant", 77, 58, 65, 89, 88, 73, 70, 46);
		Player milik = new Player("milik", "a", 25, 78, 186, "attaquant", 71, 58, 66, 80, 82, 70, 86, 33);

		// array players
		Player[] poland_players = { szczesny, majecki, skorupski, kedziora, glik, bednarek, rybus, cionek, reca,
				bereszynski, klich, frankowski, krychowiak, bielik, furman, grosicki, goralski, zielinski, szymanski,
				lewandowski, piatek, kadzior, milik };
		// array coachs
		Coach jerzy = new Coach("Jerzy", "Brzeczek", 49, "polish", 1);
		Coach[] poland_coachs = { jerzy };

		Team poland = new Team("4-3-4", "Poland", poland_players, poland_coachs, "offensif");

		/** Sweden's players */
		// goal
		Player johnsson = new Player("johnsson", "kj", 29, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
		Player nordfelt = new Player("nordfelt", "k", 30, 87, 188, "gardien", 49, 11, 35, 13, 12, 33, 50, 14);
		Player olsen = new Player("olsen", "r", 30, 86, 196, "gardien", 40, 20, 35, 16, 14, 37, 57, 14);
		// defense
		Player lustig = new Player("lustig", "m", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
		Player lindelof = new Player("lindelof", "v", 25, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
		Player granqvist = new Player("granqvist", "a", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
		Player bengtsson = new Player("bengtsson", "p", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		Player augustinsson = new Player("augustinsson", "l", 25, 72, 181, "defense", 73, 79, 74, 56, 59, 88, 69, 75);
		Player krafth = new Player("krafth", "e", 25, 72, 181, "defense", 77, 68, 66, 64, 58, 78, 70, 74);
		Player helander = new Player("helander", "f", 26, 84, 192, "defense", 47, 30, 50, 74, 25, 59, 58, 74);
		Player jansson = new Player("jansson", "p", 28, 86, 196, "defense", 65, 29, 65, 74, 50, 71, 68, 74);
		// Middle
		Player svensson = new Player("svensson", "g", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
		Player sema = new Player("sema", "k", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
		Player fransson = new Player("fransson", "a", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player fosberg = new Player("fosberg", "e", 28, 76, 177, "milieu", 65, 84, 73, 45, 74, 69, 73, 25);
		Player olsson = new Player("olsson", "k", 24, 69, 181, "milieu", 75, 65, 74, 52, 62, 78, 64, 57);
		Player ekdal = new Player("ekdal", "a", 30, 82, 186, "milieu", 47, 67, 79, 62, 69, 72, 72, 68);
		Player larsson = new Player("larsson", "s", 34, 70, 178, "attaquant", 55, 80, 77, 66, 72, 86, 77, 61);
		// attack
		Player quaison = new Player("quaison", "r", 26, 77, 183, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
		Player berg = new Player("berg", "m", 33, 74, 184, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
		Player andersson = new Player("andersson", "s", 28, 86, 190, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player tankovic = new Player("tanovic", "m", 24, 74, 180, "attaquant", 73, 65, 65, 63, 66, 74, 68, 24);
		Player isak = new Player("isak", "a", 20, 74, 190, "attaquant", 85, 51, 57, 68, 68, 68, 77, 20);

		// array players
		Player[] sweden_players = { johnsson, nordfelt, olsen, lustig, lindelof, granqvist, bengtsson, augustinsson,
				krafth, helander, jansson, svensson, sema, fransson, fosberg, olsson, ekdal, larsson, quaison, berg,
				andersson, tankovic, isak };

		// array coachs
		Coach janne = new Coach("Janne", "Anderson", 57, "polish", 2);
		Coach[] sweden_coachs = { janne };

		Team sweden = new Team("4-4-2", "Swede", sweden_players, sweden_coachs, "defensive");

		// FRANCE
		// gardien
		Player lloris = new Player(" Lloris ", " Hugo ", 33, 82, 188, " gardien ", 80, 85, 90, 75, 90, 80, 90, 80);
		Player lecompte = new Player(" Lecomte ", " Benjamin ", 28, 78, 186, " gardien ", 80, 80, 85, 75, 85, 75, 80,
				80);
		Player areola = new Player(" Areola ", " Alphonse ", 26, 94, 195, " gardien ", 80, 80, 85, 75, 85, 75, 85, 80);
		// défense
		Player hernandez = new Player(" Hernandez ", " Lucas ", 23, 76, 182, " défense ", 85, 80, 80, 85, 85, 80, 80,
				95);
		Player dubois = new Player(" Dubois ", " Léo ", 25, 73, 178, " défense ", 90, 85, 80, 70, 80, 80, 80, 85);
		Player kimpembe = new Player(" Kimpembe ", " Presnel ", 24, 80, 189, " défense ", 80, 80, 80, 80, 80, 80, 80,
				85);
		Player lenglet = new Player(" Lenglet ", " Clément ", 24, 81, 186, " défense ", 80, 85, 85, 85, 85, 80, 80, 95);
		Player mendy = new Player(" Mendy ", " Benjamin ", 25, 85, 185, " défense ", 85, 90, 85, 80, 80, 80, 80, 85);
		Player pavard = new Player(" Pavard ", " Benjamin ", 23, 76, 186, " defense ", 80, 80, 80, 80, 80, 80, 80, 90);
		Player varane = new Player(" Varane ", " Raphael ", 26, 81, 191, " défense ", 85, 80, 80, 85, 85, 90, 90, 95);
		Player zouma = new Player(" Zouma ", " Kurt ", 25, 95, 190, " défense ", 80, 80, 80, 80, 80, 95, 95, 90);
		// milieu
		Player pogba = new Player(" Pogba ", " Paul ", 26, 84, 191, " milieu ", 85, 85, 90, 85, 90, 85, 90, 80);
		Player kanté = new Player(" Kanté ", " N'Golo ", 28, 70, 168, " milieu ", 85, 85, 90, 75, 80, 100, 90, 95);
		Player ndombele = new Player(" Ndombele ", " Tanguy ", 23, 76, 181, " milieu ", 85, 80, 85, 80, 85, 80, 85, 80);
		Player matuidi = new Player(" Matuidi ", " Blaise ", 32, 75, 180, " milieu ", 80, 80, 85, 80, 85, 95, 90, 85);
		Player tolisso = new Player(" Tolisso ", " Corentin ", 25, 81, 181, " milieu ", 85, 85, 90, 85, 85, 85, 85, 80);
		// attaque
		Player dembele = new Player(" Dembele ", " Ousmane ", 22, 67, 178, " attaquant ", 95, 85, 85, 85, 85, 85, 80,
				80);
		Player coman = new Player(" Coman ", " Kingsley ", 23, 75, 179, " attaquant ", 95, 80, 80, 80, 85, 80, 80, 80);
		Player nabil = new Player(" Nabil ", " Fékir ", 26, 75, 173, " attaquant ", 85, 80, 85, 85, 85, 80, 85, 80);
		Player giroud = new Player(" Giroud ", " Olivier ", 33, 91, 193, " attaquant ", 75, 75, 80, 95, 85, 80, 90, 80);
		Player griezmann = new Player(" Griezmann ", " Antoine ", 28, 73, 176, " attaquant ", 85, 85, 90, 85, 90, 90,
				80, 80);
		Player lemar = new Player(" Lemar ", " Thomas ", 24, 62, 171, " attaquant ", 85, 85, 85, 80, 90, 85, 85, 80);
		Player mbappe = new Player(" Mbappe ", " Kylian ", 21, 73, 178, " attaquant ", 100, 85, 85, 80, 90, 85, 85, 80);
		// tableau
		Player france_players[] = { lloris, lecompte, areola, hernandez, dubois, kimpembe, lenglet, mendy, pavard,
				varane, zouma, pogba, kanté, ndombele, matuidi, tolisso, dembele, coman, nabil, giroud, griezmann,
				lemar, mbappe };
		Coach didier = new Coach("Didier", "Deschamps", 51, "française", 5);
		Coach coach_france[] = { didier };
		Team france = new Team(" 4-2-3-1 ", "France ", france_players, coach_france, " équilibré ");

		// ARGENTINE 
		// gardien
		Player marchesín = new Player(" Marchesín ", " Agustín  ", 31, 85, 188, " gardien ", 80, 80, 85, 75, 85, 75, 80,
				80);
		Player musso = new Player(" Musso ", " Juan ", 25, 93, 191, " gardien ", 75, 80, 82, 75, 85, 75, 80, 75);
		Player martínez = new Player(" Martínez ", " Emiliano ", 27, 85, 193, " gardien ", 75, 80, 80, 75, 85, 75, 80,
				75);
		// défense
		Player foyth = new Player(" Foyth ", " Juan ", 22, 69, 187, " défense ", 75, 75, 75, 75, 75, 70, 75, 75);
		Player saravia = new Player(" Saravia ", " Renzo ", 26, 75, 176, " défense ", 91, 73, 73, 70, 70, 76, 70, 75);
		Player otamendi = new Player(" Otamendi ", " Nicolás ", 31, 81, 183, " défense ", 70, 75, 75, 84, 75, 70, 80,
				85);
		Player pezzella = new Player(" Pezzella ", " Germán ", 28, 81, 186, " défense ", 70, 70, 70, 82, 70, 70, 79,
				82);
		Player rojo = new Player(" Rojo ", " Marcos ", 29, 85, 187, " défense ", 70, 72, 72, 77, 80, 70, 80, 79);
		Player tagliafico = new Player(" Tagliafico ", " Nicolás ", 27, 65, 172, " defense ", 82, 81, 78, 82, 75, 86,
				74, 84);
		Player pérez = new Player(" Pérez ", " Nehuén ", 19, 75, 186, " défense ", 70, 70, 70, 70, 70, 73, 71, 77);
		// milieu
		Player rodríguez = new Player(" Rodríguez ", " Guido ", 24, 80, 185, " milieu ", 70, 70, 78, 70, 76, 77, 81,
				79);
		Player loCelso = new Player(" Lo Celso ", " Giovani ", 23, 68, 177, " milieu ", 78, 78, 83, 70, 82, 76, 70, 70);
		Player paredesl = new Player(" Paredes ", " Leandro ", 25, 75, 180, " milieu ", 70, 76, 82, 70, 82, 79, 70, 75);
		// attaque
		Player diMaria = new Player(" Di Maria ", " Angel ", 31, 69, 180, " attaquant ", 84, 87, 83, 70, 88, 78, 70,
				70);
		Player dePaul = new Player(" De Paul ", " Rodrigo Javier ", 25, 70, 178, " attaquant ", 72, 77, 80, 70, 80, 72,
				70, 70);
		Player acuna = new Player(" Acuña ", " Marcos ", 28, 69, 172, " attaquant ", 75, 87, 81, 70, 88, 90, 81, 82);
		Player pereyra = new Player(" Pereyra ", " Roberto ", 29, 77, 182, " attaquant ", 75, 75, 79, 70, 78, 74, 70,
				70);
		Player ocampos = new Player(" Ocampos ", " Lucas ", 25, 84, 187, " attaquant ", 83, 76, 77, 77, 82, 91, 81, 70);
		Player messi = new Player(" Messi ", " Lionel ", 32, 72, 170, " attaquant ", 84, 88, 92, 70, 95, 75, 70, 70);
		Player aguero = new Player(" Agüero ", " Sergio ", 31, 70, 173, " attaquant ", 78, 70, 83, 78, 94, 79, 74, 70);
		Player gonzalez = new Player(" González ", " Nicolás ", 21, 72, 180, " attaquant ", 79, 70, 70, 70, 73, 78, 70,
				70);
		Player icardi = new Player(" Icardi ", " Mauro ", 26, 75, 181, " attaquant ", 75, 70, 74, 88, 90, 70, 73, 70);
		Player dybala = new Player(" Dybala ", " Paulo ", 26, 75, 177, " attaquant ", 82, 82, 87, 80, 88, 79, 70, 70);
		// tableau
		Player argentin_players[] = { marchesín, musso, martínez, foyth, saravia, otamendi, pezzella, rojo, tagliafico,
				pérez, rodríguez, loCelso, paredesl, diMaria, dePaul, acuna, pereyra, ocampos, messi, aguero, gonzalez,
				icardi, dybala };
		Coach lionel = new Coach(" Lionel ", " Scaloni ", 41, " argentin ", 3);
		Coach coach_argentin[] = { lionel };
		Team argentin = new Team(" 4-3-3 ", " Argentine ", argentin_players, coach_argentin, " offensif ");

		/**
		 * Teams of Portugal and Italy : LIGUORI
		 */

		/**
		 * Portugal Players
		 */

		// goal
		Player patricio = new Player("Patricio", "R", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
		Player sa = new Player("sa", "J", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
		Player beto = new Player("Beto", "", 32, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);

		// defense
		Player pepe = new Player("Pepe", "", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
		Player dias = new Player("Dias", "R", 25, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
		Player guerreiro = new Player("guerreiro", "", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
		Player pereira = new Player("pereira", "R", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		Player rui = new Player("Rui", "M", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		Player fonte = new Player("Fonte", "J", 36, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		Player cancelo = new Player("Cancelo", "J", 25, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);

		// Middle
		Player pereiraD = new Player("pereira", "D", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
		Player moutinho = new Player("moutinho", "J", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
		Player fernandes = new Player("fernandes", "B", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player carvalho = new Player("carvalho", "W", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player pizzi = new Player("Pizzi", "", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player neves = new Player("Neves", "R", 22, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);

		// attack
		Player ronaldoC = new Player("Ronaldo", "C", 34, 83, 187, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
		Player guedes = new Player("Guedes", "G", 23, 68, 179, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
		Player silvaB = new Player("Silva", "B", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player felix = new Player("Felix", "J", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player jota = new Player("Jota", "D", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player silvaA = new Player("Silva", "A", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player bruma = new Player("Bruma", "", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);

		// array players
		Player[] portugal_players = { patricio, sa, beto, pepe, dias, guerreiro, pereira, rui, fonte, cancelo, pereiraD,
				moutinho, fernandes, carvalho, pizzi, neves, ronaldoC, guedes, silvaB, felix, jota, silvaA, bruma };

		// array coachs
		Coach santosF = new Coach("Santos", "Fernando", 66, "portugal", 2);
		Coach[] portugal_coachs = { santosF };

		Team portugal = new Team("4-4-2", "Portugal", portugal_players, portugal_coachs, "offensif");

		/**
		 * Italy Players
		 */

		// goal
		Player donnarumma = new Player("Donnarumma", "G", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
		Player meret = new Player("meret", "A", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
		Player sirigu = new Player("Sirigu", "S", 33, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);

		// defense
		Player florenzi = new Player("florenzi", "A", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
		Player bonucci = new Player("bonucci", "L", 32, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
		Player acerbi = new Player("acerbi", "F", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
		Player biraghi = new Player("biraghi", "C", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		Player romagnoli = new Player("Romagnoli", "A", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
		Player lorenzo = new Player("Lorenzo", "G", 36, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);

		// Middle
		Player emerson = new Player("emerson", "", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
		Player barella = new Player("barella", "N", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
		Player jorginho = new Player("Jorginho", "", 28, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player verratti = new Player("Verratti", "M", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player tonali = new Player("Tonali", "S", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player sensi = new Player("Sensi", "S", 22, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
		Player zaniolo = new Player("Zaniolo", "N", 20, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);

		// attack
		Player bernardeschi = new Player("bernardeschi", "F", 34, 83, 187, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
		Player immobile = new Player("Immobile", "C", 23, 68, 179, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
		Player insigne = new Player("insigne", "L", 28, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player belotti = new Player("Belotti", "A", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player politano = new Player("Politano", "M", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player shaarawy = new Player("shaarawy", "S", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
		Player chiesa = new Player("Chiesa", "F", 22, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);

		// array players
		Player[] italy_players = { donnarumma, meret, sirigu, florenzi, bonucci, acerbi, biraghi, romagnoli, lorenzo,
				emerson, barella, jorginho, verratti, tonali, sensi, zaniolo, bernardeschi, immobile, insigne, belotti,
				politano, shaarawy, chiesa };

		// array coachs
		Coach mancini = new Coach("Mancini", "Roberto", 56, "italy", 2);
		Coach[] italy_coachs = { mancini };

		Team italy = new Team("4-4-2", "Italy", italy_players, italy_coachs, "offensif");

		// espagne

		Player deGea = new Player("De Gea", "d", 25, 60, 190, "gardien", 90, 84, 81, 92, 58, 85, 90, 90);
		Player kepa = new Player("kepa", "c", 23, 60, 180, "gardien", 84, 82, 86, 85, 33, 80, 88, 50);
		Player casillas = new Player("herra", "h", 30, 60, 170, "gardien", 85, 75, 61, 84, 55, 86, 88, 50);
		// defense
		Player ramos = new Player("ramos", "d", 28, 60, 170, "defense", 72, 68, 75, 74, 87, 85, 88, 90);
		Player pique = new Player("pique", "r", 23, 60, 170, "defense", 72, 63, 74, 80, 90, 82, 88, 90);
		Player jordiAlba = new Player("jordi alba", "j", 32, 60, 170, "defense", 91, 70, 82, 84, 80, 74, 88, 80);
		Player carvajal = new Player("carvajal", "m", 19, 60, 170, "defense", 82, 49, 79, 82, 83, 82, 88, 70);
		Player azpilicueta = new Player("azpilicueta", "j", 34, 60, 170, "defense", 73, 57, 80, 75, 87, 78, 88, 90);
		Player roberto = new Player("roberto", "i", 36, 60, 170, "defense", 78, 63, 81, 78, 77, 73, 88, 90);
		Player iniesta = new Player("iniesta", "b", 31, 60, 170, "milieu", 79, 81, 94, 96, 70, 76, 99, 99);
		// milieu
		Player isco = new Player("isco", "v", 30, 60, 170, "milieu", 71, 77, 83, 90, 59, 60, 88, 50);
		Player silvaDavid = new Player("david silva", "v", 18, 60, 170, "milieu", 66, 75, 89, 90, 53, 58, 88, 50);
		Player busquets = new Player("Busquets", "a", 26, 60, 170, "milieu", 42, 62, 80, 81, 85, 80, 88, 50);
		Player koke = new Player("koke", "p", 22, 60, 170, "milieu", 68, 75, 86, 82, 74, 79, 88, 50);
		Player tiago = new Player("tiago", "p", 22, 60, 170, "milieu", 71, 76, 87, 91, 70, 64, 99, 99);
		Player luis_alberto = new Player("luis_alberto", "s", 23, 60, 170, "milieu", 77, 82, 91, 88, 53, 63, 88, 50);
		Player rodri = new Player("rodri", "d", 23, 60, 170, "milieu", 67, 68, 77, 78, 82, 80, 88, 50);
		// attaque
		Player diegoCosta = new Player("diegoCosta", "v", 25, 60, 170, "attaquant", 83, 92, 79, 89, 50, 96, 88, 96);
		Player traore = new Player("traore", "s", 25, 60, 170, "attaquant", 99, 80, 80, 89, 43, 85, 90, 90);
		Player villa = new Player("david villa", "c", 28, 60, 170, "attaquant", 90, 89, 79, 92, 46, 84, 88, 88);
		Player raul = new Player("raul", "f", 29, 60, 170, "attaquant", 88, 92, 82, 90, 47, 75, 88, 99);
		Player morales = new Player("morales", "p", 29, 60, 170, "attaquant", 94, 83, 78, 90, 59, 70, 88, 100);
		Player aspas = new Player("aspas", "v", 33, 60, 170, "attaquant", 80, 86, 78, 86, 36, 65, 88, 88);

		Player[] spain_players = { deGea, kepa, casillas, ramos, pique, jordiAlba, carvajal, azpilicueta, roberto,
				iniesta, isco, silvaDavid, busquets, koke, tiago, luis_alberto, rodri, diegoCosta, traore, villa, raul,
				morales, aspas };
		Coach gouardilla = new Coach("gourdiola", "pepe", 88, "spanich", 2);
		Coach[] coach_spain = { gouardilla };
		Team spain = new Team("4-3-3", "Spain", spain_players, coach_spain, "offensif");

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// BRESIL

		Player alisson = new Player("Alisson", "d", 25, 60, 190, "gardien", 85, 84, 85, 89, 52, 90, 90, 90);
		Player ederson = new Player(" Ederson ", "c", 23, 60, 180, "gardien", 86, 82, 93, 88, 64, 86, 88, 50);
		Player neto = new Player("Neto", "h", 30, 60, 170, "gardien", 86, 81, 79, 82, 52, 82, 88, 50);
		// defene
		Player marcelo = new Player("Marcelo", "d", 28, 60, 170, "defense", 86, 78, 86, 91, 82, 84, 88, 90);
		Player carlos = new Player(" Carlos ", "r", 23, 60, 170, "defense", 92, 83, 86, 81, 86, 86, 88, 90);
		Player thiagoSilva = new Player("thiago silva", "j", 32, 60, 170, "defense", 66, 57, 77, 76, 90, 81, 88, 80);
		Player davidLuiz = new Player("david Luiz", "m", 19, 60, 170, "defense", 83, 76, 83, 82, 90, 86, 88, 70);
		Player marquinhos = new Player("Marquinhos ", "j", 34, 60, 170, "defense", 78, 43, 76, 75, 88, 79, 88, 90);
		Player Militao = new Player("Militao ", "i", 36, 60, 170, "defense", 83, 56, 75, 77, 86, 86, 88, 90);
		Player casemiro = new Player("Casemiro", "b", 31, 60, 170, "milieu", 63, 75, 76, 73, 87, 90, 99, 99);
		// milieu
		Player coutinho = new Player("Coutinho", "v", 30, 60, 170, "milieu", 80, 82, 86, 91, 53, 65, 88, 50);
		Player fabinho = new Player("Fabinho", "v", 18, 60, 170, "milieu", 69, 70, 79, 79, 87, 84, 88, 50);
		Player rivaldo = new Player("Rivaldo", "a", 26, 60, 170, "milieu", 86, 87, 85, 88, 42, 76, 88, 50);
		Player allan = new Player("allan", "p", 22, 60, 170, "milieu", 78, 76, 81, 86, 87, 86, 88, 50);
		Player fernandinho = new Player("fernandinho", "p", 22, 60, 170, "milieu", 66, 74, 79, 79, 84, 79, 99, 99);
		Player socrates = new Player("socrates", "s", 23, 60, 170, "milieu", 80, 86, 87, 87, 47, 82, 88, 50);
		Player arthur = new Player("Arthur", "d", 23, 60, 170, "milieu", 69, 71, 81, 86, 73, 70, 88, 50);
		// attaque
		Player neymar = new Player("Neymar ", "v", 25, 60, 170, "attaquant", 92, 86, 88, 96, 33, 58, 88, 96);
		Player firmino = new Player("Firmino", "s", 25, 60, 170, "attaquant", 79, 84, 81, 89, 62, 80, 90, 90);
		Player ronaldinho = new Player("Ronaldinho", "c", 28, 60, 170, "attaquant", 80, 85, 88, 90, 38, 77, 88, 88);
		Player ronaldo = new Player("Ronaldo", "f", 29, 60, 170, "attaquant", 97, 95, 81, 95, 45, 76, 88, 99);
		Player kaka = new Player("kaka", "p", 29, 60, 170, "attaquant", 91, 86, 88, 92, 44, 73, 88, 100);
		Player willian = new Player("willian", "v", 33, 60, 170, "attaquant", 89, 84, 85, 89, 53, 65, 88, 88);

		Player[] bresil_players = { alisson, ederson, neto, marcelo, carlos, thiagoSilva, davidLuiz, marquinhos,
				Militao, casemiro, coutinho, fabinho, rivaldo, allan, fernandinho, socrates, arthur, neymar, firmino,
				ronaldinho, ronaldo, kaka, willian };
		Coach sofiane = new Coach("idmbarkos", "safawan", 80, "bresilien", 3);
		// Coach ss = new Coach(lastName, firstName, age, nationality, level)
		Coach[] coach_bresil = { sofiane };
		Team bresil = new Team("4-3-4", "Brasil", bresil_players, coach_bresil, "offensif");

		// -------------------------------------------------------------------------------------------------------------------------------------------------------

		// portugal

		Player lopes = new Player("lopes", "d", 25, 60, 190, "gardien", 83, 83, 77, 85, 51, 82, 90, 90);
		Player patricioc = new Player(" patricioc ", "c", 23, 60, 180, "gardien", 83, 77, 77, 86, 48, 75, 88, 50);
		Player joseSa = new Player("jose Sa", "h", 30, 60, 170, "gardien", 79, 76, 81, 83, 44, 79, 88, 50);
		// defene
		Player pereiras = new Player("pereiras", "d", 28, 60, 170, "defense", 86, 63, 88, 85, 90, 81, 88, 90);
		Player samedo = new Player(" pereira ", "r", 23, 60, 170, "defense", 86, 65, 78, 82, 86, 86, 88, 90);
		Player canceloe = new Player("canceloe", "j", 32, 60, 170, "defense", 75, 65, 84, 77, 86, 82, 88, 80);
		Player almeida = new Player("almeida", "m", 19, 60, 170, "defense", 59, 59, 65, 62, 86, 80, 88, 70);
		Player caravalho = new Player("caravalho ", "j", 34, 60, 170, "defense", 82, 55, 78, 82, 83, 80, 88, 90);
		Player pepee = new Player("pepee", "i", 36, 60, 170, "defense", 43, 60, 67, 62, 82, 81, 88, 90);
		Player ferro = new Player("ferro", "b", 31, 60, 170, "milieu", 93, 81, 87, 94, 38, 76, 99, 99);
		// milieu
		Player pizzie = new Player("pizzie", "v", 30, 60, 170, "milieu", 76, 85, 90, 85, 77, 85, 88, 50);
		Player deco = new Player("deco", "v", 18, 60, 170, "milieu", 86, 86, 86, 92, 45, 68, 88, 50);
		Player figo = new Player("figo", "a", 26, 60, 170, "milieu", 91, 82, 85, 88, 41, 58, 88, 50);
		Player martins = new Player("martins", "p", 22, 60, 170, "milieu", 64, 76, 87, 84, 80, 72, 88, 50);
		Player nani = new Player("nani", "p", 22, 60, 170, "milieu", 91, 82, 83, 87, 52, 79, 99, 99);
		Player rafa = new Player("rafa", "s", 23, 60, 170, "milieu", 75, 71, 84, 82, 75, 77, 88, 50);
		Player guerreiroe = new Player("guerreiroe", "d", 23, 60, 170, "milieu", 80, 78, 82, 86, 39, 68, 88, 50);
		// attaque
		Player crinsianoRonaldo = new Player("crinsianoRonaldo ", "v", 25, 60, 170, "attaquant", 90, 94, 94, 98, 41, 69,
				88, 96);
		Player eusebio = new Player("eusebio", "s", 25, 60, 170, "attaquant", 82, 91, 79, 90, 34, 75, 90, 90);
		Player bernardoSilva = new Player("bernardo Silva", "c", 28, 60, 170, "attaquant", 90, 87, 86, 91, 50, 70, 88,
				88);
		Player eder = new Player("eder", "f", 29, 60, 170, "attaquant", 64, 87, 73, 81, 32, 72, 88, 99);
		Player horta = new Player("horta", "p", 29, 60, 170, "attaquant", 89, 90, 72, 89, 38, 73, 88, 99);
		Player joaoFelix = new Player("joao Felix", "v", 33, 60, 170, "attaquant", 75, 84, 61, 77, 36, 69, 88, 88);

		Player[] belgique_players = { lopes, patricioc, joseSa, pereiras, samedo, canceloe, almeida, caravalho, pepee,
				ferro, pizzie, deco, figo, martins, nani, rafa, guerreiroe, crinsianoRonaldo, eusebio, bernardoSilva,
				eder, horta, joaoFelix };
		Coach morinio = new Coach("marinio", "silva", 88, "portugal", 2);
		// Coach ss = new Coach(lastName, firstName, age, nationality, level)
		Coach[] coach_belgique = { morinio };
		Team belgique = new Team("4-5-1", "Belgique", belgique_players, coach_belgique, "offensif");

		// ALGERIE

		Player mbolhi = new Player("mbolhi", "d", 25, 60, 190, "gardien", 83, 88, 90, 94, 99, 82, 90, 90);
		Player oukidja = new Player(" oukidja ", "c", 23, 60, 180, "gardien", 88, 88, 88, 88, 99, 94, 88, 50);
		Player doukha = new Player("doukha", "h", 30, 60, 170, "gardien", 91, 92, 95, 88, 98, 99, 88, 50);
		// defene
		Player atal = new Player("atal", "d", 28, 60, 170, "defense", 80, 90, 88, 85, 90, 94, 99, 90);
		Player bensebaini = new Player(" bensebaini ", "r", 23, 60, 170, "defense", 90, 90, 90, 94, 92, 96, 99, 90);
		Player benlamri = new Player("benlamri", "j", 32, 60, 170, "defense", 99, 95, 84, 87, 86, 88, 88, 80);
		Player tahrat = new Player("tahrat", "m", 19, 60, 170, "defense", 90, 92, 94, 95, 86, 88, 88, 89);
		Player ghoulam = new Player("ghoulam ", "j", 34, 60, 170, "defense", 92, 90, 91, 94, 90, 92, 94, 90);
		Player mandi = new Player("mandi", "i", 36, 60, 170, "defense", 94, 94, 94, 92, 91, 92, 99, 90);
		Player guedioura = new Player("guedioura", "b", 31, 60, 170, "milieu", 93, 93, 93, 92, 87, 88, 99, 99);
		// milieu
		Player feghouli = new Player("feghouli", "v", 30, 60, 170, "milieu", 76, 70, 90, 88, 88, 85, 88, 88);
		Player banacer = new Player("banacer", "v", 18, 60, 170, "milieu", 90, 90, 90, 92, 88, 91, 88, 94);
		Player bentaleb = new Player("bentaleb", "a", 26, 60, 170, "milieu", 91, 82, 85, 88, 87, 88, 88, 50);
		Player ferhat = new Player("martins", "p", 22, 60, 170, "milieu", 91, 92, 94, 94, 80, 89, 88, 90);
		Player abeid = new Player("abeid", "p", 22, 60, 170, "milieu", 91, 92, 88, 98, 95, 97, 98, 91);
		Player fares = new Player("fares", "s", 23, 60, 170, "milieu", 75, 71, 84, 82, 75, 77, 88, 99);
		Player matmour = new Player("matmour", "d", 23, 60, 170, "milieu", 88, 98, 87, 86, 39, 88, 88, 80);
		// attaque
		Player mehrez = new Player("mehrez", "v", 25, 60, 170, "attaquant", 90, 94, 94, 98, 99, 94, 98, 96);
		Player dolort = new Player("dolort", "s", 25, 60, 170, "attaquant", 92, 91, 88, 90, 96, 85, 90, 90);
		Player Bounedjah = new Player("Bounedjah", "c", 28, 60, 170, "attaquant", 90, 92, 91, 90, 88, 89, 88, 88);
		Player ounas = new Player("ounas", "f", 29, 60, 170, "attaquant", 90, 97, 90, 91, 88, 92, 90, 99);
		Player soudani = new Player("soudani", "p", 29, 60, 170, "attaquant", 89, 90, 92, 99, 91, 92, 90, 99);
		Player bellaili = new Player("bellaili", "v", 33, 60, 170, "attaquant", 90, 94, 99, 99, 98, 94, 90, 90);

		Player[] algeria_players = { mbolhi, oukidja, doukha, atal, bensebaini, benlamri, tahrat, ghoulam, mandi,
				guedioura, feghouli, banacer, bentaleb, ferhat, abeid, fares, matmour, mehrez, dolort, Bounedjah, ounas,
				soudani, bellaili };
		Coach belmadi = new Coach("belmadi", "djamel", 95, "algerien", 4);
		// Coach ss = new Coach(lastName, firstName, age, nationality, level)
		Coach[] coach_algeria = { belmadi };
		Team algeria = new Team("4-4-3", "Algerie", algeria_players, coach_algeria, "offensif");

		// ----------------------------------------------------------------------------------------------------

		// Germany

		// Germany

		Player neuer = new Player("Neuer", "d", 25, 60, 190, "gardien", 92, 91, 95, 91, 63, 92, 90, 90);
		Player stegen = new Player("Ter Stegen", "c", 23, 60, 180, "gardien", 92, 91, 95, 91, 44, 89, 88, 50);
		Player bauman = new Player("Bauman", "h", 30, 60, 170, "gardien", 84, 83, 72, 87, 51, 81, 88, 50);
		// defense
		Player hummels = new Player("Hummels", "d", 28, 60, 170, "defense", 51, 58, 76, 73, 89, 76, 88, 90);
		Player kimich = new Player("Kimich", "r", 23, 60, 170, "defense", 73, 70, 88, 85, 81, 79, 88, 90);
		Player boating = new Player("Boating", "j", 32, 60, 170, "defense", 66, 50, 72, 66, 84, 82, 88, 80);
		Player bender = new Player("Bender", "m", 19, 60, 170, "defense", 69, 67, 75, 75, 87, 80, 88, 70);
		Player tah = new Player("Tah", "j", 34, 60, 170, "defense", 71, 27, 59, 58, 83, 81, 88, 90);
		Player max = new Player("Max", "i", 36, 60, 170, "defense", 85, 57, 82, 79, 74, 76, 88, 90);
		Player halstenberg = new Player("Halstenberg", "b", 31, 60, 170, "milieu", 69, 66, 72, 72, 80, 80, 99, 99);
		// milieu
		Player reus = new Player("Reus", "v", 30, 60, 170, "milieu", 86, 89, 85, 88, 46, 67, 88, 50);
		Player kroos = new Player("Kroos", "v", 18, 60, 170, "milieu", 46, 83, 91, 82, 71, 70, 88, 50);
		Player muler = new Player("Muler", "a", 26, 60, 170, "milieu", 85, 85, 81, 88, 57, 73, 88, 50);
		Player ozil = new Player("Ozil", "p", 22, 60, 170, "milieu", 82, 82, 88, 86, 26, 60, 88, 50);
		Player schweinsteiger = new Player("Schweinsteiger", "p", 22, 60, 170, "milieu", 71, 84, 90, 85, 82, 86, 99,
				99);
		Player draxler = new Player("Draxler", "s", 23, 60, 170, "milieu", 79, 81, 83, 88, 88, 71, 88, 50);
		Player gundogan = new Player("Gundogan", "d", 23, 60, 170, "milieu", 68, 77, 86, 86, 74, 73, 88, 50);
		// attaque
		Player bellarabi = new Player("Bellarbi", "v", 25, 60, 170, "attaquant", 93, 78, 78, 86, 36, 73, 88, 96);
		Player gnabry = new Player("Gnabry", "s", 25, 60, 170, "attaquant", 90, 82, 75, 85, 43, 69, 90, 90);
		Player werner = new Player("Werner", "c", 28, 60, 170, "attaquant", 93, 84, 71, 84, 36, 71, 88, 88);
		Player sane = new Player("Sane", "f", 29, 60, 170, "attaquant", 95, 81, 79, 86, 38, 70, 88, 99);
		Player gotze = new Player("Gotze", "p", 29, 60, 170, "attaquant", 71, 78, 85, 86, 56, 70, 88, 100);
		Player hunt = new Player("Hunt", "v", 33, 60, 170, "attaquant", 65, 73, 75, 76, 44, 63, 88, 88);

		Player[] germany_players = { neuer, stegen, bauman, hummels, kimich, boating, bender, tah, max, halstenberg,
				reus, kroos, muler, ozil, schweinsteiger, draxler, gundogan, bellarabi, gnabry, werner, sane, gotze,
				hunt };
		Coach jurgen = new Coach("jurgen", "clup", 73, "uruguayen", 2);
		Coach[] coach_germany = { jurgen };
		Team germany = new Team("4-3-3", "Germany", germany_players, coach_germany, "offensif");

		//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

		// england

		Player foster = new Player("Foster", "d", 25, 60, 190, "gardien", 82, 83, 76, 84, 52, 82, 90, 90);
		Player pickford = new Player(" Pickford ", "c", 23, 60, 180, "gardien", 82, 78, 87, 86, 44, 82, 88, 50);
		Player pope = new Player("Pope", "h", 30, 60, 170, "gardien", 82, 83, 79, 83, 52, 83, 88, 50);
		// defene
		Player arnold = new Player("Arnold", "d", 28, 60, 170, "defense", 92, 85, 97, 92, 92, 87, 88, 90);
		Player walker = new Player(" Walker ", "r", 23, 60, 170, "defense", 93, 68, 81, 81, 84, 84, 88, 90);
		Player smalling = new Player("Smaling", "j", 32, 60, 170, "defense", 76, 53, 65, 64, 87, 86, 88, 80);
		Player fernand = new Player("Fernand", "m", 19, 60, 170, "defense", 84, 48, 65, 64, 70, 84, 83, 70);
		Player Guigz = new Player("Guigz ", "j", 34, 60, 170, "defense", 78, 43, 76, 75, 88, 79, 88, 90);
		Player henderson = new Player("Henderson ", "i", 36, 60, 170, "defense", 52, 54, 69, 75, 84, 86, 88, 90);
		Player gomeze = new Player("gomeze", "b", 31, 60, 170, "milieu", 85, 35, 73, 75, 84, 91, 99, 99);
		// milieu
		Player sanchoc = new Player("Sanchoc", "v", 30, 60, 170, "milieu", 99, 95, 98, 99, 84, 95, 88, 50);
		Player ali = new Player("Ali", "v", 18, 60, 170, "milieu", 77, 85, 83, 86, 73, 82, 88, 50);
		Player rashford = new Player("Rashford", "a", 26, 60, 170, "milieu", 94, 85, 75, 85, 47, 80, 88, 50);
		Player maddison = new Player("Maddison", "p", 22, 60, 170, "milieu", 80, 81, 87, 84, 44, 62, 88, 50);
		Player sancho = new Player("Sancho", "p", 22, 60, 170, "milieu", 88, 72, 77, 90, 90, 36, 99, 99);
		Player philips = new Player("Philips", "s", 23, 60, 170, "milieu", 77, 80, 86, 86, 84, 83, 88, 50);
		Player lingard = new Player("Li,gard", "d", 23, 60, 170, "milieu", 80, 78, 81, 76, 83, 72, 88, 50);
		// attaque
		Player kane = new Player("Kane ", "v", 25, 60, 170, "attaquant", 80, 95, 86, 87, 87, 51, 87, 96);
		Player sterling = new Player("Sterling", "s", 25, 60, 170, "attaquant", 94, 80, 79, 90, 46, 46, 90, 90);
		Player abraham = new Player("Abraham", "c", 28, 60, 170, "attaquant", 84, 87, 70, 83, 39, 80, 88, 88);
		Player vardy = new Player("Vardy", "f", 29, 60, 170, "attaquant", 91, 86, 72, 81, 81, 59, 88, 99);
		Player rooney = new Player("Rooney", "p", 29, 60, 170, "attaquant", 64, 81, 80, 76, 56, 76, 88, 100);
		Player ings = new Player("Ings", "v", 33, 60, 170, "attaquant", 81, 81, 69, 82, 37, 71, 88, 88);

		Player[] england_players = { foster, pickford, pope, arnold, walker, smalling, fernand, Guigz, henderson,
				gomeze, sanchoc, ali, rashford, maddison, sancho, philips, lingard, kane, sterling, abraham, vardy,
				rooney, ings };
		Coach heniken = new Coach("Heniken", "adams", 73, "uruguayen", 2);
		Coach[] coach_england = { heniken };
		Team england = new Team("4-3-3", "England", england_players, coach_england, "offensif");
		// -------------------------------------------------------------------------------------------------------------------------------------------------------

		// Morocco

		Player zniti = new Player("Zniti", "d", 25, 60, 190, "gardien", 70, 60, 80, 50, 60, 81, 66, 90);
		Player bounou = new Player(" Bounou ", "c", 23, 60, 180, "gardien", 75, 66, 71, 62, 65, 54, 78, 50);
		Player munir = new Player("Munir", "h", 30, 60, 170, "gardien", 81, 76, 81, 83, 44, 79, 88, 50);
		// defene
		Player hakimi = new Player("Hakimi", "d", 28, 60, 170, "defense", 65, 65, 78, 80, 69, 60, 88, 90);
		Player costa = new Player(" Costa ", "r", 23, 60, 170, "defense", 86, 65, 78, 82, 86, 64, 88, 90);
		Player feddal = new Player("mascherano", "j", 32, 60, 170, "defense", 70, 85, 84, 77, 86, 82, 88, 80);
		Player yamiq = new Player("Yamiq", "m", 19, 60, 170, "defense", 89, 90, 84, 75, 60, 60, 88, 70);
		Player banoun = new Player("Banoun ", "j", 34, 60, 170, "defense", 82, 90, 84, 82, 83, 80, 88, 90);
		Player mendyl = new Player("Mendyl ", "i", 36, 60, 170, "defense", 89, 85, 20, 75, 40, 80, 88, 90);
		Player saadane = new Player("Saadane", "b", 31, 60, 170, "defense", 93, 81, 30, 94, 80, 40, 99, 99);
		// milieu
		Player zyich = new Player("Zyich", "v", 30, 60, 170, "milieu", 66, 55, 90, 22, 99, 65, 88, 50);
		Player amrabt = new Player("Amrabt", "v", 18, 60, 170, "milieu", 93, 33, 94, 44, 36, 88, 88, 50);
		Player fajr = new Player("Fajr", "a", 26, 60, 170, "milieu", 54, 95, 90, 23, 85, 70, 80, 50);
		Player bennaser = new Player("Bennaser", "p", 22, 60, 170, "milieu", 15, 76, 81, 86, 87, 86, 70, 50);
		Player harit = new Player("Harit", "p", 22, 60, 170, "milieu", 66, 60, 79, 79, 84, 79, 70, 50);
		Player taarabt = new Player("Taarabt", "s", 23, 60, 170, "milieu", 80, 60, 87, 87, 47, 50, 88, 50);
		Player hafidi = new Player("Hafidi", "d", 23, 60, 170, "milieu", 69, 71, 81, 86, 73, 70, 88, 50);
		// attaque
		Player enssiri = new Player("Enssiri ", "v", 25, 60, 170, "attaquant", 65, 86, 88, 96, 33, 58, 88, 96);
		Player yajour = new Player("Yajour", "s", 25, 60, 170, "attaquant", 79, 84, 81, 89, 62, 80, 90, 90);
		Player alarabi = new Player("Alarabi", "c", 28, 60, 170, "attaquant", 50, 85, 88, 56, 38, 77, 88, 88);
		Player chamakh = new Player("Chamakh", "f", 29, 60, 170, "attaquant", 26, 78, 81, 45, 90, 76, 88, 66);
		Player hamdalah = new Player("Hamdlah", "p", 29, 60, 170, "attaquant", 25, 86, 88, 92, 90, 90, 88, 77);
		Player belhanda = new Player("willian", "v", 33, 60, 170, "attaquant", 45, 84, 85, 89, 53, 90, 54, 77);

		Player[] morocco_players = { zniti, bounou, munir, hakimi, costa, feddal, yamiq, banoun, mendyl, saadane, zyich,
				amrabt, fajr, bennaser, harit, taarabt, hafidi, enssiri, yajour, alarabi, chamakh, hamdalah, belhanda };
		Coach eric = new Coach("Eric", "guerets", 73, "uruguayen", 2);
		Coach[] coach_morocco = { eric };
		Team morocco = new Team("4-3-3", "Morocco", morocco_players, coach_morocco, "offensif");

		// -------------------------------------------------------------------------------------------------------------------------------------------------------

		// netherlands

		Player zoet = new Player("Zoet", "d", 25, 60, 190, "gardien", 79, 77, 77, 77, 82, 45, 90, 90);
		Player bizot = new Player(" Bizot ", "c", 23, 60, 180, "gardien", 80, 74, 66, 77, 47, 74, 88, 50);
		Player cillicen = new Player("Cillicen", "h", 30, 60, 170, "gardien", 84, 85, 80, 85, 54, 84, 88, 50);
		// defene
		Player vanDijk = new Player("van dijk", "d", 28, 60, 170, "defense", 88, 80, 92, 90, 99, 98, 88, 90);
		Player deLigt = new Player(" DE Ligt ", "r", 23, 60, 170, "defense", 85, 75, 86, 86, 88, 96, 88, 90);
		Player deVrij = new Player("De Vrigt", "j", 32, 60, 170, "defense", 68, 43, 64, 89, 76, 82, 88, 80);
		Player beek = new Player("Beek", "m", 19, 60, 170, "defense", 75, 82, 80, 82, 74, 82, 88, 70);
		Player blind = new Player("Blind ", "j", 34, 60, 170, "defense", 54, 65, 80, 80, 77, 74, 88, 90);
		Player klaiber = new Player("Klaiber ", "i", 36, 60, 170, "defense", 87, 66, 73, 72, 72, 76, 88, 90);
		Player veltman = new Player("Veltman", "b", 31, 60, 170, "defense", 66, 49, 66, 69, 79, 78, 99, 99);
		// milieu
		Player jong = new Player("De Jong", "v", 30, 60, 170, "milieu", 88, 87, 93, 95, 95, 88, 88, 50);
		Player promes = new Player("Promes", "v", 18, 60, 170, "milieu", 92, 82, 82, 84, 42, 69, 88, 50);
		Player wijnaldum = new Player("Wijnaldum", "a", 26, 60, 170, "milieu", 77, 73, 78, 85, 76, 78, 80, 50);
		Player stengkos = new Player("Stengkos", "p", 22, 60, 170, "milieu", 83, 69, 80, 80, 83, 40, 88, 50);
		Player brgwijin = new Player("Bregwijin", "p", 22, 60, 170, "milieu", 90, 78, 88, 41, 75, 79, 99, 99);
		Player stengs = new Player("Stengs", "s", 23, 60, 170, "milieu", 83, 69, 80, 83, 40, 64, 88, 50);
		Player chong = new Player("Chong", "d", 23, 60, 170, "milieu", 86, 84, 70, 86, 46, 78, 88, 50);
		// attaque
		Player depay = new Player("Enssiri ", "v", 25, 60, 170, "attaquant", 89, 83, 84, 85, 34, 79, 88, 96);
		Player dost = new Player("Yajour", "s", 25, 60, 170, "attaquant", 50, 82, 57, 66, 45, 80, 90, 90);
		Player gullit = new Player("Gullit", "c", 28, 60, 170, "attaquant", 80, 85, 80, 71, 75, 77, 88, 88);
		Player kluvert = new Player("Kluvert", "f", 29, 60, 170, "attaquant", 80, 77, 81, 95, 90, 76, 88, 99);
		Player basten = new Player("Basten", "p", 29, 60, 170, "attaquant", 91, 86, 88, 92, 90, 90, 88, 98);
		Player overmars = new Player("Overmars", "v", 33, 60, 170, "attaquant", 89, 84, 85, 89, 53, 90, 88, 88);

		Player[] netherlands_players = { zoet, bizot, cillicen, vanDijk, deLigt, deVrij, beek, blind, klaiber, veltman,
				jong, promes, wijnaldum, stengkos, brgwijin, stengs, chong, depay, dost, gullit, kluvert, basten,
				overmars };
		Coach vanjal = new Coach("Vanjal", "Tabanez", 73, "uruguayen", 2);
		Coach[] coach_netherlands = { vanjal };
		Team netherlands = new Team("4-3-3", "Netherlands", netherlands_players, coach_netherlands, "offensif");

		/**
		 * Array of all the teams
		 */
		Team[] participant = { chili, uruguay, italy, portugal, sweden, poland, france, argentin, netherlands, morocco,
				england, germany, algeria, belgique, bresil, spain };

		System.out.println("*** Voici  les equipes qui participe a la coupe du monde ***\n");
		for (Team p : participant){
			System.out.println(p.getCountry() + "  : " +p.getScoreTeam());
		}


		initHats(participant);

	}


	/**
	 * Group Stage randomize the hats and creates the groups,
	 * Launch all the qualifications for the 4 groups
	 * @return arry, an array of all the winners of groups
	 */
	public static ArrayList<Team> initGroupStage() {
		
		
		hat1.randomizeHat();
		hat2.randomizeHat();
		hat3.randomizeHat();
		hat4.randomizeHat();
		
		group1 = new GroupStage(hat1.getTeam1(), hat2.getTeam1(), hat3.getTeam1(), hat4.getTeam1());
		group2 = new GroupStage(hat1.getTeam2(), hat2.getTeam2(), hat3.getTeam2(), hat4.getTeam2());
		group3 = new GroupStage(hat1.getTeam3(), hat2.getTeam3(), hat3.getTeam3(), hat4.getTeam3());
		group4 = new GroupStage(hat1.getTeam4(), hat2.getTeam4(), hat3.getTeam4(), hat4.getTeam4());

		System.out.println("------------------------------------");
		System.out.println("*** Les poules sonts : ***");

		System.out.println("Poule A : " + group1.getTeam1().getCountry() + " - " +  group1.getTeam2().getCountry() + " - " +  group1.getTeam3().getCountry() + " - " +  group1.getTeam4().getCountry()  );
		System.out.println("Poule B : " + group2.getTeam1().getCountry() + " - " +  group2.getTeam2().getCountry() + " - " +  group2.getTeam3().getCountry() + " - " +  group2.getTeam4().getCountry()  );
		System.out.println("Poule C : " + group3.getTeam1().getCountry() + " - " +  group3.getTeam2().getCountry() + " - " +  group3.getTeam3().getCountry() + " - " +  group3.getTeam4().getCountry()  );
		System.out.println("Poule D : " + group4.getTeam1().getCountry() + " - " +  group4.getTeam2().getCountry() + " - " +  group4.getTeam3().getCountry() + " - " +  group4.getTeam4().getCountry()  );




		System.out.println("------------------------------------");
		System.out.println("*** Debut des phases de poules ***\n");


		System.out.println(group1.getTeam1().getCountry() + " - " +  group1.getTeam2().getCountry() + " - " +  group1.getTeam3().getCountry() + " - " +  group1.getTeam4().getCountry()  );

		group1.qualification();

		System.out.println("Le premier qualifié de la poule A est " + group1.getFirst().getCountry());
		System.out.println("Le deuxième qualifié de la poule A est " + group1.getSecond().getCountry());
		System.out.println("**********************************\n");

		System.out.println(group2.getTeam1().getCountry() + " - " +  group2.getTeam2().getCountry() + " - " +  group2.getTeam3().getCountry() + " - " +  group2.getTeam4().getCountry()  );

		group2.qualification();

		System.out.println("Le premier qualifié de la poule B est " + group2.getFirst().getCountry());
		System.out.println("Le deuxième qualifié de la poule B est " + group2.getSecond().getCountry());
		System.out.println("**********************************\n");

		System.out.println(group3.getTeam1().getCountry() + " - " +  group3.getTeam2().getCountry() + " - " +  group3.getTeam3().getCountry() + " - " +  group3.getTeam4().getCountry()  );

		group3.qualification();

		System.out.println("Le premier qualifié de la poule C est " + group3.getFirst().getCountry());
		System.out.println("Le deuxième qualifié de la poule C est " + group3.getSecond().getCountry());
		System.out.println("**********************************\n");

		System.out.println(group4.getTeam1().getCountry() + " - " +  group4.getTeam2().getCountry() + " - " +  group4.getTeam3().getCountry() + " - " +  group4.getTeam4().getCountry()  );

		group4.qualification();

		System.out.println("Le premier qualifié de la poule D est " + group4.getFirst().getCountry());
		System.out.println("Le deuxième qualifié de la poule D est " + group4.getSecond().getCountry());
		System.out.println("**********************************\n");

		ArrayList<Team> arry = new ArrayList<Team>();
		arry.add(group1.getFirst());
		arry.add(group1.getSecond());
		arry.add(group2.getFirst());
		arry.add(group2.getSecond());
		arry.add(group3.getFirst());
		arry.add(group3.getSecond());
		arry.add(group4.getFirst());
		arry.add(group4.getSecond());

		return arry;




	}
	
	/**
	 * Get each team of the competition and rank them by strengh then insert them in hats by power
	 * @param participant
	 */
	public static void initHats(Team[] participant) {

		for (int i = 0; i < participant.length - 1; i++)  
		{
			int index = i;  
			for (int j = i + 1; j < participant.length; j++)
			{
				if (participant[j].getScoreTeam() < participant[index].getScoreTeam()){ 
					index = j;
				}
			}

			Team min = participant[index];
			participant[index] = participant[i]; 
			participant[i] = min;
		}

		hat1 = new Hat(participant[0], participant[1], participant[2], participant[3]);
		hat2 = new Hat(participant[4], participant[5], participant[6], participant[7]);
		hat3 = new Hat(participant[8], participant[9], participant[10], participant[11]);
		hat4 = new Hat(participant[12], participant[13], participant[14], participant[15]);

		System.out.println("------------------------------------");
		System.out.println("*** Les Chapeaux sont : ***");

		System.out.println(hat1.getTeam1().getCountry() + " - " +  hat1.getTeam2().getCountry() + " - " +  hat1.getTeam3().getCountry() + " - " +  hat1.getTeam4().getCountry()  );
		System.out.println(hat2.getTeam1().getCountry() + " - " +  hat2.getTeam2().getCountry() + " - " +  hat2.getTeam3().getCountry() + " - " +  hat2.getTeam4().getCountry()  );
		System.out.println(hat3.getTeam1().getCountry() + " - " +  hat3.getTeam2().getCountry() + " - " +  hat3.getTeam3().getCountry() + " - " +  hat3.getTeam4().getCountry()  );
		System.out.println(hat4.getTeam1().getCountry() + " - " +  hat4.getTeam2().getCountry() + " - " +  hat4.getTeam3().getCountry() + " - " +  hat4.getTeam4().getCountry()  );




	}

	/**
	 * Handle the final Stage of the World Cup 
	 * @param arry, an array of all the winners from groupStage
	 */
	public static void finalStage(ArrayList<Team> arry ) {


		QuarterFinal qF = new QuarterFinal(arry.get(0), arry.get(1), arry.get(2), arry.get(3), arry.get(4), arry.get(5), arry.get(6), arry.get(7));


		System.out.println("************************************************");
		System.out.println("*** Lancement des quarts de Finale ***");
		qF.qualificationToSemiFinal();

		System.out.println("Le gagnant du premier quart de finale est : " + qF.getFirstWinner().getCountry());
		System.out.println("Le gagnant du deuxième quart de finale est : " + qF.getSecondWinner().getCountry());
		System.out.println("Le gagnant du troisième quart de finale est : " + qF.getThirdWinner().getCountry());
		System.out.println("Le gagnant du quatrième quart de finale est : " + qF.getFourthWinner().getCountry());

		System.out.println("************************************************\n\n************************************************");
		System.out.println("*** Lancement des demie-Finale ***");
		System.out.println("************************************************");


		SemiFinal sM =  new SemiFinal(qF.getFirstWinner(), qF.getSecondWinner(), qF.getThirdWinner(), qF.getFourthWinner());
		sM.play();


		System.out.println("Le gagnant du premier demi de finale est : " + sM.getWinnerA().getCountry());
		System.out.println("Le gagnant du deuxième demi de finale est : " + sM.getWinnerB().getCountry());

		System.out.println("************************************************\n\n************************************************");
		System.out.println("*** Lancement des Finale ***");
		System.out.println("************************************************");

		Final fN =  new Final(sM.getWinnerA(), sM.getWinnerB(), sM.getLooserA(), sM.getLooserB());
		fN.playFinal();

		System.out.println("Le gagnant de la 1ere place  du tournois est : " + fN.getFirst().getCountry());
		System.out.println("Le gagnant de la 2eme  du tournois est : " + fN.getSecond().getCountry());
		System.out.println("Le gagnant de la 3eme  du tournois est : " + fN.getThird().getCountry());



	}

}