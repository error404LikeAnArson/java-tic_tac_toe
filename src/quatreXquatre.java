import java.lang.*;
import java.util.*;


public class quatreXquatre extends grille{
    public static pion[][] tab = new pion[4][4];

    public quatreXquatre () {
        //this.tab = new pion[4][4];
    }

    public boolean checkDraw (boolean pion){

    	//TODO
		//à débug

    	boolean drawT1 = true, drawT2 = true, draw = false;
    	boolean okOrdiL = false, okJoueurL = false;
    	boolean okOrdiC = false, okJoueurC = false;
    	boolean okOrdiD1 = false, okJoueurD1 = false;
    	boolean okOrdiD2 = false, okJoueurD2 = false;
    	int i, j, k = 3;
		pion joueur, ordi;

		if (pion){
			joueur = new croix();
			ordi = new rond();
		}
		else{
			joueur = new rond();
			ordi = new croix();
		}
		String joueurStr = joueur.getClass().getName();
		String ordiStr = ordi.getClass().getName();

		System.out.println("debug 1 : HERE");

		for(i=0; i<4; i++){
			for (j=0; j<4; j++){
				if(tab[i][j].getClass().getName().equals(ordiStr)){
					okOrdiL = true;
				}
				if(tab[i][j].getClass().getName().equals(joueurStr)){
					okJoueurL = true;
				}
				if(tab[j][i].getClass().getName().equals(ordiStr)){
					okOrdiC = true;
				}
				if(tab[j][i].getClass().getName().equals(joueurStr)){
					okJoueurC = true;
				}
			}

			System.out.println("debug : okOrdiL = " + okOrdiL);
			System.out.println("debug : okOrdiC = " + okOrdiC);
			System.out.println("debug : okJoueurC = " + okJoueurC);
			System.out.println("debug : okJoueurL = " + okJoueurL);

			//si il y a à la fois un pion ordi et un pion J okO et okJ, si il en manque un draw = false
			if((!(okOrdiL && okJoueurL)) || (!(okOrdiC && okJoueurC))){
				drawT1 = false;
			}
			switch(i){
				case 0:
					k = 3;
					break;
				case 1:
					k = 2;
					break;
				case 2:
					k = 1;
					break;
				case 3:
					k = 0;
					break;
				default:
					System.out.println("Erreur switch draw");
					break;
			}
			if(tab[i][i].getClass().getName().equals(ordiStr)){
				okOrdiD1 = true;
			}
			if(tab[i][k].getClass().getName().equals(ordiStr)){
				okOrdiD2 = true;
			}
			if(tab[i][i].getClass().getName().equals(joueurStr)){
				okJoueurD1 = true;
			}
			if(tab[i][k].getClass().getName().equals(joueurStr)){
				okJoueurD2 = true;
			}

			System.out.println("debug : okOrdiD1 = " + okOrdiD1);
			System.out.println("debug : okOrdiD2 = " + okOrdiD2);
			System.out.println("debug : okJoueurD1 = " + okJoueurD1);
			System.out.println("debug : okJoueurD2 = " + okJoueurD2);

			if((!(okOrdiD1 && okJoueurD1)) || (!(okOrdiD2 && okJoueurD2))){
				drawT2 = false;
			}
		}

		System.out.println("debug : drawT1 = " + drawT1);
		System.out.println("debug : drawT2 = " + drawT2);

		if(drawT1 && drawT2){
			draw = true;
		}

    	return draw;
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
        String[][] tabTempo = new String[4][4];

        int i, j;
        for (i=0; i<tab.length; i++)
            for (j=0; j<tab.length; j++)
                tabTempo[i][j] = tab[i][j].getClass().getName();

        if(		   (tabTempo[0][0].equals(joueurStr) && tabTempo[0][1].equals(joueurStr) && tabTempo[0][2].equals(joueurStr) && tabTempo[0][3].equals(joueurStr))
                || (tabTempo[1][0].equals(joueurStr) && tabTempo[1][1].equals(joueurStr) && tabTempo[1][2].equals(joueurStr) && tabTempo[1][3].equals(joueurStr))
                || (tabTempo[2][0].equals(joueurStr) && tabTempo[2][1].equals(joueurStr) && tabTempo[2][2].equals(joueurStr) && tabTempo[2][3].equals(joueurStr))
                || (tabTempo[3][0].equals(joueurStr) && tabTempo[3][1].equals(joueurStr) && tabTempo[3][2].equals(joueurStr) && tabTempo[3][3].equals(joueurStr))
                || (tabTempo[0][0].equals(joueurStr) && tabTempo[1][0].equals(joueurStr) && tabTempo[2][0].equals(joueurStr) && tabTempo[3][0].equals(joueurStr))
                || (tabTempo[0][1].equals(joueurStr) && tabTempo[1][1].equals(joueurStr) && tabTempo[2][1].equals(joueurStr) && tabTempo[3][1].equals(joueurStr))
                || (tabTempo[0][2].equals(joueurStr) && tabTempo[1][2].equals(joueurStr) && tabTempo[2][2].equals(joueurStr) && tabTempo[3][2].equals(joueurStr))
                || (tabTempo[0][3].equals(joueurStr) && tabTempo[1][3].equals(joueurStr) && tabTempo[2][3].equals(joueurStr) && tabTempo[3][3].equals(joueurStr))
                || (tabTempo[0][0].equals(joueurStr) && tabTempo[1][1].equals(joueurStr) && tabTempo[2][2].equals(joueurStr) && tabTempo[3][3].equals(joueurStr))
                || (tabTempo[0][3].equals(joueurStr) && tabTempo[1][2].equals(joueurStr) && tabTempo[2][1].equals(joueurStr) && tabTempo[3][0].equals(joueurStr)))
            victory = 1;
        if(		   (tabTempo[0][0].equals(ordiStr) && tabTempo[0][1].equals(ordiStr) && tabTempo[0][2].equals(ordiStr) && tabTempo[0][3].equals(ordiStr))
                || (tabTempo[1][0].equals(ordiStr) && tabTempo[1][1].equals(ordiStr) && tabTempo[1][2].equals(ordiStr) && tabTempo[1][3].equals(ordiStr))
                || (tabTempo[2][0].equals(ordiStr) && tabTempo[2][1].equals(ordiStr) && tabTempo[2][2].equals(ordiStr) && tabTempo[2][3].equals(ordiStr))
                || (tabTempo[3][0].equals(ordiStr) && tabTempo[3][1].equals(ordiStr) && tabTempo[3][2].equals(ordiStr) && tabTempo[3][3].equals(ordiStr))
                || (tabTempo[0][0].equals(ordiStr) && tabTempo[1][0].equals(ordiStr) && tabTempo[2][0].equals(ordiStr) && tabTempo[3][0].equals(ordiStr))
                || (tabTempo[0][1].equals(ordiStr) && tabTempo[1][1].equals(ordiStr) && tabTempo[2][1].equals(ordiStr) && tabTempo[3][1].equals(ordiStr))
                || (tabTempo[0][2].equals(ordiStr) && tabTempo[1][2].equals(ordiStr) && tabTempo[2][2].equals(ordiStr) && tabTempo[3][2].equals(ordiStr))
                || (tabTempo[0][3].equals(ordiStr) && tabTempo[1][3].equals(ordiStr) && tabTempo[2][3].equals(ordiStr) && tabTempo[3][3].equals(ordiStr))
                || (tabTempo[0][0].equals(ordiStr) && tabTempo[1][1].equals(ordiStr) && tabTempo[2][2].equals(ordiStr) && tabTempo[3][3].equals(ordiStr))
                || (tabTempo[0][3].equals(ordiStr) && tabTempo[1][2].equals(ordiStr) && tabTempo[2][1].equals(ordiStr) && tabTempo[3][0].equals(ordiStr)))
            victory = 2;

        return victory;		// 0=match nul; 1=victoire joueur; 2=victoire ordi
    }

    public boolean checkFull (){
        boolean full = true;
        int i, j;
        vide testVide = new vide();
        for (i=0; i<4; i++)
            for (j=0; j<4; j++)
                if (tab[i][j].getClass().getName().equals(testVide.getClass().getName()))
                    full = false;
        return full;		// full=true == grille pleine
    }

	public boolean complete (boolean boucle, String ordiStr, String nameVide, pion ordiPion){
		int i;

		//si trois alignes, rajoute un

		for(i=0; i<4; i++){
			if(boucle) {
				//largueur complete
				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[3][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(nameVide)) {
					tab[2][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(ordiStr) && tab[3][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(nameVide)) {
					tab[1][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[2][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[3][i].getClass().getName().equals(ordiStr) && tab[0][i].getClass().getName().equals(nameVide)) {
					tab[0][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(ordiStr) && tab[3][i].getClass().getName().equals(nameVide)) {
					tab[3][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if (boucle) {
				//longueur complete
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(ordiStr) && tab[i][3].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(nameVide)) {
					tab[i][2] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][3].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(nameVide)) {
					tab[i][1] = ordiPion;
					boucle = false;
					break;
				}
				if (tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][3].getClass().getName().equals(ordiStr) && tab[i][0].getClass().getName().equals(nameVide)) {
					tab[i][0] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][3].getClass().getName().equals(nameVide)) {
					tab[i][3] = ordiPion;
					boucle = false;
					break;
				}
			}
		}
		if (boucle) {
			//A MODIF!!!!
			// diagonale complete
			if (tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(nameVide)) {
				tab[1][1] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName().equals(nameVide)) {
				tab[0][0] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(nameVide)) {
				tab[2][2] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(nameVide)) {
				tab[3][3] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[0][3].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(nameVide)) {
				tab[2][1] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[2][1].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[0][3].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(nameVide)) {
				tab[3][0] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[3][0].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[0][3].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(nameVide)) {
				tab[1][2] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[3][0].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[0][3].getClass().getName().equals(nameVide)) {
				tab[0][3] = ordiPion;
				boucle = false;
			}
		}
		return boucle;
	}

	public boolean complete2 (boolean boucle, String ordiStr, String nameVide, pion ordiPion){
    	int i;
		Random r4 = new Random();
		int bool = r4.nextInt(2);

		//si deux alignes, rajoute un
		for(i=0; i<4; i++){
			//colonne fixe
			if(boucle) {
				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(nameVide) && tab[3][i].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[2][i] = ordiPion;
					}
					else{
						tab[3][i] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(nameVide) && tab[3][i].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[1][i] = ordiPion;
					}
					else{
						tab[3][i] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[2][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[0][i].getClass().getName().equals(nameVide) && tab[3][i].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[0][i] = ordiPion;
					}
					else{
						tab[3][i] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[3][i].getClass().getName().equals(ordiStr) && tab[1][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(nameVide) && tab[0][i].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[2][i] = ordiPion;
					}
					else{
						tab[0][i] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[0][i].getClass().getName().equals(ordiStr) && tab[3][i].getClass().getName().equals(ordiStr) && tab[2][i].getClass().getName().equals(nameVide) && tab[1][i].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[2][i] = ordiPion;
					}
					else{
						tab[1][i] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[2][i].getClass().getName().equals(ordiStr) && tab[3][i].getClass().getName().equals(ordiStr) && tab[0][i].getClass().getName().equals(nameVide) && tab[1][i].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[0][i] = ordiPion;
					}
					else{
						tab[1][i] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			//ligne fixe
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(nameVide) && tab[i][3].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[i][2] = ordiPion;
					}
					else{
						tab[i][3] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(nameVide) && tab[i][3].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[i][1] = ordiPion;
					}
					else{
						tab[i][3] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][2].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(ordiStr) && tab[i][0].getClass().getName().equals(nameVide) && tab[i][3].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[i][0] = ordiPion;
					}
					else{
						tab[i][3] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][3].getClass().getName().equals(ordiStr) && tab[i][1].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(nameVide) && tab[i][0].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[i][2] = ordiPion;
					}
					else{
						tab[i][0] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(ordiStr) && tab[i][3].getClass().getName().equals(ordiStr) && tab[i][2].getClass().getName().equals(nameVide) && tab[i][1].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[i][2] = ordiPion;
					}
					else{
						tab[i][1] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][2].getClass().getName().equals(ordiStr) && tab[i][3].getClass().getName().equals(ordiStr) && tab[i][0].getClass().getName().equals(nameVide) && tab[i][1].getClass().getName().equals(nameVide)) {
					if(bool == 0){
						tab[i][0] = ordiPion;
					}
					else{
						tab[i][1] = ordiPion;
					}
					boucle = false;
					break;
				}
			}
		}
		//diagonales
		if(boucle){
			if (tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(nameVide) && tab[3][3].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[3][3] = ordiPion;
				}
				else{
					tab[2][2] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[2][2].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName().equals(nameVide) && tab[3][3].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[3][3] = ordiPion;
				}
				else{
					tab[0][0] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(nameVide) && tab[3][3].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[3][3] = ordiPion;
				}
				else{
					tab[1][1] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[3][3].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(nameVide) && tab[0][0].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[0][0] = ordiPion;
				}
				else{
					tab[2][2] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[3][3].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(nameVide) && tab[0][0].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[0][0] = ordiPion;
				}
				else{
					tab[1][1] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[3][3].getClass().getName().equals(ordiStr) && tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(nameVide) && tab[1][1].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[1][1] = ordiPion;
				}
				else{
					tab[2][2] = ordiPion;
				}
				boucle = false;
			}
		}

		//2e diago
		if(boucle){
			if (tab[3][0].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(nameVide) && tab[0][3].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[0][3] = ordiPion;
				}
				else{
					tab[1][2] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[1][2].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(nameVide) && tab[0][3].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[0][3] = ordiPion;
				}
				else{
					tab[3][0] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[3][0].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(nameVide) && tab[0][3].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[0][3] = ordiPion;
				}
				else{
					tab[2][1] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[0][3].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(nameVide) && tab[3][0].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[3][0] = ordiPion;
				}
				else{
					tab[1][2] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[0][3].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(nameVide) && tab[3][0].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[3][0] = ordiPion;
				}
				else{
					tab[2][1] = ordiPion;
				}
				boucle = false;
			}
		}
		if(boucle){
			if (tab[0][3].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(nameVide) && tab[2][1].getClass().getName().equals(nameVide)) {
				if(bool == 0){
					tab[2][1] = ordiPion;
				}
				else{
					tab[1][2] = ordiPion;
				}
				boucle = false;
			}
		}
		return boucle;
	}

	public boolean bloque (boolean boucle, String joueurStr, String nameVide, pion ordiPion){
		int i;

		for(i=0; i<4; i++){
			if(boucle) {
				//largueur complete
				if (tab[0][i].getClass().getName().equals(joueurStr) && tab[1][i].getClass().getName().equals(joueurStr) && tab[3][i].getClass().getName().equals(joueurStr) && tab[2][i].getClass().getName().equals(nameVide)) {
					tab[2][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[0][i].getClass().getName().equals(joueurStr) && tab[2][i].getClass().getName().equals(joueurStr) && tab[3][i].getClass().getName().equals(joueurStr) && tab[1][i].getClass().getName().equals(nameVide)) {
					tab[1][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[2][i].getClass().getName().equals(joueurStr) && tab[1][i].getClass().getName().equals(joueurStr) && tab[3][i].getClass().getName().equals(joueurStr) && tab[0][i].getClass().getName().equals(nameVide)) {
					tab[0][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[0][i].getClass().getName().equals(joueurStr) && tab[1][i].getClass().getName().equals(joueurStr) && tab[2][i].getClass().getName().equals(joueurStr) && tab[3][i].getClass().getName().equals(nameVide)) {
					tab[3][i] = ordiPion;
					boucle = false;
					break;
				}
			}
			if (boucle) {
				//longueur complete
				if (tab[i][0].getClass().getName().equals(joueurStr) && tab[i][1].getClass().getName().equals(joueurStr) && tab[i][3].getClass().getName().equals(joueurStr) && tab[i][2].getClass().getName().equals(nameVide)) {
					tab[i][2] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(joueurStr) && tab[i][2].getClass().getName().equals(joueurStr) && tab[i][3].getClass().getName().equals(joueurStr) && tab[i][1].getClass().getName().equals(nameVide)) {
					tab[i][1] = ordiPion;
					boucle = false;
					break;
				}
				if (tab[i][1].getClass().getName().equals(joueurStr) && tab[i][2].getClass().getName().equals(joueurStr) && tab[i][3].getClass().getName().equals(joueurStr) && tab[i][0].getClass().getName().equals(nameVide)) {
					tab[i][0] = ordiPion;
					boucle = false;
					break;
				}
			}
			if(boucle) {
				if (tab[i][0].getClass().getName().equals(joueurStr) && tab[i][1].getClass().getName().equals(joueurStr) && tab[i][2].getClass().getName().equals(joueurStr) && tab[i][3].getClass().getName().equals(nameVide)) {
					tab[i][3] = ordiPion;
					boucle = false;
					break;
				}
			}
		}
		if (boucle) {
			// diagonale complete
			if (tab[0][0].getClass().getName().equals(joueurStr) && tab[2][2].getClass().getName().equals(joueurStr) && tab[3][3].getClass().getName().equals(joueurStr) && tab[1][1].getClass().getName().equals(nameVide)) {
				tab[1][1] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[1][1].getClass().getName().equals(joueurStr) && tab[2][2].getClass().getName().equals(joueurStr) && tab[3][3].getClass().getName().equals(joueurStr) && tab[0][0].getClass().getName().equals(nameVide)) {
				tab[0][0] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[0][0].getClass().getName().equals(joueurStr) && tab[1][1].getClass().getName().equals(joueurStr) && tab[3][3].getClass().getName().equals(joueurStr) && tab[2][2].getClass().getName().equals(nameVide)) {
				tab[2][2] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[0][0].getClass().getName().equals(joueurStr) && tab[1][1].getClass().getName().equals(joueurStr) && tab[2][2].getClass().getName().equals(joueurStr) && tab[3][3].getClass().getName().equals(nameVide)) {
				tab[3][3] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[0][3].getClass().getName().equals(joueurStr) && tab[3][0].getClass().getName().equals(joueurStr) && tab[1][2].getClass().getName().equals(joueurStr) && tab[2][1].getClass().getName().equals(nameVide)) {
				tab[2][1] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[2][1].getClass().getName().equals(joueurStr) && tab[1][2].getClass().getName().equals(joueurStr) && tab[0][3].getClass().getName().equals(joueurStr) && tab[3][0].getClass().getName().equals(nameVide)) {
				tab[3][0] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[3][0].getClass().getName().equals(joueurStr) && tab[2][1].getClass().getName().equals(joueurStr) && tab[0][3].getClass().getName().equals(joueurStr) && tab[1][2].getClass().getName().equals(nameVide)) {
				tab[1][2] = ordiPion;
				boucle = false;
			}
		}
		if (boucle) {
			if (tab[3][0].getClass().getName().equals(joueurStr) && tab[2][1].getClass().getName().equals(joueurStr) && tab[1][2].getClass().getName().equals(joueurStr) && tab[0][3].getClass().getName().equals(nameVide)) {
				tab[0][3] = ordiPion;
				boucle = false;
			}
		}
    	return boucle;
	}

	public boolean randomPion(boolean boucle, String nameVide, pion ordiPion){
		Random r1 = new Random();
		int n = r1.nextInt(4);
		Random r2 = new Random();
		int m = r2.nextInt(4);

    	while (boucle) {
			if (tab[n][m].getClass().getName().equals(nameVide)) {
				tab[n][m] = ordiPion;
				boucle = false;
				break;
			}
			r1 = new Random();
			n = r1.nextInt(4);
			r2 = new Random();
			m = r2.nextInt(4);
		}

    	return boucle;
	}

    public void ordiPlusEasy (boolean pion){
		vide testVide = new vide();
        String nameVide = testVide.getClass().getName();
        pion ordiPion;
        String ordiStr;
		pion joueurPion;
		String joueurStr;

        if(pion){
        	ordiPion = new rond();
			joueurPion = new croix();
		}	
        else{
			ordiPion = new croix();
			joueurPion = new rond();
		}	
		
		ordiStr = ordiPion.getClass().getName();
		joueurStr = joueurPion.getClass().getName();

		boolean boucle = true;
		
		while(boucle){

				boucle = complete(boucle, ordiStr, nameVide, ordiPion);

			if(boucle){
				boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
			}

			if(boucle){
				boucle = complete2(boucle, ordiStr, nameVide, ordiPion);
			}

			if(boucle){
				boucle = randomPion(boucle, nameVide, ordiPion);
			}
		}
        return;
    }
	
	public void ordiPlusMedium (boolean pion, int tour){
		vide testVide = new vide();
		String nameVide = testVide.getClass().getName();
		pion ordiPion;
		String ordiStr;
		pion joueurPion;
		String joueurStr;

		if(pion){
			ordiPion = new rond();
			joueurPion = new croix();
		}
		else{
			ordiPion = new croix();
			joueurPion = new rond();
		}

		ordiStr = ordiPion.getClass().getName();
		joueurStr = joueurPion.getClass().getName();

		boolean boucle = true;

		while(boucle){

			boucle = complete(boucle, ordiStr, nameVide, ordiPion);

			if(boucle){
				boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
			}

			if(boucle){
				boucle = complete2(boucle, ordiStr, nameVide, ordiPion);
			}

			//TODO

			if(boucle){
				boucle = randomPion(boucle, nameVide, ordiPion);
			}
		}
	}

	public void ordiPlusHard (boolean pion, int tour, boolean start){
		vide testVide = new vide();
		String nameVide = testVide.getClass().getName();
		pion ordiPion;
		String ordiStr;
		pion joueurPion;
		String joueurStr;
		int i, j;

		if(pion){
			ordiPion = new rond();
			joueurPion = new croix();
		}
		else{
			ordiPion = new croix();
			joueurPion = new rond();
		}

		ordiStr = ordiPion.getClass().getName();
		joueurStr = joueurPion.getClass().getName();

		Random r1 = new Random();
		int n = r1.nextInt(2)+1;
		Random r2 = new Random();
		int m = r2.nextInt(2)+1;

		boolean boucle = true;

		while(boucle){

			boucle = complete(boucle, ordiStr, nameVide, ordiPion);

			if(boucle){
				boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
			}

			if(tour == 1){
				tab[n][m] = ordiPion;
				boucle = false;
			}
			if(tour == 3){
				//ordi joue au centre à coté de son premier pion
				//si le joueur joue au centre
				if(tab[1][1].getClass().getName().equals(joueurStr) || tab[1][2].getClass().getName().equals(joueurStr) || tab[2][1].getClass().getName().equals(joueurStr) || tab[2][2].getClass().getName().equals(joueurStr)) {
					while(boucle) {
						if (tab[n][m].getClass().getName().equals(nameVide)) {
							if (tab[n - 1][m].getClass().getName().equals(ordiStr) || tab[n + 1][m].getClass().getName().equals(ordiStr) || tab[n][m - 1].getClass().getName().equals(ordiStr) || tab[n][m + 1].getClass().getName().equals(ordiStr)) {
								tab[n][m] = ordiPion;
								boucle = false;
							}
						}
						r1 = new Random();
						n = r1.nextInt(2) + 1;
						r2 = new Random();
						m = r2.nextInt(2) + 1;
					}
				}
				//sinon, ordi place son pion dans la place central la plus proche du joueur si il peut
				else {
					for (i = 0; i < 4; i++) {
						for (j = 0; j < 4; j++) {
							if (boucle) {
								if (tab[i][j].getClass().getName().equals(joueurStr)) {
										if (i == 0) {
											i = 1;
										}
										if (i == 3) {
											i = 3;
										}
										if (j == 0) {
											j = 0;
										}
										if (j == 3) {
											j = 2;
										}
									if(tab[i][j].getClass().getName().equals(nameVide) && (tab[i - 1][j].getClass().getName().equals(ordiStr) || tab[i + 1][j].getClass().getName().equals(ordiStr) || tab[i][j - 1].getClass().getName().equals(ordiStr) || tab[i][j + 1].getClass().getName().equals(ordiStr))) {
										tab[i][j] = ordiPion;
										boucle = false;
									}
									// si il ne peut pas, il joue dans une autre place central
									else{
										while(boucle) {
											if (tab[n][m].getClass().getName().equals(nameVide)) {
												tab[n][m] = ordiPion;
												boucle = false;
											}
											r1 = new Random();
											n = r1.nextInt(2) + 1;
											r2 = new Random();
											m = r2.nextInt(2) + 1;
										}
									}
								}
							}
						}
					}
				}
			}
			System.out.println("debug 1 : HERE");
			System.out.println("debug 1 : tour = " + tour);
			if(tour == 5){
				System.out.println("debug 2 : HERE");

				//si il reste une place au centre ou non
				if(tab[1][1].getClass().getName().equals(nameVide) || tab[1][2].getClass().getName().equals(nameVide) || tab[2][1].getClass().getName().equals(nameVide) || tab[2][2].getClass().getName().equals(nameVide)){
					System.out.println("debug 3 : HERE");
					if (tab[n][m].getClass().getName().equals(nameVide)) {
						System.out.println("debug 4 : HERE");
						tab[n][m] = ordiPion;
						boucle = false;
					}
					r1 = new Random();
					n = r1.nextInt(2)+1;
					r2 = new Random();
					m = r2.nextInt(2)+1;
				}
				else{
					System.out.println("debug 5 : HERE");
					boucle = complete2(boucle, ordiStr, nameVide, ordiPion);
				}
			}
			if(tour == 7){

			}
			boolean okay1 = false, okay2 = false;
			int k = 0, l = 0, g = 0, h = 0, g2 = 0, h2 = 0, f = 0, e, d, c;

			if(tour == 2){
				for (i = 0; i < 4; i++) {
					for (j = 0; j < 4; j++) {
						if(tab[i][j].getClass().getName().equals(joueurStr)) {
							if (((i == 0) || (i == 3)) && ((j == 0) || (j == 3))) {
								if(i == 0){
									g = 1;
								}
								if(i == 3){
									g = 2;
								}
								if(j == 0){
									h = 1;
								}
								if(j == 3){
									h = 2;
								}
								if(tab[g][h].getClass().getName().equals(nameVide)){
									tab[g][h] = ordiPion;
									boucle = false;
								}
							} else {
								for (g = 1; g < 3; g++) {
									for (h = 1; h < 3; h++) {
										if((g == i) || (h == j)) {
											if (tab[g][h].getClass().getName().equals(nameVide)) {
												tab[g][h] = ordiPion;
												boucle = false;
											}
										}
									}
								}
							}
						}
					}
				}
			}

			if(tour == 4){
				//si deux pion J au centre, last centre
				for (i = 1; i < 3; i++) {
					for (j = 1; j < 3; j++) {
						if(tab[i][j].getClass().getName().equals(joueurStr)){
							if(!okay1){
								okay1 = true;
							}
							else{
								if(!okay2){
									okay2 = true;
								}
							}
						}
					}
				}
				if(okay1 && okay2){
					for (i = 0; i < 4; i++) {
						for (j = 0; j < 4; j++) {
							if(tab[i][j].getClass().getName().equals(nameVide)){
								tab[i][j] = ordiPion;
								boucle = false;
							}
						}
					}
				}
				okay1 = false;
				okay2 = false;
				if(boucle){
					//si un centre J et un bord J alignés, centre bloque
					for (i = 1; i < 3; i++) {
						for (j = 1; j < 3; j++) {
							if(tab[i][j].getClass().getName().equals(joueurStr)){
								if (i == 1) {
									k = 0;
								}
								if (i == 2) {
									k = 3;
								}
								if (j == 1) {
									l = 0;
								}
								if (j == 2) {
									l = 3;
								}
								g = i;
								h = j;
								if(tab[k][j].getClass().getName().equals(joueurStr)){
									okay1 = true;
								}
								if(tab[i][l].getClass().getName().equals(joueurStr)){
									okay2 = true;
								}
							}
						}
					}
					for (i = 1; i < 3; i++) {
						if (okay1){
							if(tab[i][h].getClass().getName().equals(nameVide)){
								tab[i][h] = ordiPion;
								boucle = false;
							}
						}
						if(okay2){
							if(tab[g][i].getClass().getName().equals(nameVide)){
								tab[g][i] = ordiPion;
								boucle = false;
							}
						}
					}
				}
				okay1 = false;
				okay2 = false;

				if(boucle){
					//si 1 bord J et 1 coin J aligné
					for (i = 0; i < 4; i=i+3) {
						for (j = 0; j < 4; j=j+3) {
							if(tab[i][j].getClass().getName().equals(joueurStr)){
								for (f = 1; f < 3; f++) {
									if(tab[i][f].getClass().getName().equals(joueurStr)){
										for (e = 1; e < 3; e++) {
											for (d = 1; d < 3; d++) {
												if(tab[e][d].getClass().getName().equals(ordiStr)){
													for (c = 1; c < 3; c++) {
														if(tab[e][c].getClass().getName().equals(nameVide)){
															tab[e][c] = ordiPion;
															boucle = false;
														}
													}
												}
											}
										}
									}
									if(tab[f][j].getClass().getName().equals(joueurStr)){
										for (e = 1; e < 3; e++) {
											for (d = 1; d < 3; d++) {
												if(tab[e][d].getClass().getName().equals(ordiStr)){
													for (c = 1; c < 3; c++) {
														if(tab[c][d].getClass().getName().equals(nameVide)){
															tab[c][d] = ordiPion;
															boucle = false;
														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if(boucle){
					//si 1 coin J et 1 bord J, lig col coin et bord != lig col centre O
					for (i = 0; i < 4; i=i+3) {
						for (j = 0; j < 4; j=j+3) {
							if(tab[i][j].getClass().getName().equals(joueurStr)){
								for (e = 0; e < 4; e=e+3) {
									for (f = 1; f < 3; f++) {
										if(tab[e][f].getClass().getName().equals(joueurStr)){
											for (c = 1; c < 3; c++) {
												for (d = 1; d < 3; d++) {
													if((c != e) && (c != i) && (d != f) && (d != j)){
														if(tab[c][d].getClass().getName().equals(nameVide)){
															tab[c][d] = ordiPion;
															boucle = false;
														}
													}
												}
											}
										}
										else {
											if (tab[f][e].getClass().getName().equals(joueurStr)) {
												for (c = 1; c < 3; c++) {
													for (d = 1; d < 3; d++) {
														if ((c != f) && (c != i) && (d != e) && (d != j)) {
															if(tab[c][d].getClass().getName().equals(nameVide)){
																tab[c][d] = ordiPion;
																boucle = false;
															}

														}
													}
												}
											}
										}
									}
								}
							}
						}
					}
				}
				if(boucle){
					//si 1 centre O et 1 bord J alignés, centre non aligné avec J si possible consécutif
					for (i = 1; i < 3; i++) {
						for (j = 1; j < 3; j++) {
							if(tab[i][j].getClass().getName().equals(ordiStr)){
								if (i == 1) {
									k = 0;
								}
								if (i == 2) {
									k = 3;
								}
								if (j == 1) {
									l = 0;
								}
								if (j == 2) {
									l = 3;
								}
								g = i;
								h = j;
								if(tab[k][j].getClass().getName().equals(joueurStr)){
									okay1 = true;
									g2 = k;
								}
								if(tab[i][l].getClass().getName().equals(joueurStr)){
									okay2 = true;
									h2 = l;
								}
							}
						}
					}
					for (i = 1; i < 3; i++) {
						for (j = 1; j < 3; j++) {
							if((((i == g+1) || (i == g-1)) && (j == h)) || ((i == g) && ((j == h+1) || (j == h-1)))) {
								if (okay1) {
									if ((i != g2) && (j != h) && tab[i][j].getClass().getName().equals(nameVide)) {
										tab[i][j] = ordiPion;
										boucle = false;
									}
								}
								if (okay2) {
									if ((i != g) && (j != h2) && tab[i][j].getClass().getName().equals(nameVide)) {

										tab[i][j] = ordiPion;
										boucle = false;
									}
								}
							}
						}
					}
					if(boucle){
						//si consécutif pas possible
						for (i = 1; i < 3; i++) {
							for (j = 1; j < 3; j++) {
								if (okay1) {
									if ((i != g2) && (j != h) && tab[i][j].getClass().getName().equals(nameVide)) {
										tab[i][j] = ordiPion;
										boucle = false;
									}
								}
								if (okay2) {
									if ((i != g) && (j != h2) && tab[i][j].getClass().getName().equals(nameVide)) {
										tab[i][j] = ordiPion;
										boucle = false;
									}
								}
							}
						}
					}
				}
				okay1 = false;
				okay2 = false;
				g = 0;
				h = 0;
				g2 = 0;
				h2 = 0;
				if(boucle){
					for (i = 1; i < 3; i++) {
						for (j = 1; j < 3; j++) {
							if(tab[i][j].getClass().getName().equals(nameVide)){
								tab[i][j] = ordiPion;
								boucle = false;
							}
						}
					}
				}
			}

			if(tour == 6){

			}

			//TODO

			if(boucle){
				boucle = complete2(boucle, ordiStr, nameVide, ordiPion);
			}

			if(boucle){
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
					if (ligne > 0 && ligne <= 4)
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
					if (colonne > 0 && colonne <= 4)
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
        char unquatreChar = tab[3][0].getAffichageT();
        String unquatre = String.valueOf(unquatreChar);
        char deuxunChar = tab[0][1].getAffichageT();
        String deuxun = String.valueOf(deuxunChar);
        char deuxdeuxChar = tab[1][1].getAffichageT();
        String deuxdeux = String.valueOf(deuxdeuxChar);
        char deuxtroisChar = tab[2][1].getAffichageT();
        String deuxtrois = String.valueOf(deuxtroisChar);
        char deuxquatreChar = tab[3][1].getAffichageT();
        String deuxquatre = String.valueOf(deuxquatreChar);
        char troisunChar = tab[0][2].getAffichageT();
        String troisun = String.valueOf(troisunChar);
        char troisdeuxChar = tab[1][2].getAffichageT();
        String troisdeux = String.valueOf(troisdeuxChar);
        char troistroisChar = tab[2][2].getAffichageT();
        String troistrois = String.valueOf(troistroisChar);
        char troisquatreChar = tab[3][2].getAffichageT();
        String troisquatre = String.valueOf(troisquatreChar);
        char quatreunChar = tab[0][3].getAffichageT();
        String quatreun = String.valueOf(quatreunChar);
        char quatredeuxChar = tab[1][3].getAffichageT();
        String quatredeux = String.valueOf(quatredeuxChar);
        char quatretroisChar = tab[2][3].getAffichageT();
        String quatretrois = String.valueOf(quatretroisChar);
        char quatrequatreChar = tab[3][3].getAffichageT();
        String quatrequatre = String.valueOf(quatrequatreChar);

        System.out.println("");
        System.out.println("   1 | 2 | 3 | 4");
        System.out.println("");
        System.out.println("1  " + unun + " | " + undeux + " | " + untrois + " | " + unquatre);
        System.out.println("_________________");
        System.out.println("2  " + deuxun + " | " + deuxdeux + " | " + deuxtrois + " | " + deuxquatre);
        System.out.println("_________________");
        System.out.println("3  " + troisun + " | " + troisdeux + " | " + troistrois + " | " + troisquatre);
        System.out.println("_________________");
        System.out.println("4  " + quatreun + " | " + quatredeux + " | " + quatretrois + " | " + quatrequatre);
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
    }

    public void PlusT (boolean pion, char levelGame, int affichage, int nbGame){
		int tempoVict = 0;
		boolean tempoDraw = false;
		int tour = 0;
		boolean start = true;
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
				System.out.println("Erreur start plus switch");
				break;
		}

		if (start) {
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
					System.out.println("Erreur plus affichage switch 1");
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
					System.out.println("Erreur plus insertion switch");
					break;
			}
		}

		while(true){
			tempoVict = checkVictory(pion);
			tempoDraw = checkDraw(pion);

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
					if((tempoVict == 0)) {
									//System.out.println("débug: if tempoVict = 0 ?");
									//System.out.println("débug: checkFull = " + checkFull());
						if (checkFull() || tempoDraw) {
							main.draw();
									//System.out.println("débug: pass draw ?");
							break;
						}
					}
					else{
						System.out.println("erreur tempoVict PlusT");
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
					System.out.println("Erreur plus affichage switch 2");
					break;
			}

			tour++;
			switch(levelGame){
				case 'E':
					ordiPlusEasy(pion);
					break;
				case 'M':
					ordiPlusMedium(pion, tour);
					break;
				case 'H':
					ordiPlusHard(pion, tour, start);
					break;
				default	:
					System.out.println("Erreur level PlusT switch");
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
					System.out.println("Erreur plus affichage switch 3");
					break;
			}
			tempoVict = checkVictory(pion);
			tempoDraw = checkDraw(pion);
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
						if (checkFull() || tempoDraw) {
							main.draw();
									//System.out.println("débug: pass draw ?");
							break;
						}
					}
					else{
						System.out.println("erreur tempoVict PlusT");
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
					System.out.println("Erreur plus insertion switch");
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
					System.out.println("Erreur plus affichage switch 4");
					break;
			}
		}
        return;
    }

    public void plusGame(char levelGame, boolean pion, int affichage, int nbGame){
		initialisation();
		PlusT(pion, levelGame, affichage, nbGame);

				
        return;
    }
}