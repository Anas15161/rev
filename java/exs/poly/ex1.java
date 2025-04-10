// Super-classe Animal
class Animal {
    public void parle() {
        System.out.println("Cet animal fait un bruit.");
    }
}

// Sous-classe Chien
class Chien extends Animal {
    @Override
    public void parle() {
        System.out.println("Le chien aboie: Ouaf Ouaf!");
    }
}

// Sous-classe Chat
class Chat extends Animal {
    @Override
    public void parle() {
        System.out.println("Le chat miaule: Miaou Miaou!");
    }
}

// Sous-classe Oiseau
class Oiseau extends Animal {
    @Override
    public void parle() {
        System.out.println("L'oiseau chante: Cui Cui!");
    }
}

// Classe principale pour tester le polymorphisme
public class TestPolymorphisme {
    public static void main(String[] args) {
        // Création d'un tableau d'objets Animal
        Animal[] animaux = { new Chien(), new Chat(), new Oiseau() };
        
        // Parcourir le tableau et appeler la méthode parle()
        for (Animal animal : animaux) {
            animal.parle();
        }
    }
}