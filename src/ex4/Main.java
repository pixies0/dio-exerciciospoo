package ex4;

public class Main {
    public static void main(String[] args) {
        Ingresso normal = new Ingresso(30.0, "O Poderoso Chefão", false) {
            @Override
            public double getValorReal() {
                return valorBase;
            }
        };

        MeiaEntrada meia = new MeiaEntrada(30.0, "O Poderoso Chefão", false);
        IngressoFamilia familia1 = new IngressoFamilia(30.0, "O Poderoso Chefão", false, 3);
        IngressoFamilia familia2 = new IngressoFamilia(30.0, "O Poderoso Chefão", false, 5);

        System.out.println(normal);
        System.out.println(meia);
        System.out.println(familia1);
        System.out.println(familia2);
    }
}
