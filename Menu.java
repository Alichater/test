
public class Menu {
    public static void main(String[] args) {
        System.out.print("inserer la piece");
        int[] gagnant = { 5, 12, 34, 56, 63, 75, 89, 92 };
        int nombre;
        System.out.println("écrivez un nombre entre 1 et 100: ");
        //instruction pour saisir la réponse...

        //vérifier la réponse
        for (int n : gagnant){
            if (nombre == n) {
                System.out.print("vous avez gagné");
                break;
            }
        }
        

        
    }
}