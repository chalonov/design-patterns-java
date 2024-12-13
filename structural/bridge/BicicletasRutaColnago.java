public class BicicletasRutaColnago extends FabricaBicicletasRuta{
    public BicicletasRutaColnago(BicicletaRuta bicicletaRuta){
        super(bicicletaRuta);
    }

    @Override
    public void vender() {
        bicicletaRuta.ensamblar();
        String marca = "Colnago";
        System.out.println(marca);
    }
}
