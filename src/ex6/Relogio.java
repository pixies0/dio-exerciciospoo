package ex6;

import java.util.Objects;

public abstract class Relogio {
    protected int hora;
    protected int minuto;
    protected int segundo;

    public Relogio(int hora, int minuto, int segundo) {
        setHora(hora);
        setMinuto(minuto);
        setSegundo(segundo);
    }

    // Getters e Setters com validações
    public int getHora() {
        return hora;
    }

    public void setHora(int hora) {
        if (hora < 0 || hora > 23) {
            throw new IllegalArgumentException("Hora inválida! Deve estar entre 0 e 23.");
        }
        this.hora = hora;
    }

    public int getMinuto() {
        return minuto;
    }

    public void setMinuto(int minuto) {
        if (minuto < 0 || minuto > 59) {
            throw new IllegalArgumentException("Minuto inválido! Deve estar entre 0 e 59.");
        }
        this.minuto = minuto;
    }

    public int getSegundo() {
        return segundo;
    }

    public void setSegundo(int segundo) {
        if (segundo < 0 || segundo > 59) {
            throw new IllegalArgumentException("Segundo inválido! Deve estar entre 0 e 59.");
        }
        this.segundo = segundo;
    }

    public String getHoraFormatada() {
        return String.format("%02d:%02d:%02d", hora, minuto, segundo);
    }

    public abstract String getHoraCompleta();

    public void sincronizar(Relogio outroRelogio) {
        Objects.requireNonNull(outroRelogio, "Relógio não pode ser nulo");

        int novaHora = outroRelogio.getHora();
        int novoMinuto = outroRelogio.getMinuto();
        int novoSegundo = outroRelogio.getSegundo();

        this.setHora(novaHora);
        this.setMinuto(novoMinuto);
        this.setSegundo(novoSegundo);

        System.out.println("Relógio sincronizado com sucesso!");
    }
}
