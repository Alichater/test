import java.util.Scanner;

public class Menu {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.console().reader());
        System.out.println("inserer le montant a parier:");
        double montant = scanner.nextDouble();
        
        int[] gagnant = { 5, 12, 34, 56, 63, 75, 89, 92 };
        System.out.println("écrivez un nombre entre 1 et 100:");
        int nombre = scanner.nextInt();
        boolean gagne = false;
        for (int n : gagnant) {
            if (nombre == n) {
                gagne = true;
                break;
            }
        }
        if (gagne){
            System.out.print("vous avez gagné:");
            System.out.print(montant * 10);
        } else {
            System.out.print("vous avez perdu");
        }

    }
}