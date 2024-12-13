public class Specialized extends Bicicleta{
    Specialized(Cuadro cuadro, Componentes componentes, Ruedas ruedas){
        super(cuadro, componentes, ruedas);
        System.out.println("Bicicleta Specialized ensamblada correctamente");
    }

    public void pedalear(){
        System.out.println("Bicicleta Specialized pedaleando");
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
