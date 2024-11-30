import javax.swing.JOptionPane;

public class TesteAtribuicao {
    public static void main(String[] args) {
        Professor professor = new Professor("Carlos Silva", 45);
        Disciplina disciplina = new Disciplina("Matemática", true);
        Atribuicao atribuicao = new Atribuicao(professor, disciplina);

        JOptionPane.showMessageDialog(null, atribuicao.getDados());
    }
}
