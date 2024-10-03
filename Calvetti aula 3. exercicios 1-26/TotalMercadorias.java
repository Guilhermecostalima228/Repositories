import java.util.Scanner;

public class TotalMercadorias {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double total = 0;

        while (true) {
            System.out.println("Digite o preço da mercadoria:");
            double preco = sc.nextDouble();

            while (preco < 0) {
                System.out.println("Preço inválido. Digite novamente:");
                preco = sc.nextDouble();
            }

            System.out.println("Digite a quantidade de itens:");
            int quantidade = sc.nextInt();

            while (quantidade < 0) {
                System.out.println("Quantidade inválida. Digite novamente:");
                quantidade = sc.nextInt();
            }

            if (quantidade == 0) {
                break;
            }

            total += preco * quantidade;
        }

        System.out.printf("Total a ser pago: R$ %.2f\n", total);
        sc.close();
    }
}
