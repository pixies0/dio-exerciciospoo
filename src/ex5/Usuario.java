package ex5;

public abstract class Usuario {
    protected String nome;
    protected String email;
    protected String senha;
    protected boolean isAdmin;
    protected boolean isLogado;

    public Usuario(String nome, String email, String senha, boolean isAdmin) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        this.isAdmin = isAdmin;
        this.isLogado = false;
    }

    public void realizarLogin(String email, String senha) {
        if (this.email.equals(email) && this.senha.equals(senha)) {
            this.isLogado = true;
            System.out.println(nome + " logado com sucesso!");
        } else {
            throw new IllegalArgumentException("Email ou senha inválidos.");
        }
    }

    public void realizarLogoff() {
        this.isLogado = false;
        System.out.println(nome + " deslogado com sucesso!");
    }

    public void alterarDados(String novoNome, String novoEmail) {
        if (isLogado) {
            this.nome = novoNome;
            this.email = novoEmail;
            System.out.println("Dados alterados com sucesso!");
        } else {
            System.out.println("Usuário não está logado!");
        }
    }

    public void alterarSenha(String senhaAntiga, String novaSenha) {
        if (isLogado && this.senha.equals(senhaAntiga)) {
            this.senha = novaSenha;
            System.out.println("Senha alterada com sucesso!");
        } else {
            System.out.println("Não foi possível alterar a senha!");
        }
    }

    public String getNome() {
        return nome;
    }

    public String getEmail() {
        return email;
    }

    public boolean isAdmin() {
        return isAdmin;
    }

    public boolean isLogado() {
        return isLogado;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }
}
