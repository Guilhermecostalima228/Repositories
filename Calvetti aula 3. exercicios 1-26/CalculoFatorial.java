import java.util.Scanner;

public class CalculoFatorial {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para calcular o fatorial:");
        int numero = sc.nextInt();
        long fatorial = 1;

        for (int i = 2; i <= numero; i++) {
            fatorial *= i;
        }

        System.out.println("O fatorial de " + numero + " é: " + fatorial);

        sc.close();
    }
}
