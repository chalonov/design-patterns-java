public abstract class Bicicleta {
    private Cuadro cuadro;
    private Componentes componentes;
    private Ruedas ruedas;

    Bicicleta(Cuadro cuadro, Componentes componentes, Ruedas ruedas) {
        this.cuadro = cuadro;
        this.componentes = componentes;
        this.ruedas = ruedas;
    }

    public Cuadro getCuadro() {
        return cuadro;
    }

    public Ruedas getRuedas() {
        return ruedas;
    }

    public Componentes getComponentes() {
        return componentes;
    }
    // métodos cuadros
    public abstract void pedalear();
    // métodos componentes
    public abstract void cambiar();
    public abstract void frenar();
    // métodos ruedas
    public abstract void rodar();
}
