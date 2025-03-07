package section8.Bank.Entities;

public class User {
    private String name;
    private String cep;
    private String cpf;

    //Métodos construtores
    public User(String name, String cep, String cpf){
        this.name = name;
        this.cep = cep;
        this.cpf = cpf;
    }

    public User() {
    }

    //Getters
    public String getCpf() {
        return cpf;
    }

    public String getCep() {
        return cep;
    }

    public String getName() {
        return name;
    }

    //Setters


    public void setName(String name) {
        this.name = name;
    }

    //Métodos
    public String toString(){
        return getName() + " " + getCep() + " " + getCpf();
    }
}
