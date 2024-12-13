public abstract class FabricaBicicletas {
    public abstract Cuadro crearCuadro();
    public abstract Componentes crearComponentes();
    public abstract Ruedas crearRuedas();
    public abstract Bicicleta crearBicicleta(Cuadro cuadro, Componentes componentes, Ruedas ruedas);

}
