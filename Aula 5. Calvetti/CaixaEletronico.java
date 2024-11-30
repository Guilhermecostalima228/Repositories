public class CaixaEletronico {
    public static void main(String[] args) {
        Agencia agencia = new Agencia("Centro", 7890, 5);
        ContaCorrente conta = new ContaCorrente(1234, agencia, 150.00);
        Cliente cliente = new Cliente("Ademar Apior", "123231518-12", conta);

        System.out.println(cliente.getDados());
        System.out.println(agencia.getDados());
        conta.imprimirSaldo();

        // Operações
        System.out.println("Saque de 140.0: " + conta.sacar(140.0));
        conta.imprimirSaldo();

        System.out.println("Saque de 200.0: " + conta.sacar(200.0));
        conta.imprimirSaldo();

        conta.depositar(25.45);
        conta.imprimirSaldo();
    }
}
