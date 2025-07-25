package provedores;

public class Sedex implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        if (peso >= 1000)
            frete.valor += (valor * 0.10);
        else
            frete.valor += (valor * 0.05);
        frete.tipoProvedorFrete = obterTipoProvedorFrete();
        return frete;
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.SEDEX;
    }
}