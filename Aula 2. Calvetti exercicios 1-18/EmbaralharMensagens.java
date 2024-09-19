import javax.swing.JOptionPane;

public class EmbaralharMensagens {
    public static void main(String[] args) {
        // Leitura das três frases
        String frase1 = JOptionPane.showInputDialog("Digite a primeira frase:");
        String frase2 = JOptionPane.showInputDialog("Digite a segunda frase:");
        String frase3 = JOptionPane.showInputDialog("Digite a terceira frase:");
        
        // Separando as frases ao meio
        String primeiraMetade1 = frase1.substring(0, frase1.length() / 2);
        String segundaMetade1 = frase1.substring(frase1.length() / 2);

        String primeiraMetade2 = frase2.substring(0, frase2.length() / 2);
        String segundaMetade2 = frase2.substring(frase2.length() / 2);

        String primeiraMetade3 = frase3.substring(0, frase3.length() / 2);
        String segundaMetade3 = frase3.substring(frase3.length() / 2);
        
        // Montagem da nova frase embaralhada
        String fraseEmbaralhada = primeiraMetade2 + segundaMetade3 + segundaMetade2 +
                                  primeiraMetade1 + primeiraMetade3 + segundaMetade1;
        
        // Concatenação das frases originais
        String frasesOriginais = frase1 + " " + frase2 + " " + frase3;
        
        // Exibição das frases originais e da frase embaralhada
        JOptionPane.showMessageDialog(null, "Frases originais: " + frasesOriginais +
                                            "\nFrase embaralhada: " + fraseEmbaralhada);
    }
}