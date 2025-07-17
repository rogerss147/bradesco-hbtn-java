package Heranca.salario;

public class Departamento {
    double valorMeta;
    double valorAtingidoMeta;

    public Departamento(double valorAtingidoMeta, double valorMeta) {
        this.valorMeta = valorMeta;
        this.valorAtingidoMeta = valorAtingidoMeta;
    }

    double getValorMeta() {
        return valorMeta;
    }

    double getValorAtingidoMeta() {
        return valorAtingidoMeta;
    }

    boolean alcancouMeta() {
        if (getValorMeta() < getValorAtingidoMeta())
            return true;
        return false;
    }
}
