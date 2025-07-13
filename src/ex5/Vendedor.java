package ex5;

public class Vendedor extends Usuario{
    private int quantidadeVendas;

    public Vendedor(String nome, String email, String senha) {
        super(nome, email, senha, false);
        this.quantidadeVendas = 0;
    }

    public void realizarVenda(){
        if (isLogado) {
            quantidadeVendas++;
            System.out.println("Venda realizada com sucesso! Total de vendas: " + quantidadeVendas);
        } else {
            System.out.println("Usuário não está logado!");
        }
    }

    public void consultarVendas() {
        if (isLogado) {
            System.out.println("Total de vendas realizadas: " + quantidadeVendas);
        } else {
            System.out.println("Usuário não está logado!");
        }
    }

    public int getQuantidadeVendas() {
        return quantidadeVendas;
    }
}
