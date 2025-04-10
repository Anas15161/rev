import java.util.InputMismatchException;
import java.util.Scanner;

public class RacineCarree {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        try {
            System.out.print("Entrez un nombre réel : ");
            double nombre = scanner.nextDouble();
            
            if (nombre < 0) {
                throw new IllegalArgumentException("Erreur : Impossible de calculer la racine carrée d'un nombre négatif !");
            }
            
            double racineCarree = Math.sqrt(nombre);
            System.out.println("La racine carrée de " + nombre + " est : " + racineCarree);
        } catch (InputMismatchException e) {
            System.out.println("Erreur : Veuillez entrer un nombre valide !");
        } catch (IllegalArgumentException e) {
            System.out.println(e.getMessage());
        } catch (Exception e) {
            System.out.println("Une erreur inattendue est survenue : " + e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Fin du programme.");
        }
    }
}
