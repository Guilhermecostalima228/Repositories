// Classe Animal
class Animal {
    protected String nome;

    public Animal(String nome) {
        this.nome = nome;
    }

    public String som() {
        return "";
    }
}

// Classe Cachorro que herda de Animal
class Cachorro extends Animal {
    public Cachorro(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return "// Classe Gato que herda de Animal
class Gato extends Animal {
    public Gato(String nome) {
        super(nome);
    }

    @Override
    public String som() {
        return "Miau";
    }
}

// Classe principal para testes
public class TesteAnimal {
    public static void main(String[] args) {
        Cachorro cachorro = new Cachorro("Rex");
        System.out.println(cachorro.som()); // Deve exibir "Latido"

        Gato gato = new Gato("Mimi");
        System.out.println(gato.som()); // Deve exibir "Miau"
    }
}
