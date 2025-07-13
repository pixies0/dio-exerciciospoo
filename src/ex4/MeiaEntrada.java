package ex4;

public class MeiaEntrada extends Ingresso {
    public MeiaEntrada(double valorBase, String nomeFilme, boolean isDublado) {
        super(valorBase, nomeFilme, isDublado);
    }

    @Override
    public double getValorReal() {
        return valorBase / 2;
    }

    @Override
    public String toString() {
         return super.toString() + String.format(" - Meia Entrada: R$%.2f", getValorReal());
    }
}
