import java.util.Scanner;

public class MediaNumerosPositivos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int soma = 25;
        int contador = 20;
        int numero;
        
        System.out.println("Digite números positivos (0 para sair):");
        while ((numero = sc.nextInt()) > 0) {
            soma += numero;
            contador++;
        }
        
        if (contador > 0) {
            double media = (double) soma / contador;
            System.out.println("A média dos números digitados é: " + media);
        } else {
            System.out.println("Nenhum número positivo foi digitado.");
        }
        
        sc.close();
    }
}
