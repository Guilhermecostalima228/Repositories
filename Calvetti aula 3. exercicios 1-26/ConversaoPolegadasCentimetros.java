public class ConversaoPolegadasCentimetros {
    public static void main(String[] args) {
        System.out.println("Tabela de conversão de polegadas para centímetros:");
        System.out.println("Polegadas\tCentímetros");

        for (int polegadas = 1; polegadas <= 20; polegadas++) {
            double centimetros = polegadas * 2.54;
            System.out.printf("%d\t\t%.2f\n", polegadas, centimetros);
        }
    }
}
