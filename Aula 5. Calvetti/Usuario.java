public class Usuario {
    public static void main(String[] args) {
        CondicionadorDeAr condicionador = new CondicionadorDeAr();

        condicionador.imprimirTemperatura(); // Tenta imprimir sem ligar

        condicionador.ligar();
        condicionador.aumentarTemperatura(); // 21 graus
        condicionador.aumentarTemperatura(); // 22 graus

        // Testando limites superiores
        for (int i = 0; i < 10; i++) {
            condicionador.aumentarTemperatura();
        }
        condicionador.imprimirTemperatura(); // Máximo permitido: 28 graus

        // Testando limites inferiores
        for (int i = 0; i < 20; i++) {
            condicionador.reduzirTemperatura();
        }
        condicionador.imprimirTemperatura(); // Mínimo permitido: 15 graus

        condicionador.desligar();
        condicionador.imprimirTemperatura(); // Tentativa com o ar desligado
    }
}
