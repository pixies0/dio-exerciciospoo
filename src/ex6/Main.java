package ex6;

public class Main {
    public static void main(String[] args) {
        RelogioBrasileiro relogioBR = new RelogioBrasileiro(14, 30, 45);
        RelogioAmericano relogioUS = new RelogioAmericano(2, 30, 45);

        System.out.println(relogioBR.getHoraCompleta());
        System.out.println(relogioUS.getHoraCompleta());

        System.out.println("BR (24h): " + relogioBR.getHoraFormatada());
        System.out.println("US (12h): " + relogioUS.getHoraFormatada());

        relogioUS.sincronizar(relogioBR);
        System.out.println(relogioUS.getHoraCompleta());
        try {
            relogioUS.setHora(15); // Lançará exceção
        } catch (IllegalArgumentException e) {
            System.out.println("Erro: " + e.getMessage());
        }

        relogioUS.setHoraFrom24h(23);
        System.out.println(relogioUS.getHoraCompleta());
    }
}
