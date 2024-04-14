import java.util.Scanner;

public class Circulo {
    
    private double raio;
    private String cor;

    
    public Circulo(double raio, String cor) {
        this.raio = raio;
        this.cor = cor;
    }

    
    public double calcularArea() {
        return Math.PI * raio * raio;
    }

    public double calcularPerimetro() {
        return 2 * Math.PI * raio;
    }

    
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Digite o raio do circulo: ");
        double raio = scanner.nextDouble();

        System.out.print("Digite a cor do circulo: ");
        String cor = scanner.next();

        
        Circulo circulo = new Circulo(raio, cor);

        
        System.out.println("Caracteristicas do Circulo:");
        System.out.println("Raio: " + circulo.raio);
        System.out.println("Cor: " + circulo.cor);

        
        System.out.println("Area do Circulo: " + circulo.calcularArea());
        System.out.println("Perimetro do Circulo: " + circulo.calcularPerimetro());

        scanner.close();
    }
}
