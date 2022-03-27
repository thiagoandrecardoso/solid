package DIP.good.model;


import DIP.good.interfaces.IContato;

public class Cliente implements IContato {
    private String nome;
    private String email;
    private String celular;

    public Cliente(String nome, String email, String celular) {
        this.nome = nome;
        this.email = email;
        this.celular = celular;
    }

    public Cliente() {

    }

    @Override
    public String getNome() {
        return nome;
    }

    @Override
    public void setNome(String nome) {
        this.nome = nome;
    }

    @Override
    public String getEmail() {
        return email;
    }

    @Override
    public void setEmail(String email) {
        this.email = email;
    }

    @Override
    public String getCelular() {
        return celular;
    }

    @Override
    public void setCelular(String celular) {
        this.celular = celular;
    }
}
