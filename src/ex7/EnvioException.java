package ex7;

public class EnvioException extends Exception {
    private final String servico;

    public EnvioException(String servico, String mensagem) {
        super(mensagem);
        this.servico = servico;
    }

    public EnvioException(String servico, String mensagem, Throwable causa) {
        super(mensagem, causa);
        this.servico = servico;
    }

    public String getServico() {
        return servico;
    }
}
