package exercicios.lista_3;

import java.util.Scanner;

public class ex1 {
    static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        try
        {
            System.out.print("Digite um número inteiro: ");
            int num = teclado.nextInt();

            if(num < 0)
            {
                System.out.println("Não existe raiz quadrada real para número negativo.");
            }
            else
            {
                double raiz = Math.sqrt(num);
                System.out.println("Raiz quadrada: " + raiz);
            }
        }
        catch(Exception e)
        {
            System.out.println("Erro: "+e);
        }
    }
}
