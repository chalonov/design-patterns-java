public class Main {
    public static void main(String[] args){
        FabricaBici mtb = new FabricaBiciMtb();
        Bici biciMtb1 = mtb.factoryMethod();

        FabricaBici ruta = new FabricaBiciRuta();
        Bici biciRuta1 = ruta.factoryMethod();

        FabricaBici gravel = new FabricaBiciGravel();
        Bici biciGravel1 = gravel.factoryMethod();

        biciMtb1.pedalear();
        biciRuta1.pedalear();
        biciGravel1.pedalear();
    }
}
