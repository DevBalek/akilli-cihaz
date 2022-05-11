package Factory;

public class FactoryIstemci {
    IFactoryMaker eyleyici;
    IFactoryMaker sicaklikAlgilayici;

    public FactoryIstemci(IFactoryMaker eyleyici, IFactoryMaker sicaklikAlgilayici) {
        this.eyleyici = eyleyici;
        this.sicaklikAlgilayici = sicaklikAlgilayici;
    }

    public IMakeModule sicaklikAlgilayiciModul() {
        IMakeModule mdl = sicaklikAlgilayici.factoryMakerMethod();
        return mdl;
    }

    public IMakeModule eyleyiciModul() {
        IMakeModule mdl = eyleyici.factoryMakerMethod();
        return mdl;
    }

}
