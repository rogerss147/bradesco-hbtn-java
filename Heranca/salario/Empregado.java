package Heranca.salario;

public class Empregado {
    double salarioFixo;

    public Empregado(double salarioFixo) {
        this.salarioFixo = salarioFixo;
    }

    double getSalarioFixo() {
        return salarioFixo;
    }

    double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta())
            return 0;
        return salarioFixo * 10 / 100;
    }

    double calcularSalarioTotal(Departamento departamento) {
        if (departamento.alcancouMeta())
            return salarioFixo;
        return salarioFixo + calcularBonus(departamento);
    }
}
