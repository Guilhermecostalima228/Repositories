interface Movel {
    String mover();
}

class Carro implements Movel {
    @Override
    public String mover() {
        return "Carro está em movimento";
    }
}

// Classe principal para testes
public class TesteMovel {
    public static void main(String[] args) {
        Carro carro = new Carro();
        System.out.println(carro.mover()); // Deve exibir "Carro está em movimento"
    }
}
