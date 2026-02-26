package primeiroProjetoJava;

import java.util.Scanner;

public class Ex2 {

	public static void main(String[] args) {
		
		Scanner teclado = new Scanner(System.in);
		
		double precoCombustivel = 4.9;
		double odometroInicio;
		double odometroFinal;
		
		System.out.print("Kilometragem no início do dia: \n ->");
		odometroInicio = teclado.nextDouble();
		int retorno = 0;
		do {
			if(retorno == 1)
			{
				System.out.println("A kilometragem final não pode ser menor que a inicial");
			}
			
			System.out.print("Kilometragem no final do dia: \n ->");
			odometroFinal = teclado.nextDouble();
			
			retorno = 1;
		}while (odometroFinal<odometroInicio);
			
		double kmRodados = odometroFinal - odometroInicio;
		
		double combustivel;
		
		System.out.print("Quantos litros de combustivel foram gastos no dia? \n ->");
		combustivel = teclado.nextDouble();
		
		double valorRecebido;
		
		System.out.print("Quanto foi o valor recebido dos passageiros no dia? \n ->");
		valorRecebido = teclado.nextDouble();
		
		double mediaConsumo = kmRodados/combustivel;
		double lucro = valorRecebido - (combustivel * precoCombustivel);
		
		System.out.printf("Media do consumo do dia %.2f Km/L\n", mediaConsumo);
		System.out.printf("Lucro líquido do dia: %.2f", lucro);

	}

}
