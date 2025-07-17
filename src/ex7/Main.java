package ex7;

// Main.java
import java.util.Arrays;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        ServicoMensagem email = new ServicoEmail();
        ServicoMensagem sms = new ServicoSMS();
        ServicoMensagem redesSociais = new ServicoRedesSociais();
        ServicoMensagem whatsapp = new ServicoWhatsApp();

        List<ServicoMensagem> servicos = Arrays.asList(email, sms, redesSociais, whatsapp);

        String mensagemMarketing = "Confira nossas novas promoções!";
        enviarMensagemParaTodosComTratamento(servicos, mensagemMarketing);

        try {
            System.out.println("\nTestando com mensagem vazia:");
            enviarMensagemParaTodosComTratamento(servicos, "");
        } catch (RuntimeException e) {
            System.err.println("Erro crítico: " + e.getMessage());
        }
    }

    public static void enviarMensagemParaTodosComTratamento(List<ServicoMensagem> servicos, String mensagem) {
        for (ServicoMensagem servico : servicos) {
            try {
                servico.enviarMensagem(mensagem);
            } catch (EnvioException e) {
                System.err.printf("Erro no serviço %s: %s (Causa: %s)%n",
                    e.getServico(), e.getMessage(), e.getCause().getMessage());
            }
        }
    }

    public static void enviarMensagemComLambdas(String mensagem) {
        List<ServicoMensagem> servicos = Arrays.asList(
            m -> {
                try {
                    if (Math.random() < 0.3) throw new RuntimeException("Falha aleatória no e-mail");
                    System.out.println("Enviando por E-mail: " + m);
                } catch (Exception e) {
                    throw new EnvioException("E-mail", "Falha no envio", e);
                }
            },
            m -> {
                try {
                    if (m.length() > 160) throw new IllegalArgumentException("SMS muito longo");
                    System.out.println("Enviando por SMS: " + m);
                } catch (Exception e) {
                    throw new EnvioException("SMS", "Falha no envio", e);
                }
            }
        );

        servicos.forEach(s -> {
            try {
                s.enviarMensagem(mensagem);
            } catch (EnvioException e) {
                System.err.println("Erro com lambda: " + e.getMessage());
            }
        });
    }
}