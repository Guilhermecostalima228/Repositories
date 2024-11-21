abstract class PessoaFisica {
    private String nome;
    private String cpf;

    public PessoaFisica(String nome, String cpf) {
        this.nome = nome;
        this.cpf = cpf;
    }

    public String getNome() {
        return nome;
    }

    public String getCpf() {
        return cpf;
    }

    public abstract String getDetalhes();
}

class Desempregado extends PessoaFisica {
    public Desempregado(String nome, String cpf) {
        super(nome, cpf);
    }

    @Override
    public String getDetalhes() {
        return "Desempregado.";
    }
}

abstract class Empregado extends PessoaFisica {
    public Empregado(String nome, String cpf) {
        super(nome, cpf);
    }

    public abstract double calcularSalario();
}

class Mensalista extends Empregado {
    private double salarioMensal;

    public Mensalista(String nome, String cpf, double salarioMensal) {
        super(nome, cpf);
        this.salarioMensal = salarioMensal;
    }

    @Override
    public double calcularSalario() {
        return salarioMensal;
    }

    @Override
    public String getDetalhes() {
        return "Mensalista com salário mensal: " + calcularSalario();
    }
}

class Comissionado extends Empregado {
    private double vendas, taxaComissao;

    public Comissionado(String nome, String cpf, double vendas, double taxaComissao) {
        super(nome, cpf);
        this.vendas = vendas;
        this.taxaComissao = taxaComissao;
    }

    @Override
    public double calcularSalario() {
        return vendas * taxaComissao;
    }

    @Override
    public String getDetalhes() {
        return "Comissionado com salário: " + calcularSalario();
    }
}
