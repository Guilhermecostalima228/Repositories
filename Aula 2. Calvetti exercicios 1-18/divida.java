public class divida{
  public static void main(String[] args){
    double valorInicial = 100.0;
    double juros = 10.0;
    int meses = 8;
    
    
    double valorFinal = valorInicial * Math.pow(1 + juros / 100, meses);
    System.out.println("Após " + meses + " meses, você deverá: R$ " + valorFinal);
    }
}
    