package ex2;

public class Carro {
    private boolean ligado;
    private double velocidade;
    private int marcha;
    private final int[] LIMITES_MARCHA = { 0, 20, 40, 60, 80, 100 };

    public Carro() {
        this.ligado = false;
        this.velocidade = 0.0;
        this.marcha = 0;
    }

    // Operação de ligar o carro :check:
    public void ligarCarro(String ligado) {
        this.ligado = true;
    }

    // Operação de desligar o carro :check:
    public void desligarCarro(boolean ligado, int marcha, double velocidade) {
        if (ligado) {
            if (marcha == 0 && velocidade == 0) {
                ligado = false;
                System.out.println("Carro desligado.");
            } else {
                System.out
                        .println("Não pode desligar: coloque em ponto morto (marcha 0) e pare o carro (velocidade 0)");
            }
        } else {
            System.out.println("O carro já está desligado.");
        }
    }

    // Operação de acelerar :check:
    public void aumentarVelocidade() {
        if (!ligado) {
            System.out.println("Carro desligado. Ligue o carro primeiro.");
            return;
        }

        if (marcha == 0) {
            System.out.println("Não pode acelerar em ponto morto!");
            return;
        }

        if (velocidade < LIMITES_MARCHA[marcha]) {
            velocidade++;
            System.out.println("Acelerando. Velocidade atual: " + velocidade + "km/h");
        } else {
            System.out.println("Velocidade máxima para " + marcha +
                    "ª marcha atingida (" + LIMITES_MARCHA[marcha] + "km/h)");
        }
    }

    }

    // Operação de freiar :check:
    public void diminuirVelocidade() {
        if (ligado == true) {
            velocidade -= 5.0; // Diminui a velocidade em 5.0 km/h
            if (velocidade < 0) {
                velocidade = 0;
            }
        } else {
            System.out.println("Carro desligado, não é possível desacelerar.");
        }
    }

    // Operacao de virar :check:
    // Parametro pode ser "esquerda" ou "direita"
    public String virar(String direcao, double velocidade) {
        if (ligado == true && (velocidade > 1.0 && velocidade < 40.0)) {
            return "Carro virando para " + direcao;
        } else {
            return "O carro está parado";
        }
    }

    // Verificar Velocidade :check:
    public double getVelocidade() {
        if (ligado == true)
            return velocidade;
        return 0.0; // Retorna 0 se o carro estiver desligado
    }

    // Operação de trocar marcha :check:
    // Parâmetro deve ser um número entre 0 (ponto morto) e 6 (marcha máxima)
    // Não pode pular marchas, deve apenas aumentar ou reduzir uma marcha de cada
    // vez
    public void trocarMarcha(int novaMarcha) {
        if (!ligado) {
            System.out.println("Carro desligado. Ligue o carro primeiro.");
            return;
        }

        if (novaMarcha < 0 || novaMarcha > 6) {
            System.out.println("Marcha inválida! Deve ser entre 0 (ponto morto) e 6.");
            return;
        }

        if (Math.abs(novaMarcha - marcha) > 1) {
            System.out.println("Não pode pular marchas! Use aumentar/diminuir marcha.");
            return;
        }

        if (novaMarcha == marcha) {
            System.out.println("O carro já está nesta marcha!");
            return;
        }

        if (novaMarcha > marcha) {
            aumentarMarcha();
        } else {
            diminuirMarcha();
        }
    }

    public void aumentarMarcha() {
        if (!ligado) {
            System.out.println("Carro desligado. Ligue o carro primeiro.");
            return;
        }

        if (marcha < 6) {
            int novaMarcha = marcha + 1;

            if (velocidade >= LIMITES_MARCHA[novaMarcha - 1] + 1 &&
                    velocidade <= LIMITES_MARCHA[novaMarcha]) {
                marcha = novaMarcha;
                System.out.println("Marcha aumentada para: " + marcha + "ª");
            } else {
                System.out.println("Velocidade " + velocidade + "km/h não compatível com " +
                        (novaMarcha) + "ª marcha (" +
                        (LIMITES_MARCHA[novaMarcha - 1] + 1) + "-" +
                        LIMITES_MARCHA[novaMarcha] + "km/h)");
            }
        } else {
            System.out.println("Já está na 6ª marcha!");
        }
    }

    public void diminuirMarcha() {
        if (!ligado) {
            System.out.println("Carro desligado. Ligue o carro primeiro.");
            return;
        }

        if (marcha > 0) {
            int novaMarcha = marcha - 1;

            if (velocidade >= LIMITES_MARCHA[novaMarcha - 1] + 1 &&
                    velocidade <= LIMITES_MARCHA[novaMarcha]) {
                marcha = novaMarcha;
                System.out.println("Marcha diminuída para: " + marcha + "ª");
            } else if (novaMarcha == 0 && velocidade == 0) {
                marcha = novaMarcha;
                System.out.println("Colocado em ponto morto");
            } else {
                System.out.println("Velocidade " + velocidade + "km/h não compatível com " +
                        (novaMarcha) + "ª marcha (" +
                        (novaMarcha == 0 ? "0" : (LIMITES_MARCHA[novaMarcha - 1] + 1)) +
                        "-" + LIMITES_MARCHA[novaMarcha] + "km/h)");
            }
        } else {
            System.out.println("Já está em ponto morto!");
        }
    }

    public boolean getLigado() {
        return ligado;
    }

    public int getMarcha() {
        return marcha;
    }

    public void setVelocidade(double velocidade) {
        this.velocidade = velocidade;
    }

    public void setMarcha(char marcha) {
        this.marcha = marcha;
    }
}
