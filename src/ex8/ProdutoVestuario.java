package ex8;

public class ProdutoVestuario extends Produto {

    public ProdutoVestuario(double valor) {
        super(valor);
    }

    @Override
    public double calcularTributo() {
        return valor * 0.025; // 2%
    }

    public double getValor() {
        return valor;
    }

}
