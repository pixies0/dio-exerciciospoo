package ex7;

public class ServicoEmail implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por email: " + mensagem);
    }

}
