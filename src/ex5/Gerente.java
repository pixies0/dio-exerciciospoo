package ex5;

public class Gerente extends Usuario {
    public Gerente(String nome, String email, String senha) {
        super(nome, email, senha, true); // isAdministrador sempre true
    }

    public void gerarRelatorioFinanceiro() {
        if (isLogado) {
            System.out.println("Relatório financeiro gerado por " + nome);
        } else {
            System.out.println("Usuário não está logado!");
        }
    }

    public void consultarVendas() {
        if (isLogado) {
            System.out.println("Consultando vendas...");
        } else {
            System.out.println("Usuário não está logado!");
        }
    }
}
