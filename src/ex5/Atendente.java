package ex5;

public class Atendente extends Usuario {
    private double valorEmCaixa;

    public Atendente(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.valorEmCaixa = 0.0;
    }

    public void receberPagamento(double valor) {
        if (isLogado) {
            if (valor > 0) {
                valorEmCaixa += valor;
                System.out.println("Pagamento recebido com sucesso! Valor em caixa: " + valorEmCaixa);
            } else {
                System.out.println("Valor inválido para pagamento.");
            }
        } else {
            System.out.println("Usuário não está logado!");
        }
    }

    public void fecharCaixa() {
        if (isLogado) {
            System.out.println("Caixa fechado com sucesso! Valor total em caixa: " + valorEmCaixa);
            valorEmCaixa = 0.0;
        } else {
            System.out.println("Usuário não está logado!");
        }
    }

    public double getValorEmCaixa() {
        return valorEmCaixa;
    }
}
