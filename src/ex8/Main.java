package ex8;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        List<Tributavel> produtos = new ArrayList<>();

        produtos.add(new ProdutoAlimentacao(100.0));
        produtos.add(new ProdutoSaude(200.0));
        produtos.add(new ProdutoVestuario(150.0));
        produtos.add(new ProdutoCultura(80.0));
        calcularETributos(produtos);


        System.out.println("\nUsando lambdas:");
        calcularTributosComLambdas(produtos);
    }

    public static void calcularETributos(List<Tributavel> produtos) {
        double totalTributos = 0.0;

        for (Tributavel produto : produtos) {
            double tributo = produto.calcularTributo();
            String tipoProduto = produto.getClass().getSimpleName().replace("Produto", "");
            double valorProduto = ((Produto) produto).getValor();

            System.out.printf("%s: Valor = R$%.2f | Tributo = R$%.2f%n",
                tipoProduto, valorProduto, tributo);

            totalTributos += tributo;
        }

        System.out.printf("%nTotal de tributos: R$%.2f%n", totalTributos);
    }

    // Versão alternativa usando lambdas
    public static void calcularTributosComLambdas(List<Tributavel> produtos) {
        produtos.forEach(p -> {
            double tributo = p.calcularTributo();
            String tipo = p.getClass().getSimpleName().replace("Produto", "");
            double valor = ((Produto) p).getValor();

            System.out.printf("%s: R$%.2f → R$%.2f de tributo%n",
                tipo, valor, tributo);
        });
    }
}
