package provedores;

public class JadLog implements ProvedorFrete {
    public Frete calcularFrete(double peso, double valor) {
        Frete frete = new Frete();
        if (peso >= 2000)
            frete.valor += (valor * 0.07);
        else
            frete.valor += (valor * 0.045);
        frete.tipoProvedorFrete = obterTipoProvedorFrete();
        return frete;
    }

    public TipoProvedorFrete obterTipoProvedorFrete() {
        return TipoProvedorFrete.JADLOG;
    }
}