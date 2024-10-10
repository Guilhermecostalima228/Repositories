import javax.swing.JOptionPane;

public class Disciplina 
{
    private String nome;
    private String professor;
    private int semestre;
    private boolean ofertada;

    public Disciplina(String nome, String professor, int semestre, boolean ofertada) 
    {
        this.nome = nome;
        this.professor = professor;
        this.semestre = semestre;
        this.ofertada = ofertada;
    }

    public String getNome() 
    {
        return nome;
    }

    public String getProfessor() 
    {
        return professor;
    }

    public int getSemestre() 
    {
        return semestre;
    }

    public boolean isOfertada() 
    {
        return ofertada;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setProfessor(String professor) 
    {
        this.professor = professor;
    }

    public void setSemestre(int semestre) 
    {
        this.semestre = semestre;
    }

    public void setOfertada(boolean ofertada) 
    {
        this.ofertada = ofertada;
    }
}

class TesteDisciplina 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog("Nome da Disciplina");
        String professor = JOptionPane.showInputDialog("Nome do Professor");
        int semestre = Integer.parseInt(JOptionPane.showInputDialog("Semestre"));
        boolean ofertada = Boolean.parseBoolean(JOptionPane.showInputDialog("Ofertada? (true/false)"));

        Disciplina disciplina = new Disciplina(nome, professor, semestre, ofertada);

        String msg = "Nome: " + disciplina.getNome() +
                     "\nProfessor: " + disciplina.getProfessor() +
                     "\nSemestre: " + disciplina.getSemestre() +
                     "\nOfertada: " + (disciplina.isOfertada() ? "sim" : "não");

        JOptionPane.showMessageDialog(null, msg);
    }
}
