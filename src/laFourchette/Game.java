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

    public static void main(String[] args) {

        int i = 0;

        System.out.println(comparaison(5,5));
        System.out.println(comparaison(7,5));
        System.out.println(comparaison(nombreAléatoire(),askNumber()));

    }
}
