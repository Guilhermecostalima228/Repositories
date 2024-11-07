class Calculadora {
    public int soma(int a, int b) {
        return a + b;
    }

    public int subtracao(int a, int b) {
        return a - b;
    }
}

// Classe principal para testes
public class TesteCalculadora {
    public static void main(String[] args) {
        Calculadora calc = new Calculadora();
        System.out.println("Soma: " + calc.soma(3, 4)); // Deve exibir 7
        System.out.println("Subtração: " + calc.subtracao(10, 5)); // Deve exibir 5
    }
}
