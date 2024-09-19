public class angulo {
    public static void main(String[] args) {
        double anguloGraus = 30;  // Exemplo de ângulo em graus
        double anguloRad = Math.toRadians(anguloGraus);
        
        double seno = Math.sin(anguloRad);
        double cosseno = Math.cos(anguloRad);
        double tangente = Math.tan(anguloRad);
        double secante = 1 / cosseno;
        double cossecante = 1 / seno;
        double cotangente = 1 / tangente;
        
        System.out.println("Seno: " + seno);
        System.out.println("Cosseno: " + cosseno);
        System.out.println("Tangente: " + tangente);
        System.out.println("Secante: " + secante);
        System.out.println("Cossecante: " + cossecante);
        System.out.println("Cotangente: " + cotangente);
    }
}
