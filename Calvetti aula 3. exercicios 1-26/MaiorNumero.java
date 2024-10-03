import java.util.Scanner;

public class MaiorNumero {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int numero, maior = Integer.MIN_VALUE;

        System.out.println("Digite números (-9999 para sair):");
        while ((numero = sc.nextInt()) != -9999) {
            if (numero > maior) {
                maior = numero;
            }
        }

        if (maior != Integer.MIN_VALUE) {
            System.out.println("O maior número digitado foi: " + maior);
        } else {
            System.out.println("Nenhum número foi digitado.");
        }

        sc.close();
    }
}
