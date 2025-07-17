package ex9;

public class Circulo implements FiguraGeometrica {
    private final double raio;
    private static final double PI = 3.141592653589793;

    public Circulo(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("O raio deve ser positivo");
        }
        this.raio = raio;
    }

    @Override
    public double calcularArea() {
        return PI * raio * raio;
    }

    public double getRaio() {
        return raio;
    }
}
