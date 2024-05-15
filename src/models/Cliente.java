package models;

public class Cliente {
    private String nome;
    private String cpf;
    private String telefone;
    private String email;

    public String exibirCliente(){
        return "Bom dia " + this.nome +
                "\nSeu cpf foi cadastrado como: " + this.cpf +
                "\nSeu telefone é: " + this.telefone +
                "\nE seu email é: " + this.email;
    }


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getCpf() {
        return cpf;
    }

    public void setCpf(String cpf) {
        this.cpf = cpf;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
