package ex9;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<FiguraGeometrica> figuras = new ArrayList<>();

        figuras.add(new Quadrado(5.0));
        figuras.add(new Retangulo(4.0, 6.0));
        figuras.add(new Circulo(3.0));
        calcularEExibirAreas(figuras);

        System.out.println("\nUsando expressões lambda:");
        figuras.forEach(figura -> {
            System.out.printf("%s: Área = %.2f%n",
                figura.getClass().getSimpleName(),
                figura.calcularArea());
        });
    }

    public static void calcularEExibirAreas(List<FiguraGeometrica> figuras) {
        for (FiguraGeometrica figura : figuras) {
            String nomeFigura = figura.getClass().getSimpleName();
            double area = figura.calcularArea();

            String detalhes = "";
            if (figura instanceof Quadrado) {
                detalhes = String.format(" (lado = %.1f)", ((Quadrado) figura).getLado());
            } else if (figura instanceof Retangulo) {
                detalhes = String.format(" (base = %.1f, altura = %.1f)",
                    ((Retangulo) figura).getBase(),
                    ((Retangulo) figura).getAltura());
            } else if (figura instanceof Circulo) {
                detalhes = String.format(" (raio = %.1f)", ((Circulo) figura).getRaio());
            }

            System.out.printf("%s%s: Área = %.2f%n", nomeFigura, detalhes, area);
        }
    }
}
