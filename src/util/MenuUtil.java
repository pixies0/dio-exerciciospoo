package util;

import java.util.Scanner;
import java.util.LinkedHashMap;
import java.util.Map;

public class MenuUtil {
    private static final Scanner scanner = new Scanner(System.in);
    private final LinkedHashMap<String, Runnable> opcoes = new LinkedHashMap<>();
    private final String titulo;

    public MenuUtil(String titulo) {
        this.titulo = titulo;
    }

    public void adicionarOpcao(String descricao, Runnable acao) {
        opcoes.put(descricao, acao);
    }

    public void executar() {
        while (true) {
            TerminalUtil.limparTerminal(); // Limpa o terminal antes de exibir o menu
            System.out.println("\n--- " + titulo + " ---");
            int i = 1;
            for (Map.Entry<String, Runnable> entry : opcoes.entrySet()) {
                System.out.println(i++ + ". " + entry.getKey());
            }
            System.out.println("0. Sair");
            System.out.print("Escolha uma opção: ");

            try {
                int escolha = Integer.parseInt(scanner.nextLine());
                if (escolha == 0) {
                    System.out.println("Saindo...");
                    break;
                } else if (escolha > 0 && escolha <= opcoes.size()) {
                    TerminalUtil.limparTerminal(); // Limpa antes de executar a ação
                    Runnable acao = opcoes.values().toArray(new Runnable[0])[escolha - 1];
                    acao.run();
                    TerminalUtil.pausar(); // Pausa após a ação
                } else {
                    System.out.println("Opção inválida!");
                    TerminalUtil.pausar();
                }
            } catch (NumberFormatException e) {
                System.out.println("Digite um número válido!");
                TerminalUtil.pausar();
            }
        }
    }
}