package exercicios.lista_3;

import java.util.Scanner;

public class ex2 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try
        {
            System.out.print("Digite o primeiro número: ");
            double a = teclado.nextDouble();

            System.out.print("Digite o segundo número: ");
            double b = teclado.nextDouble();

            System.out.print("Escolha a operação (+ - * /): ");
            char op = teclado.next().charAt(0);

            double resultado;

            if(op == '+')
            {
                resultado = a + b;
            }
            else if(op == '-')
            {
                resultado = a - b;
            }
            else if(op == '*')
            {
                resultado = a * b;
            }
            else if(op == '/')
            {
                resultado = a / b;
            }
            else
            {
                System.out.println("Operação inválida.");
                return;
            }

            System.out.println("Resultado: " + resultado);
        }
        catch(Exception e)
        {
            System.out.println("Erro: " + e);
        }
    }
}
