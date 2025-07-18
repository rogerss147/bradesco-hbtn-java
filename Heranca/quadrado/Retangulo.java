public class Retangulo extends FormaGeometrica {
    protected double largura;
    protected double altura;

    public double getLargura() {
        return largura;
    }

    public void setLargura(double largura) {
        if (largura > 0)
            this.largura = largura;
        else
            throw new java.lang.UnsupportedOperationException("Largura deve ser maior ou igual a 0");
    }

    public double getAltura() {
        return altura;
    }

    public void setAltura(double altura) {
        if (altura > 0)
            this.altura = altura;
        else
            throw new java.lang.UnsupportedOperationException("Altura deve ser maior ou igual a 0");
    }

    @Override
    public double area() {
        return this.getAltura() * this.getLargura();
    }

    public String toString() {
        return String.format("[Retangulo] %.2f / %.2f", this.getLargura(), this.getAltura());
    }
}