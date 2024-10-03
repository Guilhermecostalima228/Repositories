import java.util.Scanner;

public class FiltroNomeIdadeSexo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        for (int i = 1; i <= 20; i++) {
            System.out.println("Digite o nome da pessoa " + i + ":");
            String nome = sc.next();

            System.out.println("Digite a idade da pessoa " + i + ":");
            int idade = sc.nextInt();

            System.out.println("Digite o sexo da pessoa " + i + " (M/F):");
            char sexo = sc.next().toUpperCase().charAt(0);

            if (sexo == 'M' && idade > 21) {
                System.out.println("Nome: " + nome);
            }
        }

        sc.close();
    }
}
