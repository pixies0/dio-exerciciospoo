package ex8;

public class ProdutoSaude extends Produto  {

    public ProdutoSaude(double valor) {
        super(valor);
    }

    @Override
    public double calcularTributo() {
        return valor * 0.015; // 1.5%
    }

    public double getValor() {
        return valor;
    }
}
