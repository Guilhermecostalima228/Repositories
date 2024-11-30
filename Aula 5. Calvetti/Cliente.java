public class Cliente {
    private String nome;
    private String cpf;
    private ContaCorrente conta;

    public Cliente(String nome, String cpf, ContaCorrente conta) {
        this.nome = nome;
        this.cpf = cpf;
        this.conta = conta;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public ContaCorrente getConta() {
        return conta;
    }

    public String getDados() {
        return "Cliente [nome=" + nome + ", CPF=" + cpf + ", Conta=" + conta.getNumero() + "-" + conta.getDigito() + "]";
    }
}
