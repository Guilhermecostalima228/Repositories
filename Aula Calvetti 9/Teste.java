import javax.swing.*;

public class Teste {
    public static void main(String[] args) {
        Deposito deposito = new Deposito();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Adicionar caixa\n" +
                "2) Remover caixa\n" +
                "3) Procurar caixa\n" +
                "4) Alterar caixa\n" +
                "5) Listar caixas com peso > 10\n" +
                "6) Listar todas as caixas\n" +
                "7) Sair"
            ));

            switch (opcao) {
                case 1:
                    String corredor = JOptionPane.showInputDialog("Digite o corredor:");
                    int posicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a posição:"));
                    double peso = Double.parseDouble(JOptionPane.showInputDialog("Digite o peso:"));
                    String dono = JOptionPane.showInputDialog("Digite o nome do dono:");
                    deposito.adicionarCaixa(new Caixa(corredor, posicao, peso, dono));
                    break;
                case 2:
                    String donoRemover = JOptionPane.showInputDialog("Digite o nome do dono:");
                    if (deposito.removerCaixa(donoRemover)) {
                        JOptionPane.showMessageDialog(null, "Caixa removida.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;
                case 3:
                    String donoProcurar = JOptionPane.showInputDialog("Digite o nome do dono:");
                    int posicaoCaixa = deposito.procurarCaixa(donoProcurar);
                    if (posicaoCaixa != -1) {
                        JOptionPane.showMessageDialog(null, "Caixa encontrada na posição " + posicaoCaixa);
                    } else {
                        JOptionPane.showMessageDialog(null, "Caixa não encontrada.");
                    }
                    break;
                case 4:
                    String donoAlterar = JOptionPane.showInputDialog("Digite o nome do dono:");
                    String novoCorredor = JOptionPane.showInputDialog("Digite o novo corredor:");
                    int novaPosicao = Integer.parseInt(JOptionPane.showInputDialog("Digite a nova posição:"));
                    deposito.alterarCaixa(donoAlterar, novoCorredor, novaPosicao);
                    break;
                case 5:
                    Caixa[] caixasPesadas = deposito.caixasMaisPesadas(10.0);
                    for (Caixa caixa : caixasPesadas) {
                        System.out.println(caixa);
                    }
                    break;
                case 6:
                    deposito.listarCaixas();
                    break;
                case 7:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 7);
    }
}
