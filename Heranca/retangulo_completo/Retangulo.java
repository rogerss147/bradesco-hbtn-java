
public class Retangulo extends FormaGeometrica {
    private double largura;
    private double altura;

    public double getLargura() {
        return largura;
    }

    public double getAltura() {
        return altura;
    }

    public void setLargura(double largura) throws Exception {
        if (getLargura() < 0)
            throw new java.lang.IllegalArgumentException("Largura deve ser maior ou igual a 0");
        this.largura = largura;
    }

    public void setAltura(double altura) throws Exception {
        if (getAltura() < 0)
            throw new java.lang.IllegalArgumentException("Altura deve ser maior ou igual a 0");
        this.altura = altura;
    }

    @Override
    public double area() {
        return this.getAltura() * this.getLargura();
    }

    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", this.getLargura(), this.getAltura());
    }
}
