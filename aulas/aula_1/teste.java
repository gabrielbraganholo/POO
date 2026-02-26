package primeiroProjetoJava;

import java.util.Scanner;

public class teste {

	public static void main(String[] args) {
		
		System.out.println("Olá, Mundo!");
		
		//int idade = 18;
		//System.out.print("A idade é: %d", idade);
		//System.out.println("A idade é "+ idade);
		
		//System.out.println("O indivíduo tem " + idade + " anos.");
		
		String nome;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite seu nome: \n ->");
		nome = teclado.nextLine();
		System.out.println("Nome digitado: "+nome);
		
		int idade;
		System.out.print("Digite sua idade: \n ->");
		idade = teclado.nextInt();
		
		if(idade <= 18)
		{
			System.out.println("Maior de idade");
		}
		else
		{
			System.out.println("Menor de idade");
		}
		
		double d;
		System.out.print("Digite um double: \n ->");
		d = teclado.nextDouble();
		System.out.println("Double digitado: "+d);
	}

}
