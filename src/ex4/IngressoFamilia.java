package ex4;

public class IngressoFamilia extends Ingresso {

    private int quantidadePessoas;

    public IngressoFamilia(double valorBase, String nomeFilme, boolean isDublado, int quantidadePessoas) {
        super(valorBase, nomeFilme, isDublado);
        this.quantidadePessoas = quantidadePessoas;
    }

    @Override
    public double getValorReal() {
        double valorTotal = valorBase * quantidadePessoas;

        if (quantidadePessoas > 3)
            valorTotal *= 0.95;
        return valorTotal;
    }

    public int getQuantidadePessoas() {
        return quantidadePessoas;
    }

    @Override
    public String toString() {
        return super.toString() + String.format(" - Família (%d pessoas): R$%.2f",
                quantidadePessoas, getValorReal());
    }
}
