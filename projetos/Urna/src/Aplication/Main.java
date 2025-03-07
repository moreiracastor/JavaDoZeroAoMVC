package Aplication;

import Entities.Candidato;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        ArrayList<String> candidatos = new ArrayList<>();
        ArrayList<Integer> voto = new ArrayList<>();
        ArrayList<Integer> chapa = new ArrayList<>();

        Candidato cd = new Candidato();
        Scanner sc = new Scanner(System.in);

        String request = "";

        while(true){
            System.out.print("Digite o nome do candidato: ");
            cd.nome = sc.nextLine();

            System.out.print("Digite a chapa: ");
            cd.chapa = sc.nextInt();
            sc.nextLine();

            candidatos.add(cd.toString());
            chapa.add(cd.getChapa());

            System.out.println("Deseja sair?");
            request = sc.nextLine();

            if(request.toLowerCase() == "sim"){
                break;
            }
        }

        for(String cand : candidatos){
            System.out.println(cand);
        }

        for (Integer chap : chapa){
            System.out.println(chap);
        }
    }
}
