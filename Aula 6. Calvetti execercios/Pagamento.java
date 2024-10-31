public class Pagamento {
    private String nomeDoPagador;
    private String cpf;
    private double valorASerPago;

    // Construtor padrão
    public Pagamento() {
        this.nomeDoPagador = "";
        this.cpf = "";
        this.valorASerPago = 0.0;
    }

    // Construtor com parâmetros
    public Pagamento(String nomeDoPagador, String cpf, double valorASerPago) {
        this.nomeDoPagador = nomeDoPagador;
        this.cpf = cpf;
        this.valorASerPago = valorASerPago;
    }

    // Métodos de acesso e modificação
    public String getNomeDoPagador() {
        return nomeDoPagador;
    }

    public void setNomeDoPagador(String nomeDoPagador) {
        this.nomeDoPagador = nomeDoPagador;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public double getValorASerPago() {
        return valorASerPago;
    }

    public void setValorASerPago(double valorASerPago) {
        this.valorASerPago = valorASerPago;
    }
}
