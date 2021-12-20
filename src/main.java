
import java.lang.*;
import java.util.*;

public class main {

	protected static int typeGame;
	protected static char levelGame;
	protected static boolean pionJoueur;
	protected static int nbGame;

	public static void victory (){
		System.out.println("");
		System.out.println("you're WINNER =D");
		System.out.println("");
	}

	public static void fail (){
		System.out.println("");
		System.out.println("it's FAIL ='(");
		System.out.println("");
	}

	public static void draw (){
		System.out.println("");
		System.out.println("draw =/");
		System.out.println("");
	}

	public static void pion (){					// X == true; O == false
		System.out.println("");
		System.out.println("Choose a X or O");
		System.out.println("");
		char pionJoueurTempo = 'A';
		char pionJoueurTempo2 = 'A';
		Scanner scanner = new Scanner(System.in);
		while(true) {
			pionJoueurTempo = scanner.next().charAt(0);
			if (pionJoueurTempo == 'X' || pionJoueurTempo == 'x' || pionJoueurTempo == 'O' || pionJoueurTempo == 'o') {
				pionJoueurTempo2 = Character.toUpperCase(pionJoueurTempo);
				if (pionJoueurTempo2 == 'X')
					pionJoueur = true;
				else
					pionJoueur = false;
				break;
			} else {
				scanner.nextLine();
				System.out.println("try again");
				System.out.println("");
			}
		}
	}

	public static void level(){
		//selection du niveau de jeu
		System.out.println("");
		System.out.println("Choose a level");
		System.out.println("E : easy");
		System.out.println("M : medium");
		System.out.println("H : hard");
		System.out.println("q : exit");
		System.out.println("");
		Scanner scannerL = new Scanner(System.in);
		char levelGameTempo;
		// verification de l'entrée clavier
		while(true){
			levelGameTempo = scannerL.next().charAt(0);
			if (levelGameTempo == 'E' || levelGameTempo == 'e' || levelGameTempo == 'M' || levelGameTempo == 'm'
					|| levelGameTempo == 'H' || levelGameTempo == 'h' || levelGameTempo == 'q' || levelGameTempo == 'Q'){
				levelGame = Character.toUpperCase(levelGameTempo);
				break;
			}
			else{
				scannerL.nextLine();
				System.out.println("try again");
				System.out.println("");
				levelGame = 'A';
			}
		}
		return;
	}

	public static void type (){
		//quelle grille ?
		System.out.println("");
		System.out.println("Choose a game");
		System.out.println("3 : 3x3");
		System.out.println("4 : 4x4");
		System.out.println("0 : 3x3x3");
		System.out.println("9 : exit");
		System.out.println("");
		Scanner scanne = new Scanner(System.in);
		//verification de l'entrée clavier
		while(true){
			if (scanne.hasNextInt()) {
				typeGame = scanne.nextInt();
				if (typeGame == 0 || typeGame == 3 || typeGame == 4 || typeGame == 9)
					break;
				else{
					scanne.nextLine();
					System.out.println("try again");
					System.out.println("");
					typeGame = 1;
				}
			}
			else{
				scanne.nextLine();
				System.out.println("try again");
				System.out.println("");
				typeGame = 1;
			}
		}
		return;
	}

	public static void terminalGame(){
		System.out.println("Welcome in this little game");
		nbGame = 0;

		while(true){
			//donnée de démarage : quelle grille, quel pion, quel niveau de difficulté

			nbGame++;

			//initialisation de typeGame
			typeGame = 1;
			type();
			if (typeGame == 9) 		//quitter le jeu
				break;
			//initialisation de levelGame
			levelGame = 'A';
			level();
			if (levelGame == 'Q')	//quitter le jeu
				break;
			pion();

			//pour appeler une methode non static
			troisXtrois tt = new troisXtrois();
			quatreXquatre qq = new quatreXquatre();
			troisXtroisXtrois ttt = new troisXtroisXtrois();

			//envoie sur la grille adéquate
			//(char levelGame, boolean pion, boolean affichage) <= aff=0 == terminal; pion=1 == croix=Joueur
			switch(typeGame){
				case 3:
					tt.classicGame(levelGame, pionJoueur, 0, nbGame);
					break;
				case 4:
					qq.plusGame(levelGame, pionJoueur, 0, nbGame);
					break;
				case 0:
					ttt.extraGame(levelGame, pionJoueur, 0, nbGame);
					break;
				default	:
					System.out.println("Erreur grille choice switch terminalGame");
					break;
			}
			System.out.println("");
			System.out.println("Quit ? Y/N");
			System.out.println("");

			Scanner scannerQ = new Scanner(System.in);
			char quitTempo = 'A', quit = 'A';
			// verification de l'entrée clavier
			while(true){
				quitTempo = scannerQ.next().charAt(0);
				if (quitTempo == 'y' || quitTempo == 'Y' || quitTempo == 'n' || quitTempo == 'N'){
					quit = Character.toUpperCase(quitTempo);
					break;
				}
				else{
					scannerQ.nextLine();
					System.out.println("try again");
					System.out.println("");
					quit = 'A';
				}
			}
			if(quit == 'Y')
				break;
		}

		System.out.println("Bye Bye");
		return;
	}

	public static void interfaceGame(){
		System.out.println("Welcome in this little game");
		nbGame = 0;

		while(true){
			//donnée de démarage : quelle grille, quel pion, quel niveau de difficulté

			nbGame++;

			//initialisation de typeGame
			typeGame = 1;
			type();
			if (typeGame == 9) 		//quitter le jeu
				break;
			//initialisation de levelGame
			levelGame = 'A';
			level();
			if (levelGame == 'Q')	//quitter le jeu
				break;
			pion();

			//pour appeler une methode non static
			troisXtrois tt = new troisXtrois();
			quatreXquatre qq = new quatreXquatre();
			troisXtroisXtrois ttt = new troisXtroisXtrois();

			//envoie sur la grille adéquate
			//(char levelGame, boolean pion, boolean affichage) <= aff=0 == terminal; pion=1 == croix=Joueur
			switch(typeGame){
				case 3:
					tt.classicGame(levelGame, pionJoueur, 1, nbGame);
					break;
				case 4:
					qq.plusGame(levelGame, pionJoueur, 1, nbGame);
					break;
				case 0:
					ttt.extraGame(levelGame, pionJoueur, 1, nbGame);
					break;
				default	:
					System.out.println("Erreur grille choice switch interfaceGame");
					break;
			}
			System.out.println("");
			System.out.println("Quit ? Y/N");
			System.out.println("");

			Scanner scannerQ = new Scanner(System.in);
			char quitTempo = 'A', quit = 'A';
			// verification de l'entrée clavier
			while(true){
				quitTempo = scannerQ.next().charAt(0);
				if (quitTempo == 'y' || quitTempo == 'Y' || quitTempo == 'n' || quitTempo == 'N'){
					quit = Character.toUpperCase(quitTempo);
					break;
				}
				else{
					scannerQ.nextLine();
					System.out.println("try again");
					System.out.println("");
					quit = 'A';
				}
			}
			if(quit == 'Y')
				break;
		}

		System.out.println("Bye Bye");
		return;
	}


	public static void main(String[] arg){
		// jeu sans interface graffique, dans le terminal
		System.out.println("avec interface graphique ou dans le terminal ? I/T");
		Scanner scannerQ = new Scanner(System.in);
		char GameTempo = 'A', game = 'A';
		// verification de l'entrée clavier
		while(true){
			GameTempo = scannerQ.next().charAt(0);
			if (GameTempo == 'i' || GameTempo == 'I' || GameTempo == 't' || GameTempo == 'T'){
				game = Character.toUpperCase(GameTempo);
				break;
			}
			else{
				scannerQ.nextLine();
				System.out.println("try again");
				System.out.println("");
				game = 'A';
			}
		}
		switch(game){
			case 'I':

				break;
			case 'T':
				terminalGame();
				break;
			default	:
				System.out.println("Erreur main switch Game");
				break;
		}

		return;
	}

}
