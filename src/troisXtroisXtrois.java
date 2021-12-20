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

    public boolean complete (boolean boucle, String ordiStr, String nameVide, pion ordiPion){
        int i, j, k, l, iBis, jBis;

        for(i=0; i<3; i++) {
            for (j = 0; j < 3; j++) {
                if (boucle) {
                        //largueur complete
                    if (tab[0][j][i].getClass().getName().equals(ordiStr) && tab[1][j][i].getClass().getName().equals(ordiStr) && tab[2][j][i].getClass().getName().equals(nameVide)) {
                        tab[2][j][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if(boucle) {
                    if (tab[0][j][i].getClass().getName().equals(ordiStr) && tab[2][j][i].getClass().getName().equals(ordiStr) && tab[1][j][i].getClass().getName().equals(nameVide)) {
                        tab[1][j][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if(boucle) {
                    if (tab[2][j][i].getClass().getName().equals(ordiStr) && tab[1][j][i].getClass().getName().equals(ordiStr) && tab[0][j][i].getClass().getName().equals(nameVide)) {
                        tab[0][j][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if (boucle) {
                        //longueur complete
                    if (tab[j][0][i].getClass().getName().equals(ordiStr) && tab[j][1][i].getClass().getName().equals(ordiStr) && tab[j][2][i].getClass().getName().equals(nameVide)) {
                        tab[j][2][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if(boucle) {
                    if (tab[j][0][i].getClass().getName().equals(ordiStr) && tab[j][2][i].getClass().getName().equals(ordiStr) && tab[j][1][i].getClass().getName().equals(nameVide)) {
                        tab[j][1][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if(boucle) {
                    if (tab[j][1][i].getClass().getName().equals(ordiStr) && tab[j][2][i].getClass().getName().equals(ordiStr) && tab[j][0][i].getClass().getName().equals(nameVide)) {
                        tab[j][0][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if (boucle) {
                        //hauteur complete
                    if (tab[j][i][0].getClass().getName().equals(ordiStr) && tab[j][i][1].getClass().getName().equals(ordiStr) && tab[j][i][2].getClass().getName().equals(nameVide)) {
                        tab[j][i][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if(boucle) {
                    if (tab[j][i][0].getClass().getName().equals(ordiStr) && tab[j][i][2].getClass().getName().equals(ordiStr) && tab[j][i][1].getClass().getName().equals(nameVide)) {
                        tab[j][i][1] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if(boucle) {
                    if (tab[j][i][1].getClass().getName().equals(ordiStr) && tab[j][i][2].getClass().getName().equals(ordiStr) && tab[j][i][0].getClass().getName().equals(nameVide)) {
                        tab[j][i][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
            }
        }
        for(i=0; i<3; i++) {
            if (boucle) {
                //diagonale complete
                //diagonale hauteur
                if (tab[0][0][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[2][2][i].getClass().getName().equals(nameVide)) {
                    tab[2][2][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[2][2][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[0][0][i].getClass().getName().equals(nameVide)) {
                    tab[0][0][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][0][i].getClass().getName().equals(ordiStr) && tab[2][2][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(nameVide)) {
                    tab[1][1][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][2][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[2][0][i].getClass().getName().equals(nameVide)) {
                    tab[2][0][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[2][0][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(ordiStr) && tab[0][2][i].getClass().getName().equals(nameVide)) {
                    tab[0][2][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][2][i].getClass().getName().equals(ordiStr) && tab[2][0][i].getClass().getName().equals(ordiStr) && tab[1][1][i].getClass().getName().equals(nameVide)) {
                    tab[1][1][i] = ordiPion;
                    boucle = false;
                }
            }
            //diagonale largeuer


            if (boucle) {
                if (tab[0][i][0].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[2][i][2].getClass().getName().equals(nameVide)) {
                    tab[2][i][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[2][i][2].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[0][i][0].getClass().getName().equals(nameVide)) {
                    tab[0][i][0] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][i][0].getClass().getName().equals(ordiStr) && tab[2][i][2].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(nameVide)) {
                    tab[1][i][1] = ordiPion;
                    boucle = false;

                }
            }
            if (boucle) {
                if (tab[0][i][2].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[2][i][0].getClass().getName().equals(nameVide)) {
                    tab[2][i][0] = ordiPion;
                    boucle = false;

                }
            }
            if (boucle) {
                if (tab[2][i][0].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(ordiStr) && tab[0][i][2].getClass().getName().equals(nameVide)) {
                    tab[0][i][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][i][2].getClass().getName().equals(ordiStr) && tab[2][i][0].getClass().getName().equals(ordiStr) && tab[1][i][1].getClass().getName().equals(nameVide)) {
                    tab[1][i][1] = ordiPion;
                    boucle = false;
                }
            }

            //diagonale longueur


            if (boucle) {
                if (tab[i][0][0].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][2][2].getClass().getName().equals(nameVide)) {
                    tab[i][2][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][2][2].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][0][0].getClass().getName().equals(nameVide)) {
                    tab[i][0][0] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][0][0].getClass().getName().equals(ordiStr) && tab[i][2][2].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(nameVide)) {
                    tab[i][1][1] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][0][2].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][2][0].getClass().getName().equals(nameVide)) {
                    tab[i][2][0] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][2][0].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(ordiStr) && tab[i][0][2].getClass().getName().equals(nameVide)) {
                    tab[i][0][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][0][2].getClass().getName().equals(ordiStr) && tab[i][2][0].getClass().getName().equals(ordiStr) && tab[i][1][1].getClass().getName().equals(nameVide)) {
                    tab[i][1][1] = ordiPion;
                    boucle = false;
                }
            }
        }

        //diagonale pure complete
        if(boucle) {
            for (iBis = 0; iBis < 3; iBis = iBis + 2) {
                for (jBis = 0; jBis < 3; jBis = jBis + 2) {

                    if (iBis == 0)
                        k = 2;
                    else
                        k = 0;
                    if (jBis == 0)
                        l = 2;
                    else
                        l = 0;
                    if (tab[iBis][jBis][0].getClass().getName().equals(ordiStr) && tab[1][1][1].getClass().getName().equals(ordiStr) && tab[k][l][2].getClass().getName().equals(nameVide)) {
                        tab[k][l][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[k][l][2].getClass().getName().equals(ordiStr) && tab[1][1][1].getClass().getName().equals(ordiStr) && tab[iBis][jBis][0].getClass().getName().equals(nameVide)) {
                        tab[iBis][jBis][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[k][l][2].getClass().getName().equals(ordiStr) && tab[iBis][jBis][0].getClass().getName().equals(ordiStr) && tab[1][1][1].getClass().getName().equals(nameVide)) {
                        tab[1][1][1] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
            }
        }
        return boucle;
    }

    public boolean bloque (boolean boucle, String joueurStr, String nameVide, pion ordiPion){
        int i, j, k, l, iBis, jBis;
        for(i=0; i<3; i++) {
            for (j = 0; j < 3; j++) {
                if (boucle) {
                    //bloquer l'adversaire
                    //largueur bloque
                    if (tab[0][j][i].getClass().getName().equals(joueurStr) && tab[1][j][i].getClass().getName().equals(joueurStr) && tab[2][j][i].getClass().getName().equals(nameVide)) {
                        tab[2][j][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[0][j][i].getClass().getName().equals(joueurStr) && tab[2][j][i].getClass().getName().equals(joueurStr) && tab[1][j][i].getClass().getName().equals(nameVide)) {
                        tab[1][j][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[2][j][i].getClass().getName().equals(joueurStr) && tab[1][j][i].getClass().getName().equals(joueurStr) && tab[0][j][i].getClass().getName().equals(nameVide)) {
                        tab[0][j][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if (boucle) {
                    //longueur bloque
                    if (tab[j][0][i].getClass().getName().equals(joueurStr) && tab[j][1][i].getClass().getName().equals(joueurStr) && tab[j][2][i].getClass().getName().equals(nameVide)) {
                        tab[j][2][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[j][0][i].getClass().getName().equals(joueurStr) && tab[j][2][i].getClass().getName().equals(joueurStr) && tab[j][1][i].getClass().getName().equals(nameVide)) {
                        tab[j][1][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[j][1][i].getClass().getName().equals(joueurStr) && tab[j][2][i].getClass().getName().equals(joueurStr) && tab[j][0][i].getClass().getName().equals(nameVide)) {
                        tab[j][0][i] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
                if (boucle) {
                    //hauteur bloque
                    if (tab[j][i][0].getClass().getName().equals(joueurStr) && tab[j][i][1].getClass().getName().equals(joueurStr) && tab[j][i][2].getClass().getName().equals(nameVide)) {
                        tab[j][i][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[j][i][0].getClass().getName().equals(joueurStr) && tab[j][i][2].getClass().getName().equals(joueurStr) && tab[j][i][1].getClass().getName().equals(nameVide)) {
                        tab[j][i][1] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[j][i][1].getClass().getName().equals(joueurStr) && tab[j][i][2].getClass().getName().equals(joueurStr) && tab[j][i][0].getClass().getName().equals(nameVide)) {
                        tab[j][i][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
            }
        }

        for(i=0; i<3; i++) {
            if (boucle) {
                //diagonale bloque
                //diagonale hauteur
                if (tab[0][0][i].getClass().getName().equals(joueurStr) && tab[1][1][i].getClass().getName().equals(joueurStr) && tab[2][2][i].getClass().getName().equals(nameVide)) {
                    tab[2][2][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[2][2][i].getClass().getName().equals(joueurStr) && tab[1][1][i].getClass().getName().equals(joueurStr) && tab[0][0][i].getClass().getName().equals(nameVide)) {
                    tab[0][0][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][0][i].getClass().getName().equals(joueurStr) && tab[2][2][i].getClass().getName().equals(joueurStr) && tab[1][1][i].getClass().getName().equals(nameVide)) {
                    tab[1][1][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][2][i].getClass().getName().equals(joueurStr) && tab[1][1][i].getClass().getName().equals(joueurStr) && tab[2][0][i].getClass().getName().equals(nameVide)) {
                    tab[2][0][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[2][0][i].getClass().getName().equals(joueurStr) && tab[1][1][i].getClass().getName().equals(joueurStr) && tab[0][2][i].getClass().getName().equals(nameVide)) {
                    tab[0][2][i] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][2][i].getClass().getName().equals(joueurStr) && tab[2][0][i].getClass().getName().equals(joueurStr) && tab[1][1][i].getClass().getName().equals(nameVide)) {
                    tab[1][1][i] = ordiPion;
                    boucle = false;
                }
            }

            if (boucle) {
                //diagonale largeuer
                if (tab[0][i][0].getClass().getName().equals(joueurStr) && tab[1][i][1].getClass().getName().equals(joueurStr) && tab[2][i][2].getClass().getName().equals(nameVide)) {
                    tab[2][i][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[2][i][2].getClass().getName().equals(joueurStr) && tab[1][i][1].getClass().getName().equals(joueurStr) && tab[0][i][0].getClass().getName().equals(nameVide)) {
                    tab[0][i][0] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][i][0].getClass().getName().equals(joueurStr) && tab[2][i][2].getClass().getName().equals(joueurStr) && tab[1][i][1].getClass().getName().equals(nameVide)) {
                    tab[1][i][1] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][i][2].getClass().getName().equals(joueurStr) && tab[1][i][1].getClass().getName().equals(joueurStr) && tab[2][i][0].getClass().getName().equals(nameVide)) {
                    tab[2][i][0] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[2][i][0].getClass().getName().equals(joueurStr) && tab[1][i][1].getClass().getName().equals(joueurStr) && tab[0][i][2].getClass().getName().equals(nameVide)) {
                    tab[0][i][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[0][i][2].getClass().getName().equals(joueurStr) && tab[2][i][0].getClass().getName().equals(joueurStr) && tab[1][i][1].getClass().getName().equals(nameVide)) {
                    tab[1][i][1] = ordiPion;
                    boucle = false;
                }
            }

            if (boucle) {
                //diagonale longueur
                if (tab[i][0][0].getClass().getName().equals(joueurStr) && tab[i][1][1].getClass().getName().equals(joueurStr) && tab[i][2][2].getClass().getName().equals(nameVide)) {
                    tab[i][2][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][2][2].getClass().getName().equals(joueurStr) && tab[i][1][1].getClass().getName().equals(joueurStr) && tab[i][0][0].getClass().getName().equals(nameVide)) {
                    tab[i][0][0] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][0][0].getClass().getName().equals(joueurStr) && tab[i][2][2].getClass().getName().equals(joueurStr) && tab[i][1][1].getClass().getName().equals(nameVide)) {
                    tab[i][1][1] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][0][2].getClass().getName().equals(joueurStr) && tab[i][1][1].getClass().getName().equals(joueurStr) && tab[i][2][0].getClass().getName().equals(nameVide)) {
                    tab[i][2][0] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][2][0].getClass().getName().equals(joueurStr) && tab[i][1][1].getClass().getName().equals(joueurStr) && tab[i][0][2].getClass().getName().equals(nameVide)) {
                    tab[i][0][2] = ordiPion;
                    boucle = false;
                }
            }
            if (boucle) {
                if (tab[i][0][2].getClass().getName().equals(joueurStr) && tab[i][2][0].getClass().getName().equals(joueurStr) && tab[i][1][1].getClass().getName().equals(nameVide)) {
                    tab[i][1][1] = ordiPion;
                    boucle = false;
                }
            }
        }

        //diagonale pure bloque
        if (boucle) {
            for (iBis = 0; iBis < 3; iBis = iBis + 2) {
                for (jBis = 0; jBis < 3; jBis = jBis + 2) {
                    if (iBis == 0)
                        k = 2;
                    else
                        k = 0;
                    if (jBis == 0)
                        l = 2;
                    else
                        l = 0;
                    if (tab[iBis][jBis][0].getClass().getName().equals(joueurStr) && tab[1][1][1].getClass().getName().equals(joueurStr) && tab[k][l][2].getClass().getName().equals(nameVide)) {
                        tab[k][l][2] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[k][l][2].getClass().getName().equals(joueurStr) && tab[1][1][1].getClass().getName().equals(joueurStr) && tab[iBis][jBis][0].getClass().getName().equals(nameVide)) {
                        tab[iBis][jBis][0] = ordiPion;
                        boucle = false;
                        break;
                    }
                    if (tab[k][l][2].getClass().getName().equals(joueurStr) && tab[iBis][jBis][0].getClass().getName().equals(joueurStr) && tab[1][1][1].getClass().getName().equals(nameVide)) {
                        tab[1][1][1] = ordiPion;
                        boucle = false;
                        break;
                    }
                }
            }
        }
        return boucle;
    }

    public boolean randomPion(boolean boucle, String nameVide, pion ordiPion){
        Random r1 = new Random();
        int n = r1.nextInt(3);
        Random r2 = new Random();
        int m = r2.nextInt(3);
        Random r3 = new Random();
        int o = r3.nextInt(3);

        while (boucle) {
            if (tab[n][m][o].getClass().getName().equals(nameVide)) {
                tab[n][m][o] = ordiPion;
                boucle = false;
                break;
            }
            r1 = new Random();
            n = r1.nextInt(3);
            r2 = new Random();
            m = r2.nextInt(3);
            r3 = new Random();
            o = r3.nextInt(3);
        }

        return boucle;
    }

    public void ordiExtraEasy (boolean pion, int tour){
        int boolSup = 3;
        Random r4 = new Random();
        int bool = r4.nextInt(boolSup);
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

		boolean boucle = true;
		
		while(boucle){

                    boucle = complete(boucle, ordiStr, nameVide, ordiPion);

            if((bool > 0) || (tour < 3)) {
                if (boucle){
                    boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
                }
            }
            r4 = new Random();
            bool = r4.nextInt(boolSup);

            if(boucle){
                boucle = randomPion(boucle, nameVide, ordiPion);
            }
		}
        return;
    }
	
	public void ordiExtraMedium (boolean pion, int tour){
        int boolSup = 10;
        Random r4 = new Random();
        int bool = r4.nextInt(boolSup);
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

        boolean boucle = true;

        Random r1 = new Random();
        int n = r1.nextInt(3);
        Random r2 = new Random();
        int m = r2.nextInt(3);
        Random r3 = new Random();
        int o = r3.nextInt(3);

        Random r1B = new Random();
        int nB = r1B.nextInt(2)*2;
        Random r2B = new Random();
        int mB = r2B.nextInt(2)*2;
        Random r3B = new Random();
        int oB = r3B.nextInt(2)*2;

        while(boucle){

                    boucle = complete(boucle, ordiStr, nameVide, ordiPion);

            if((bool > 0) || (tour < 5)) {
                if (boucle){
                    boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
                }
            }
            r4 = new Random();
            bool = r4.nextInt(boolSup);

            Random r5 = new Random();
            int oo = r5.nextInt(2);

            if (tour == 1){
                if(oo == 0){
                    tab[1][1][1] = ordiPion;
                    boucle = false;
                }
                else{
                    tab[nB][mB][oB] = ordiPion;
                }
            }

            if(boucle){
                boucle = randomPion(boucle, nameVide, ordiPion);
            }
        }
        return;
    }
	
	public void ordiExtraHard (boolean pion, int tour){
        vide testVide = new vide();
        String nameVide = testVide.getClass().getName();
        pion ordiPion;
        String ordiStr;
        pion joueurPion;
        String joueurStr;
        int i, j, k, iB;
        boolean okay = true;

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

        Random r1 = new Random();
        int n = r1.nextInt(3);
        Random r2 = new Random();
        int m = r2.nextInt(3);
        Random r3 = new Random();
        int o = r3.nextInt(3);

        Random r1B = new Random();
        int nB = r1B.nextInt(2)*2;
        Random r2B = new Random();
        int mB = r2B.nextInt(2)*2;
        Random r3B = new Random();
        int oB = r3B.nextInt(2)*2;

        while(boucle){

                boucle = complete(boucle, ordiStr, nameVide, ordiPion);

            if (boucle){
                boucle = bloque(boucle, joueurStr, nameVide, ordiPion);
            }

            if (tour == 1) {
                tab[1][1][1] = ordiPion;
                boucle = false;
            }

            if(tour == 3){
                for (i=0; i<3; i++){
                    for (j=0; j<3; j++){
                        for (k=0; k<3; k++){
                            if(tab[i][j][k].getClass().getName().equals(ordiStr)){
                                while (boucle) {
                                    if ((tab[n][m][o].getClass().getName().equals(nameVide)) && ((n == i) || (m == j) || (o == k))) {
                                        for (iB=0; iB<3; iB++){
                                            if((tab[iB][m][o].getClass().getName().equals(joueurStr))){
                                                okay = false;
                                                break;
                                            }
                                            if((tab[n][iB][o].getClass().getName().equals(joueurStr))){
                                                okay = false;
                                                break;
                                            }
                                            if((tab[n][m][iB].getClass().getName().equals(joueurStr))){
                                                okay = false;
                                                break;
                                            }
                                        }
                                        if(okay) {
                                            tab[n][m][o] = ordiPion;
                                            boucle = false;
                                            break;
                                        }
                                    }
                                    r1 = new Random();
                                    n = r1.nextInt(3);
                                    r2 = new Random();
                                    m = r2.nextInt(3);
                                    r3 = new Random();
                                    o = r3.nextInt(3);
                                }
                            }
                        }
                    }
                }


            }

            if(tour == 2){
                if(tab[1][1][1].getClass().getName().equals(nameVide)) {
                    tab[1][1][1] = ordiPion;
                    boucle = false;
                }
                else {
                    for (i = 0; i < 3; i++) {
                        for (j = 0; j < 3; j++) {
                            for (k = 0; k < 3; k++) {
                                if (tab[i][j][k].getClass().getName().equals(joueurStr)) {
                                    while (boucle) {
                                        if ((tab[n][m][o].getClass().getName().equals(nameVide)) && ((n == i) || (m == j) || (o == k))) {
                                            tab[n][m][o] = ordiPion;
                                            boucle = false;
                                            break;
                                        }
                                        r1 = new Random();
                                        n = r1.nextInt(3);
                                        r2 = new Random();
                                        m = r2.nextInt(3);
                                        r3 = new Random();
                                        o = r3.nextInt(3);
                                    }
                                }
                            }
                        }
                    }
                }
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
        int plateau = 0;
        Scanner scanner1 = new Scanner(System.in);
        Scanner scanner2 = new Scanner(System.in);
        Scanner scanner3 = new Scanner(System.in);
        vide testVide = new vide();
        String nameVide = testVide.getClass().getName();


        System.out.println("");
        System.out.println("Où jouer ? / Where ?");
        System.out.println("plateau n°?");

        //verification de l'entrée clavier
        while(true) {
            while (true) {
                if (scanner3.hasNextInt()) {
                    plateau = scanner3.nextInt();
                    if (plateau > 0 && plateau <= 3)
                        break;
                    else {
                        scanner3.nextLine();
                        System.out.println("try again");
                        System.out.println("");
                    }
                } else {
                    scanner3.nextLine();
                    System.out.println("try again");
                    System.out.println("");
                }
            }

            System.out.println("");
            System.out.println("ligne n°?");

            //verification de l'entrée clavier
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
            if(tab[colonne - 1][ligne - 1][plateau - 1].getClass().getName().equals(nameVide))
                break;
            else{
                System.out.println("try again");
                System.out.println("");
            }
            System.out.println("");
        }
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

    public void insertionJoueurI (boolean pion){

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
        System.out.println("_____________      _____________      _____________");
        System.out.println("2  " + deuxunun + " | " + deuxdeuxun + " | " + deuxtroisun + "      " + "2  " + deuxundeux + " | " + deuxdeuxdeux + " | " + deuxtroisdeux + "      " + "2  " + deuxuntrois + " | " + deuxdeuxtrois + " | " + deuxtroistrois);
        System.out.println("_____________      _____________      _____________");
        System.out.println("3  " + troisunun + " | " + troisdeuxun + " | " + troistroisun + "      " + "3  " + troisundeux + " | " + troisdeuxdeux + " | " + troistroisdeux + "      " + "3  " + troisuntrois + " | " + troisdeuxtrois + " | " + troistroistrois);
        System.out.println("");
        System.out.println("__plateau 1__      __plateau 2__      __plateau3__");
        System.out.println("");
        return;
    }

    public void affichageInterface () {

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

    public void ExtraT (boolean pion, char levelGame, int affichage, int nbGame){
		int tempoVict = 0;
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
                System.out.println("Erreur start extra switch");
                break;
        }

		if(start) {
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
                    System.out.println("Erreur hard affichage switch 1");
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
                    System.out.println("Erreur hard insertion switch");
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
						System.out.println("erreur tempoVict ExtraT");
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
                    System.out.println("Erreur hard affichage switch 2");
                    break;
            }

            tour++;
			switch(levelGame){
				case 'E':
					ordiExtraEasy(pion, tour);
					break;
				case 'M':
					ordiExtraMedium(pion, tour);
					break;
				case 'H':
					ordiExtraHard(pion, tour);
					break;
				default	:
					System.out.println("Erreur level ExtraT switch");
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
                    System.out.println("Erreur hard affichage switch 3");
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
						System.out.println("erreur tempoVict ExtraT");
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
                    System.out.println("Erreur hard insertion switch");
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
                    System.out.println("Erreur hard affichage switch 4");
                    break;
            }
		}
        return;
    }

    public void extraGame(char levelGame, boolean pion, int affichage, int nbGame){
		initialisation();
        ExtraT(pion, levelGame, affichage, nbGame);
			
			
        return;
    }
}