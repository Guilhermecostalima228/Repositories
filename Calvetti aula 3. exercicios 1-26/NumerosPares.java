import java.util.Scanner;

public class NumerosPares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite a quantidade de números pares que deseja imprimir:");
        int quantidade = sc.nextInt();

        int numero = 2;
        for (int i = 0; i < quantidade; i++) {
            System.out.print(numero + " ");
            numero += 2;
        }

        sc.close();
    }
}
