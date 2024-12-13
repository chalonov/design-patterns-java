public class Trek extends Bicicleta {
    Trek(Cuadro cuadro, Componentes componentes, Ruedas ruedas) {
        super(cuadro, componentes, ruedas);
        System.out.println("Bicicleta Trek ensamblada correctamente");
    }

    public void pedalear() {
        System.out.println("Bicicleta Trek pedaleando");
        getCuadro().pedalear();
    }
    public void cambiar() {
        getComponentes().cambiar();
    }
    public void frenar() {
        getComponentes().frenar();
    }
    public void rodar() {
        getRuedas().rodar();
    }
}
