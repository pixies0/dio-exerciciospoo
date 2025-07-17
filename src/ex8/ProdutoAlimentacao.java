package ex8;

public class ProdutoAlimentacao extends Produto {

    public ProdutoAlimentacao(double valor) {
        super(valor);
    }

    @Override
    public double calcularTributo() {
        return valor * 0.01; // 1%
    }

    public double getValor() {
        return valor;
    }
}
