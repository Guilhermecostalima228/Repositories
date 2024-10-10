import javax.swing.JOptionPane;

public class Produto 
{
    private String nome;
    private double preco;
    private int quantidade;

    public Produto(String nome, double preco, int quantidade) 
    {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public String getNome() 
    {
        return nome;
    }

    public double getPreco() 
    {
        return preco;
    }

    public int getQuantidade() 
    {
        return quantidade;
    }

    public void setNome(String nome) 
    {
        this.nome = nome;
    }

    public void setPreco(double preco) 
    {
        this.preco = preco;
    }

    public void setQuantidade(int quantidade) 
    {
        this.quantidade = quantidade;
    }
}

class TesteProduto 
{
    public static void main(String[] args) 
    {
        String nome = JOptionPane.showInputDialog("Nome do Produto");
        double preco = Double.parseDouble(JOptionPane.showInputDialog("Preço"));
        int quantidade = Integer.parseInt(JOptionPane.showInputDialog("Quantidade"));

        Produto produto = new Produto(nome, preco, quantidade);

        String msg = "Nome: " + produto.getNome() +
                     "\nPreço: " + produto.getPreco() +
                     "\nQuantidade: " + produto.getQuantidade();

        JOptionPane.showMessageDialog(null, msg);
    }
}
