import javax.swing.JOptionPane;

public class comprimento {
    public static void main(String[] args) {
        String str1 = JOptionPane.showInputDialog("Quantos anos você tem:");
        String str2 = JOptionPane.showInputDialog("em qual ano nasceu:");
        String str3 = JOptionPane.showInputDialog("qual a data do seu aniversario:");
        
        int comprimentoTotal = str1.length() + str2.length() + str3.length();
        JOptionPane.showMessageDialog(null, "A soma dos comprimentos das strings é: " + comprimentoTotal);
    }
}