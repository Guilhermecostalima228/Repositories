import java.util.Scanner;

public class LerNomes {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nome;
        
        System.out.println("Digite nomes (FIM para parar):");
        while (!(nome = sc.nextLine()).equalsIgnoreCase("FIM")) {
            System.out.println(nome);
        }
        
        sc.close();
    }
}
