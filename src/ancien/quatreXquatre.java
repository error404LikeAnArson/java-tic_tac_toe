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

    public void easyPlusT (boolean pion){

        return;
    }

    public void mediumPlusT (boolean pion){

        return;
    }

    public void hardPlusT (boolean pion){

        return;
    }

    public void plusGame(char levelGame, boolean pion, int affichage){

        return;
    }
}