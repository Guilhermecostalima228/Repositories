public class data2 {
    public static void main(String[] args) {
        String data = "16/09/24";
        String[] partes = data.split("/");
        
        String dia = partes[0];
        String mes = partes[1];
        String ano = partes[2];
        
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}
