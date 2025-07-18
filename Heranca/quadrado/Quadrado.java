public class Quadrado extends Retangulo {
    private double lado;

    public double getLado() {
        return lado;
    }

    public void setLado(double lado) {
        if (lado > 0) {
            this.lado = lado;
            this.altura = lado;
            this.largura = lado;
        } else
            throw new java.lang.IllegalArgumentException("Lado deve ser maior ou igual a 0");
    }

    public String toString() {
        return String.format("[Quadrado] %.2f", this.lado);
    }
}