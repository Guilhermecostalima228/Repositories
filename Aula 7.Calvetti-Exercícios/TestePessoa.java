class Pessoa {
    protected String nome;

    public Pessoa(String nome) {
        this.nome = nome;
    }
}

class Estudante extends Pessoa {
    public Estudante(String nome) {
        super(nome);
    }

    public String estudar() {
        return nome + " está estudando.";
    }
}

// Classe principal para testes
public class TestePessoa {
    public static void main(String[] args) {
        Estudante estudante = new Estudante("Maria");
        System.out.println(estudante.estudar()); // Deve exibir "Maria está estudando."
    }
}
