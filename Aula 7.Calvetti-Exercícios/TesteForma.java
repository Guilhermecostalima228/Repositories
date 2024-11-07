abstract class Forma {
    public abstract double area();
}

class Circulo extends Forma {
    private double raio;

    public Circulo(double raio) {
        this.raio = raio;
    }

    @Override
    public double area() {
        return 3.14 * raio * raio;
    }
}

// Classe principal para testes
public class TesteForma {
    public static void main(String[] args) {
        Circulo circulo = new Circulo(5);
        System.out.println("Área do círculo: " + circulo.area()); // Exibe a área do círculo
    }
}
