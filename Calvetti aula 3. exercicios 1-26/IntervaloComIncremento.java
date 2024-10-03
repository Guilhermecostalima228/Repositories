import java.util.Scanner;

public class IntervaloComIncremento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o limite superior:");
        int limiteSuperior = sc.nextInt();

        System.out.println("Digite o incremento:");
        int incremento = sc.nextInt();

        System.out.println("Números de 0 até " + limiteSuperior + " com incremento de " + incremento + ":");
        for (int i = 0; i <= limiteSuperior; i += incremento) {
            System.out.print(i + " ");
        }

        sc.close();
    }
}
