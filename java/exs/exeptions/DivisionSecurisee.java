import java.util.InputMismatchException;
import java.util.Scanner;

public class DivisionSecurisee {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Entrez le premier nombre entier : ");
            int num1 = scanner.nextInt();
            
            System.out.print("Entrez le second nombre entier : ");
            int num2 = scanner.nextInt();
            
            int resultat = num1 / num2;
            System.out.println("Résultat de la division : " + resultat);
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Veuillez entrer uniquement des nombres entiers !");
        } catch (ArithmeticException e) {
            System.out.println("Erreur : Division par zéro impossible !");
        } catch (Exception e) {
            System.out.println("Une erreur inattendue est survenue : " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Fin du programme.");
        }
    }
}
