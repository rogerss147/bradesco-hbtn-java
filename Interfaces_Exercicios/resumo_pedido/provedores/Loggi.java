package provedores;

public class Loggi implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        if (peso >= 5000)
            frete.valor += (valor * 0.12);
        else
            frete.valor += (valor * 0.04);
        frete.tipoProvedorFrete = obterTipoProvedorFrete();
        return frete;
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.LOGGI;
    }
}