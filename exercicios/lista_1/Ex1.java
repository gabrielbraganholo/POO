package primeiroProjetoJava;

import java.util.Scanner;

public class Ex1 {

	public static void main(String[] args) {
		
		double n1, n2;
		Scanner teclado = new Scanner(System.in);
		System.out.print("Digite um número: \n ->");
		n1 = teclado.nextDouble();
		System.out.print("Digite outro número: \n ->");
		n2 = teclado.nextDouble();
		
		double som, sub, mul, div;
		som = n1 + n2;
		sub = n1 - n2;
		mul = n1 * n2;
		div = n1 / n2;
		
		System.out.println("Soma: "+som);
		System.out.println("Subtração: "+sub);
		System.out.println("Multiplicação: "+mul);
		System.out.printf("Divisão: %.2f", div);
	}

}
