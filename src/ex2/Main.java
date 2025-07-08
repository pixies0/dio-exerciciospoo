package ex2;

import java.util.Scanner;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Carro carro = new Carro();

        // Menu interativo
        MenuUtil menu = new MenuUtil("Controle do Carro");

        menu.adicionarOpcao("Ligar carro", new Runnable() {
            public void run() {
                carro.ligarCarro("ligar");
            }
        });

        menu.adicionarOpcao("Desligar carro", new Runnable() {
            public void run() {
                carro.desligarCarro(carro.getLigado(), carro.getMarcha(), carro.getVelocidade());
            }
        });

        menu.adicionarOpcao("Acelerar", new Runnable() {
            public void run() {
                carro.aumentarVelocidade();
            }
        });

        menu.adicionarOpcao("Diminuir velocidade", new Runnable() {
            public void run() {
                carro.diminuirVelocidade();
            }
        });

        menu.adicionarOpcao("Virar para esquerda", new Runnable() {
            public void run() {
                System.out.println(carro.virar("esquerda", carro.getVelocidade()));
            }
        });

        menu.adicionarOpcao("Virar para direita", new Runnable() {
            public void run() {
                System.out.println(carro.virar("direita", carro.getVelocidade()));
            }
        });

        menu.adicionarOpcao("Verificar velocidade", new Runnable() {
            public void run() {
                System.out.println("Velocidade atual: " + carro.getVelocidade() + " km/h");
            }
        });

        menu.adicionarOpcao("Aumentar marcha", new Runnable() {
            public void run() {
                carro.aumentarMarcha();
            }
        });

        menu.adicionarOpcao("Diminuir marcha", new Runnable() {
            public void run() {
                carro.diminuirMarcha();
            }
        });

        menu.adicionarOpcao("Trocar para marcha específica", new Runnable() {
            public void run() {
                System.out.print("Digite a marcha desejada (0-6): ");
                try {
                    int marcha = Integer.parseInt(scanner.nextLine());
                    carro.trocarMarcha(marcha);
                } catch (NumberFormatException e) {
                    System.out.println("Por favor, digite um número válido!");
                }
            }
        });

        menu.adicionarOpcao("Verificar estado atual", new Runnable() {
            public void run() {
                System.out.println("\n--- ESTADO DO CARRO ---");
                System.out.println("Status: " + (carro.getLigado() ? "Ligado" : "Desligado"));
                System.out.println("Marcha: " + (carro.getMarcha() == 0 ? "Ponto morto" : carro.getMarcha() + "ª"));
                System.out.println("Velocidade: " + carro.getVelocidade() + " km/h");
            }
        });

        menu.adicionarOpcao("Como dirigir (ajuda)", new Runnable() {
            public void run() {
                System.out.println("\n--- INSTRUÇÕES ---");
                System.out.println("1. Ligue o carro");
                System.out.println("2. Aumente para 1ª marcha");
                System.out.println("3. Acelere até 5-10 km/h");
                System.out.println("4. Aumente para 2ª marcha");
                System.out.println("5. Continue acelerando e trocando marchas");
                System.out.println("6. Para reduzir: freie e depois diminua as marchas");
            }
        });

        // Executa o menu
        menu.executar();
        scanner.close();
    }
}