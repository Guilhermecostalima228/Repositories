import java.util.Scanner;

public class NumerosImpares {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite o limite superior:");
        int limiteSuperior = sc.nextInt();

        System.out.println("Números ímpares menores que " + limiteSuperior + ":");
        for (int i = 1; i < limiteSuperior; i += 2) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
