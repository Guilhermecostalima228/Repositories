public class data {
    public static void main(String[] args) {
        int data = 160924;
        
        int dia = data / 10000;
        int mes = (data / 100) % 100;
        int ano = data % 100;
        
        System.out.println("Dia: " + dia);
        System.out.println("Mês: " + mes);
        System.out.println("Ano: " + ano);
    }
}
