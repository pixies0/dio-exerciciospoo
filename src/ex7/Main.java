package ex7;

import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args){
        ServicoMensagem email = new ServicoEmail();
        ServicoMensagem sms = new ServicoSMS();
        ServicoMensagem redesSociais = new ServicoRedesSociais();
        ServicoMensagem whatsApp = new ServicoWhatsApp();

        List<ServicoMensagem> servicos = Arrays.asList(email, sms, redesSociais, whatsApp);

        String mensagemMarketing = "Promoção de verão: 50% de desconto!";
        enviarMensagemTodos(servicos, mensagemMarketing);

        System.out.println("\nUsando Lambdas:");
        enviarMensagemLambdas(mensagemMarketing);
    }

    public static void enviarMensagemTodos(List<ServicoMensagem> servicos, String mensagem) {
        for (ServicoMensagem servico : servicos) {
            servico.enviarMensagem(mensagem);
        }
    }

    public static void enviarMensagemLambdas(String mensagem){
        ServicoMensagem email = (msg) -> System.out.println("Enviando email: " + msg);
        ServicoMensagem sms = (msg) -> System.out.println("Enviando SMS: " + msg);
        ServicoMensagem redesSociais = (msg) -> System.out.println("Enviando mensagem em redes sociais: " + msg);
        ServicoMensagem whatsApp = (msg) -> System.out.println("Enviando mensagem via WhatsApp: " + msg);

        List<ServicoMensagem> servicos = Arrays.asList(email, sms, redesSociais, whatsApp);
        servicos.forEach(servico -> servico.enviarMensagem(mensagem));
    }


}