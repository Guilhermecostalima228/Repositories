import java.util.ArrayList;

public class Deposito {
    private ArrayList<Caixa> caixas;

    public Deposito() {
        caixas = new ArrayList<>();
    }

    public void adicionarCaixa(Caixa caixa) {
        caixas.add(caixa);
    }

    public boolean removerCaixa(String dono) {
        return caixas.removeIf(caixa -> caixa.getDono().equals(dono));
    }

    public int procurarCaixa(String dono) {
        for (int i = 0; i < caixas.size(); i++) {
            if (caixas.get(i).getDono().equals(dono)) {
                return i;
            }
        }
        return -1;
    }

    public void alterarCaixa(String dono, String novoCorredor, int novaPosicao) {
        int indice = procurarCaixa(dono);
        if (indice != -1) {
            Caixa caixa = caixas.get(indice);
            caixa.setCorredor(novoCorredor);
            caixa.setPosicao(novaPosicao);
        }
    }

    public Caixa[] caixasMaisPesadas(double peso) {
        return caixas.stream().filter(caixa -> caixa.getPeso() > peso).toArray(Caixa[]::new);
    }

    public void listarCaixas() {
        for (Caixa caixa : caixas) {
            System.out.println(caixa);
        }
    }
}
