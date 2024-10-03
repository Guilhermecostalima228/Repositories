import java.util.Scanner;

public class ContarNumerosEntre100e200 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int contador = 0;
        int numero;
        
        System.out.println("Digite números (0 para sair):");
        while ((numero = sc.nextInt()) != 0) {
            if (numero >= 100 && numero <= 200) {
                contador++;
            }
        }
        
        System.out.println("Quantidade de números entre 100 e 200: " + contador);
        
        sc.close();
    }
}
