import java.util.Scanner;

public class ContarIdades {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int idade;
        int menos21 = 0, mais50 = 0;

        System.out.println("Digite a idade (valor fora de 0-120 para sair):");
        while (true) {
            idade = sc.nextInt();
            if (idade < 0 || idade > 120) break;

            if (idade < 21) {
                menos21++;
            } else if (idade > 50) {
                mais50++;
            }
        }

        System.out.printf("Total de pessoas com menos de 21 anos: %d\n", menos21);
        System.out.printf("Total de pessoas com mais de 50 anos: %d\n", mais50);
        
        sc.close();
    }
}
