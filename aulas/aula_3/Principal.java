package aulas.aula_3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        Aluno a1 = new Aluno();
        System.out.println("Digite o nome do aluno: ");
        a1.nome = teclado.nextLine();
        System.out.println("Digite a matrícula: ");
        a1.matricula = teclado.nextLine();
        System.out.println("Digite o cpf: ");
        a1.cpf = teclado.nextLine();

        System.out.println("Nome: "+ a1.nome+"\nMatrícula: "+a1.matricula+"\nCPF: "+a1.cpf);
    }
}
