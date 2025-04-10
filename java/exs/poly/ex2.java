// Super-classe Employe
class Employe {
    public void afficheDetails() {
        System.out.println("Informations générales sur l'employé.");
    }
}

// Sous-classe Manager
class Manager extends Employe {
    @Override
    public void afficheDetails() {
        System.out.println("Le manager supervise les équipes et les projets.");
    }
}

// Sous-classe Developpeur
class Developpeur extends Employe {
    @Override
    public void afficheDetails() {
        System.out.println("Le développeur écrit et maintient le code des applications.");
    }
}

// Classe principale pour tester le polymorphisme
public class TestPolymorphisme {
    public static void main(String[] args) {
        // Création d'un tableau d'objets Employe
        Employe[] employes = { new Manager(), new Developpeur() };
        
        // Parcourir le tableau et appeler la méthode afficheDetails()
        for (Employe employe : employes) {
            employe.afficheDetails();
        }
    }
}