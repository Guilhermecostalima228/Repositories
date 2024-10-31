public class Empregado extends PessoaFisica {
    // Atributos e métodos específicos de Empregado

    public Empregado() {
        super();
    }

    public Empregado(String nome, String sobrenome, String cpf) {
        super(nome, sobrenome, cpf);
    }

    @Override
    public String dados() {
        return super.dados() + " (detalhes específicos do empregado)";
    }
}
