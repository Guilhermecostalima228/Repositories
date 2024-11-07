class Motor {
    public String ligar() {
        return "Motor ligado";
    }
}

class Carro {
    private Motor motor;

    public Carro(Motor motor) {
        this.motor = motor;
    }

    public String ligarCarro() {
        return motor.ligar();
    }
}

// Classe principal para testes
public class TesteCarro {
    public static void main(String[] args) {
        Motor motor = new Motor();
        Carro carro = new Carro(motor);
        System.out.println(carro.ligarCarro()); // Deve exibir "Motor ligado"
    }
}
