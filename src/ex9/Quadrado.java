package ex9;

public class Quadrado implements FiguraGeometrica {
    private final double lado;

    public Quadrado(double lado) {
        if (lado <= 0) {
            throw new IllegalArgumentException("O lado do quadrado deve ser positivo");
        }
        this.lado = lado;
    }

    @Override
    public double calcularArea() {
        return lado * lado;
    }

    public double getLado() {
        return lado;
    }
}
