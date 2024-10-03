import java.util.Scanner;

public class UrnaEletronica {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] votos = new int[4];
        int totalVotos = 0;

        while (true) {
            System.out.println("Digite o número do candidato (1 a 4) ou -1 para encerrar:");
            int voto = sc.nextInt();

            if (voto == -1) {
                break;
            }

            if (voto >= 1 && voto <= 4) {
                votos[voto - 1]++;
                totalVotos++;
            } else {
                System.out.println("Número inválido. Tente novamente.");
            }
        }

        System.out.println("Resultados da eleição:");
        for (int i = 0; i < votos.length; i++) {
            double percentual = (totalVotos > 0) ? (votos[i] * 100.0 / totalVotos) : 0;
            System.out.printf("Candidato %d: %d votos (%.2f%%)\n", i + 1, votos[i], percentual);
        }

        System.out.println("Total de eleitores: " + totalVotos);
        sc.close();
    }
}
