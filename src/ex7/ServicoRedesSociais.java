package ex7;

public class ServicoRedesSociais implements ServicoMensagem {
    @Override
    public void enviarMensagem(String mensagem) {
        System.out.println("Enviando mensagem por redes sociais: " + mensagem);
    }

}
