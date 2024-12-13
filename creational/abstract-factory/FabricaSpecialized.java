public class FabricaSpecialized extends FabricaBicicletasRuta {
    public Cuadro crearCuadro(){
        return new CuadroMTB();
    }

    public Componentes crearComponentes() {
        return new ComponentesShimano();
    }

    public Ruedas crearRuedas() {
        return new RuedasZipp();
    }

    public Bicicleta crearBicicleta(Cuadro cuadro, Componentes componentes, Ruedas ruedas) {
        return new Specialized(cuadro, componentes, ruedas);
    }
}
