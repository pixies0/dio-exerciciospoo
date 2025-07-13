package ex5;

public class Main {
    public static void main(String[] args) {
        // Criando usuários
        Gerente gerente = new Gerente("João Silva", "joao@empresa.com", "123456");
        Vendedor vendedor = new Vendedor("Maria Souza", "maria@empresa.com", "654321");
        Atendente atendente = new Atendente("Carlos Oliveira", "carlos@empresa.com", "112233");

        // Testando funcionalidades
        gerente.realizarLogin("joao@empresa.com", "123456");
        gerente.gerarRelatorioFinanceiro();
        gerente.consultarVendas();
        gerente.alterarSenha("123456", "novaSenha");
        gerente.realizarLogoff();

        vendedor.realizarLogin("maria@empresa.com", "654321");
        vendedor.realizarVenda();
        vendedor.realizarVenda();
        vendedor.consultarVendas();
        vendedor.alterarDados("Maria Souza Santos", "maria.souza@empresa.com");

        atendente.realizarLogin("carlos@empresa.com", "112233");
        atendente.receberPagamento(150.50);
        atendente.receberPagamento(89.90);
        atendente.fecharCaixa();
    }
}
