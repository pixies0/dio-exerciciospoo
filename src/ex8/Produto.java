package ex8;

public abstract class Produto implements Tributavel {
    protected final double valor;

    public Produto(double valor) {
        this.valor = valor;
    }

    public double getValor() {
        return valor;
    }
}
