import java.util.Scanner;

public class QuantidadeNumerosPrimos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, contPrimos = 0;

        System.out.println("Digite números inteiros positivos (número não positivo para sair):");
        while ((numero = sc.nextInt()) > 0) {
            boolean ehPrimo = true;
            if (numero <= 1) {
                ehPrimo = false;
            } else {
                for (int i = 2; i <= Math.sqrt(numero); i++) {
                    if (numero % i == 0) {
                        ehPrimo = false;
                        break;
                    }
                }
            }

            if (ehPrimo) {
                contPrimos++;
            }
        }

        System.out.println("Quantidade de números primos digitados: " + contPrimos);

        sc.close();
    }
}
