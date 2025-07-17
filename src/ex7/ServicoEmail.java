package ex7;

public class ServicoEmail implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) throws EnvioException {
        try {
            if (mensagem == null || mensagem.isEmpty()) {
                throw new IllegalArgumentException("Mensagem vazia");
            }

            if (Math.random() < 0.2) {
                throw new RuntimeException("Falha na conexão com o servidor de e-mail");
            }

            System.out.println("Enviando mensagem por E-mail: " + mensagem);
        } catch (Exception e) {
            throw new EnvioException("E-mail", "Falha ao enviar e-mail", e);
        }
    }

}
