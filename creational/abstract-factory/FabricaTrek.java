public class FabricaTrek extends FabricaBicicletasRuta {
    public Cuadro crearCuadro(){
        return new CuadroRuta();
    }

    public Componentes crearComponentes() {
        return new ComponentesSram();
    }

    public Ruedas crearRuedas() {
        return new RuedasBontrager();
    }

    public Bicicleta crearBicicleta(Cuadro cuadro, Componentes componentes, Ruedas ruedas) {
        return new Trek(cuadro, componentes, ruedas);
    }
}
