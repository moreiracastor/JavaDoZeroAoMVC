package Entities;

public class Candidato {
    public String nome;
    public int chapa;
    public int voto;

    public void votar(int voto){
        this.voto = voto;
    }

    public String toString(){
        return "Nome: "+ nome +" Chapa: " + chapa;
    }

    public int getChapa(){
        return chapa;
    }

    public int getVoto(){
        return voto;
    }

    public String getNome(){
        return nome;
    }
}
