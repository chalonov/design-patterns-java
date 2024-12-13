public class Vendedor {
    public Bicicleta comprarBicicleta(FabricaBicicletasRuta pedido){
        return pedido.crearBicicleta(pedido.crearCuadro(), pedido.crearComponentes(), pedido.crearRuedas());
    }
}
