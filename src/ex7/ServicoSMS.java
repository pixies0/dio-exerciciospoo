package ex7;

public class ServicoSMS implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) throws EnvioException {
        try {
            if (mensagem.length() > 160) {
                throw new IllegalArgumentException("SMS não pode ter mais de 160 caracteres");
            }

            System.out.println("Enviando mensagem por SMS: " + mensagem);
        } catch (Exception e) {
            throw new EnvioException("SMS", "Falha ao enviar SMS", e);
        }
    }
}
