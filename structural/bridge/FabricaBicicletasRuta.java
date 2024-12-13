public abstract class FabricaBicicletasRuta {
    protected BicicletaRuta bicicletaRuta;

    public FabricaBicicletasRuta(BicicletaRuta bicicletaRuta){
        this.bicicletaRuta = bicicletaRuta;
    }

    public abstract void vender();
}
