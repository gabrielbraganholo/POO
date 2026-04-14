package exercicios.lista_4.exercicio_8;

public class Retangulo {
    private int x;
    private int y;

    public Retangulo(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public int getX() {
        return x;
    }

    public int getY() {
        return y;
    }

    public void Retangulo(int x, int y) {
        System.out.println("x -> " + x + " | y -> " + y);
    }

    public void inserirLados(int x, int y) {
        this.x = x;
        this.y = y;
    }

    public void calcularArea(int x, int y) {
        int area = x * y;
        System.out.println("Área: " + area);
    }
}
