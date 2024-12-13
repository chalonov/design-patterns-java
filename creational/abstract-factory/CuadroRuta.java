public class CuadroRuta extends Cuadro{
    private String modalidad;

    CuadroRuta(){
        modalidad = "Ruta";
        setTalla('M');
        setMaterial("Carbono");
        setColor("Blanco");
    }

    public void pedalear() {
        System.out.println("La bici de " + modalidad + " se está pedaleando");
    }
}
