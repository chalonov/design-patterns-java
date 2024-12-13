public class CuadroMTB extends Cuadro{
    private String modalidad;

    CuadroMTB(){
        modalidad = "MTB";
        setTalla('L');
        setMaterial("Aluminio");
        setColor("Azul");
    }

    public void pedalear() {
        System.out.println("La bici de " + modalidad + " se está pedaleando");
    }
}
