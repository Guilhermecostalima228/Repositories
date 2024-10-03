import java.util.Scanner;

public class ConversaoCelsiusFahrenheit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite inferior em graus Celsius:");
        int limiteInferior = sc.nextInt();

        System.out.println("Digite o limite superior em graus Celsius:");
        int limiteSuperior = sc.nextInt();

        System.out.println("Digite o incremento:");
        int incremento = sc.nextInt();

        System.out.println("Tabela de conversão de Celsius para Fahrenheit:");
        System.out.println("Celsius\tFahrenheit");

        for (int celsius = limiteInferior; celsius <= limiteSuperior; celsius += incremento) {
            double fahrenheit = (celsius * 9.0 / 5.0) + 32;
            System.out.printf("%d\t%.2f\n", celsius, fahrenheit);
        }

        sc.close();
    }
}
