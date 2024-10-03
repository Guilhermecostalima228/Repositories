import java.util.Scanner;

public class CalculadoraComMenu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        double num1 = sc.nextDouble();

        System.out.println("Digite o segundo número:");
        double num2 = sc.nextDouble();

        while (true) {
            System.out.println("\nOperações Disponíveis:");
            System.out.println("1. Adição");
            System.out.println("2. Subtração");
            System.out.println("3. Multiplicação");
            System.out.println("4. Divisão");
            System.out.println("9. Sair do Programa");
            System.out.print("Digite o número de ordem da opção desejada: ");
            int opcao = sc.nextInt();

            if (opcao == 9) {
                System.out.println("Programa encerrado.");
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Resultado: " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("Resultado: " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("Resultado: " + (num1 * num2));
                    break;
                case 4:
                    if (num2 != 0) {
                        System.out.println("Resultado: " + (num1 / num2));
                    } else {
                        System.out.println("Erro: Divisão por zero não é permitida.");
                    }
                    break;
                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }
        }

        sc.close();
    }
}
