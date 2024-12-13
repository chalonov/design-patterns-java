public class BicicletaRutaEscalada implements BicicletaRuta{
    private final String tipo = "escalada";

    @Override
    public void ensamblar() {
        System.out.println("Bicicleta con cuadro: " + tipo);
    }
}
