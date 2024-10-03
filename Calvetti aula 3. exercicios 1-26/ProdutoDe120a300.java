import java.math.BigInteger;

public class ProdutoDe120a300 {
    public static void main(String[] args) {
        BigInteger produto = BigInteger.ONE;

        for (int i = 120; i <= 300; i++) {
            produto = produto.multiply(BigInteger.valueOf(i));
        }

        System.out.println("O produto de todos os números de 120 a 300 é: " + produto);
    }
}
