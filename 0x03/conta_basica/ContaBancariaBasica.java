import exceptions.OperacaoInvalidaException;

public class ContaBancariaBasica {
    public String numeracao;
    public double saldo;
    public double taxaJurosAnual;

    public ContaBancariaBasica(String numeracao, double taxaJurosAnual) {
        this.numeracao = numeracao;
        this.taxaJurosAnual = taxaJurosAnual;
        this.saldo = 0;
    }

    public void depositar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0)
            throw new OperacaoInvalidaException("Valor para deposito deve ser maior que 0");
        else
            this.saldo += valor;
    }

    public void sacar(double valor) throws OperacaoInvalidaException {
        if (valor <= 0)
            throw new OperacaoInvalidaException("Valor de saque deve ser maior que 0");
        else {
            if (this.saldo < valor)
                throw new OperacaoInvalidaException("Valor de saque deve ser menor que o saldo atual");
            else
                this.saldo -= valor;
        }

    }

    public double calcularTarifaMensal() {
        if (this.saldo < 100)
            return this.saldo * 0.1;
        else
            return 10;
    }

    public double calcularJurosMensal() {
        if (this.saldo < 0)
            return 0;
        else
            return (this.saldo * (this.getTaxaJurosAnual() / 12)) / 100;
    }

    public void aplicarAtualizacaoMensal() {
        double saldoAtualizado = 0;
        saldoAtualizado = this.saldo - this.calcularTarifaMensal();
        saldoAtualizado += this.calcularJurosMensal();
        this.saldo = saldoAtualizado;
    }

    public String getNumeracao() {
        return numeracao;
    }

    public double getSaldo() {
        return saldo;
    }

    public double getTaxaJurosAnual() {
        return taxaJurosAnual;
    }
}