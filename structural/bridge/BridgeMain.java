public class BridgeMain {
    public static void main(String[] args) {
        FabricaBicicletasRuta bicicletasTrekAero = new BicicletasRutaTrek(new BicicletaRutaAero());
        FabricaBicicletasRuta bicicletasColnagoEscalada = new BicicletasRutaColnago(new BicicletaRutaEscalada());

        bicicletasTrekAero.vender();
        bicicletasColnagoEscalada.vender();

    }
}
