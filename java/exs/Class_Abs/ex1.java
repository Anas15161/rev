// Définition de l'interface Animal
interface Animal {
    void faireSon();
}

// Implémentation de l'interface par la classe Chien
class Chien implements Animal {
    @Override
    public void faireSon() {
        System.out.println("Le chien aboie");
    }
}

// Implémentation de l'interface par la classe Chat
class Chat implements Animal {
    @Override
    public void faireSon() {
        System.out.println("Le chat miaule");
    }
}

// Classe principale pour tester
public class TestAnimal {
    public static void main(String[] args) {
        // Création d'un tableau d'objets Animal
        Animal[] animaux = {new Chien(), new Chat()};
        
        // Affichage du son de chaque animal
        for (Animal animal : animaux) {
            animal.faireSon();
        }
    }
}
