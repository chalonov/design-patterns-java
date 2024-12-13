public class BicicletasRutaTrek extends FabricaBicicletasRuta{

    public BicicletasRutaTrek(BicicletaRuta bicicletaRuta){
        super(bicicletaRuta);
    }

    @Override
    public void vender() {
        bicicletaRuta.ensamblar();
        String marca = "Trek";
        System.out.println(marca);
    }
}
