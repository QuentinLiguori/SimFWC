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
		Player muslera = new Player("Muslera", "Fernando", 33, 74, 190, "gardien", 70, 80, 88, 70, 65, 76, 88, 80);
		Player campana = new Player("Campana", "Martin", 30, 75, 185, "gardien", 60, 50, 66, 44, 33, 12, 66, 90);
		Player conde = new Player("Conde", "Esteban", 36, 85, 186, "gardien", 90, 80, 90, 70, 90, 89, 88, 70);
		// defense
		Player urretaviscaya = new Player("Urretaviscaya", "Jonathan", 29, 69, 174, "defense", 90, 80, 90, 100, 90, 89, 88,50);
		Player coates = new Player("Coates", "Sebastian", 29, 92, 196, "defense", 90, 80, 90, 70, 90, 89, 88, 50);
		Player godin = new Player("Godin", "Diego", 34, 78, 187, "defense", 88, 100, 100, 100, 90, 89, 99, 100);
		Player gimerez = new Player("Gimenez", "Jose Maria", 35, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 80);
		Player caceres = new Player("Caceres", "Martin", 32, 78, 180, "defense", 90, 80, 90, 70, 90, 89, 88, 93);
		Player pereira = new Player("Pereira", "Alvaro", 34, 78, 180, "defense", 90, 80, 90, 70, 90, 89, 88, 92);
		Player caceres2 = new Player("Caceres", "Sebastian", 20, 77, 180, "defense", 90, 80, 90, 70, 90, 89, 88, 91);
		// milieu
		Player valverde = new Player("Valverde", "Federico", 21, 78, 182, "milieu", 90, 80, 90, 70, 90, 89, 88, 99);
		Player vecino = new Player("Vecino", "Mathias", 28, 81, 187, "milieu", 90, 80, 90, 70, 90, 89, 88, 99);
		Player nandez = new Player("Nandez", "Nahitan", 24, 70, 172, "milieu", 90, 80, 90, 70, 90, 89, 88, 77);
		Player lodeiro = new Player("Lodeiro", "Lodeiro", 30, 69, 170, "milieu", 90, 80, 90, 70, 90, 89, 88, 80);
		Player arambarri = new Player("Arambarri", "Mauro", 24, 74, 175, "milieu", 99, 100, 100, 100, 100, 99, 99, 99);
		Player bentancur = new Player("Bentancur", "Rodrigo", 22, 78, 187, "milieu", 90, 88, 88, 88, 90, 97, 97, 88);
		// attaque
		Player suarez = new Player("Suarez", "Luis", 33, 86, 170, "attaquant", 99, 99, 100, 100, 100, 99, 100, 100);
		Player cavani = new Player("Cavani", "Edinson", 33, 77, 185, "attaquant", 98, 99, 98, 99, 98, 99, 100, 100);
		Player rodriguez = new Player("Rodriguez", "Jonathan", 26, 77, 179, "attaquant", 90, 95, 95, 95, 90, 95, 95, 95);
		Player gomez = new Player("Gomez", "Maximiliano", 23, 84, 186, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
		Player delacruz = new Player("De la Cruz", "Nicolas", 22, 65, 167, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
		Player rolan = new Player("Rolan", "Diego", 26, 72, 177, "attaquant", 90, 80, 90, 70, 90, 89, 88, 90);
		Player stuani = new Player("Stuani", "Cristhian", 33, 76, 186, "attaquant", 90, 80, 90, 70, 90, 89, 88, 50);
		// array payers
		Player uruguay_players[] = { muslera, campana, conde, urretaviscaya, coates, godin, gimerez, caceres, pereira,
				caceres2, valverde, vecino, nandez, lodeiro, arambarri, bentancur, suarez, cavani, rodriguez, gomez,
				delacruz, rolan, stuani };
		Coach oscar = new Coach("Oscar", "Tabanez", 73, "uruguayen", 2);
		Coach coach_uruguay[] = { oscar };
		Team uruguay = new Team("4-3-3", "Uruguay", uruguay_players, coach_uruguay, "offensif","../Flag/uruguay-flag-icon-32.png");

		/** chili's players */
		// goal
		Player bravo = new Player("Bravo", "Claudio", 36, 80, 184, "gardien", 90, 99, 90, 100, 90, 99, 90, 90);
		Player cortes = new Player("Cortes", "Brayan", 24, 79, 185, "gardien", 90, 80, 90, 70, 90, 89, 88, 50);
		Player arias = new Player("Arias", "Gabriel", 32, 82, 188, "gardien", 90, 80, 90, 70, 90, 89, 88, 50);
		// defense
		Player diaz = new Player("Diaz", "Paulo", 25, 76, 178, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
		Player roco = new Player("Roco", "Enzo", 27, 79, 192, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
		Player jara = new Player("Jara", "Gonzalo", 34, 77, 178, "defense", 90, 80, 90, 70, 90, 89, 88, 80);
		Player medel = new Player("Medel", "Gary", 32, 76, 171, "defense", 90, 80, 90, 70, 90, 89, 88, 70);
		Player maripan = new Player("Maripan", "Guillermo", 25, 84, 193, "defense", 90, 80, 90, 70, 90, 89, 88, 90);
		Player isla = new Player("Isla", "Mauricio", 36, 60, 170, "defense", 90, 80, 90, 70, 90, 89, 88, 100);
		Player beausejour = new Player("Beausejour", "Jean", 35, 83, 178, "milieu", 100, 99, 98, 97, 100, 100, 100, 100);
		// milieu
		Player valdivia = new Player("Valdivia", "Jorge", 36, 71, 173, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player vidal = new Player("Vidal", "Arturo", 32, 75, 180, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player aranguiz = new Player("Aranguiz", "Charles", 30, 70, 171, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player puch = new Player("Puch", "Edson", 33, 73, 168, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player pulgar = new Player("Pulgar", "Erick", 26, 74, 187, "milieu", 90, 90, 98, 99, 88, 100, 100, 100);
		Player silva = new Player("Silva", "Francisco", 34, 75, 178, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		Player diaz2 = new Player("Diaz", "Marcelo", 33, 68, 167, "milieu", 90, 80, 90, 70, 90, 89, 88, 50);
		// attaque
		Player vargas = new Player("Vargas", "Eduardo", 30, 81, 174, "attaquant", 90, 80, 90, 70, 90, 89, 88, 96);
		Player sanchez = new Player("Sanchez", "Alexis", 31, 62, 168, "attaquant", 99, 99, 90, 90, 90, 98, 100, 100);
		Player castillo = new Player("Castillo", "Nicolas", 37, 81, 179, "attaquant", 90, 80, 90, 70, 90, 89, 88, 88);
		Player fuenzalida = new Player("Fuenzalida", "José Pedro", 35, 67, 170, "attaquant", 90, 80, 90, 70, 90, 89, 88, 99);
		Player paredes = new Player("Paredes", "Esteban", 39, 82, 178, "attaquant", 90, 80, 90, 70, 90, 89, 88, 100);
		Player fernandes = new Player("Fernandes", "Junior", 31, 78, 183, "attaquant", 90, 80, 90, 70, 90, 89, 88, 88);

		// array chili's players
		Player chili_players[] = { bravo, cortes, arias, diaz, roco, jara, medel, maripan, isla, beausejour, valdivia,
				vidal, aranguiz, puch, pulgar, silva, diaz2, vargas, sanchez2, castillo, fuenzalida, paredes, fernandes };
		Coach rueda = new Coach("Reinaldo", "Rueda", 63, "colombien", 3);
		Coach coach_chili[] = { rueda };
		Team chili = new Team("5-3-1", "Chili", chili_players, coach_chili, "defensif","../Flag/chile-flag-icon-32.png");

		/**
		 * Poland ans Sweden's teams : Radolanirina
		 */
		/** Poland's players */
		// goal
			Player szczesny = new Player("Szczesny", "Wojciech", 29, 90, 195, "gardien", 47, 12, 34, 16, 14, 45, 55, 13);
	Player majecki = new Player("Majecki", "Radoslaw", 20, 78, 191, "gardien", 31, 12, 22, 12, 16, 23, 45, 25);
	Player skorupski = new Player("Skorupski", "Lukasz", 28, 84, 187, "gardien", 51, 19, 28, 10, 15, 31, 41, 12);
	// defense
	Player kedziora = new Player("Kedziora", "Tomasz", 25, 77, 183, "defense", 79, 78, 67, 71, 51, 78, 56, 76);
	Player glik = new Player("Glik", "Kamil", 31, 80, 190, "defense", 47, 29, 62, 79, 20, 63, 57, 77);
	Player bednarek = new Player("Bednarek", "Jan", 23, 77, 189, "defense", 68, 44, 66, 75, 23, 67, 25, 77);
	Player rybus = new Player("Rybus", "Maciej", 30, 75, 173, "defense", 76, 74, 70, 47, 71, 74, 75, 70);
	Player cionek = new Player("Cionek", "Thiago", 33, 80, 183, "defense", 62, 35, 53, 66, 26, 59, 31, 71);
	Player reca = new Player("Reca", "Arkadiusz", 24, 81, 187, "defense", 78, 67, 62, 62, 54, 68, 60, 63);
	Player bereszynski = new Player("Bereszynski", "Bartosz", 27, 77, 183, "defense", 86, 68, 65, 60, 60, 78, 64, 70);
	// Middle
	Player klich = new Player("Klich", "Mateusz", 29, 82, 183, "milieu", 68, 67, 73, 48, 73, 83, 70, 50);
	Player frankowski = new Player("Frankowski", "Przemyslaw", 24, 70, 173, "milieu", 92, 66, 68, 57, 56, 83, 58, 50);
	Player krychowiak = new Player("Krychowiak", "Grzegorz", 29, 85, 186, "milieu", 69, 63, 80, 75, 73, 75, 82, 75);
	Player bielik = new Player("Bielik", "Krystian", 22, 78, 189, "milieu", 64, 49, 70, 68, 52, 64, 62, 68);
	Player furman = new Player("Furman", "Dominik", 27, 71, 181, "milieu", 67, 72, 70, 60, 64, 72, 69, 64);
	Player grosicki = new Player("Grosicki", "Kamil", 31, 78, 180, "milieu", 80, 72, 70, 69, 75, 64, 74, 25);
	Player goralski = new Player("Goralski", "Jacek", 27, 66, 172, "attaquant", 73, 51, 70, 55, 46, 86, 50, 71);
	// attack
	Player zielinski = new Player("Zielinski", "Piotr", 25, 75, 180, "attaquant", 82, 77, 82, 52, 82, 73, 76, 71);
	Player szymanski = new Player("Szymanski", "Sebastian", 20, 58, 174, "attaquant", 79, 71, 62, 40, 67, 65, 67, 29);
	Player lewandowski = new Player("Lewandowski", "Robert", 31, 80, 184, "attaquant", 77, 71, 77, 85, 84, 78, 88, 35);
	Player piatek = new Player("Piatek", "Krzysztof", 24, 77, 183, "attaquant", 75, 51, 56, 80, 69, 73, 80, 33);
	Player kadzior = new Player("Kadzior", "Damian", 27, 74, 175, "attaquant", 77, 58, 65, 89, 88, 73, 70, 46);
	Player milik = new Player("Milik", "Arkadiusz", 25, 78, 186, "attaquant", 71, 58, 66, 80, 82, 70, 86, 33);

	// array players
	Player[] poland_players = { szczesny, majecki, skorupski, kedziora, glik, bednarek, rybus, cionek, reca,
			bereszynski, klich, frankowski, krychowiak, bielik, furman, grosicki, goralski, zielinski, szymanski,
			lewandowski, piatek, kadzior, milik };
		// array coachs
		Coach jerzy = new Coach("Jerzy", "Brzeczek", 49, "polish", 1);
		Coach[] poland_coachs = { jerzy };

		Team poland = new Team("4-3-4", "Poland", poland_players, poland_coachs, "offensif","../Flag/poland-flag-icon-32.png");

		/** Sweden's players */
		// goal
			Player johnsson = new Player("Johnsson", "Karl-Johan", 29, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
	Player nordfelt = new Player("Nordfelt", "Kristoffer", 30, 87, 188, "gardien", 49, 11, 35, 13, 12, 33, 50, 14);
	Player olsen = new Player("Olsen", "Robin", 30, 86, 196, "gardien", 40, 20, 35, 16, 14, 37, 57, 14);
	// defense
	Player lustig = new Player("Lustig", "Mikael", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
	Player lindelof = new Player("Lindelof", "Victor", 25, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
	Player granqvist = new Player("Granqvist", "Andreas", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
	Player bengtsson = new Player("Bengtsson", "Pierre", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
	Player augustinsson = new Player("Augustinsson", "Ludwig", 25, 72, 181, "defense", 73, 79, 74, 56, 59, 88, 69, 75);
	Player krafth = new Player("Krafth", "Emil", 25, 72, 181, "defense", 77, 68, 66, 64, 58, 78, 70, 74);
	Player helander = new Player("Helander", "Filip", 26, 84, 192, "defense", 47, 30, 50, 74, 25, 59, 58, 74);
	Player jansson = new Player("Jansson", "Pontus", 28, 86, 196, "defense", 65, 29, 65, 74, 50, 71, 68, 74);
	// Middle
	Player svensson = new Player("Svensson", "Gustav", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
	Player sema = new Player("Sema", "Ken", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
	Player fransson = new Player("Fransson", "Alexander", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player fosberg = new Player("Fosberg", "Emil", 28, 76, 177, "milieu", 65, 84, 73, 45, 74, 69, 73, 25);
	Player olsson = new Player("Olsson", "Kristoffer", 24, 69, 181, "milieu", 75, 65, 74, 52, 62, 78, 64, 57);
	Player ekdal = new Player("Ekdal", "Albin", 30, 82, 186, "milieu", 47, 67, 79, 62, 69, 72, 72, 68);
	Player larsson = new Player("Larsson", "Sebastian", 34, 70, 178, "attaquant", 55, 80, 77, 66, 72, 86, 77, 61);
	// attack
	Player quaison = new Player("Quaison", "Robin", 26, 77, 183, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
	Player berg = new Player("Berg", "Marcus", 33, 74, 184, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
	Player andersson = new Player("Andersson", "Sebstian", 28, 86, 190, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player tankovic = new Player("Tanovic", "Muamer", 24, 74, 180, "attaquant", 73, 65, 65, 63, 66, 74, 68, 24);
	Player isak = new Player("Isak", "Alexander", 20, 74, 190, "attaquant", 85, 51, 57, 68, 68, 68, 77, 20);

	// array players
	Player[] sweden_players = {johnsson, nordfelt, olsen, lustig, lindelof, granqvist, bengtsson, augustinsson,
			krafth, helander, jansson, svensson, sema, fransson, fosberg, olsson, ekdal, larsson, quaison, berg,
			andersson, tankovic, isak};

		// array coachs
		Coach janne = new Coach("Janne", "Anderson", 57, "polish", 2);
		Coach[] sweden_coachs = { janne };

		Team sweden = new Team("4-4-2", "Swede", sweden_players, sweden_coachs, "defensive","../Flag/sweden-flag-icon-32.png");

		// FRANCE
		// gardien
		Player lloris = new Player("Lloris", "Hugo", 33, 82, 188, "gardien", 80, 85, 90, 75, 90, 80, 90, 80);
		Player lecompte = new Player("Lecomte", "Benjamin", 28, 78, 186, "gardien", 80, 80, 85, 75, 85, 75, 80,80);
		Player areola = new Player("Areola", "Alphonse", 26, 94, 195, "gardien", 80, 80, 85, 75, 85, 75, 85, 80);
		// défense
		Player hernandez = new Player("Hernandez ", " Lucas ", 23, 76, 182, "défense", 85, 80, 80, 85, 85, 80, 80, 95);
		Player dubois = new Player("Dubois", "Léo", 25, 73, 178, "défense", 90, 85, 80, 70, 80, 80, 80, 85);
		Player kimpembe = new Player("Kimpembe", "Presnel", 24, 80, 189, "défense", 85, 85, 88, 80, 85, 80, 80, 85);
		Player lenglet = new Player("Lenglet", "Clément", 24, 81, 186, "défense", 80, 85, 85, 85, 85, 80, 80, 95);
		Player mendy = new Player("Mendy", "Benjamin", 25, 85, 185, "défense", 85, 90, 85, 80, 80, 80, 80, 85);
		Player pavard = new Player("Pavard", "Benjamin", 23, 76, 186, "defense", 80, 80, 80, 80, 80, 80, 90, 90);
		Player varane = new Player("Varane ", "Raphael", 26, 81, 191, "défense", 85, 80, 95, 85, 85, 90, 90, 95);
		Player zouma = new Player("Zouma", "Kurt", 25, 95, 190, "défense", 80, 80, 80, 80, 80, 95, 95, 90);
		// milieu
		Player pogba = new Player("Pogba", "Paul", 26, 84, 191, "milieu", 90, 85, 90, 85, 90, 85, 95, 90);
		Player kanté = new Player("Kanté", "N'Golo", 28, 70, 168, "milieu", 85, 85, 90, 75, 80, 100, 90, 95);
		Player ndombele = new Player("Ndombele", "Tanguy", 23, 76, 181, "milieu", 85, 80, 85, 80, 85, 80, 85, 80);
		Player matuidi = new Player("Matuidi", "Blaise", 32, 75, 180, "milieu", 80, 80, 85, 80, 85, 95, 90, 85);
		Player tolisso = new Player("Tolisso", "Corentin", 25, 81, 181, "milieu", 85, 85, 90, 85, 85, 85, 85, 80);
		// attaque
		Player dembele = new Player("Dembele ", " Ousmane ", 22, 67, 178, "attaquant", 95, 85, 85, 85, 85, 85, 80, 85);
		Player coman = new Player("Coman", "Kingsley", 23, 75, 179, "attaquant", 95, 80, 80, 80, 85, 80, 80, 80);
		Player nabil = new Player("Nabil", "Nékir", 26, 75, 173, "attaquant", 85, 80, 85, 85, 85, 80, 85, 80);
		Player giroud = new Player("Giroud", "Olivier", 33, 91, 193, "attaquant", 75, 75, 80, 95, 85, 80, 90, 80);
		Player griezmann = new Player("Griezmann", "Antoine", 28, 73, 176, "attaquant", 85, 85, 90, 85, 95, 90, 80, 90);
		Player lemar = new Player("Lemar", "Thomas", 24, 62, 171, "attaquant", 85, 85, 85, 80, 90, 85, 85, 80);
		Player mbappe = new Player("Mbappe", "Kylian", 21, 73, 178, "attaquant", 100, 85, 85, 85, 95, 90, 85, 90);
		// tableau
		Player france_players[] = { lloris, lecompte, areola, hernandez, dubois, kimpembe, lenglet, mendy, pavard,
				varane, zouma, pogba, kanté, ndombele, matuidi, tolisso, dembele, coman, nabil, giroud, griezmann,
				lemar, mbappe };
		Coach didier = new Coach("Didier", "Deschamps", 51, "française", 95);
		Coach coach_france[] = { didier };
		Team france = new Team(" 4-2-3-1 ", "France ", france_players, coach_france, " équilibré ","../Flag/france-flag-icon-32.png");

		// ARGENTINE 
		// gardien
		Player marchesín = new Player("Marchesín", "Agustin", 31, 85, 188, "gardien", 80, 80, 85, 75, 85, 75, 80, 80);
		Player musso = new Player("Musso", "Juan", 25, 93, 191, "gardien", 75, 80, 82, 75, 85, 75, 80, 75);
		Player martínez = new Player("Martínez", "Emiliano", 27, 85, 193, "gardien", 75, 80, 80, 75, 85, 75, 80, 75);
		// défense
		Player foyth = new Player("Foyth", "Juan", 22, 69, 187, "défense", 75, 75, 75, 75, 75, 70, 75, 75);
		Player saravia = new Player("Saravia", "Renzo", 26, 75, 176, "défense", 91, 73, 73, 70, 70, 76, 70, 75);
		Player otamendi = new Player("Otamendi", "Nicolás", 31, 81, 183, "défense", 70, 75, 75, 84, 75, 70, 80, 85);
		Player pezzella = new Player("Pezzella", "Germán", 28, 81, 186, "défense", 70, 70, 70, 82, 70, 70, 79, 82);
		Player rojo = new Player("Rojo", "Marcos", 29, 85, 187, "défense", 70, 72, 72, 77, 80, 70, 80, 79);
		Player tagliafico = new Player("Tagliafico", "Nicolás", 27, 65, 172, "defense", 82, 81, 78, 82, 75, 86, 74, 84);
		Player pérez = new Player("Pérez", "Nehuén", 19, 75, 186, "défense", 70, 70, 70, 70, 70, 73, 71, 77);
		// milieu
		Player rodríguez = new Player("Rodríguez", "Guido", 24, 80, 185, "milieu", 70, 70, 78, 70, 76, 77, 81, 79);
		Player loCelso = new Player("Lo Celso", "Giovani", 23, 68, 177, "milieu", 78, 78, 83, 70, 82, 76, 70, 70);
		Player paredesl = new Player("Paredes", "Leandro", 25, 75, 180, "milieu", 70, 76, 82, 70, 82, 79, 70, 75);
		// attaque
		Player diMaria = new Player("Di Maria", "Angel", 31, 69, 180, "attaquant", 84, 87, 83, 70, 88, 78, 70,70);
		Player dePaul = new Player("De Paul", "Rodrigo Javier", 25, 70, 178, "attaquant", 72, 77, 80, 70, 80, 72, 70, 70);
		Player acuna = new Player("Acuña", "Marcos", 28, 69, 172, "attaquant", 75, 87, 81, 70, 88, 90, 81, 82);
		Player pereyra = new Player("Pereyra", "Roberto", 29, 77, 182, "attaquant", 75, 75, 79, 70, 78, 74, 70,	70);
		Player ocampos = new Player("Ocampos", "Lucas", 25, 84, 187, "attaquant", 83, 76, 77, 77, 82, 91, 81, 70);
		Player messi = new Player(" Messi ", " Lionel ", 32, 72, 170, "attaquant", 84, 88, 92, 70, 95, 75, 70, 70);
		Player aguero = new Player(" Agüero ", " Sergio ", 31, 70, 173, "attaquant", 78, 70, 83, 78, 94, 79, 74, 70);
		Player gonzalez = new Player("González", "Nicolás", 21, 72, 180, "attaquant", 79, 70, 70, 70, 73, 78, 70, 70);
		Player icardi = new Player("Icardi", "Mauro", 26, 75, 181, "attaquant", 75, 70, 74, 88, 90, 70, 73, 70);
		Player dybala = new Player("Dybala", " Paulo", 26, 75, 177, "attaquant", 82, 82, 87, 80, 88, 79, 70, 70);
		// tableau
		Player argentin_players[] = { marchesín, musso, martínez, foyth, saravia, otamendi, pezzella, rojo, tagliafico,
				pérez, rodríguez, loCelso, paredesl, diMaria, dePaul, acuna, pereyra, ocampos, messi, aguero, gonzalez,
				icardi, dybala };
		Coach lionel = new Coach("Lionel", "Scaloni", 41, "argentin", 45);
		Coach coach_argentin[] = { lionel };
		Team argentin = new Team(" 4-3-3 ", " Argentine ", argentin_players, coach_argentin, " offensif ","../Flag/argentina-flag-icon-32.png");

		/**
		 * Teams of Portugal and Italy : LIGUORI
		 */

		/**
		 * Portugal Players
		 */

		// goal
			Player patricio = new Player("Patricio", "Rui", 25, 84, 189, "gardien", 49, 61, 74, 79, 53, 60, 57, 83);
	Player sa = new Player("Sa", "Jose", 31, 84, 179, "gardien", 59, 71, 84, 79, 63, 50, 65, 73);
	Player beto = new Player("Beto", "Antonio Alberto", 27, 84, 182, "gardien", 39, 41, 44, 69, 63, 68, 57, 63);

	// defense
	Player pepe = new Player("Pepe", "", 33, 78, 189, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
	Player dias = new Player("Dias", "Ruben", 25, 80, 187, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
	Player guerreiro = new Player("Guerreiro", "Raphael", 34, 84, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
	Player pereira = new Player("Pereira", "Ricardo", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
	Player rui = new Player("Rui", "Mario", 31, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
	Player fonte = new Player("Fonte", "Jose", 36, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
	Player cancelo = new Player("Cancelo", "Joao", 25, 74, 175, "defense", 69, 65, 65, 48, 60, 73, 64, 67);

	// Middle
	Player pereiraD = new Player("Pereira", "Danilo", 32, 77, 184, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
	Player moutinho = new Player("Moutinho", "Joao", 26, 69, 180, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
	Player fernandes = new Player("Fernandes", "Bruno", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player carvalho = new Player("Carvalho", "William", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player pizzi = new Player("Pizzi", "", 25, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player neves = new Player("Neves", "Ruben", 22, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);

	// attack
	Player ronaldoC = new Player("Ronaldo", "Christiano", 34, 83, 187, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
	Player guedes = new Player("Guedes", "Goncalo", 23, 68, 179, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
	Player silvaB = new Player("Silva", "Bernardo", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player felix = new Player("Felix", "Joao", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player jota = new Player("Jota", "Diogo", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player silvaA = new Player("Silva", "Andre", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player bruma = new Player("Bruma", "", 25, 64, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);

	// array players
	Player[] portugal_players = { patricio, sa, beto, pepe, dias, guerreiro, pereira, rui, fonte, cancelo, pereiraD,
			moutinho, fernandes, carvalho, pizzi, neves, ronaldoC, guedes, silvaB, felix, jota, silvaA, bruma };

		// array coachs
		Coach santosF = new Coach("Santos", "Fernando", 66, "portugal", 2);
		Coach[] portugal_coachs = { santosF };

		Team portugal = new Team("4-4-2", "Portugal", portugal_players, portugal_coachs, "offensif","../Flag/portugal-flag-icon-32.png");

		/**
		 * Italy Players
		 */

		// goal
		Player donnarumma = new Player("Donnarumma", "Gianluigi", 31, 84, 189, "gardien", 49, 11, 34, 19, 13, 40, 55, 13);
	Player meret = new Player("Meret", "Alex", 22, 83, 190, "gardien", 49, 31, 44, 29, 23, 50, 65, 23);
	Player sirigu = new Player("Sirigu", "Salvatore", 33, 80, 192, "gardien", 60, 22, 43, 40, 31, 51, 55, 31);

	// defense
	Player florenzi = new Player("Florenzi", "Alessandro", 28, 67, 173, "defense", 64, 74, 69, 73, 60, 73, 65, 71);
	Player bonucci = new Player("Bonucci", "Leonardo", 32, 85, 190, "defense", 76, 62, 78, 79, 52, 76, 70, 81);
	Player acerbi = new Player("Acerbi", "Francesco", 32, 88, 192, "defense", 34, 49, 68, 77, 59, 58, 74, 75);
	Player biraghi = new Player("Biraghi", "Cristiano", 27, 78, 185, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
	Player romagnoli = new Player("Romagnoli", "Alessio", 25, 78, 188, "defense", 69, 65, 65, 48, 60, 73, 64, 67);
	Player lorenzo = new Player("Di Lorenzo", "Giovanni", 26, 83, 183, "defense", 69, 65, 65, 48, 60, 73, 64, 67);

	// Middle
	Player emerson = new Player("Emerson", "", 25, 79, 176, "milieu", 37, 49, 73, 65, 47, 85, 66, 72);
	Player barella = new Player("Barella", "NicolO", 26, 68, 175, "milieu", 78, 69, 67, 34, 68, 69, 77, 59);
	Player jorginho = new Player("Jorginho", "", 28, 74, 180, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player verratti = new Player("Verratti", "Marco", 27, 60, 165, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player tonali = new Player("Tonali", "Sandro", 19, 79, 181, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player sensi = new Player("Sensi", "Stefano", 24, 62, 168, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);
	Player zaniolo = new Player("Zaniolo", "Nicolo", 20, 79, 190, "milieu", 70, 62, 71, 60, 71, 83, 70, 67);

	// attack
	Player bernardeschi = new Player("Bernardeschi", "Federico", 26, 77, 185, "attaquant", 77, 67, 70, 56, 72, 76, 73, 56);
	Player immobile = new Player("Immobile", "Ciro", 30, 85, 185, "attaquant", 73, 56, 60, 75, 74, 69, 79, 29);
	Player insigne = new Player("Insigne", "Lorenzo", 28, 59, 163, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player belotti = new Player("Belotti", "Andrea", 26, 72, 181, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player politano = new Player("Politano", "Matteo", 26, 67, 171, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player shaarawy = new Player("Shaarawy", "Stephan", 27, 78, 173, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);
	Player chiesa = new Player("Chiesa", "Federico", 22, 70, 175, "attaquant", 65, 28, 48, 81, 55, 76, 71, 27);

		// array players
		Player[] italy_players = { donnarumma, meret, sirigu, florenzi, bonucci, acerbi, biraghi, romagnoli, lorenzo,
				emerson, barella, jorginho, verratti, tonali, sensi, zaniolo, bernardeschi, immobile, insigne, belotti,
				politano, shaarawy, chiesa };

		// array coachs
		Coach mancini = new Coach("Mancini", "Roberto", 56, "italy", 2);
		Coach[] italy_coachs = { mancini };

		Team italy = new Team("4-4-2", "Italy", italy_players, italy_coachs, "offensif","../Flag/italy-flag-icon-32.png");

		// espagne

			Player deGea = new Player("De Gea", "David", 29, 82, 192, "gardien", 90, 84, 81, 92, 58, 85, 90, 90);
			Player kepa = new Player("Kepa", "", 25, 88, 186, "gardien", 84, 82, 86, 85, 33, 80, 88, 50);
			Player casillas = new Player("Herrera", "Hector", 29, 80, 185, "gardien", 85, 75, 61, 84, 55, 86, 88, 50);
			// defense
			Player ramos = new Player("Ramos", "DarIo", 20, 78, 191, "defense", 72, 68, 75, 74, 87, 85, 88, 90);
			Player pique = new Player("Pique", "", 33, 85, 194, "defense", 72, 63, 74, 80, 90, 82, 88, 90);
			Player jordiAlba = new Player("Jordi Alba", "", 30, 68, 170, "defense", 91, 70, 82, 84, 80, 74, 88, 80);
			Player carvajal = new Player("Carvajal", "", 28, 73, 173, "defense", 82, 49, 79, 82, 83, 82, 88, 70);
			Player azpilicueta = new Player("Azpilicueta", "", 30, 77, 178, "defense", 73, 57, 80, 75, 87, 78, 88, 90);
			Player roberto = new Player("Roberto", "Ibanez", 26, 71, 178, "defense", 78, 63, 81, 78, 77, 73, 88, 90);
			Player iniesta = new Player("Iniesta", "", 35, 68, 171, "milieu", 79, 81, 94, 96, 70, 76, 99, 99);
			// milieu
			Player isco = new Player("Isco", "", 27, 79, 176, "milieu", 71, 77, 83, 90, 59, 60, 88, 50);
			Player silvaDavid = new Player("Silva", "David", 34, 67, 173, "milieu", 66, 75, 89, 90, 53, 58, 88, 50);
			Player busquets = new Player("Busquets", "Sergio", 31, 76, 189, "milieu", 42, 62, 80, 81, 85, 80, 88, 50);
			Player koke = new Player("Koke", "", 28, 77, 176, "milieu", 68, 75, 86, 82, 74, 79, 88, 50);
			Player tiago = new Player("Thiago", "", 28, 70, 174, "milieu", 71, 76, 87, 91, 70, 64, 99, 99);
			Player luis_alberto = new Player("Luis Alberto", "", 27, 74, 183, "milieu", 77, 82, 91, 88, 53, 63, 88, 50);
			Player rodri = new Player("Rodri", "", 23, 82, 191, "milieu", 67, 68, 77, 78, 82, 80, 88, 50);
			// attaque
			Player diegoCosta = new Player("Costa", "Diego", 31, 83, 188, "attaquant", 83, 92, 79, 89, 50, 96, 88, 96);
			Player traore = new Player("Traore", "Adama", 24, 72, 178, "attaquant", 99, 80, 80, 89, 43, 85, 90, 90);
			Player villa = new Player("Villa", "David", 38, 70, 174, "attaquant", 90, 89, 79, 92, 46, 84, 88, 88);
			Player raul = new Player("Garcia", "Raul", 33, 83, 184, "attaquant", 88, 92, 82, 90, 47, 75, 88, 99);
			Player morales = new Player("Morales", "", 32, 70, 180, "attaquant", 94, 83, 78, 90, 59, 70, 88, 100);
			Player aspas = new Player("Aspas", "Iago", 32, 67, 176, "attaquant", 80, 86, 78, 86, 36, 65, 88, 88);

			Player[] spain_players = { deGea, kepa, casillas, ramos, pique, jordiAlba, carvajal, azpilicueta, roberto,
					iniesta, isco, silvaDavid, busquets, koke, tiago, luis_alberto, rodri, diegoCosta, traore, villa, raul,
					morales, aspas };
			Coach gouardilla = new Coach("Guardiola", "Pep", 49, "spanich", 70);
			Coach[] coach_spain = { gouardilla };
			Team spain = new Team("4-3-3", "Spain", spain_players, coach_spain, "offensif","../Flag/spain-flag-icon-32.png");

			//----------------------------------------------------------------------------------------------------------------------------------------------------------------------------

			// BRESIL

			Player alisson = new Player("Alisson", "", 27, 91, 191, "gardien", 85, 84, 85, 89, 52, 90, 90, 90);
			Player ederson = new Player(" Ederson ", "", 26, 86, 188, "gardien", 86, 82, 93, 88, 64, 86, 88, 50);
			Player neto = new Player("Neto", "", 30, 84, 190, "gardien", 86, 81, 79, 82, 52, 82, 88, 50);
			// defene
			Player marcelo = new Player("Marcelo", "", 31, 75, 174, "defense", 86, 78, 86, 91, 82, 84, 88, 90);
			Player carlos = new Player("Carlos", "Diego", 26, 86, 186, "defense", 92, 83, 86, 81, 86, 86, 88, 90);
			Player thiagoSilva = new Player("Silva", "Thiago", 35, 73, 183, "defense", 66, 57, 77, 76, 90, 81, 88, 80);
			Player davidLuiz = new Player("Luiz", "David", 32, 86, 189, "defense", 83, 76, 83, 82, 90, 86, 88, 70);
			Player marquinhos = new Player("Marquinhos", "", 25, 75, 183, "defense", 78, 43, 76, 75, 88, 79, 88, 90);
			Player Militao = new Player("Militao ", "Eder", 22, 78, 186, "defense", 83, 56, 75, 77, 86, 86, 88, 90);
			Player casemiro = new Player("Casemiro", "", 28, 84, 185, "milieu", 63, 75, 76, 73, 87, 90, 99, 99);
			// milieu
			Player coutinho = new Player("Coutinho", "", 27, 68, 172, "milieu", 80, 82, 86, 91, 53, 65, 88, 50);
			Player fabinho = new Player("Fabinho", "", 26, 78, 188, "milieu", 69, 70, 79, 79, 87, 84, 88, 50);
			Player rivaldo = new Player("Rivaldinho", "", 24, 80, 186, "milieu", 86, 87, 85, 88, 42, 76, 88, 50);
			Player allan = new Player("Allan", "", 29, 74, 175, "milieu", 78, 76, 81, 86, 87, 86, 88, 50);
			Player fernandinho = new Player("Fernandinho", "", 34, 67, 179, "milieu", 66, 74, 79, 79, 84, 79, 99, 99);
			Player socrates = new Player("Socrates", "", 66, 71, 174, "milieu", 80, 86, 87, 87, 47, 82, 88, 50);
			Player arthur = new Player("Arthur", "", 23, 73, 171, "milieu", 69, 71, 81, 86, 73, 70, 88, 50);
			// attaque
			Player neymar = new Player("Neymar ", "Jr", 28, 68, 175, "attaquant", 92, 86, 88, 96, 33, 58, 88, 96);
			Player firmino = new Player("Firmino", "Roberto", 28, 76, 181, "attaquant", 79, 84, 81, 89, 62, 80, 90, 90);
			Player ronaldinho = new Player("Ronaldinho", "", 39, 82, 181, "attaquant", 80, 85, 88, 90, 38, 77, 88, 88);
			Player ronaldo = new Player("Cabrais", "Ronaldo", 28, 75, 177, "attaquant", 97, 95, 81, 95, 45, 76, 88, 99);
			Player kaka = new Player("Ronaldo", "", 43, 112, 183, "attaquant", 91, 86, 88, 92, 44, 73, 88, 100);
			Player willian = new Player("Willian", "Jose", 28, 93, 189, "attaquant", 89, 84, 85, 89, 53, 65, 88, 88);

			Player[] bresil_players = { alisson, ederson, neto, marcelo, carlos, thiagoSilva, davidLuiz, marquinhos,
					Militao, casemiro, coutinho, fabinho, rivaldo, allan, fernandinho, socrates, arthur, neymar, firmino,
					ronaldinho, ronaldo, kaka, willian };
			Coach sofiane = new Coach("idmbarkos", "safawan", 80, "bresilien", 3);
			// Coach ss = new Coach(lastName, firstName, age, nationality, level)
			Coach[] coach_bresil = { sofiane };
			Team bresil = new Team("4-3-4", "Brasil", bresil_players, coach_bresil, "offensif","../Flag/brazil-flag-icon-32.png");

		// -------------------------------------------------------------------------------------------------------------------------------------------------------

				// portugal

		Player courtois = new Player("Courtois", "Thibaut", 27, 96, 199, "gardien", 83, 83, 77, 85, 51, 82, 90, 90);
		Player mignolet = new Player("Mignolet", "Simon", 31, 87, 193, "gardien", 83, 77, 77, 86, 48, 75, 88, 50);
		Player sels = new Player("Sels", "Matz", 28, 88, 190, "gardien", 79, 76, 81, 83, 44, 79, 88, 50);
		// defene
		Player alderweireld = new Player("Alderweireld", "Toby", 31, 81, 186, "defense", 86, 63, 88, 85, 90, 81, 88, 90);
		Player boyata = new Player("Boyata", "Dedryck", 29, 84, 188, "defense", 86, 65, 78, 82, 86, 86, 88, 90);
		Player dendoncker = new Player("Dendoncker", "Leander", 24, 88, 189, "defense", 75, 65, 84, 77, 86, 82, 88, 80);
		Player mechele = new Player("Mechele", "Brandon", 27, 79, 190, "defense", 59, 59, 65, 62, 86, 80, 88, 70);
		Player vermaelen = new Player("Vermaelen", "Thomas", 34, 80, 183, "defense", 82, 55, 78, 82, 83, 80, 88, 90);
		Player vertonghen = new Player("Vertonghen", "Jan", 32, 86, 189, "defense", 43, 60, 67, 62, 82, 81, 88, 90);
		// milieu
		Player carrasco = new Player("Carrasco", "Yannick", 26, 72, 181, "milieu", 93, 81, 87, 94, 38, 76, 99, 99);
		Player castagne = new Player("Castagne", "Timothy", 24, 80, 180, "milieu", 76, 85, 90, 85, 77, 85, 88, 50);
		Player chadli = new Player("Chadli", "Nacer", 30, 85, 187, "milieu", 86, 86, 86, 92, 45, 68, 88, 50);
		Player witsel = new Player("Witsel", "Axel", 31, 81, 186, "milieu", 91, 82, 85, 88, 41, 58, 88, 50);
		Player meunier = new Player("Meunier", "Thomas", 28, 90, 191, "milieu", 64, 76, 87, 84, 80, 72, 88, 50);
		Player hazard1 = new Player("Hazard", "Thorgan", 26, 71, 175, "milieu", 91, 82, 83, 87, 52, 79, 99, 99);
		Player tielemans = new Player("Tielemans", "Youri", 22, 72, 176, "milieu", 75, 71, 84, 82, 75, 77, 88, 50);
		// attaque
		Player hazard2 = new Player("Hazard", "Eden", 29, 74, 175, "attaquant", 90, 94, 94, 98, 41, 69, 88, 96); 
		Player januzaj = new Player("Januzaj ", "Adnan", 25, 76, 186, "attaquant", 80, 78, 82, 86, 39, 68, 88, 50);
		Player mertens = new Player("Mertens", "Dries", 32, 61, 169, "attaquant", 82, 91, 79, 90, 34, 75, 90, 90);
		Player origi = new Player("Origi", "Divock", 24, 75, 188, "attaquant", 90, 87, 86, 91, 50, 70, 88, 88);
		Player batshuayi = new Player("Batshuayi", "Michy", 269, 91, 185, "attaquant", 64, 87, 73, 81, 32, 72, 88, 99);
		Player benteke = new Player("Benteke", "Christian", 29, 83, 190, "attaquant", 75, 84, 61, 77, 36, 69, 88, 88);
		Player lukaku = new Player("Lukaku", "Romelu", 26, 94, 191, "attaquant", 89, 90, 72, 89, 38, 73, 88, 99); 

		Player[] belgique_players = { courtois, mignolet, sels, alderweireld, boyata, dendoncker, mechele, vermaelen, vertonghen,
				carrasco, castagne, chadli, witsel, meunier, hazard1, tielemans, hazard2, januzaj, mertens, origi,
				batshuayi, benteke, lukaku };
		Coach MartinezC = new Coach("Martinez", "Roberto", 46, "portugal", 2);
		// Coach ss = new Coach(lastName, firstName, age, nationality, level)
		Coach[] coach_belgique = { morinio };
		Team belgique = new Team("4-5-1", "Belgique", belgique_players, coach_belgique, "offensif","../Flag/belgium-flag-icon-32.png");

		// ALGERIE

		Player mbolhi = new Player("M'bolhi", "Raïs", 33, 80, 190, "gardien", 80, 80, 85, 90, 90, 70, 85, 85);
		Player oukidja = new Player("Oukidja", "Alexandre", 31, 79, 184, "gardien", 80, 80, 80, 80, 90, 90, 80, 50);
		Player doukha = new Player("Doukha", "Azzeddine", 33, 85, 186, "gardien", 85, 90, 90, 80, 70, 90, 80, 50);
		// defene
		Player atal = new Player("Atal", "Youcef", 23, 64, 176, "defense", 75, 85, 80, 80, 85, 90, 70, 85);
		Player bensebaini = new Player("Bensebaini", "Ramy", 24, 82, 186, "defense", 85, 85, 85, 70, 90, 90, 90, 90);
		Player benlamri = new Player("Benlamri", "Djamel Eddine", 30, 83, 185, "defense", 90, 90, 80, 80, 80, 80, 80, 80);
		Player tahrat = new Player("Tahrat", "Mehdi", 30, 84, 193, "defense", 85, 90, 90, 90, 70, 80, 80, 80);
		Player ghoulam = new Player("Ghoulam", "Faouzi", 29, 80, 184, "defense", 90, 85, 90, 90, 85, 90, 90, 85);
		Player mandi = new Player("Mandi", "Aissa", 28, 78, 184, "defense", 90, 90, 90, 90, 90, 90, 90, 85);
		Player guedioura = new Player("Guedioura", "Adlène", 34, 81, 178, "milieu", 90, 90, 90, 90, 80, 80, 70, 70);
		// milieu
		Player feghouli = new Player("Feghouli", "Sofiane", 30, 75, 176, "milieu", 70, 70, 70, 80, 80, 80, 80, 80);
		Player banacer = new Player("Bennacer", "Ismael", 22, 70, 175, "milieu", 85, 85, 85, 90, 80, 85, 80, 90);
		Player bentaleb = new Player("Bentaleb", "Nabil", 25, 78, 187, "milieu", 85, 80, 80, 80, 80, 80, 80, 50);
		Player ferhat = new Player("Ferhat", "Zinedine", 22, 77, 183, "milieu", 85, 90, 90, 90, 70, 80, 80, 70);
		Player abeid = new Player("Abeid", "Mehdi", 27, 77, 178, "milieu", 85, 85, 80, 90, 70, 90, 90, 85);
		Player fares = new Player("Fares", "Mohamed", 24, 75, 183, "milieu", 70, 70, 70, 70, 70, 70, 80, 80);
		Player matmour = new Player("Matmour", "Karim", 34, 75, 185, "milieu", 80, 70, 80, 80, 39, 80, 80, 70);
		// attaque
		Player mehrez = new Player("Mahrez", "Riyad", 29, 67, 179, "attaquant", 85, 90, 70, 90, 90, 90, 90, 90);
		Player dolort = new Player("Delort", "Andy", 28, 83, 181, "attaquant", 90, 85, 80, 85, 90, 75, 85, 85);
		Player Bounedjah = new Player("Bounedjah", "Baghdad", 28, 78, 180, "attaquant", 85, 85, 85, 85, 80, 80, 80, 80);
		Player ounas = new Player("Ounas", "Adam", 23, 65, 172, "attaquant", 70, 90, 70, 85, 80, 85, 85, 85);
		Player soudani = new Player("Soudani", "Hillal", 32, 75, 177, "attaquant", 80, 70, 85, 90, 85, 85, 85, 90);
		Player bellaili = new Player("Belaili", "Youcef", 27, 75, 178, "attaquant", 85, 90, 90, 90, 90, 90, 80, 80);

		Player[] algeria_players = { mbolhi, oukidja, doukha, atal, bensebaini, benlamri, tahrat, ghoulam, mandi,
				guedioura, feghouli, banacer, bentaleb, ferhat, abeid, fares, matmour, mehrez, dolort, Bounedjah, ounas,
				soudani, bellaili };
		Coach belmadi = new Coach("Belmadi", "Djamel", 48, "algerien", 4);
		// Coach ss = new Coach(lastName, firstName, age, nationality, level)
		Coach[] coach_algeria = { belmadi };
		Team algeria = new Team("4-4-3", "Algerie", algeria_players, coach_algeria, "offensif","../Flag/algeria-flag-icon-32.png");


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
		Team germany = new Team("4-3-3", "Germany", germany_players, coach_germany, "offensif","../Flag/germany-flag-icon-32.png");

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
		Team england = new Team("4-3-3", "England", england_players, coach_england, "offensif","../Flag/england-flag-icon-32.png");
		// -------------------------------------------------------------------------------------------------------------------------------------------------------

		// Morocco
		Player zniti = new Player("Zniti", "Anas", 25, 85, 190, "gardien", 70, 60, 80, 50, 60, 81, 66, 90);
		Player bounou = new Player("Bounou", "Yassine", 28, 78, 192, "gardien", 75, 66, 71, 62, 65, 54, 78, 50);
		Player munir = new Player("Munir", "Mohand Mohamedi", 30, 89, 190, "gardien", 81, 76, 81, 83, 44, 79, 88, 50);
		// defene
		Player hakimi = new Player("Hakimi", "Achraf", 21, 73, 181, "defense", 65, 65, 78, 80, 69, 60, 88, 90);
		Player costa = new Player("Costa", "Manuel", 33, 84, 191, "defense", 86, 65, 78, 82, 86, 64, 88, 90);
		Player feddal = new Player("Feddal", "Zouhair", 30, 83, 192, "defense", 70, 85, 84, 77, 86, 82, 88, 80);
		Player yamiq = new Player("Yamiq", "Jawad", 28, 83, 190, "defense", 89, 90, 84, 75, 60, 60, 88, 70);
		Player banoun = new Player("Banoun ", "Badr", 26, 82, 193, "defense", 82, 90, 84, 82, 83, 80, 88, 90);
		Player mendyl = new Player("Mendyl ", "Hamza", 22, 73, 179, "defense", 89, 85, 20, 75, 40, 80, 88, 90);
		Player saadane = new Player("Saadane", "Marwane", 28, 75, 187, "defense", 93, 81, 30, 94, 80, 40, 99, 99);
		// milieu
		Player zyich = new Player("Zyich", "Mohamed", 25, 75, 185, "milieu", 66, 55, 80, 22, 99, 65, 76, 50);
		Player amrabt = new Player("Amrabt", "Nordin", 32, 85, 180, "milieu", 93, 33, 94, 44, 36, 88, 88, 50);
		Player fajr = new Player("Fajr", "Faycal", 31, 71, 178, "milieu", 54, 95, 90, 23, 85, 70, 80, 50);
		Player bennaser = new Player("Bennacer", "Ismael", 22, 64, 173, "milieu", 15, 76, 81, 86, 87, 86, 70, 50);
		Player harit = new Player("Harit", "Amine", 22, 67, 180, "milieu", 66, 60, 79, 79, 84, 79, 70, 50);
		Player taarabt = new Player("Taarabt", "Adel", 30, 75, 185, "milieu", 80, 60, 87, 87, 47, 50, 88, 50);
		Player hafidi = new Player("Hafidi", "Hamza", 23, 78, 184, "milieu", 69, 71, 81, 70, 73, 70, 45, 50);
		// attaque
		Player enssiri = new Player("En-Nesyri ", "Youssef", 22, 77, 188, "attaquant", 65, 86, 88, 96, 33, 58, 88, 96);
		Player yajour = new Player("Iajour", "Mouhcine", 34, 76, 178, "attaquant", 79, 84, 81, 89, 62, 80, 90, 90);
		Player alarabi = new Player("El-Arabi", "Youssef", 33, 70, 183, "attaquant", 50, 85, 88, 56, 38, 77, 88, 88);
		Player chamakh = new Player("Chamakh", "Marouane", 36, 70, 185, "attaquant", 26, 78, 81, 45, 90, 76, 88, 66);
		Player hamdalah = new Player("Hamed Allah", "Abderrazak", 29, 75, 179, "attaquant", 25, 86, 88, 92, 90, 90, 88, 77);
		Player belhanda = new Player("Belhanda", "Younès", 30, 75, 179, "attaquant", 45, 84, 85, 89, 53, 90, 54, 77);

		Player[] morocco_players = { zniti, bounou, munir, hakimi, costa, feddal, yamiq, banoun, mendyl, saadane, zyich,
				amrabt, fajr, bennaser, harit, taarabt, hafidi, enssiri, yajour, alarabi, chamakh, hamdalah, belhanda };
		Coach eric = new Coach("Eric", "guerets", 73, "uruguayen", 2);
		Coach[] coach_morocco = { eric };
		Team morocco = new Team("4-3-3", "Morocco", morocco_players, coach_morocco, "offensif");

		// -------------------------------------------------------------------------------------------------------------------------------------------------------

		// netherlands

		Player zoet = new Player("Zoet", "Jeroen", 29, 88, 189, "gardien", 79, 77, 77, 77, 82, 45, 90, 90);
		Player bizot = new Player("Bizot", "Marco", 28, 85, 194, "gardien", 80, 74, 66, 77, 47, 74, 88, 50);
		Player cillicen = new Player("Cillessen ", "Jasper", 30, 83, 185, "gardien", 84, 85, 80, 85, 54, 84, 88, 50);
		// defene
		Player vanDijk = new Player("van dijk", "d", 28, 92, 193, "defense", 88, 80, 92, 90, 99, 98, 88, 90);
		Player deLigt = new Player("De Ligt", "Matthijs", 20, 89, 189, "defense", 85, 75, 86, 86, 88, 96, 88, 90);
		Player deVrij = new Player("De Vrij", "Stefan", 32, 78, 189, "defense", 68, 43, 64, 89, 76, 82, 88, 80);
		Player beek = new Player("van de Beek", "Donny", 22, 74, 184, "defense", 75, 82, 80, 82, 74, 82, 88, 70);
		Player blind = new Player("Blind ", "Daley", 28, 72, 180, "defense", 54, 65, 80, 80, 77, 74, 88, 90);
		Player klaiber = new Player("Klaiber ", "Sean", 25, 76, 184, "defense", 87, 66, 73, 72, 72, 76, 88, 90);
		Player veltman = new Player("Veltman", "Joel", 28, 75, 184, "defense", 66, 49, 66, 69, 79, 78, 99, 99);
		// milieu
		Player jong = new Player("De Jong", "Frenkie", 22, 74, 180, "milieu", 88, 87, 93, 95, 95, 88, 88, 50);
		Player promes = new Player("Promes", "Quincy", 28, 72, 174, "milieu", 92, 82, 82, 84, 42, 69, 88, 50);
		Player wijnaldum = new Player("Wijnaldum", "Georginio", 29, 69, 175, "milieu", 77, 73, 78, 85, 76, 78, 80, 50);
		Player stengkos = new Player("Stengkos", "Phillipe", 25, 69, 173, "milieu", 83, 69, 80, 80, 83, 40, 88, 50);
		Player brgwijin = new Player("Bregwijin", "Steven", 22, 78, 178, "milieu", 90, 78, 88, 41, 75, 79, 99, 99);
		Player stengs = new Player("Stengs", "Calvin", 21, 68, 187, "milieu", 83, 69, 80, 83, 40, 64, 88, 50);
		Player chong = new Player("Chong", "Tahith", 20, 75, 185, "milieu", 86, 84, 70, 86, 46, 78, 88, 50);
		// attaque
		Player depay = new Player("Depay", "Memphis", 26, 78, 176, "attaquant", 89, 83, 84, 85, 34, 79, 88, 96);
		Player dost = new Player("Dost", "Bas", 30, 89, 196, "attaquant", 50, 82, 57, 66, 45, 80, 90, 90);
		Player gullit = new Player("Gullit", "Ruud", 57, 84, 191, "attaquant", 70, 65, 75, 21, 48, 78, 59, 65);
		Player kluvert = new Player("De Jong", "Luuk", 29, 86, 188, "attaquant", 80, 77, 81, 95, 90, 76, 88, 99);
		Player basten = new Player("Berghuis", "Steven", 28, 75, 182, "attaquant", 91, 86, 88, 92, 90, 90, 88, 98);
		Player overmars = new Player("Babel", "Ryan", 33, 85, 185, "attaquant", 89, 84, 85, 89, 53, 90, 88, 88);

		Player[] netherlands_players = { zoet, bizot, cillicen, vanDijk, deLigt, deVrij, beek, blind, klaiber, veltman,
				jong, promes, wijnaldum, stengkos, brgwijin, stengs, chong, depay, dost, gullit, kluvert, basten,
				overmars };
		Coach vanjal = new Coach("Vanjal", "Tabanez", 73, "uruguayen", 2);
		Coach[] coach_netherlands = { vanjal };
		Team netherlands = new Team("4-3-3", "Netherlands", netherlands_players, coach_netherlands, "offensif","../Flag/netherlands-flag-icon-32.png");

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
