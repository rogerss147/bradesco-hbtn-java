package Heranca.salario;

public class Gerente extends Empregado {

    public Gerente(double salarioFixo) {
        super(salarioFixo);
        // TODO Auto-generated constructor stub
    }

    @Override
    double calcularBonus(Departamento departamento) {
        if (departamento.alcancouMeta())
            return 0;
        return salarioFixo * 20 / 100;
    }
}
