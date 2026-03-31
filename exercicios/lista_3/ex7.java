package exercicios.lista_3;

public class ex7 {
    static void main(String[] args) {
//        Algumas exceções comuns que contém tratamento:
//
//        - ArithmeticException:
//        Ocorre quando há erro matemático, como divisão por zero.
//
//        - NullPointerException:
//        Ocorre quando tentamos usar uma variável que está nula (sem valor).
//
//        - ArrayIndexOutOfBoundsException:
//        Ocorre quando acessamos uma posição inválida de um array.
//
//        - NumberFormatException:
//        Ocorre ao tentar converter uma String inválida para número.
//
//        - InputMismatchException:
//        Ocorre quando o tipo digitado pelo usuário é diferente do esperado.

        try
        {
            int a = 10 / 0;
        }
        catch(ArithmeticException e)
        {
            System.out.println("Erro: " + e);
        }

        try
        {
            int[] vetor = new int[3];
            System.out.println(vetor[10]);
        }
        catch(ArrayIndexOutOfBoundsException e)
        {
            System.out.println("Erro: " + e);
        }
    }
}
