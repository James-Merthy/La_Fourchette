package laFourchette;

import java.util.Scanner;

public class Game {

    /**
     * Cette méthode retourne un nombre aléatoire
     * de 1 à 100
     *
     * @return
     */
    public static int nombreAléatoire() {

        return (int) (Math.random() * 101);
    }

    /**
     * Cette méthode demande a l'utilisateur
     * de taper un chiffre
     * cette méthode retourne le chiffre
     *
     * @return
     */
    public static int askNumber() {

        Scanner scanner = new Scanner(System.in);

        int estValid = 0;

        int choix = 0;

        System.out.println("entrez un nombre entier de 0 à 100");

        while (estValid == 0) {


            int number = scanner.nextInt();

            if (number > 100 || number < 0) {

                System.out.println("votre nombre n'est pas valid recommencez ! ");
            } else {

                choix = number;
                estValid++;
            }

        }


        return choix;
    }

    /**
     * Cette méthode reçois en param 2 entiers et les compares
     * retourne false si ils sont différents sinon c'est true
     *
     * @param nombreAuHazard
     * @param choixUtilisateur
     * @return
     */


    public static boolean comparaison(int nombreAuHazard, int choixUtilisateur) {

        boolean sonEgaux = false;

        if (nombreAuHazard == choixUtilisateur) {

            return sonEgaux = true;

        } else {

            return sonEgaux;

        }

    }

    /**
     * Cette méthode vas tout qimplement lancer la game
     * et dire a l'utilisateur si son nombre est plus grand
     * ou plus petit que le nombre du bot
     * il a 5 chances pas une de plus
     */
    public static void la_Game (){

        System.out.println("=============== La fourchette ==========================");
        int nombre_de_chance = 5 ;



        int Le_bon_nombre = nombreAléatoire();

        while (nombre_de_chance > 0) {

            String displayChance = " | ***** tentative : " + nombre_de_chance + " ***** |";

            String displayToure = "------------------------------------------------------";

            System.out.println(displayToure);

            System.out.println(displayChance);

            int nb = askNumber() ;

            if (comparaison(Le_bon_nombre, nb)){
                System.out.println("vous avez trouvez le nombre bravo !!!");
                nombre_de_chance = -1 ;

            } else if (nb > Le_bon_nombre) {

                System.out.println("votre nombre est trop grand");

                nombre_de_chance -- ;
            }else{

                System.out.println("votre nombre est trop petit");
                nombre_de_chance --;
            }



        }

        if (nombre_de_chance == 0){

            System.out.println("vous avez perdu !");
        }



    }

    public static void main(String[] args) {

        int i = 0;

        la_Game();

    }
}
