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


	public void ordiCassicEasy (boolean pion){
		Random r1 = new Random();
        int n = r1.nextInt(3);
		Random r2 = new Random();
        int m = r2.nextInt(3);
        vide testVide = new vide();
        String nameVide = testVide.getClass().getName();
        pion ordiPion;
        String ordiStr;

        if(pion)
        	ordiPion = new rond();
        else
			ordiPion = new croix();

		ordiStr = ordiPion.getClass().getName();

		int i;
		boolean boucle = true;
		
				// break the while direct ???? comment ?
		
		while(boucle){
			for(i=0; i<3; i++){
				
				//ligne
				if(tab[i][0].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(nameVide)){
					tab[i][2] = ordiPion;
					boucle = false;
					break;
				}
				if(tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][0].getClass().getName().equals(nameVide)){
					tab[i][0] = ordiPion;
					boucle = false;
					break;
				}
				if(tab[i][0].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(nameVide)){
					tab[i][1] = ordiPion;
					boucle = false;
					break;
				}
				
				//colonne
				if(tab[0][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(nameVide)){
					tab[2][i] = ordiPion;
					boucle = false;
					break;
				}	
			
				if(tab[1][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(ordiStr) && tab[0][i].getClass().getName().equals(nameVide)){
					tab[0][i] = ordiPion;
					boucle = false;
					break;
				}	
			
				if(tab[0][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(nameVide)){
					tab[1][i] = ordiPion;
					boucle = false;
					break;
				}	
			
			}
			if(boucle){	
				// diagonale
				if(tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(nameVide)){
					tab[1][1] = ordiPion;
					break;
				}	
			
				if(tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName().equals(nameVide)){
					tab[0][0] = ordiPion;
					break;
				}	
			
				if(tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(nameVide)){
					tab[2][2] = ordiPion;
					break;
				}
			
				if(tab[0][2].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(nameVide)){
					tab[1][1] = ordiPion;
					break;
				}
			
				if(tab[1][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(nameVide)){
					tab[2][0] = ordiPion;
					break;
				}
			
				if(tab[2][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(nameVide)){
					tab[0][2] = ordiPion;
					break;
				}
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
		}
	/*	
			// ligne par ligne
        	if(tab[0][0].getClass().getName().equals(ordiStr) && tab[0][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName.equals(nameVide))
				tab[0][2] = ordiPion;
			else
			if(tab[0][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName.equals(nameVide))
				tab[0][0] = ordiPion;
			else
        	if(tab[0][0].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(ordiStr) && tab[0][1].getClass().getName.equals(nameVide))
        		tab[0][1] = ordiPion;
        	else
			if(tab[1][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName.equals(nameVide))
				tab[1][2] = ordiPion;
			else
			if(tab[1][1].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[1][0].getClass().getName.equals(nameVide))
				tab[1][0] = ordiPion;
			else
			if(tab[1][0].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName.equals(nameVide))
				tab[1][1] = ordiPion;
			else
			if(tab[2][0].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName.equals(nameVide))
				tab[2][2] = ordiPion;
			else
			if(tab[2][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName.equals(nameVide))
				tab[2][0] = ordiPion;
			else
			if(tab[2][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName.equals(nameVide))
				tab[2][1] = ordiPion;

			//colonne par colonne
			else
			if(tab[0][0].getClass().getName().equals(ordiStr) && tab[1][0].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName.equals(nameVide))
				tab[2][0] = ordiPion;
			else
			if(tab[1][0].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName.equals(nameVide))
				tab[0][0] = ordiPion;
			else
			if(tab[0][0].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(ordiStr) && tab[1][0].getClass().getName.equals(nameVide))
				tab[1][0] = ordiPion;
			else
			if(tab[0][1].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName.equals(nameVide))
				tab[2][1] = ordiPion;
			else
			if(tab[1][1].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[0][1].getClass().getName.equals(nameVide))
				tab[0][1] = ordiPion;
			else
			if(tab[0][1].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName.equals(nameVide))
				tab[1][1] = ordiPion;
			else
			if(tab[0][2].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName.equals(nameVide))
				tab[2][2] = ordiPion;
			else
			if(tab[1][2].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName.equals(nameVide))
				tab[0][2] = ordiPion;
			else
			if(tab[0][2].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName.equals(nameVide))
				tab[1][2] = ordiPion;

			//diagonale
			else
			if(tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName.equals(nameVide))
				tab[1][1] = ordiPion;
			else
			if(tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName.equals(nameVide))
				tab[0][0] = ordiPion;
			else
			if(tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName.equals(nameVide))
				tab[2][2] = ordiPion;
			else
			if(tab[0][2].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName.equals(nameVide))
				tab[1][1] = ordiPion;
			else
			if(tab[1][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName.equals(nameVide))
				tab[2][0] = ordiPion;
			else
			if(tab[2][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName.equals(nameVide))
				tab[0][2] = ordiPion;
			//fin de l'indentation foirée

		else {
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
		}*/
		return;	
	}
	
	public void ordiClassicMedium (boolean pion){
		
		return;
	}
	
	public void ordiCassicHard (boolean pion){
		
		return;
	}
	
	public void insertionJoueur (boolean pion){
		int ligne = 0;
		int colonne = 0;
		Scanner scanner1 = new Scanner(System.in);
		Scanner scanner2 = new Scanner(System.in);
		
		System.out.println("");
		System.out.println("Où jouer ? / Where ?");
		System.out.println("ligne n°?");

		//verification de l'entrée clavier
		while(true){
			if (scanner1.hasNextInt()) {
                ligne = scanner1.nextInt();
                if (ligne > 0 && ligne <= 3)
                    break;
				else {
					scanner1.nextLine();
					System.out.println("try again");
					System.out.println("");
				}
            }
            else{
                scanner1.nextLine();
				System.out.println("try again");
				System.out.println("");
			}
		}	
		System.out.println("");
		System.out.println("colonne n°?");
		
		//verification de l'entrée clavier
		while(true){
			if (scanner2.hasNextInt()) {
                colonne = scanner2.nextInt();
                if (colonne > 0 && colonne <= 3)
                    break;
				else {
					scanner1.nextLine();
					System.out.println("try again");
					System.out.println("");
				}
            }
            else{
                scanner2.nextLine();
				System.out.println("try again");
				System.out.println("");
			}
		}	
		System.out.println("");

		ligne--;
		colonne--;

		// insertion en fonction du pion choisi
		if (pion)
			tab[colonne][ligne] = new croix();		// ligne colonne, dans quelle ordre ????
		else
			tab[colonne][ligne] = new rond();

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
	
	public void initialisation (){
		int i, j;
		for(i=0; i < tab.length; i++)
			for(j=0; j < tab.length; j++)
				tab[i][j] = new vide();

    /*	vide vide1 = new vide();
		vide vide2 = new vide();
		vide vide3 = new vide();
		vide vide4 = new vide();
		vide vide5 = new vide();
		vide vide6 = new vide();
		vide vide7 = new vide();
		vide vide8 = new vide();
		vide vide9 = new vide();
		tab = new pion[][]{{vide1, vide2, vide3}, {vide4, vide5, vide6}, {vide7, vide8, vide9}};  */
		return;		
	}
	
	public void ClassicT (boolean pion, char levelGame){
		int tempoVict = 0;
		System.out.println("");
		System.out.println("Game start");
		affichageTerminal();
		insertionJoueur(pion);
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
			affichageTerminal();
			
			switch(levelGame){
				case 'E':
					ordiCassicEasy(pion);
					break;
				case 'M':
					ordiClassicMedium(pion);
					break;
				case 'H':
					ordiCassicHard(pion);
					break;
				default	:
					System.out.println("Erreur level ClassicT switch");
					break;
			}
			
			affichageTerminal();
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
			insertionJoueur(pion);
			affichageTerminal();
		}
		return;
	}
	
	
	public void classicGame(char levelGame, boolean pion, int affichage){ //0 == terminal, 1 == 2D, ...?
		initialisation();
		
			switch(affichage){
				case 0:
					ClassicT(pion, levelGame);
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				default	:
					System.out.println("Erreur classic affichage switch");
					break;
			}
			
		return;
	}

}
