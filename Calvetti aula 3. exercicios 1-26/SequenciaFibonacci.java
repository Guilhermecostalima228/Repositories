import java.util.Scanner;

public class SequenciaFibonacci {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite um número para exibir a sequência de Fibonacci até ele:");
        int numero = sc.nextInt();

        int a = 0, b = 1, c;
        System.out.print(a + " ");
        while (b <= numero) {
            System.out.print(b + " ");
            c = a + b;
            a = b;
            b = c;
        }

        sc.close();
    }
}
