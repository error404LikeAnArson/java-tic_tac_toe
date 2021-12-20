import javax.swing.*;
import java.awt.*;
import java.lang.*;
import java.util.*;


public class troisXtrois extends grille{
    public static pion[][] tab = new pion[3][3];

    public troisXtrois () {
    	//this.tab = new pion[3][3];
    }

	
	public int checkVictory (boolean pion){
		int victory = 0;
		// reférence des pions en fonction du choix du joueur
		pion joueur, ordi;

		if (pion){
			joueur = new croix();
			ordi = new rond();
		}
		else{
			joueur = new rond();
			ordi = new croix();
		}

		//m^me format
		String joueurStr = joueur.getClass().getName();
		String ordiStr = ordi.getClass().getName();
		String[][] tabTempo = new String[3][3];

		int i, j;
		for (i=0; i<tab.length; i++)
			for (j=0; j<tab.length; j++)
				tabTempo[i][j] = tab[i][j].getClass().getName();

		if(		   (tabTempo[0][0].equals(joueurStr) && tabTempo[0][1].equals(joueurStr) && tabTempo[0][2].equals(joueurStr))
				|| (tabTempo[1][0].equals(joueurStr) && tabTempo[1][1].equals(joueurStr) && tabTempo[1][2].equals(joueurStr))
				|| (tabTempo[2][0].equals(joueurStr) && tabTempo[2][1].equals(joueurStr) && tabTempo[2][2].equals(joueurStr))
				|| (tabTempo[0][0].equals(joueurStr) && tabTempo[1][0].equals(joueurStr) && tabTempo[2][0].equals(joueurStr))
				|| (tabTempo[0][1].equals(joueurStr) && tabTempo[1][1].equals(joueurStr) && tabTempo[2][1].equals(joueurStr))
				|| (tabTempo[0][2].equals(joueurStr) && tabTempo[1][2].equals(joueurStr) && tabTempo[2][2].equals(joueurStr))
				|| (tabTempo[0][0].equals(joueurStr) && tabTempo[1][1].equals(joueurStr) && tabTempo[2][2].equals(joueurStr))
				|| (tabTempo[0][2].equals(joueurStr) && tabTempo[1][1].equals(joueurStr) && tabTempo[2][0].equals(joueurStr)))
			victory = 1;
		if(		   (tabTempo[0][0].equals(ordiStr) && tabTempo[0][1].equals(ordiStr) && tabTempo[0][2].equals(ordiStr))
				|| (tabTempo[1][0].equals(ordiStr) && tabTempo[1][1].equals(ordiStr) && tabTempo[1][2].equals(ordiStr))
				|| (tabTempo[2][0].equals(ordiStr) && tabTempo[2][1].equals(ordiStr) && tabTempo[2][2].equals(ordiStr))
				|| (tabTempo[0][0].equals(ordiStr) && tabTempo[1][0].equals(ordiStr) && tabTempo[2][0].equals(ordiStr))
				|| (tabTempo[0][1].equals(ordiStr) && tabTempo[1][1].equals(ordiStr) && tabTempo[2][1].equals(ordiStr))
				|| (tabTempo[0][2].equals(ordiStr) && tabTempo[1][2].equals(ordiStr) && tabTempo[2][2].equals(ordiStr))
				|| (tabTempo[0][0].equals(ordiStr) && tabTempo[1][1].equals(ordiStr) && tabTempo[2][2].equals(ordiStr))
				|| (tabTempo[0][2].equals(ordiStr) && tabTempo[1][1].equals(ordiStr) && tabTempo[2][0].equals(ordiStr)))
			victory = 2;

		return victory;		// 0=match nul; 1=victoire joueur; 2=victoire ordi
	}
	
	public boolean checkFull (){
		boolean full = true;
		int i, j;
		vide testVide = new vide();
		for (i=0; i<3; i++)
			for (j=0; j<3; j++)
				if (tab[i][j].getClass().getName().equals(testVide.getClass().getName()))
					full = false;
		return full;		// full=true == grille pleine
	}


	public boolean complete (boolean boucle, String ordiStr, String nameVide, pion ordiPion){
    	int i;
			//complete un alignement
			for (i = 0; i < 3; i++) {
				//ligne complete
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(nameVide)) {
					tab[i][2] = ordiPion;
					boucle = false;
					break;
				}
				if (tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][0].getClass().getName().equals(nameVide)) {
					tab[i][0] = ordiPion;
					boucle = false;
					break;
				}
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(nameVide)) {
					tab[i][1] = ordiPion;
					boucle = false;
					break;
				}

				//colonne complete
				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(nameVide)) {
					tab[2][i] = ordiPion;
					boucle = false;
					break;
				}

				if (tab[1][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(ordiStr) && tab[0][i].getClass().getName().equals(nameVide)) {
					tab[0][i] = ordiPion;
					boucle = false;
					break;
				}

				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(nameVide)) {
					tab[1][i] = ordiPion;
					boucle = false;
					break;
				}
			}

				if (boucle) {
					// diagonale complete
					if (tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(nameVide)) {
						tab[1][1] = ordiPion;
						boucle = false;
					}
				}
				if (boucle) {
					if (tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName().equals(nameVide)) {
						tab[0][0] = ordiPion;
						boucle = false;
					}
				}
				if (boucle) {
					if (tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(nameVide)) {
						tab[2][2] = ordiPion;
						boucle = false;
					}
				}
				if (boucle) {
					if (tab[0][2].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(nameVide)) {
						tab[1][1] = ordiPion;
						boucle = false;
					}
				}
				if (boucle) {
					if (tab[1][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(nameVide)) {
						tab[2][0] = ordiPion;
						boucle = false;
					}
				}
				if (boucle) {
					if (tab[2][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(nameVide)) {
						tab[0][2] = ordiPion;
						boucle = false;
					}
				}
		return boucle;
	}


	public boolean bloque (boolean boucle, String joueurStr, String nameVide, pion ordiPion){
    	int i;
		for (i = 0; i < 3; i++) {
			//ligne complete

			if(boucle) {
				if (tab[i][0].getClass().getName().equals(joueurStr) && tab[i][1].getClass().getName().equals(joueurStr) && tab[i][2].getClass().getName().equals(nameVide)) {
					tab[i][2] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][1].getClass().getName().equals(joueurStr) && tab[i][2].getClass().getName().equals(joueurStr) && tab[i][0].getClass().getName().equals(nameVide)) {
					tab[i][0] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(joueurStr) && tab[i][2].getClass().getName().equals(joueurStr) && tab[i][1].getClass().getName().equals(nameVide)) {
					tab[i][1] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				//colonne complete
				if (tab[0][i].getClass().getName().equals(joueurStr) && tab[1][i].getClass().getName().equals(joueurStr) && tab[2][i].getClass().getName().equals(nameVide)) {
					tab[2][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {

				if (tab[1][i].getClass().getName().equals(joueurStr) && tab[2][i].getClass().getName().equals(joueurStr) && tab[0][i].getClass().getName().equals(nameVide)) {
					tab[0][i] = ordiPion;
					boucle = false;
					break;
				}
			}

			if(boucle) {
			if (tab[0][i].getClass().getName().equals(joueurStr) && tab[2][i].getClass().getName().equals(joueurStr) && tab[1][i].getClass().getName().equals(nameVide)) {
				tab[1][i] = ordiPion;
				boucle = false;
				break;
			}
		}
			if (boucle) {
				// diagonale complete
				if (tab[0][0].getClass().getName().equals(joueurStr) && tab[2][2].getClass().getName().equals(joueurStr) && tab[1][1].getClass().getName().equals(nameVide)) {
					tab[1][1] = ordiPion;
					boucle = false;
				}
			}
			if (boucle) {
				if (tab[1][1].getClass().getName().equals(joueurStr) && tab[2][2].getClass().getName().equals(joueurStr) && tab[0][0].getClass().getName().equals(nameVide)) {
					tab[0][0] = ordiPion;
					boucle = false;
				}
			}
			if (boucle) {
				if (tab[0][0].getClass().getName().equals(joueurStr) && tab[1][1].getClass().getName().equals(joueurStr) && tab[2][2].getClass().getName().equals(nameVide)) {
					tab[2][2] = ordiPion;
					boucle = false;
				}
			}
			if (boucle) {
				if (tab[0][2].getClass().getName().equals(joueurStr) && tab[2][0].getClass().getName().equals(joueurStr) && tab[1][1].getClass().getName().equals(nameVide)) {
					tab[1][1] = ordiPion;
					boucle = false;
				}
			}
			if (boucle) {
				if (tab[1][1].getClass().getName().equals(joueurStr) && tab[0][2].getClass().getName().equals(joueurStr) && tab[2][0].getClass().getName().equals(nameVide)) {
					tab[2][0] = ordiPion;
					boucle = false;
				}
			}
			if (boucle) {
				if (tab[2][0].getClass().getName().equals(joueurStr) && tab[1][1].getClass().getName().equals(joueurStr) && tab[0][2].getClass().getName().equals(nameVide)) {
					tab[0][2] = ordiPion;
					boucle = false;
				}
			}
		}

		return boucle;
	}


	public boolean randomPion (boolean boucle, String nameVide, pion ordiPion){
		Random r1 = new Random();
		int n = r1.nextInt(3);
		Random r2 = new Random();
		int m = r2.nextInt(3);
		if(boucle) {
			while (true) {
				if (tab[n][m].getClass().getName().equals(nameVide)) {
					tab[n][m] = ordiPion;
					break;
				}
				r1 = new Random();
				n = r1.nextInt(3);
				r2 = new Random();
				m = r2.nextInt(3);
			}
			boucle = false;
		}
    	return boucle;
	}


	public void ordiCassicEasy (boolean pion){
        vide testVide = new vide();
        String nameVide = testVide.getClass().getName();
        pion ordiPion;
        String ordiStr;

        if(pion)
        	ordiPion = new rond();
        else
			ordiPion = new croix();

		ordiStr = ordiPion.getClass().getName();
		boolean boucle = true;
		
		while(boucle){

			boucle = complete(boucle, ordiStr, nameVide, ordiPion);

			boucle = randomPion(boucle, nameVide, ordiPion);

		}
		return;	
	}
	
	public void ordiClassicMedium (boolean pion, int tour){
		vide testVide = new vide();
		String nameVide = testVide.getClass().getName();

		Random r3 = new Random();
		int o = r3.nextInt(2);

		Random r1 = new Random();
		int n = r1.nextInt(2)*2; //random = 0 ou 2
		Random r2 = new Random();
		int m = r2.nextInt(2)*2; //random = 0 ou 2


		pion ordiPion;
		String ordiStr;
		pion joueurPion;
		String joueurStr;


		if(pion) {
			ordiPion = new rond();
			joueurPion = new croix();
		}
		else {
			ordiPion = new croix();
			joueurPion = new rond();
		}
		ordiStr = ordiPion.getClass().getName();
		joueurStr = joueurPion.getClass().getName();

		boolean boucle = true;

		while(boucle) {

			boucle = complete(boucle, ordiStr, nameVide, ordiPion);

			if (boucle) {
				boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
			}

			if (tour == 1){
				if(o == 0){
					tab[1][1] = ordiPion;
					boucle = false;
				}
				else{
					tab[n][m] = ordiPion;
				}
			}

			if(boucle){
				boucle = randomPion(boucle, nameVide, ordiPion);
			}

		}
		return;
	}
	
	public void ordiCassicHard (boolean pion, boolean start, int tour){
		vide testVide = new vide();
		String nameVide = testVide.getClass().getName();

		pion ordiPion;
		String ordiStr;
		pion joueurPion;
		String joueurStr;

		if(pion) {
			ordiPion = new rond();
			joueurPion = new croix();
		}
		else {
			ordiPion = new croix();
			joueurPion = new rond();
		}
		ordiStr = ordiPion.getClass().getName();
		joueurStr = joueurPion.getClass().getName();

		int i, j, iBis, jBis;
		boolean boucle = true;

		while(boucle) {

				boucle = complete(boucle, ordiStr, nameVide, ordiPion);

			if (boucle) {
				boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
			}

			Random r1 = new Random();
			int n = r1.nextInt(2)*2; //random = 0 ou 2
			Random r2 = new Random();
			int m = r2.nextInt(2)*2; //random = 0 ou 2

			if(boucle) {
				//en fonction du tour de jeu et qui commence
				if ((!start) && (tour == 1)) {    //si ordi commence, tour 1
					tab[n][m] = ordiPion;
					boucle = false;
				}
				if ((!start) && (tour == 3)) {
					//si joueur joue central
					if (tab[1][1].getClass().getName().equals(joueurStr)) {
						if (tab[0][0].getClass().getName().equals(ordiStr)) {
							tab[2][2] = ordiPion;
							boucle = false;
						}
						if (tab[0][2].getClass().getName().equals(ordiStr)) {
							tab[2][0] = ordiPion;
							boucle = false;
						}
						if (tab[2][0].getClass().getName().equals(ordiStr)) {
							tab[0][2] = ordiPion;
							boucle = false;
						}
						if (tab[2][2].getClass().getName().equals(ordiStr)) {
							tab[0][0] = ordiPion;
							boucle = false;
						}
					}
					//sinon
					if (tab[0][0].getClass().getName().equals(joueurStr) || tab[0][1].getClass().getName().equals(joueurStr) || tab[1][0].getClass().getName().equals(joueurStr)) {
						if (tab[2][2].getClass().getName().equals(nameVide)) {
							tab[2][2] = ordiPion;
							boucle = false;
						}
						if (tab[0][0].getClass().getName().equals(joueurStr) && (!(tab[2][2].getClass().getName().equals(nameVide)))) {
							if (n == 0) {
								tab[0][2] = ordiPion;
								boucle = false;
							} else {
								tab[2][0] = ordiPion;
								boucle = false;
							}
						}
					}
					if (tab[0][2].getClass().getName().equals(joueurStr) || tab[0][1].getClass().getName().equals(joueurStr) || tab[1][2].getClass().getName().equals(joueurStr)) {
						if (tab[2][0].getClass().getName().equals(nameVide)) {
							tab[2][0] = ordiPion;
							boucle = false;
						}
						if (tab[0][2].getClass().getName().equals(joueurStr) && (!(tab[2][0].getClass().getName().equals(nameVide)))) {
							if (n == 0) {
								tab[0][0] = ordiPion;
								boucle = false;
							} else {
								tab[2][2] = ordiPion;
								boucle = false;
							}
						}
					}
					if (tab[2][0].getClass().getName().equals(joueurStr) || tab[2][1].getClass().getName().equals(joueurStr) || tab[1][0].getClass().getName().equals(joueurStr)) {
						if (tab[0][2].getClass().getName().equals(nameVide)) {
							tab[0][2] = ordiPion;
							boucle = false;
						}
						if (tab[2][0].getClass().getName().equals(joueurStr) && (!(tab[0][2].getClass().getName().equals(nameVide)))) {
							if (n == 0) {
								tab[0][0] = ordiPion;
								boucle = false;
							} else {
								tab[2][2] = ordiPion;
								boucle = false;
							}
						}
					}
					if (tab[2][2].getClass().getName().equals(joueurStr) || tab[2][1].getClass().getName().equals(joueurStr) || tab[1][2].getClass().getName().equals(joueurStr)) {
						if (tab[0][0].getClass().getName().equals(nameVide)) {
							tab[0][0] = ordiPion;
							boucle = false;
						}
						if (tab[2][2].getClass().getName().equals(joueurStr) && (!(tab[0][0].getClass().getName().equals(nameVide)))) {
							if (n == 0) {
								tab[0][2] = ordiPion;
								boucle = false;
							} else {
								tab[2][0] = ordiPion;
								boucle = false;
							}
						}
					}
				}
				if ((!start) && (tour == 5)){
					//si central tour 2, alors bloque puis peut etre complete
					//sinon
					//si joueur joue dans un angle
					for (i = 0; i < 3; i = i+2){
						for (j = 0; j < 3; j = j+2){
							if(boucle){
								if(tab[i][j].getClass().getName().equals(joueurStr)) {
									for (iBis = 0; iBis < 3; iBis = iBis + 2) {
										for (jBis = 0; jBis < 3; jBis = jBis + 2) {
											if (boucle) {
												if(tab[iBis][jBis].getClass().getName().equals(nameVide)){
													tab[iBis][jBis] = ordiPion;
													boucle = false;
												}
											}
										}
									}
								}
							}
						}
					}
					//si joueur joue sur un bord
					for (i = 0; i < 3; i = i+2){
						for (j = 0; j < 3; j = j+2){
							if(tab[i][j].getClass().getName().equals(nameVide)){
								if(i == 0){
									iBis = i++;
								}
								else{
									iBis = i--;
								}
								if(j == 0){
									jBis = j++;
								}
								else{
									jBis = j--;
								}
								if(tab[i][jBis].getClass().getName().equals(nameVide) && tab[iBis][j].getClass().getName().equals(nameVide)){
									tab[i][j] = ordiPion;
									boucle = false;
								}
							}
						}
					}

				}



				if ((start) && (tour == 2)){
					if(tab[1][1].getClass().getName().equals(nameVide)){
						tab[1][1] = ordiPion;
						boucle = false;
					}
					else{
						tab[n][m] = ordiPion;
						boucle = false;
					}
				}
				if ((start) && (tour == 4)){
					if(tab[1][1].getClass().getName().equals(ordiStr)){
						while(boucle) {
							if (n == 0) {
								if(tab[1][m].getClass().getName().equals(nameVide)) {
									tab[1][m] = ordiPion;
									boucle = false;
									break;
								}
							} else {
								if(tab[m][1].getClass().getName().equals(nameVide)) {
									tab[m][1] = ordiPion;
									boucle = false;
									break;
								}
							}
							r2 = new Random();
							m = r2.nextInt(2)*2;
						}
					}
				}
			}
		if(boucle) {
			boucle = randomPion(boucle, nameVide, ordiPion);
		}
		}
		return;
	}

	public boolean mediumStart (){
		boolean start = true;
		Random r1 = new Random();
		int n = r1.nextInt(2);

		System.out.println("");
		System.out.println("Voulez-vous commencer ?");
		System.out.println("Y: oui");
		System.out.println("N: non");
		System.out.println("R: hasard");
		System.out.println("");

		Scanner scannerQ = new Scanner(System.in);
		char startTempo = 'A', sTempo = 'A';
		// verification de l'entrée clavier
		while(true){
			startTempo = scannerQ.next().charAt(0);
			if (startTempo == 'y' || startTempo == 'Y' || startTempo == 'n' || startTempo == 'N' || startTempo == 'r' || startTempo == 'R'){
				sTempo = Character.toUpperCase(startTempo);
				break;
			}
			else{
				scannerQ.nextLine();
				System.out.println("try again");
				System.out.println("");
				sTempo = 'A';
			}
		}

		switch(startTempo){
			case 'Y':
				start = true;
				break;
			case 'N':
				start = false;
				break;
			case 'R':
				if (n == 0)
					start = true;
				else
					start = false;
				break;
			default	:
				System.out.println("Erreur mediumStart classic switch");
				break;
		}
    	return start;
	}
	
	public void insertionJoueurT (boolean pion){
		int ligne = 0;
		int colonne = 0;
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		vide testVide = new vide();
		String nameVide = testVide.getClass().getName();
		
		System.out.println("");
		System.out.println("Où jouer ? / Where ?");
		System.out.println("ligne n°?");

		//verification de l'entrée clavier
		while(true) {
			while (true) {
				if (scanner1.hasNextInt()) {
					ligne = scanner1.nextInt();
					if (ligne > 0 && ligne <= 3)
						break;
					else {
						scanner1.nextLine();
						System.out.println("try again");
						System.out.println("");
					}
				} else {
					scanner1.nextLine();
					System.out.println("try again");
					System.out.println("");
				}
			}
			System.out.println("");
			System.out.println("colonne n°?");

			//verification de l'entrée clavier
			while (true) {
				if (scanner2.hasNextInt()) {
					colonne = scanner2.nextInt();
					if (colonne > 0 && colonne <= 3)
						break;
					else {
						scanner1.nextLine();
						System.out.println("try again");
						System.out.println("");
					}
				} else {
					scanner2.nextLine();
					System.out.println("try again");
					System.out.println("");
				}
			}
			if(tab[colonne - 1][ligne - 1].getClass().getName().equals(nameVide))
				break;
			else{
				System.out.println("try again");
				System.out.println("");
			}
			System.out.println("");
		}
		ligne--;
		colonne--;

		// insertion en fonction du pion choisi
		if (pion)
			tab[colonne][ligne] = new croix();		// ligne colonne, dans quelle ordre ????
		else
			tab[colonne][ligne] = new rond();

		return;
	}

	public void insertionJoueurI (boolean pion){

        return;
    }
	
	public void affichageTerminal (){
    	char ununChar = tab[0][0].getAffichageT();
    	String unun = String.valueOf(ununChar);
    	char undeuxChar = tab[1][0].getAffichageT();
    	String undeux = String.valueOf(undeuxChar);
    	char untroisChar = tab[2][0].getAffichageT();
    	String untrois = String.valueOf(untroisChar);
		char deuxunChar = tab[0][1].getAffichageT();
		String deuxun = String.valueOf(deuxunChar);
		char deuxdeuxChar = tab[1][1].getAffichageT();
		String deuxdeux = String.valueOf(deuxdeuxChar);
		char deuxtroisChar = tab[2][1].getAffichageT();
		String deuxtrois = String.valueOf(deuxtroisChar);
		char troisunChar = tab[0][2].getAffichageT();
		String troisun = String.valueOf(troisunChar);
		char troisdeuxChar = tab[1][2].getAffichageT();
		String troisdeux = String.valueOf(troisdeuxChar);
		char troistroisChar = tab[2][2].getAffichageT();
		String troistrois = String.valueOf(troistroisChar);

		System.out.println("");
		System.out.println("   1 | 2 | 3");
		System.out.println("");
		System.out.println("1  " + unun + " | " + undeux + " | " + untrois);
		System.out.println("_____________");
		System.out.println("2  " + deuxun + " | " + deuxdeux + " | " + deuxtrois);
		System.out.println("_____________");
		System.out.println("3  " + troisun + " | " + troisdeux + " | " + troistrois);
		System.out.println("");
		return;
	}

	public void affichageInterface(){

        return;
	}
	
	public void initialisation (){
		int i, j;
		for(i=0; i < tab.length; i++)
			for(j=0; j < tab.length; j++)
				tab[i][j] = new vide();
		return;		
	}
	
	public void ClassicT (boolean pion, char levelGame, int affichage, int nbGame){
		int tempoVict = 0;
		int tour = 0;
		boolean start = true;	//true = joueur commence; false = ordi commence
		System.out.println("");
		System.out.println("Game start");

		switch(levelGame){
			case 'E':
				start = true;
				break;
			case 'M':
				start = mediumStart();
				break;
			case 'H':
				if (nbGame % 2 == 0)
					start = true;
				else
					start = false;
				break;
			default	:
				System.out.println("Erreur start classic switch");
				break;
		}

		if (start){
			tour++;

			switch(affichage){
				case 0:
					affichageTerminal();
					break;
				case 1:
					affichageInterface();
					break;
				case 2:

					break;
				default	:
					System.out.println("Erreur classic affichage switch 1");
					break;
			}

            switch(affichage){
                case 0:
                    insertionJoueurT(pion);
                    break;
                case 1:
                    insertionJoueurI(pion);
                    break;
                case 2:

                    break;
                default	:
                    System.out.println("Erreur classic insertion switch");
                    break;
            }
		}

		while(true){
			tempoVict = checkVictory(pion);
									//System.out.println("débug: tempoVict = " + tempoVict);
			if(tempoVict == 1){
				main.victory();
									//System.out.println("débug: if tempoVict = 1 ?");
				break;
			}
			else{
				if(tempoVict == 2){
					main.fail();
									//System.out.println("débug: if tempoVict = 2 ?");
					break;
				}
				else{
					if(tempoVict == 0) {
									//System.out.println("débug: if tempoVict = 0 ?");
									//System.out.println("débug: checkFull = " + checkFull());
						if (checkFull()) {
							main.draw();
									//System.out.println("débug: pass draw ?");
							break;
						}
					}
					else{
						System.out.println("erreur tempoVict ClassicT");
						break;
					}
				}
			}
			switch(affichage){
				case 0:
					affichageTerminal();
					break;
				case 1:
					affichageInterface();
					break;
				case 2:

					break;
				default	:
					System.out.println("Erreur classic affichage switch");
					break;
			}


			tour++;
			switch(levelGame){
				case 'E':
					ordiCassicEasy(pion);
					break;
				case 'M':
					ordiClassicMedium(pion, tour);
					break;
				case 'H':
					ordiCassicHard(pion, start, tour);
					break;
				default	:
					System.out.println("Erreur level ClassicT switch");
					break;
			}

			switch(affichage){
				case 0:
					affichageTerminal();
					break;
				case 1:
					affichageInterface();
					break;
				case 2:

					break;
				default	:
					System.out.println("Erreur classic affichage switch");
					break;
			}

			tempoVict = checkVictory(pion);
									//System.out.println("débug: tempoVict = " + tempoVict);
			if(tempoVict == 1){
				main.victory();
									//System.out.println("débug: if tempoVict = 1 ?");
				break;
			}
			else{
				if(tempoVict == 2){
					main.fail();
									//System.out.println("débug: if tempoVict = 2 ?");
					break;
				}
				else{
					if(tempoVict == 0) {
									//System.out.println("débug: if tempoVict = 0 ?");
									//System.out.println("débug: checkFull = " + checkFull());
						if (checkFull()) {
							main.draw();
									//System.out.println("débug: pass draw ?");
							break;
						}
					}
					else{
						System.out.println("erreur tempoVict ClassicT");
						break;
					}
				}
			}
			tour++;

            switch(affichage){
                case 0:
                    insertionJoueurT(pion);
                    break;
                case 1:
                    insertionJoueurI(pion);
                    break;
                case 2:

                    break;
                default	:
                    System.out.println("Erreur classic insertion switch");
                    break;
            }

			switch(affichage){
				case 0:
					affichageTerminal();
					break;
				case 1:
					affichageInterface();
					break;
				case 2:

					break;
				default	:
					System.out.println("Erreur classic affichage switch");
					break;
			}

		}
		return;
	}
	
	
	public void classicGame(char levelGame, boolean pion, int affichage, int nbGame){ //0 == terminal, 1 == 2D, ...?
		initialisation();

		ClassicT(pion, levelGame, affichage, nbGame);
		/*	switch(affichage){
				case 0:

					break;
				case 1:
					
					break;
				case 2:
					
					break;
				default	:
					System.out.println("Erreur classic affichage switch");
					break;
			}*/
			
		return;
	}

}
