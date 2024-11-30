public class ContaCorrente {
    private int numero;
    private int digito;
    private Agencia agencia;
    private double saldo;

    public ContaCorrente(int numero, Agencia agencia, double saldoInicial) {
        this.numero = numero;
        this.digito = validarDigito(numero);
        this.agencia = agencia;
        this.saldo = saldoInicial;
    }

    public int getNumero() {
        return numero;
    }

    public int getDigito() {
        return digito;
    }

    public Agencia getAgencia() {
        return agencia;
    }

    public double getSaldo() {
        return saldo;
    }

    public void depositar(double valor) {
        if (valor > 0) {
            saldo += valor;
        }
    }

    public double sacar(double valor) {
        if (valor <= saldo) {
            saldo -= valor;
            return valor;
        } else {
            System.out.println("Saldo insuficiente. Saque não efetuado.");
            return 0;
        }
    }

    public void imprimirSaldo() {
        System.out.println("Conta Corrente: " + numero + "-" + digito);
        System.out.println("Agência: " + agencia.getNumero() + "-" + agencia.getDigito());
        System.out.println("Saldo: " + saldo);
    }

    private int validarDigito(int numero) {
        String numStr = String.format("%04d", numero);
        int[] pesos = {4, 6, 8, 2};
        int soma = 0;

        for (int i = 0; i < numStr.length(); i++) {
            soma += Character.getNumericValue(numStr.charAt(i)) * pesos[i];
        }
        int resto = soma % 11;
        return resto == 10 ? 0 : resto;
    }
}
