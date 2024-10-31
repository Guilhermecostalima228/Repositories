public class Teste {
    public static void main(String[] args) {
        // Teste com classes de pagamento
        CartaoDeCredito cartao = new CartaoDeCredito("João", "111.222.333-44", 100.0, "1234-5678-9012-3456");
        System.out.println(cartao.getNomeDoPagador() + " pagará " + cartao.getValorASerPago() + " com o cartão " + cartao.getNumeroDoCartao());

        // Teste com PessoaFisica e Desempregado
        Desempregado desempregado = new Desempregado("Carlos", "Silva", "555.666.777-88", 1500.0);
        System.out.println(desempregado.dados());
    }
}
