package util;

public class TerminalUtil {
    public static void limparTerminal() {
        try {
            if (System.getProperty("os.name").contains("Windows")) {
                new ProcessBuilder("cmd", "/c", "cls").inheritIO().start().waitFor();
            } else {
                System.out.print("\033[H\033[2J"); // Códigos ANSI para limpar terminal
                System.out.flush();
            }
        } catch (Exception e) {
            System.out.println("Não foi possível limpar o terminal: " + e.getMessage());
        }
    }

    public static void pausar() {
        System.out.println("\nPressione Enter para continuar...");
        try {
            System.in.read();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}