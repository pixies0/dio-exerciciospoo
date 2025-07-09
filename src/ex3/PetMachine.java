package ex3;

public class PetMachine {
    private boolean petNaMaquina;
    private boolean petLimpo;
    private double nivelAgua;
    private double nivelShampoo;

    // Constantes
    private static final int CAPACIDADE_MAXIMA_AGUA = 30;
    private static final int CAPACIDADE_MAXIMA_SHAMPOO = 10;
    private static final int CONSUMO_BANHO_AGUA = 10;
    private static final int CONSUMO_BANHO_SHAMPOO = 2;
    private static final int CONSUMO_LIMPEZA_AGUA = 3;
    private static final int CONSUMO_LIMPEZA_SHAMPOO = 1;
    private static final int ABASTECIMENTO_PASSO = 2;

    public PetMachine() {
        this.petNaMaquina = false;
        this.petLimpo = false;
        this.nivelAgua = 0;
        this.nivelShampoo = 0;
    }

    public void darBanho(){
        if (!petNaMaquina) {
            System.out.println("Nenhum pet na máquina.");
            return;
        }

        if (nivelAgua < CONSUMO_BANHO_AGUA){
            System.out.println("Nível de água insuficiente para dar banho.");
            System.out.println("Nível ATUAL: " + nivelAgua);
            return;
        }

        if (nivelShampoo < CONSUMO_BANHO_SHAMPOO) {
            System.out.println("Nível de shampoo insuficiente para dar banho.");
            System.out.println("Nível ATUAL: " + nivelShampoo);
            return;
        }


        nivelAgua -= CONSUMO_BANHO_AGUA;
        nivelShampoo -= CONSUMO_BANHO_SHAMPOO;
        petLimpo = true;
        System.out.println("Banho dado com sucesso!");
        System.out.println("Nível de água restante: " + nivelAgua);
        System.out.println("Nível de shampoo restante: " + nivelShampoo);
    }

    public void abastecerAgua(){
        if(nivelAgua + ABASTECIMENTO_PASSO > CAPACIDADE_MAXIMA_AGUA){
            nivelAgua = CAPACIDADE_MAXIMA_AGUA;
            System.out.println("Nível de água já está no máximo.");
            return;
        }else {
            nivelAgua += ABASTECIMENTO_PASSO;
            System.out.println("Água abastecida com sucesso!");
        }
    }

    public void abastecerShampoo(){
        if(nivelShampoo + ABASTECIMENTO_PASSO > CAPACIDADE_MAXIMA_SHAMPOO){
            nivelShampoo = CAPACIDADE_MAXIMA_SHAMPOO;
            System.out.println("Nível de shampoo já está no máximo.");
            return;
        }else {
            nivelShampoo += ABASTECIMENTO_PASSO;
            System.out.println("Shampoo abastecido com sucesso!");
        }
    }

    public void colocarPet(){
        if (petNaMaquina) {
            System.out.println("Já existe um pet na máquina.");
            return;
        }

        petNaMaquina = true;
        petLimpo = false;
        System.out.println("Pet colocado na máquina com sucesso!");
    }

    public void retirarPet(){
        if(!petNaMaquina) {
            System.out.println("Nenhum pet na máquina.");
            return;
        }

        if(!petLimpo) {
            System.out.println("ATENÇÃO: Pet retirado sem estar limpo! Máquina ficou suja.");
        }

        petNaMaquina = false;
        System.out.println("Pet retirado da máquina!");
    }

    public void limparMaquina(){
        if(petNaMaquina) {
            System.out.println("Não é possível limpar a máquina com um pet dentro.");
            return;
        }

        if(nivelAgua < CONSUMO_LIMPEZA_AGUA || nivelShampoo < CONSUMO_LIMPEZA_SHAMPOO) {
            System.out.println("Recursos insuficiente para limpeza.");
            System.out.println("Nível de água: " + nivelAgua);
            System.out.println("Nível de shampoo: " + nivelShampoo);
            return;
        }

        nivelAgua -= CONSUMO_LIMPEZA_AGUA;
        nivelShampoo -= CONSUMO_LIMPEZA_SHAMPOO;
        System.out.println("Máquina limpa com sucesso!");
    }

    public void verificarNivelAgua() {
        System.out.println("Nível de água: " + nivelAgua);
    }

    public void verificarNivelShampoo() {
        System.out.println("Nível de shampoo: " + nivelShampoo);
    }


    public void verificarPetNaMaquina() {
        System.out.println(petNaMaquina ? "Há um pet na máquina." : "Não há pet na máquina.");
    }
}
