package aulas.aula_6;

import java.util.Scanner;

public class main {
    static void main(String[] args) {
        //Pessoa p = new Pessoa();
        //p.nome = "Gabriel";
        //p.idade = 20;

        Scanner sc = new Scanner(System.in);
        Pessoa p = new Pessoa("Gabriel", 20);
        //String nome;
        //nome = p.getNome(); // esse metodo retorna uma string com o nome
        System.out.println("Nome: "+p.getNome());

        System.out.println("Novo nome: ");
        p.setNome(sc.nextLine());
        System.out.println("Nome: "+p.getNome());

        int idade;
        idade = p.getIdade();
        System.out.println("Idade: "+p.getIdade());

        System.out.println("Digite a nova idade: ");
        p.setIdade(sc.nextInt());
        System.out.println("Idade: "+p.getIdade());

    }
}
