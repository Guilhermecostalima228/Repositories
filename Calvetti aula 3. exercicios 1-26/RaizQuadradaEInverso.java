import java.util.Scanner;

public class RaizQuadradaEInverso {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double numero;
        
        System.out.println("Digite números (-999 para sair):");
        while ((numero = sc.nextDouble()) != -999) {
            if (numero >= 0) {
                System.out.printf("Raiz quadrada: %.2f\n", Math.sqrt(numero));
            } else {
                System.out.println("Raiz quadrada: Número negativo");
            }
            if (numero != 0) {
                System.out.printf("Inverso: %.4f\n", 1 / numero);
            } else {
                System.out.println("Inverso: Divisão por zero");
            }
        }
        
        sc.close();
    }
}
