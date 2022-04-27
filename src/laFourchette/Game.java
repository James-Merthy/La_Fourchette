package laFourchette;

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
     * @return
     */
    public static int askNumber(){

        return 0 ;
    }

    public static void main(String[] args) {

        int i = 0 ;

        while (i < 1000){

            System.out.println(nombreAléatoire());

            i ++ ;

        }

    }
}
