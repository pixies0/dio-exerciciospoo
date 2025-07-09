package ex3;

import java.util.Scanner;
import util.MenuUtil;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        PetMachine maquina = new PetMachine();

        MenuUtil menu = new MenuUtil("Máquina de Banho - Petshop");

        menu.adicionarOpcao("Colocar pet na máquina", new Runnable() {
            public void run() {
                maquina.colocarPet();
            }
        });

        menu.adicionarOpcao("Retirar pet da máquina", new Runnable() {
            public void run() {
                maquina.retirarPet();
            }
        });

        menu.adicionarOpcao("Dar banho no pet", new Runnable() {
            public void run() {
                maquina.darBanho();
            }
        });

        menu.adicionarOpcao("Abastecer com água", new Runnable() {
            public void run() {
                maquina.abastecerAgua();
            }
        });

        menu.adicionarOpcao("Abastecer com shampoo", new Runnable() {
            public void run() {
                maquina.abastecerShampoo();
            }
        });

        menu.adicionarOpcao("Verificar nível de água", new Runnable() {
            public void run() {
                maquina.verificarNivelAgua();
            }
        });

        menu.adicionarOpcao("Verificar nível de shampoo", new Runnable() {
            public void run() {
                maquina.verificarNivelShampoo();
            }
        });

        menu.adicionarOpcao("Verificar se tem pet na máquina", new Runnable() {
            public void run() {
                maquina.verificarPetNaMaquina();
            }
        });

        menu.adicionarOpcao("Limpar máquina", new Runnable() {
            public void run() {
                maquina.limparMaquina();
            }
        });

        menu.adicionarOpcao("Mostrar status completo", new Runnable() {
            public void run() {
                System.out.println("\n--- STATUS DA MÁQUINA ---");
                maquina.verificarPetNaMaquina();
                maquina.verificarNivelAgua();
                maquina.verificarNivelShampoo();
            }
        });

        menu.executar();
        scanner.close();
    }
}