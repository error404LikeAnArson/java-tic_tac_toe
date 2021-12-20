import java.lang.*;
import java.util.*;


public class troisXtroisXtrois extends grille{
    public static pion[][][] tab = new pion[3][3][3];

    public troisXtroisXtrois () {
        //this.tab = new pion[3][3][3];
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
        String[][][] tabTempo = new String[3][3][3];

        int i, j, k;
        for (i=0; i<tab.length; i++)
            for (j=0; j<tab.length; j++)
                for (k=0; k<tab.length; k++)
                tabTempo[i][j][k] = tab[i][j][k].getClass().getName();

        if(		   (tabTempo[0][0][0].equals(joueurStr) && tabTempo[0][1][0].equals(joueurStr) && tabTempo[0][2][0].equals(joueurStr))
                || (tabTempo[1][0][0].equals(joueurStr) && tabTempo[1][1][0].equals(joueurStr) && tabTempo[1][2][0].equals(joueurStr))
                || (tabTempo[2][0][0].equals(joueurStr) && tabTempo[2][1][0].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
                || (tabTempo[0][0][0].equals(joueurStr) && tabTempo[1][0][0].equals(joueurStr) && tabTempo[2][0][0].equals(joueurStr))
                || (tabTempo[0][1][0].equals(joueurStr) && tabTempo[1][1][0].equals(joueurStr) && tabTempo[2][1][0].equals(joueurStr))
                || (tabTempo[0][2][0].equals(joueurStr) && tabTempo[1][2][0].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
                || (tabTempo[0][0][0].equals(joueurStr) && tabTempo[1][1][0].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
                || (tabTempo[0][2][0].equals(joueurStr) && tabTempo[1][1][0].equals(joueurStr) && tabTempo[2][0][0].equals(joueurStr))

                || (tabTempo[0][0][1].equals(joueurStr) && tabTempo[0][1][1].equals(joueurStr) && tabTempo[0][2][1].equals(joueurStr))
                || (tabTempo[1][0][1].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr))
                || (tabTempo[2][0][1].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr) && tabTempo[2][2][1].equals(joueurStr))
                || (tabTempo[0][0][1].equals(joueurStr) && tabTempo[1][0][1].equals(joueurStr) && tabTempo[2][0][1].equals(joueurStr))
                || (tabTempo[0][1][1].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr))
                || (tabTempo[0][2][1].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr) && tabTempo[2][2][1].equals(joueurStr))
                || (tabTempo[0][0][1].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][2][1].equals(joueurStr))
                || (tabTempo[0][2][1].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][0][1].equals(joueurStr))

                || (tabTempo[0][0][2].equals(joueurStr) && tabTempo[0][1][2].equals(joueurStr) && tabTempo[0][2][2].equals(joueurStr))
                || (tabTempo[1][0][2].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr) && tabTempo[1][2][2].equals(joueurStr))
                || (tabTempo[2][0][2].equals(joueurStr) && tabTempo[2][1][2].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[0][0][2].equals(joueurStr) && tabTempo[1][0][2].equals(joueurStr) && tabTempo[2][0][2].equals(joueurStr))
                || (tabTempo[0][1][2].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr) && tabTempo[2][1][2].equals(joueurStr))
                || (tabTempo[0][2][2].equals(joueurStr) && tabTempo[1][2][2].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[0][0][2].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[0][2][2].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr) && tabTempo[2][0][2].equals(joueurStr))
				
				
				|| (tabTempo[0][0][0].equals(joueurStr) && tabTempo[0][0][1].equals(joueurStr) && tabTempo[0][0][2].equals(joueurStr))
                || (tabTempo[1][0][0].equals(joueurStr) && tabTempo[1][0][1].equals(joueurStr) && tabTempo[1][0][2].equals(joueurStr))
                || (tabTempo[2][0][0].equals(joueurStr) && tabTempo[2][0][1].equals(joueurStr) && tabTempo[2][0][2].equals(joueurStr))
                || (tabTempo[0][0][0].equals(joueurStr) && tabTempo[1][0][0].equals(joueurStr) && tabTempo[2][0][0].equals(joueurStr))
                || (tabTempo[0][0][1].equals(joueurStr) && tabTempo[1][0][1].equals(joueurStr) && tabTempo[2][0][1].equals(joueurStr))
                || (tabTempo[0][0][2].equals(joueurStr) && tabTempo[1][0][2].equals(joueurStr) && tabTempo[2][0][2].equals(joueurStr))
                || (tabTempo[0][0][0].equals(joueurStr) && tabTempo[1][0][1].equals(joueurStr) && tabTempo[2][0][2].equals(joueurStr))
                || (tabTempo[0][0][2].equals(joueurStr) && tabTempo[1][0][1].equals(joueurStr) && tabTempo[2][0][0].equals(joueurStr))

                || (tabTempo[0][1][0].equals(joueurStr) && tabTempo[0][1][1].equals(joueurStr) && tabTempo[0][1][2].equals(joueurStr))
                || (tabTempo[1][1][0].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr))
                || (tabTempo[2][1][0].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr) && tabTempo[2][1][2].equals(joueurStr))
                || (tabTempo[0][1][0].equals(joueurStr) && tabTempo[1][1][0].equals(joueurStr) && tabTempo[2][1][0].equals(joueurStr))
                || (tabTempo[0][1][1].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr))
                || (tabTempo[0][1][2].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr) && tabTempo[2][1][2].equals(joueurStr))
                || (tabTempo[0][1][0].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][1][2].equals(joueurStr))
                || (tabTempo[0][1][2].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][1][0].equals(joueurStr))

                || (tabTempo[0][2][0].equals(joueurStr) && tabTempo[0][2][1].equals(joueurStr) && tabTempo[0][2][2].equals(joueurStr))
                || (tabTempo[1][2][0].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr) && tabTempo[1][2][2].equals(joueurStr))
                || (tabTempo[2][2][0].equals(joueurStr) && tabTempo[2][2][1].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[0][2][0].equals(joueurStr) && tabTempo[1][2][0].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
                || (tabTempo[0][2][1].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr) && tabTempo[2][2][1].equals(joueurStr))
                || (tabTempo[0][2][2].equals(joueurStr) && tabTempo[1][2][2].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[0][2][0].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[0][2][2].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
				
				
				|| (tabTempo[0][0][0].equals(joueurStr) && tabTempo[0][0][1].equals(joueurStr) && tabTempo[0][0][2].equals(joueurStr))
                || (tabTempo[0][1][0].equals(joueurStr) && tabTempo[0][1][1].equals(joueurStr) && tabTempo[0][1][2].equals(joueurStr))
                || (tabTempo[0][2][0].equals(joueurStr) && tabTempo[0][2][1].equals(joueurStr) && tabTempo[0][2][2].equals(joueurStr))
                || (tabTempo[0][0][0].equals(joueurStr) && tabTempo[0][1][0].equals(joueurStr) && tabTempo[0][2][0].equals(joueurStr))
                || (tabTempo[0][0][1].equals(joueurStr) && tabTempo[0][1][1].equals(joueurStr) && tabTempo[0][2][1].equals(joueurStr))
                || (tabTempo[0][0][2].equals(joueurStr) && tabTempo[0][1][2].equals(joueurStr) && tabTempo[0][2][2].equals(joueurStr))
                || (tabTempo[0][0][0].equals(joueurStr) && tabTempo[0][1][1].equals(joueurStr) && tabTempo[0][2][2].equals(joueurStr))
                || (tabTempo[0][0][2].equals(joueurStr) && tabTempo[0][1][1].equals(joueurStr) && tabTempo[0][2][0].equals(joueurStr))

                || (tabTempo[1][0][0].equals(joueurStr) && tabTempo[1][0][1].equals(joueurStr) && tabTempo[1][0][2].equals(joueurStr))
                || (tabTempo[1][1][0].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr))
                || (tabTempo[1][2][0].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr) && tabTempo[1][2][2].equals(joueurStr))
                || (tabTempo[1][0][0].equals(joueurStr) && tabTempo[1][1][0].equals(joueurStr) && tabTempo[1][2][0].equals(joueurStr))
                || (tabTempo[1][0][1].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[1][2][1].equals(joueurStr))
                || (tabTempo[1][0][2].equals(joueurStr) && tabTempo[1][1][2].equals(joueurStr) && tabTempo[1][2][2].equals(joueurStr))
                || (tabTempo[1][0][0].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[1][2][2].equals(joueurStr))
                || (tabTempo[1][0][2].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[1][2][0].equals(joueurStr))

                || (tabTempo[2][0][0].equals(joueurStr) && tabTempo[2][0][1].equals(joueurStr) && tabTempo[2][0][2].equals(joueurStr))
                || (tabTempo[2][1][0].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr) && tabTempo[2][1][2].equals(joueurStr))
                || (tabTempo[2][2][0].equals(joueurStr) && tabTempo[2][2][1].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[2][0][0].equals(joueurStr) && tabTempo[2][1][0].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
                || (tabTempo[2][0][1].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr) && tabTempo[2][2][1].equals(joueurStr))
                || (tabTempo[2][0][2].equals(joueurStr) && tabTempo[2][1][2].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[2][0][0].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
                || (tabTempo[2][0][2].equals(joueurStr) && tabTempo[2][1][1].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
				
				
				|| (tabTempo[0][0][0].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][2][2].equals(joueurStr))
				|| (tabTempo[0][0][2].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][2][0].equals(joueurStr))
				|| (tabTempo[0][2][2].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][0][0].equals(joueurStr))
				|| (tabTempo[0][2][0].equals(joueurStr) && tabTempo[1][1][1].equals(joueurStr) && tabTempo[2][0][2].equals(joueurStr))
				
                ) victory = 1;
			
			
        if(		   (tabTempo[0][0][0].equals(ordiStr) && tabTempo[0][1][0].equals(ordiStr) && tabTempo[0][2][0].equals(ordiStr))
                || (tabTempo[1][0][0].equals(ordiStr) && tabTempo[1][1][0].equals(ordiStr) && tabTempo[1][2][0].equals(ordiStr))
                || (tabTempo[2][0][0].equals(ordiStr) && tabTempo[2][1][0].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
                || (tabTempo[0][0][0].equals(ordiStr) && tabTempo[1][0][0].equals(ordiStr) && tabTempo[2][0][0].equals(ordiStr))
                || (tabTempo[0][1][0].equals(ordiStr) && tabTempo[1][1][0].equals(ordiStr) && tabTempo[2][1][0].equals(ordiStr))
                || (tabTempo[0][2][0].equals(ordiStr) && tabTempo[1][2][0].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
                || (tabTempo[0][0][0].equals(ordiStr) && tabTempo[1][1][0].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
                || (tabTempo[0][2][0].equals(ordiStr) && tabTempo[1][1][0].equals(ordiStr) && tabTempo[2][0][0].equals(ordiStr))

                || (tabTempo[0][0][1].equals(ordiStr) && tabTempo[0][1][1].equals(ordiStr) && tabTempo[0][2][1].equals(ordiStr))
                || (tabTempo[1][0][1].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr))
                || (tabTempo[2][0][1].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr) && tabTempo[2][2][1].equals(ordiStr))
                || (tabTempo[0][0][1].equals(ordiStr) && tabTempo[1][0][1].equals(ordiStr) && tabTempo[2][0][1].equals(ordiStr))
                || (tabTempo[0][1][1].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr))
                || (tabTempo[0][2][1].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr) && tabTempo[2][2][1].equals(ordiStr))
                || (tabTempo[0][0][1].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][2][1].equals(ordiStr))
                || (tabTempo[0][2][1].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][0][1].equals(ordiStr))

                || (tabTempo[0][0][2].equals(ordiStr) && tabTempo[0][1][2].equals(ordiStr) && tabTempo[0][2][2].equals(ordiStr))
                || (tabTempo[1][0][2].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr) && tabTempo[1][2][2].equals(ordiStr))
                || (tabTempo[2][0][2].equals(ordiStr) && tabTempo[2][1][2].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[0][0][2].equals(ordiStr) && tabTempo[1][0][2].equals(ordiStr) && tabTempo[2][0][2].equals(ordiStr))
                || (tabTempo[0][1][2].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr) && tabTempo[2][1][2].equals(ordiStr))
                || (tabTempo[0][2][2].equals(ordiStr) && tabTempo[1][2][2].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[0][0][2].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[0][2][2].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr) && tabTempo[2][0][2].equals(ordiStr))

                || (tabTempo[0][0][0].equals(ordiStr) && tabTempo[0][0][1].equals(ordiStr) && tabTempo[0][0][2].equals(ordiStr))
                || (tabTempo[1][0][0].equals(ordiStr) && tabTempo[1][0][1].equals(ordiStr) && tabTempo[1][0][2].equals(ordiStr))
                || (tabTempo[2][0][0].equals(ordiStr) && tabTempo[2][0][1].equals(ordiStr) && tabTempo[2][0][2].equals(ordiStr))
                || (tabTempo[0][0][0].equals(ordiStr) && tabTempo[1][0][0].equals(ordiStr) && tabTempo[2][0][0].equals(ordiStr))
                || (tabTempo[0][0][1].equals(ordiStr) && tabTempo[1][0][1].equals(ordiStr) && tabTempo[2][0][1].equals(ordiStr))
                || (tabTempo[0][0][2].equals(ordiStr) && tabTempo[1][0][2].equals(ordiStr) && tabTempo[2][0][2].equals(ordiStr))
                || (tabTempo[0][0][0].equals(ordiStr) && tabTempo[1][0][1].equals(ordiStr) && tabTempo[2][0][2].equals(ordiStr))
                || (tabTempo[0][0][2].equals(ordiStr) && tabTempo[1][0][1].equals(ordiStr) && tabTempo[2][0][0].equals(ordiStr))

                || (tabTempo[0][1][0].equals(ordiStr) && tabTempo[0][1][1].equals(ordiStr) && tabTempo[0][1][2].equals(ordiStr))
                || (tabTempo[1][1][0].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr))
                || (tabTempo[2][1][0].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr) && tabTempo[2][1][2].equals(ordiStr))
                || (tabTempo[0][1][0].equals(ordiStr) && tabTempo[1][1][0].equals(ordiStr) && tabTempo[2][1][0].equals(ordiStr))
                || (tabTempo[0][1][1].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr))
                || (tabTempo[0][1][2].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr) && tabTempo[2][1][2].equals(ordiStr))
                || (tabTempo[0][1][0].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][1][2].equals(ordiStr))
                || (tabTempo[0][1][2].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][1][0].equals(ordiStr))

                || (tabTempo[0][2][0].equals(ordiStr) && tabTempo[0][2][1].equals(ordiStr) && tabTempo[0][2][2].equals(ordiStr))
                || (tabTempo[1][2][0].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr) && tabTempo[1][2][2].equals(ordiStr))
                || (tabTempo[2][2][0].equals(ordiStr) && tabTempo[2][2][1].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[0][2][0].equals(ordiStr) && tabTempo[1][2][0].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
                || (tabTempo[0][2][1].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr) && tabTempo[2][2][1].equals(ordiStr))
                || (tabTempo[0][2][2].equals(ordiStr) && tabTempo[1][2][2].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[0][2][0].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[0][2][2].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
				
				
				|| (tabTempo[0][0][0].equals(ordiStr) && tabTempo[0][0][1].equals(ordiStr) && tabTempo[0][0][2].equals(ordiStr))
                || (tabTempo[0][1][0].equals(ordiStr) && tabTempo[0][1][1].equals(ordiStr) && tabTempo[0][1][2].equals(ordiStr))
                || (tabTempo[0][2][0].equals(ordiStr) && tabTempo[0][2][1].equals(ordiStr) && tabTempo[0][2][2].equals(ordiStr))
                || (tabTempo[0][0][0].equals(ordiStr) && tabTempo[0][1][0].equals(ordiStr) && tabTempo[0][2][0].equals(ordiStr))
                || (tabTempo[0][0][1].equals(ordiStr) && tabTempo[0][1][1].equals(ordiStr) && tabTempo[0][2][1].equals(ordiStr))
                || (tabTempo[0][0][2].equals(ordiStr) && tabTempo[0][1][2].equals(ordiStr) && tabTempo[0][2][2].equals(ordiStr))
                || (tabTempo[0][0][0].equals(ordiStr) && tabTempo[0][1][1].equals(ordiStr) && tabTempo[0][2][2].equals(ordiStr))
                || (tabTempo[0][0][2].equals(ordiStr) && tabTempo[0][1][1].equals(ordiStr) && tabTempo[0][2][0].equals(ordiStr))

                || (tabTempo[1][0][0].equals(ordiStr) && tabTempo[1][0][1].equals(ordiStr) && tabTempo[1][0][2].equals(ordiStr))
                || (tabTempo[1][1][0].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr))
                || (tabTempo[1][2][0].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr) && tabTempo[1][2][2].equals(ordiStr))
                || (tabTempo[1][0][0].equals(ordiStr) && tabTempo[1][1][0].equals(ordiStr) && tabTempo[1][2][0].equals(ordiStr))
                || (tabTempo[1][0][1].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[1][2][1].equals(ordiStr))
                || (tabTempo[1][0][2].equals(ordiStr) && tabTempo[1][1][2].equals(ordiStr) && tabTempo[1][2][2].equals(ordiStr))
                || (tabTempo[1][0][0].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[1][2][2].equals(ordiStr))
                || (tabTempo[1][0][2].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[1][2][0].equals(ordiStr))

                || (tabTempo[2][0][0].equals(ordiStr) && tabTempo[2][0][1].equals(ordiStr) && tabTempo[2][0][2].equals(ordiStr))
                || (tabTempo[2][1][0].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr) && tabTempo[2][1][2].equals(ordiStr))
                || (tabTempo[2][2][0].equals(ordiStr) && tabTempo[2][2][1].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[2][0][0].equals(ordiStr) && tabTempo[2][1][0].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
                || (tabTempo[2][0][1].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr) && tabTempo[2][2][1].equals(ordiStr))
                || (tabTempo[2][0][2].equals(ordiStr) && tabTempo[2][1][2].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[2][0][0].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
                || (tabTempo[2][0][2].equals(ordiStr) && tabTempo[2][1][1].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
				
				
				|| (tabTempo[0][0][0].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][2][2].equals(ordiStr))
				|| (tabTempo[0][0][2].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][2][0].equals(ordiStr))
				|| (tabTempo[0][2][2].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][0][0].equals(ordiStr))
				|| (tabTempo[0][2][0].equals(ordiStr) && tabTempo[1][1][1].equals(ordiStr) && tabTempo[2][0][2].equals(ordiStr))
				
                ) victory = 2;

        return victory;		// 0=match nul; 1=victoire joueur; 2=victoire ordi
    }

    public boolean checkFull (){
        boolean full = true;
        int i, j, k;
        vide testVide = new vide();
        for (i=0; i<3; i++)
            for (j=0; j<3; j++)
                for (k=0; k<3; k++)
                    if (tab[i][j][k].getClass().getName().equals(testVide.getClass().getName()))
                        full = false;
        return full;		// full=true == grille pleine
    }

    public void ordiExtraEasy (boolean pion){
		Random r1 = new Random();
        int n = r1.nextInt(3);
		Random r2 = new Random();
        int m = r2.nextInt(3);
		Random r3 = new Random();
        int o = r3.nextInt(3);
        vide testVide = new vide();
        String nameVide = testVide.getClass().getName();
        pion ordiPion;
        String ordiStr;

        if(pion)
        	ordiPion = new rond();
        else
			ordiPion = new croix();

		ordiStr = ordiPion.getClass().getName();

			//if else imbriqué; les indentations 'revu' dans un effort de lisibilité


		int i, j, k, l;
		boolean boucle = true;
		
		while(boucle){					//verifier la sortie
			for(i=0; i<3; i++){
				for(j=0; j<3; j++){
				    		//largueur
					if(boucle) {

                        if (tab[0][j][i].getClass().getName().equals(ordiStr) && tab[1][j][i].getClass().getName().equals(ordiStr) && tab[2][j][i].getClass().getName().equals(nameVide)) {
                            tab[2][j][i] = ordiPion;
                            boucle = false;
                            break;
                        }
                        if (tab[0][j][i].getClass().getName().equals(ordiStr) && tab[2][j][i].getClass().getName().equals(ordiStr) && tab[1][j][i].getClass().getName().equals(nameVide)) {
                            tab[1][j][i] = ordiPion;
                            boucle = false;
                            break;
                        }
                        if (tab[2][j][i].getClass().getName().equals(ordiStr) && tab[1][j][i].getClass().getName().equals(ordiStr) && tab[0][j][i].getClass().getName().equals(nameVide)) {
                            tab[0][j][i] = ordiPion;
                            boucle = false;
                            break;
                        }
                    }
					if(boucle) {
                        //longueur
                        if (tab[j][0][i].getClass().getName().equals(ordiStr) && tab[j][1][i].getClass().getName().equals(ordiStr) && tab[j][2][i].getClass().getName().equals(nameVide)) {
                            tab[j][2][i] = ordiPion;
                            boucle = false;
                            break;
                        }
                        if (tab[j][0][i].getClass().getName().equals(ordiStr) && tab[j][2][i].getClass().getName().equals(ordiStr) && tab[j][1][i].getClass().getName().equals(nameVide)) {
                            tab[j][1][i] = ordiPion;
                            boucle = false;
                            break;
                        }
                        if (tab[j][1][i].getClass().getName().equals(ordiStr) && tab[j][2][i].getClass().getName().equals(ordiStr) && tab[j][0][i].getClass().getName().equals(nameVide)) {
                            tab[j][0][i] = ordiPion;
                            boucle = false;
                            break;
                        }
                    }
					if(boucle) {
                        //hauteur
                        if (tab[j][i][0].getClass().getName().equals(ordiStr) && tab[j][i][1].getClass().getName().equals(ordiStr) && tab[j][i][2].getClass().getName().equals(nameVide)) {
                            tab[j][i][2] = ordiPion;
                            boucle = false;
                            break;
                        }
                        if (tab[j][i][0].getClass().getName().equals(ordiStr) && tab[j][i][2].getClass().getName().equals(ordiStr) && tab[j][i][1].getClass().getName().equals(nameVide)) {
                            tab[j][i][1] = ordiPion;
                            boucle = false;
                            break;
                        }
                        if (tab[j][i][1].getClass().getName().equals(ordiStr) && tab[j][i][2].getClass().getName().equals(ordiStr) && tab[j][i][0].getClass().getName().equals(nameVide)) {
                            tab[j][i][0] = ordiPion;
                            boucle = false;
                            break;
                        }
                    }
				}
                if(boucle) {
                    //diagonale
                    //diagonale hauteur
                    if (tab[0][0][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[2][2][i].getClass().getName().equals(nameVide)) {
                        tab[2][2][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[2][2][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[0][0][i].getClass().getName().equals(nameVide)) {
                        tab[0][0][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[0][0][i].getClass().getName().equals(ordiStr) && tab[2][2][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(nameVide)) {
                        tab[1][1][i] = ordiPion;
                        boucle = false;
                        break;
                    }

                    if (tab[0][2][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[2][0][i].getClass().getName().equals(nameVide)) {
                        tab[2][0][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[2][0][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[0][2][i].getClass().getName().equals(nameVide)) {
                        tab[0][2][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[0][2][i].getClass().getName().equals(ordiStr) && tab[2][0][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(nameVide)) {
                        tab[1][1][i] = ordiPion;
                        boucle = false;
                        break;
                    }

                    //diagonale largeuer
                    if (tab[0][i][0].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[2][i][2].getClass().getName().equals(nameVide)) {
                        tab[2][i][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[2][i][2].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[0][i][0].getClass().getName().equals(nameVide)) {
                        tab[0][i][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[0][i][0].getClass().getName().equals(ordiStr) && tab[2][i][2].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(nameVide)) {
                        tab[1][i][1] = ordiPion;
                        boucle = false;
                        break;
                    }

                    if (tab[0][i][2].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[2][i][0].getClass().getName().equals(nameVide)) {
                        tab[2][i][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[2][i][0].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[0][i][2].getClass().getName().equals(nameVide)) {
                        tab[0][i][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[0][i][2].getClass().getName().equals(ordiStr) && tab[2][i][0].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(nameVide)) {
                        tab[1][i][1] = ordiPion;
                        boucle = false;
                        break;
                    }

                    //diagonale longueur
                    if (tab[i][0][0].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][2][2].getClass().getName().equals(nameVide)) {
                        tab[i][2][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[i][2][2].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][0][0].getClass().getName().equals(nameVide)) {
                        tab[i][0][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[i][0][0].getClass().getName().equals(ordiStr) && tab[i][2][2].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(nameVide)) {
                        tab[i][1][1] = ordiPion;
                        boucle = false;
                        break;
                    }

                    if (tab[i][0][2].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][2][0].getClass().getName().equals(nameVide)) {
                        tab[i][2][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[i][2][0].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][0][2].getClass().getName().equals(nameVide)) {
                        tab[i][0][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[i][0][2].getClass().getName().equals(ordiStr) && tab[i][2][0].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(nameVide)) {
                        tab[i][1][1] = ordiPion;
                        boucle = false;
                        break;
                    }
                }

                //diagonale pure
                if(boucle) {
                    for (i = 0; i < 3; i = i + 2) {
                        for (j = 0; j < 3; j = j + 2) {
                            if (i == 0)
                                k = 2;
                            else
                                k = 0;
                            if (j == 0)
                                l = 2;
                            else
                                l = 0;
                            if (tab[i][j][0].getClass().getName().equals(ordiStr) && tab[1][1][1].getClass().getName().equals(ordiStr) && tab[k][l][2].getClass().getName().equals(nameVide)) {
                                tab[k][l][2] = ordiPion;
                                boucle = false;
                                break;
                            }
                            if (tab[k][l][2].getClass().getName().equals(ordiStr) && tab[1][1][1].getClass().getName().equals(ordiStr) && tab[i][j][0].getClass().getName().equals(nameVide)) {
                                tab[i][j][0] = ordiPion;
                                boucle = false;
                                break;
                            }
                            if (tab[k][l][2].getClass().getName().equals(ordiStr) && tab[i][j][0].getClass().getName().equals(ordiStr) && tab[1][1][1].getClass().getName().equals(nameVide)) {
                                tab[1][1][1] = ordiPion;
                                boucle = false;
                                break;
                            }
                        }
                    }
                }
			}

			while (true) {
				if (tab[n][m][o].getClass().getName().equals(nameVide)) {
					tab[n][m][o] = ordiPion;
					break;
				}
				r1 = new Random();
				n = r1.nextInt(3);
				r2 = new Random();
				m = r2.nextInt(3);
				r3 = new Random();
				o = r3.nextInt(3);
			}
			boucle = false;	
		}

        return;
    }
	
	public void ordiExtraMedium (boolean pion){

        return;
    }
	
	public void ordiExtraHard (boolean pion){

        return;
    }

    public void insertionJoueur (boolean pion){
        int ligne = 0;
        int colonne = 0;
        int plateau = 0;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);

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
        System.out.println("Où jouer ? / Where ?");
        System.out.println("plateau n°?");

        //verification de l'entrée clavier
        while(true){
            if (scanner3.hasNextInt()) {
                plateau = scanner3.nextInt();
                if (plateau > 0 && plateau <= 3)
                    break;
                else {
                    scanner3.nextLine();
                    System.out.println("try again");
                    System.out.println("");
                }
            }
            else{
                scanner3.nextLine();
                System.out.println("try again");
                System.out.println("");
            }
        }
        System.out.println("");

        ligne--;
        colonne--;
        plateau--;

        // insertion en fonction du pion choisi
        if (pion)
            tab[colonne][ligne][plateau] = new croix();		// ligne colonne plateau, dans quelle ordre ????
        else
            tab[colonne][ligne][plateau] = new rond();

        return;
    }

    public void affichageTerminal (){
        char unununChar = tab[0][0][0].getAffichageT();
        String ununun = String.valueOf(unununChar);
        char undeuxunChar = tab[1][0][0].getAffichageT();
        String undeuxun = String.valueOf(undeuxunChar);
        char untroisunChar = tab[2][0][0].getAffichageT();
        String untroisun = String.valueOf(untroisunChar);
        char deuxununChar = tab[0][1][0].getAffichageT();
        String deuxunun = String.valueOf(deuxununChar);
        char deuxdeuxunChar = tab[1][1][0].getAffichageT();
        String deuxdeuxun = String.valueOf(deuxdeuxunChar);
        char deuxtroisunChar = tab[2][1][0].getAffichageT();
        String deuxtroisun = String.valueOf(deuxtroisunChar);
        char troisununChar = tab[0][2][0].getAffichageT();
        String troisunun = String.valueOf(troisununChar);
        char troisdeuxunChar = tab[1][2][0].getAffichageT();
        String troisdeuxun = String.valueOf(troisdeuxunChar);
        char troistroisunChar = tab[2][2][0].getAffichageT();
        String troistroisun = String.valueOf(troistroisunChar);

        char unundeuxChar = tab[0][0][1].getAffichageT();
        String unundeux = String.valueOf(unundeuxChar);
        char undeuxdeuxChar = tab[1][0][1].getAffichageT();
        String undeuxdeux = String.valueOf(undeuxdeuxChar);
        char untroisdeuxChar = tab[2][0][1].getAffichageT();
        String untroisdeux = String.valueOf(untroisdeuxChar);
        char deuxundeuxChar = tab[0][1][1].getAffichageT();
        String deuxundeux = String.valueOf(deuxundeuxChar);
        char deuxdeuxdeuxChar = tab[1][1][1].getAffichageT();
        String deuxdeuxdeux = String.valueOf(deuxdeuxdeuxChar);
        char deuxtroisdeuxChar = tab[2][1][1].getAffichageT();
        String deuxtroisdeux = String.valueOf(deuxtroisdeuxChar);
        char troisundeuxChar = tab[0][2][1].getAffichageT();
        String troisundeux = String.valueOf(troisundeuxChar);
        char troisdeuxdeuxChar = tab[1][2][1].getAffichageT();
        String troisdeuxdeux = String.valueOf(troisdeuxdeuxChar);
        char troistroisdeuxChar = tab[2][2][1].getAffichageT();
        String troistroisdeux = String.valueOf(troistroisdeuxChar);

        char ununtroisChar = tab[0][0][2].getAffichageT();
        String ununtrois = String.valueOf(ununtroisChar);
        char undeuxtroisChar = tab[1][0][2].getAffichageT();
        String undeuxtrois = String.valueOf(undeuxtroisChar);
        char untroistroisChar = tab[2][0][2].getAffichageT();
        String untroistrois = String.valueOf(untroistroisChar);
        char deuxuntroisChar = tab[0][1][2].getAffichageT();
        String deuxuntrois = String.valueOf(deuxuntroisChar);
        char deuxdeuxtroisChar = tab[1][1][2].getAffichageT();
        String deuxdeuxtrois = String.valueOf(deuxdeuxtroisChar);
        char deuxtroistroisChar = tab[2][1][2].getAffichageT();
        String deuxtroistrois = String.valueOf(deuxtroistroisChar);
        char troisuntroisChar = tab[0][2][2].getAffichageT();
        String troisuntrois = String.valueOf(troisuntroisChar);
        char troisdeuxtroisChar = tab[1][2][2].getAffichageT();
        String troisdeuxtrois = String.valueOf(troisdeuxtroisChar);
        char troistroistroisChar = tab[2][2][2].getAffichageT();
        String troistroistrois = String.valueOf(troistroistroisChar);

        System.out.println("");
        System.out.println("   1 | 2 | 3");
        System.out.println("");
        System.out.println("1  " + ununun + " | " + undeuxun + " | " + untroisun + "      " + "1  " + unundeux + " | " + undeuxdeux + " | " + untroisdeux + "      " + "1  " + ununtrois + " | " + undeuxtrois + " | " + untroistrois);
        System.out.println("_____________");
        System.out.println("2  " + deuxunun + " | " + deuxdeuxun + " | " + deuxtroisun + "      " + "2  " + deuxundeux + " | " + deuxdeuxdeux + " | " + deuxtroisdeux + "      " + "2  " + deuxuntrois + " | " + deuxdeuxtrois + " | " + deuxtroistrois);
        System.out.println("_____________");
        System.out.println("3  " + troisunun + " | " + troisdeuxun + " | " + troistroisun + "      " + "3  " + troisundeux + " | " + troisdeuxdeux + " | " + troistroisdeux + "      " + "3  " + troisuntrois + " | " + troisdeuxtrois + " | " + troistroistrois);
        System.out.println("");
        System.out.println("__plateau 1__      __plateau 2__      __plateau3__");
        System.out.println("");
        return;
    }

    public void initialisation (){
        int i, j, k;
        for(i=0; i < tab.length; i++)
            for(j=0; j < tab.length; j++)
                for(k=0; k < tab.length; k++)
                    tab[i][j][k] = new vide();

        return;
    }

    public void ExtraT (boolean pion, char levelGame){
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
						System.out.println("erreur tempoVict ExtraT");
						break;
					}
				}
			}
			affichageTerminal();
			
			switch(levelGame){
				case 'E':
					ordiExtraEasy(pion);
					break;
				case 'M':
					ordiExtraMedium(pion);
					break;
				case 'H':
					ordiExtraHard(pion);
					break;
				default	:
					System.out.println("Erreur level ExtraT switch");
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
						System.out.println("erreur tempoVict ExtraT");
						break;
					}
				}
			}
			insertionJoueur(pion);
			affichageTerminal();
		}
        return;
    }

    public void extraGame(char levelGame, boolean pion, int affichage){
		initialisation();
		
			switch(affichage){
				case 0:
					ExtraT(pion, levelGame);
					break;
				case 1:
					
					break;
				case 2:
					
					break;
				default	:
					System.out.println("Erreur extra affichage switch");
					break;
			}
			
        return;
    }
}