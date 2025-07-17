package ex8;

public class ProdutoCultura extends Produto {

    public ProdutoCultura(double valor) {
        super(valor);
    }

    @Override
    public double calcularTributo() {
        return valor * 0.04; // 4%
    }

    public double getValor() {
        return valor;
    }

}
