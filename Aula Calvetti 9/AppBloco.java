import javax.swing.*;

public class AppBloco {
    public static void main(String[] args) {
        BlocoDeNotas bloco = new BlocoDeNotas();
        int opcao;

        do {
            opcao = Integer.parseInt(JOptionPane.showInputDialog(
                "1) Inserir nota\n" +
                "2) Remover nota\n" +
                "3) Alterar nota\n" +
                "4) Listar todas as notas\n" +
                "5) Sair"
            ));

            switch (opcao) {
                case 1:
                    String nota = JOptionPane.showInputDialog("Digite a nota:");
                    bloco.inserirNota(nota);
                    break;
                case 2:
                    int indiceRemover = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da nota para remover:")) - 1;
                    if (bloco.removerNota(indiceRemover)) {
                        JOptionPane.showMessageDialog(null, "Nota removida com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                    break;
                case 3:
                    int indiceAlterar = Integer.parseInt(JOptionPane.showInputDialog("Digite o índice da nota para alterar:")) - 1;
                    String novaNota = JOptionPane.showInputDialog("Digite a nova nota:");
                    if (bloco.alterarNota(indiceAlterar, novaNota)) {
                        JOptionPane.showMessageDialog(null, "Nota alterada com sucesso.");
                    } else {
                        JOptionPane.showMessageDialog(null, "Índice inválido.");
                    }
                    break;
                case 4:
                    bloco.listarNotas();
                    break;
                case 5:
                    JOptionPane.showMessageDialog(null, "Saindo do sistema.");
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Opção inválida.");
            }
        } while (opcao != 5);
    }
}
