package exercicios.lista_4.exercicio_3;

public class Retangulo {
    private double altura;
    private double base;

    public Retangulo(double altura, double base) {
        this.setAltura(altura);
        this.setBase(base);
    }

    public double getAltura() {
        return altura;
    }

    public double getBase() {
        return base;
    }

    public void setAltura(double altura) {
        if (altura > 0) {
            this.altura = altura;
        }
        else {
            System.err.println("Altura precisa ser positiva");
        }
    }

    public void setBase(double base) {
        if (base == getAltura()) {
            System.err.println("Base e altura precisam ser diferentes");
        }
        else if (base > 0 && base != getAltura()) {
            this.base = base;
        }
        else {
            System.err.println("Base precisa ser positiva");
        }
    }

    public double calcularArea(double altura, double base) {
        return altura * base;
    }
}
