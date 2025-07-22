package Java.inheritanceandpolymorphism.users.domain.adm;

public abstract class Funcionario {
    private String nome;
    private String email;
    private String senha;
    private boolean adm;
    private int vendas;
    private double dinheiro;

    public Funcionario(String nome, String email, String senha) {
        this.nome = nome;
        this.email = email;
        this.senha = senha;
        setAdm(false);
    }

    public void login(){
        System.out.println("Realizando login...");
    }

    public void logOff(){
        System.out.println("Saindo da conta");
    }

    public void alterarNome(String nome){
       this.nome = nome;
        System.out.println("Nome alterado");
    }

    public void alterarEmail(String email){
        this.email = email;
        System.out.println("Email alterado");
    }

    public void alterarSenha(String senha){
        this.senha = senha;
        System.out.println("Senha alterada");
    }



    protected String getNome() {
        return nome;
    }

    protected void setNome(String nome) {
        this.nome = nome;
    }

    protected String getEmail() {
        return email;
    }

    protected void setEmail(String email) {
        this.email = email;
    }

    protected String getSenha() {
        return senha;
    }

    protected void setSenha(String senha) {
        this.senha = senha;
    }

    protected boolean isAdm() {
        return adm;
    }

    protected void setAdm(boolean adm) {
        this.adm = adm;
    }

    protected int getVendas() {
        return vendas;
    }

    protected void setVendas(int vendas) {
        this.vendas = vendas;
    }

    protected double getDinheiro() {
        return dinheiro;
    }

    protected void setDinheiro(double dinheiro) {
        this.dinheiro = dinheiro;
    }
}
