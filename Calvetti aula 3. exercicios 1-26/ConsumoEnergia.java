import java.util.Scanner;

public class ConsumoEnergia {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int codigo, tipo;
        double kWh, custo;
        double totalResidencial = 0, totalComercial = 0, totalIndustrial = 0;
        int totalConsumidoresTipo1 = 0, totalConsumidoresTipo2 = 0;
        
        System.out.println("Digite o código do consumidor (0 para sair):");
        while ((codigo = sc.nextInt()) != 0) {
            System.out.println("Digite a quantidade de kWh consumidos:");
            kWh = sc.nextDouble();
            System.out.println("Digite o tipo de consumidor (1-Residencial, 2-Comercial, 3-Industrial):");
            tipo = sc.nextInt();
            
            switch (tipo) {
                case 1:
                    custo = kWh * 0.3;
                    totalResidencial += kWh;
                    totalConsumidoresTipo1++;
                    break;
                case 2:
                    custo = kWh * 0.5;
                    totalComercial += kWh;
                    totalConsumidoresTipo2++;
                    break;
                case 3:
                    custo = kWh * 0.7;
                    totalIndustrial += kWh;
                    break;
                default:
                    System.out.println("Tipo de consumidor inválido!");
                    continue;
            }
            System.out.printf("Custo total do consumidor %d: R$ %.2f\n", codigo, custo);
        }

        double mediaTipo1 = (totalConsumidoresTipo1 > 0) ? totalResidencial / totalConsumidoresTipo1 : 0;
        double mediaTipo2 = (totalConsumidoresTipo2 > 0) ? totalComercial / totalConsumidoresTipo2 : 0;

        System.out.printf("Consumo total Residencial: %.2f kWh\n", totalResidencial);
        System.out.printf("Consumo total Comercial: %.2f kWh\n", totalComercial);
        System.out.printf("Consumo total Industrial: %.2f kWh\n", totalIndustrial);
        System.out.printf("Média de consumo tipo 1 (Residencial): %.2f kWh\n", mediaTipo1);
        System.out.printf("Média de consumo tipo 2 (Comercial): %.2f kWh\n", mediaTipo2);

        sc.close();
    }
}
