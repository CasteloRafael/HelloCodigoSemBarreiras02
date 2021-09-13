package TestesParticulares;

public class Usuario {

    private String nome;
    private int senha;
    private String login;


    public Usuario() {

    }

    public static void add(Usuario d) {

    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getSenha() {
        return senha;
    }
    public void setSenha(int senha) {
        this.senha = senha;
    }
    public String getLogin() {
        return login;
    }
    public void setLogin(String login) {
        this.login = login;
    }

    @Override
    public String toString() {
        return "Usuario{" +
                "nome='" + nome + '\'' +
                ", senha=" + senha +
                ", login='" + login + '\'' +
                '}';
    }
}
