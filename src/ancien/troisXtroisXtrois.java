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

                //TODO

                )
            victory = 1;
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


                )
            victory = 2;

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

    public void easyExtraT (boolean pion){

        return;
    }

    public void mediumExtraT (boolean pion){

        return;
    }

    public void hardExtraT (boolean pion){

        return;
    }

    public void extraGame(char levelGame, boolean pion, int affichage){

        return;
    }
}