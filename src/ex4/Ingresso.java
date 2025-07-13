package ex4;

public abstract class Ingresso {
    protected double valorBase;
    protected String nomeFilme;
    protected boolean isDublado;

    public Ingresso(double valorBase, String nomeFilme, boolean isDublado) {
        this.valorBase = valorBase;
        this.nomeFilme = nomeFilme;
        this.isDublado = isDublado;
    }

    public abstract double getValorReal();

    public String getNomeFilme() {
        return nomeFilme;
    }

    public boolean isDublado() {
        return isDublado;
    }

    @Override
    public String toString() {
        return String.format("Filme: %s (%s) - Valor Base: R$%.2f",
                nomeFilme,
                isDublado ? "Dublado" : "Legendado",
                valorBase);
    }

}
