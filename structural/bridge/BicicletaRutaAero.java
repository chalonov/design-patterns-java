public class BicicletaRutaAero implements BicicletaRuta{
    private final String tipo = "aero";

    @Override
    public void ensamblar() {
        System.out.println("Bicicleta con cuadro: " + tipo);
    }

}
