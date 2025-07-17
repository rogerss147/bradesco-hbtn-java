package Heranca.salario;

public class Empregado {
    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    public double getSalarioFixo() {
        return salarioFixo;
    }

    public double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta())
            return 0;
        return salarioFixo * 10 / 100;
    }

    public double calcularSalarioTotal(Departamento departamento) {
        if (departamento.alcancouMeta())
            return salarioFixo;
        return salarioFixo + calcularBonus(departamento);
    }
}
