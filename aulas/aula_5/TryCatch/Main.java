package aulas.aula_5.TryCatch;

public class Main {
    static void main(String[] args) {
        try {
            int[] numeros = {1, 2, 3};
            System.out.println(numeros[3]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Array ");

        } catch (Exception e) {
            System.out.println("Exeção: "+e.toString());
        }
    }
}
