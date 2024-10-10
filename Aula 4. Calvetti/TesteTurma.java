import javax.swing.JOptionPane;

public class TesteTurma 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog("Nome da Turma");
        String curso = JOptionPane.showInputDialog("Curso");
        int quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Quantidade de Alunos"));
        int serie = Integer.parseInt(JOptionPane.showInputDialog("Série"));

        Turma turma = new Turma(nome, curso, quantidadeDeAlunos, serie);

        String msg = "Nome: " + turma.getNome() +
                     "\nCurso: " + turma.getCurso() +
                     "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() +
                     "\nSérie: " + turma.getSerie();

        JOptionPane.showMessageDialog(null, msg);

        quantidadeDeAlunos = Integer.parseInt(JOptionPane.showInputDialog("Nova Quantidade de Alunos"));
        turma.setQuantidadeDeAlunos(quantidadeDeAlunos);

        msg = "Nome: " + turma.getNome() +
              "\nCurso: " + turma.getCurso() +
              "\nQuantidade de Alunos: " + turma.getQuantidadeDeAlunos() +
              "\nSérie: " + turma.getSerie();

        JOptionPane.showMessageDialog(null, msg);
    }
}
