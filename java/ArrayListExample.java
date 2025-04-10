import java.util.ArrayList;
public class ArrayListExample {
    public static void main(String[] args) {
        ArrayList Ar = new ArrayList();
        Ar.add(12);
        Ar.add("Bonjour tout le monde");
        Ar.add(12.2);
        Ar.add('d');

        System.out.println("Elements de la liste avant suppression:");
        for (int i = 0; i < Ar.size(); i++) {
            System.out.println("Indice " + i + " : " + Ar.get(i));}
        
        Ar.remove(2);
        System.out.println("\nElements de la liste après suppression:");
        for (int i = 0; i < Ar.size(); i++) {
            System.out.println("Indice " + i + " : " + Ar.get(i));
        
        System.out.println("\nl'element 'a' est-il présent dans la liste? " + Ar.contains('a'));
    }

    }
}