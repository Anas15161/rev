import java.util.Arrays;

public class TableauEntiers {
    public static void main(String[] args) {
        // Initialisation du tableau
        int[] tableau = {12, 45, 3, 89, 22, 67, 9, 34, 56, 78};
        
        // 1. Afficher tous les entiers du tableau
        System.out.println("Tableau : " + Arrays.toString(tableau));
        
        // 2. Afficher tous les entiers du tableau dans l'ordre inverse
        System.out.print("Tableau inversé : [");
        for (int i = tableau.length - 1; i >= 0; i--) {
            System.out.print(tableau[i] + (i > 0 ? ", " : ""));
        }
        System.out.println("]");
        
        // 3. Calculer et afficher la somme des 10 entiers
        int somme = Arrays.stream(tableau).sum();
        System.out.println("Somme des éléments : " + somme);
        
        // 4. Trouver et afficher l'entier minimum du tableau
        int min = Arrays.stream(tableau).min().getAsInt();
        System.out.println("Valeur minimale : " + min);
        
        // 5. Trouver et afficher l'entier maximum du tableau
        int max = Arrays.stream(tableau).max().getAsInt();
        System.out.println("Valeur maximale : " + max);
        
        // 6. Calculer et afficher la moyenne des entiers du tableau
        double moyenne = (double) somme / tableau.length;
        System.out.println("Moyenne : " + moyenne);
        
        // 7. Afficher toutes les valeurs du tableau qui sont supérieures à la moyenne
        System.out.print("Valeurs supérieures à la moyenne : [");
        boolean first = true;
        for (int valeur : tableau) {
            if (valeur > moyenne) {
                if (!first) {
                    System.out.print(", ");
                }
                System.out.print(valeur);
                first = false;
            }
        }
        System.out.println("]");
    }
}
