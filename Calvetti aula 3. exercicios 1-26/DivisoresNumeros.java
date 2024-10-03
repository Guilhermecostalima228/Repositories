import java.util.Scanner;

public class DivisoresNumeros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero;

        System.out.println("Digite números (-999 para sair):");
        while ((numero = sc.nextInt()) != -999) {
            System.out.print("Divisores de " + numero + ": ");
            for (int i = 1; i <= Math.abs(numero); i++) {
                if (numero % i == 0) {
                    System.out.print(i + " ");
                }
            }
            System.out.println();
        }

        sc.close();
    }
}
