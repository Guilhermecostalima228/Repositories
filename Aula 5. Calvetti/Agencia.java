public class Agencia {
    private String nome;
    private int numero;
    private int digito;

    public Agencia(String nome, int numero, int digito) {
        this.nome = nome;
        this.numero = numero;
        this.digito = validarDigito(numero);
        if (this.digito != digito) {
            throw new IllegalArgumentException("Dígito da agência inválido.");
        }
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
        this.digito = validarDigito(numero);
    }

    public int getDigito() {
        return digito;
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

    public String getDados() {
        return "Agência [nome=" + nome + ", número=" + numero + ", dígito=" + digito + "]";
    }
}
