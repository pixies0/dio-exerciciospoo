package ex7;

public class ServicoWhatsApp implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por WhatsApp: " + mensagem);
    }

}
