package ex6;

public class RelogioAmericano extends Relogio {
    public RelogioAmericano(int hora, int minuto, int segundo) {
        super(converterPara12h(hora), minuto, segundo);
    }

    private static int converterPara12h(int hora24) {
        if (hora24 == 0) {
            return 12; // meia-noite
        } else if (hora24 > 12) {
            return hora24 - 12;
        }
        return hora24;
    }

    private String getPeriodo() {
        return hora < 12 ? "AM" : "PM";
    }

    @Override
    public void setHora(int hora) {
        if (hora < 1 || hora > 12) {
            throw new IllegalArgumentException("Hora inválida para formato americano! Deve estar entre 1 e 12.");
        }
        this.hora = hora;
    }

    @Override
    public String getHoraCompleta() {
        return String.format("US Time: %02d:%02d:%02d %s", hora, minuto, segundo, getPeriodo());
    }

    // Método específico para conversão de 24h para 12h
    public void setHoraFrom24h(int hora24) {
        if (hora24 < 0 || hora24 > 23) {
            throw new IllegalArgumentException("Hora inválida! Deve estar entre 0 e 23.");
        }
        this.hora = converterPara12h(hora24);
    }
}
