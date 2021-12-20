import java.lang.*;
import java.util.*;


public class quatreXquatre extends grille{
    public static pion[][] tab = new pion[4][4];

    public quatreXquatre () {
        //this.tab = new pion[4][4];
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

    public void ordiPlusEasy (boolean pion){
		Random r1 = new Random();
        int n = r1.nextInt(4);
		Random r2 = new Random();
        int m = r2.nextInt(4);
		Random r3 = new Random();
		int o = r3.nextInt(4);
		Random r4 = new Random();
		int bool = r4.nextInt(2);
		
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
		
		int i, j, k, l, h;
		boolean boucle = true;
		
		while(boucle){
			for(h=0; h<4; h++){
			if(boucle){
				for(j=0; j<4; j++){
				if(boucle){
					for(i=0; i<4; i++){
					if(boucle){
						for(l=0; l<4; l++) {
						if (boucle) {
							for (k=0; k<4; k++) {
							if(boucle) {
								if((i != j) && (i != k) && (i != l) && (j != k) && (j != l) && (k != l)){
									//bloque l'adversaire si trois pion alignés, ligne
									if(tab[h][i].getClass().getName().equals(joueurStr) && tab[h][j].getClass().getName().equals(joueurStr) && tab[h][l].getClass().getName().equals(joueurStr)) {
										if(tab[h][k].getClass().getName().equals(nameVide)){
											tab[h][k] = ordiPion;
											boucle = false;
											break;
										}
									}
									//bloque l'adversaire colonne
								if(boucle) {
									if(tab[i][h].getClass().getName().equals(joueurStr) && tab[j][h].getClass().getName().equals(joueurStr) && tab[l][h].getClass().getName().equals(joueurStr)) {
										if(tab[k][h].getClass().getName().equals(nameVide)) {
											tab[k][h] = ordiPion;
											boucle = false;
											break;
										}
									}
								}
									//bloque l'adversaire diagonale
								if(boucle){
									if(tab[i][i].getClass().getName().equals(joueurStr)&& tab[j][j].getClass().getName().equals(joueurStr) && tab[k][k].getClass().getName().equals(joueurStr) && tab[l][l].getClass().getName().equals(nameVide)){
										tab[l][l] = ordiPion;
										boucle = false;
										break;
									}
								}
										//ça suffit ? ou ik jl aussi ?
								if(boucle){
									if(tab[i][l].getClass().getName().equals(joueurStr)&& tab[j][k].getClass().getName().equals(joueurStr) && tab[k][j].getClass().getName().equals(joueurStr) && tab[l][i].getClass().getName().equals(nameVide)){
										tab[l][i] = ordiPion;
										boucle = false;
										break;
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
			}
			for(h=0; h<4; h++){
			if(boucle){
				for(j=0; j<4; j++){
				if(boucle){
					for(i=0; i<4; i++){
					if(boucle){
						for(l=0; l<4; l++) {
						if (boucle) {
							for (k=0; k<4; k++) {
							if(boucle) {
								if ((i != j) && (i != k) && (i != l) && (j != k) && (j != l) && (k != l)) {
									// lignes random placement
									if(tab[h][i].getClass().getName().equals(ordiStr) && tab[h][j].getClass().getName().equals(ordiStr)){
										if(tab[h][k].getClass().getName().equals(nameVide) || tab[h][l].getClass().getName().equals(nameVide)){
											/*	if(bool == 1){
													if(tab[h][k].getClass().getName().equals(nameVide)) {
														tab[h][k] = ordiPion;
														boucle = false;
														break;
													}
													else{
														tab[h][l] = ordiPion;
														boucle = false;
														break;
													}
												}
												else{
													if(tab[h][l].getClass().getName().equals(nameVide)){
														tab[h][l] = ordiPion;
														boucle = false;
														break;
													}
													else{
														tab[h][k] = ordiPion;
														boucle = falsz;
														break;
													}
												} */
											while (true) {
												if (tab[h][o].getClass().getName().equals(nameVide)) {
													tab[h][o] = ordiPion;
													boucle = false;
													break;
												}
												r3 = new Random();
												o = r1.nextInt(4);
											}
										}
									}
									if(boucle) {
										// colonnes random placement
									if (tab[i][h].getClass().getName().equals(ordiStr) && tab[j][h].getClass().getName().equals(ordiStr)) {
										if (tab[k][h].getClass().getName().equals(nameVide) || tab[l][h].getClass().getName().equals(nameVide)) {
											while (true) {
												if (tab[o][h].getClass().getName().equals(nameVide)) {
													tab[o][h] = ordiPion;
													boucle = false;
													break;
												}
												r3 = new Random();
												o = r1.nextInt(4);
											}
										}
									}
									}
										//diagonale random placement
									if(boucle) {
									if (tab[i][i].getClass().getName().equals(ordiStr) && tab[j][j].getClass().getName().equals(ordiStr)) {
										if (tab[k][k].getClass().getName().equals(nameVide) || tab[l][l].getClass().getName().equals(nameVide)) {
											while (true) {
												if (tab[o][o].getClass().getName().equals(nameVide)) {
													tab[o][o] = ordiPion;
													boucle = false;
													break;
												}
												r3 = new Random();
												o = r1.nextInt(4);
											}
										}
									}
									}
									if(boucle){
										if (tab[i][l].getClass().getName().equals(ordiStr) && tab[j][k].getClass().getName().equals(ordiStr)) {
											if (tab[k][j].getClass().getName().equals(nameVide) || tab[l][i].getClass().getName().equals(nameVide)) {
												if(bool == 1){
													if(tab[k][j].getClass().getName().equals(nameVide)){
														tab[k][j] = ordiPion;
														boucle = false;
														break;
													}
													else{
														tab[l][i] = ordiPion;
														boucle = false;
														break;
													}
												}
												else{
													if(tab[l][j].getClass().getName().equals(nameVide)){
														tab[l][j] = ordiPion;
														boucle = false;
														break;
													}
													else{
														tab[k][i] = ordiPion;
														boucle = false;
														break;
													}
												}
											}
										}
									}
									if(boucle){
										if (tab[i][l].getClass().getName().equals(ordiStr) && tab[l][i].getClass().getName().equals(ordiStr)) {
											if (tab[k][j].getClass().getName().equals(nameVide) || tab[j][k].getClass().getName().equals(nameVide)) {
												if(bool == 1){
													if(tab[k][j].getClass().getName().equals(nameVide)){
														tab[k][j] = ordiPion;
														boucle = false;
														break;
													}
													else{
														tab[j][k] = ordiPion;
														boucle = false;
														break;
													}
												}
												else{
													if(tab[j][k].getClass().getName().equals(nameVide)){
														tab[j][k] = ordiPion;
														boucle = false;
														break;
													}
													else{
														tab[k][j] = ordiPion;
														boucle = false;
														break;
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
				}
				}
			}
		}

											/*
											if((i != j) && (i != l) && (j != l)){
													//bloque l'adversaire si trois pion alignés, ligne
												if(tab[k][i].getClass().getName().equals(joueurStr) && tab[k][j].getClass().getName().equals(joueurStr) && tab[k][l].getClass().getName().equals(joueurStr)) {
													while (true) {
														if (tab[k][o].getClass().getName().equals(nameVide)) {
															tab[k][o] = ordiPion;
															boucle = false;
															break;
														}
														r3 = new Random();
														o = r1.nextInt(4);
													}
												}

											}
										}
									}
									if(i != j){
											// lignes (colonnes?) random placement
										if(tab[k][i].getClass().getName().equals(ordiStr) && tab[k][j].getClass().getName().equals(ordiStr)){
											while(true){
												if (tab[k][o].getClass().getName().equals(nameVide)) {
													tab[k][o] = ordiPion;
													boucle = false;
													break;
												}
												r3 = new Random();
												o = r1.nextInt(4);
											}
										}
											//colonnes (lignes?) random placement
										if(boucle){
											if(tab[i][k].getClass().getName().equals(ordiStr) && tab[j][k].getClass().getName().equals(ordiStr)){
												while(true){
													if (tab[o][k].getClass().getName().equals(nameVide)) {
														tab[o][k] = ordiPion;
														boucle = false;
														break;
													}
													r3 = new Random();
													o = r1.nextInt(4);
												}
											}
										}
											//diagonales random placement
										if(boucle){
											if(tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr)
											|| tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
											|| tab[0][0].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
											|| tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
											|| tab[1][1].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
											|| tab[2][2].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)){
												while(true){
													if (tab[o][o].getClass().getName().equals(nameVide)) {
													tab[o][o] = ordiPion;
													boucle = false;
													break;
													}
												r3 = new Random();
												o = r1.nextInt(4);
												}
											}												
										}
										if(boucle){
											if(tab[0][3].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr)
											|| tab[0][3].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr)
											|| tab[0][3].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr)
											|| tab[1][2].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr)
											|| tab[1][2].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr)
											|| tab[2][1].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr)){
												while(true){
													if(bool == 1)
														if (tab[o][3-o].getClass().getName().equals(nameVide)) {
															tab[o][3-o] = ordiPion;												// fonctionne ?
															boucle = false;
															break;
														}
													else
														if (tab[3-o][o].getClass().getName().equals(nameVide)) {
															tab[3-o][o] = ordiPion;												// fonctionne ?
															boucle = false;
															break;
														}
												r3 = new Random();
												o = r1.nextInt(4);
												}
											}
										}
											//par défaut
										if(boucle){
											while (true) {
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
										}
						
									}
								}
							}
						}							
					}
				}
			}
			System.out.println("Erreur ????? 4x4  # putain de boucle #");
			
		}
		*/
		/*
		if(){
			//if else imbriqué; les indentations 'revu' dans un effort de lisibilité
			// for ?
			
						//lignes (colonnes ?)
			
			if(tab[0][0].getClass().getName().equals(ordiStr) && tab[0][1].getClass().getName().equals(ordiStr)
			|| tab[0][0].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(ordiStr)
			|| tab[0][0].getClass().getName().equals(ordiStr) && tab[0][3].getClass().getName().equals(ordiStr)
			|| tab[0][1].getClass().getName().equals(ordiStr) && tab[0][2].getClass().getName().equals(ordiStr)
			|| tab[0][1].getClass().getName().equals(ordiStr) && tab[0][3].getClass().getName().equals(ordiStr)
			|| tab[0][2].getClass().getName().equals(ordiStr) && tab[0][3].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[0][o].getClass().getName().equals(nameVide)) {
						tab[0][o] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}
			else
			if(tab[1][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr)
			|| tab[1][0].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr)
			|| tab[1][0].getClass().getName().equals(ordiStr) && tab[1][3].getClass().getName().equals(ordiStr)
			|| tab[1][1].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr)
			|| tab[1][1].getClass().getName().equals(ordiStr) && tab[1][3].getClass().getName().equals(ordiStr)
			|| tab[1][2].getClass().getName().equals(ordiStr) && tab[1][3].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[1][o].getClass().getName().equals(nameVide)) {
						tab[1][o] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}	
			else
			if(tab[2][0].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr)
			|| tab[2][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
			|| tab[2][0].getClass().getName().equals(ordiStr) && tab[2][3].getClass().getName().equals(ordiStr)
			|| tab[2][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
			|| tab[2][1].getClass().getName().equals(ordiStr) && tab[2][3].getClass().getName().equals(ordiStr)
			|| tab[2][2].getClass().getName().equals(ordiStr) && tab[2][3].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[2][o].getClass().getName().equals(nameVide)) {
						tab[2][o] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}	
			else
			if(tab[3][0].getClass().getName().equals(ordiStr) && tab[3][1].getClass().getName().equals(ordiStr)
			|| tab[3][0].getClass().getName().equals(ordiStr) && tab[3][2].getClass().getName().equals(ordiStr)
			|| tab[3][0].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
			|| tab[3][1].getClass().getName().equals(ordiStr) && tab[3][2].getClass().getName().equals(ordiStr)
			|| tab[3][1].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
			|| tab[3][2].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[3][o].getClass().getName().equals(nameVide)) {
						tab[3][o] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}	
						//colonnes (lignes ?)

			else
			if(tab[0][0].getClass().getName().equals(ordiStr) && tab[1][0].getClass().getName().equals(ordiStr)
			|| tab[0][0].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(ordiStr)
			|| tab[0][0].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr)
			|| tab[1][0].getClass().getName().equals(ordiStr) && tab[2][0].getClass().getName().equals(ordiStr)
			|| tab[1][0].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr)
			|| tab[2][0].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[o][0].getClass().getName().equals(nameVide)) {
						tab[o][0] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}	
			else
			if(tab[0][1].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr)
			|| tab[0][1].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr)
			|| tab[0][1].getClass().getName().equals(ordiStr) && tab[3][1].getClass().getName().equals(ordiStr)
			|| tab[1][1].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr)
			|| tab[1][1].getClass().getName().equals(ordiStr) && tab[3][1].getClass().getName().equals(ordiStr)
			|| tab[2][1].getClass().getName().equals(ordiStr) && tab[3][1].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[o][1].getClass().getName().equals(nameVide)) {
						tab[o][1] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}	
			else
			if(tab[0][2].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr)
			|| tab[0][2].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
			|| tab[0][2].getClass().getName().equals(ordiStr) && tab[3][2].getClass().getName().equals(ordiStr)
			|| tab[1][2].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
			|| tab[1][2].getClass().getName().equals(ordiStr) && tab[3][2].getClass().getName().equals(ordiStr)
			|| tab[2][2].getClass().getName().equals(ordiStr) && tab[3][2].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[o][2].getClass().getName().equals(nameVide)) {
						tab[o][2] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}	
			else
			if(tab[0][3].getClass().getName().equals(ordiStr) && tab[1][3].getClass().getName().equals(ordiStr)
			|| tab[0][3].getClass().getName().equals(ordiStr) && tab[2][3].getClass().getName().equals(ordiStr)
			|| tab[0][3].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
			|| tab[1][3].getClass().getName().equals(ordiStr) && tab[2][3].getClass().getName().equals(ordiStr)
			|| tab[1][3].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
			|| tab[2][3].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[o][3].getClass().getName().equals(nameVide)) {
						tab[o][3] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}
				
						//diagonales
			else
			if(tab[0][0].getClass().getName().equals(ordiStr) && tab[1][1].getClass().getName().equals(ordiStr)
			|| tab[0][0].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
			|| tab[0][0].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
			|| tab[1][1].getClass().getName().equals(ordiStr) && tab[2][2].getClass().getName().equals(ordiStr)
			|| tab[1][1].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr)
			|| tab[2][2].getClass().getName().equals(ordiStr) && tab[3][3].getClass().getName().equals(ordiStr))
				while(true){
					if (tab[o][o].getClass().getName().equals(nameVide)) {
						tab[o][o] = ordiPion;
						break;
					}
				r3 = new Random();
				o = r1.nextInt(4);
				}	
			else
			if(tab[0][3].getClass().getName().equals(ordiStr) && tab[1][2].getClass().getName().equals(ordiStr)
			|| tab[0][3].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr)
			|| tab[0][3].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr)
			|| tab[1][2].getClass().getName().equals(ordiStr) && tab[2][1].getClass().getName().equals(ordiStr)
			|| tab[1][2].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr)
			|| tab[2][1].getClass().getName().equals(ordiStr) && tab[3][0].getClass().getName().equals(ordiStr))
				while(true){
					if(bool == 1)
						if (tab[o][3-o].getClass().getName().equals(nameVide)) {
							tab[o][3-o] = ordiPion;												// fonctionne ?
							break;
						}
					else
						if (tab[3-o][o].getClass().getName().equals(nameVide)) {
							tab[3-o][o] = ordiPion;												// fonctionne ?
							break;
						}
				r3 = new Random();
				o = r1.nextInt(4);
				}			
			
			//fin de l'indentation foirée
		}
		else{
			while (true) {
				if (tab[n][m].getClass().getName().equals(nameVide)) {
					tab[n][m] = ordiPion;
					break;
				}
				r1 = new Random();
				n = r1.nextInt(4);
				r2 = new Random();
				m = r2.nextInt(4);
			}

		 */
		}

        return;
    }
	
	public void ordiPlusMedium (boolean pion){
		//TODO 1- si trois ordiP termine; 2- si trois JouP bloque; 3- si deux ordi complète ?
		

			
	}

	public void ordiPlusHard (boolean pion){
		//TODO
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
                if (ligne > 0 && ligne <= 4)
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
                if (colonne > 0 && colonne <= 4)
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

    public void initialisation (){
        int i, j;
        for(i=0; i < tab.length; i++)
            for(j=0; j < tab.length; j++)
                tab[i][j] = new vide();
    }

    public void PlusT (boolean pion, char levelGame){
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
						System.out.println("erreur tempoVict PlusT");
						break;
					}
				}
			}
			affichageTerminal();
			
			switch(levelGame){
				case 'E':
					ordiPlusEasy(pion);
					break;
				case 'M':
					ordiPlusMedium(pion);
					break;
				case 'H':
					ordiPlusHard(pion);
					break;
				default	:
					System.out.println("Erreur level PlusT switch");
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
						System.out.println("erreur tempoVict PlusT");
						break;
					}
				}
			}
			insertionJoueur(pion);
			affichageTerminal();
		}
        return;
    }

    public void plusGame(char levelGame, boolean pion, int affichage){
		initialisation();
		
			switch(affichage){
				case 0:
					PlusT(pion, levelGame);
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				default	:
					System.out.println("Erreur plus affichage switch");
					break;
			}
				
        return;
    }
}