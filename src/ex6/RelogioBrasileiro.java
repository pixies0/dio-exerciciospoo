package ex6;

public class RelogioBrasileiro extends Relogio {
    public RelogioBrasileiro(int hora, int minuto, int segundo) {
        super(hora, minuto, segundo);
    }

    @Override
    public String getHoraCompleta() {
        return String.format("Horário do Brasil: %02d:%02d:%02d", hora, minuto, segundo);
    }
}
