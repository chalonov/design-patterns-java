public class RuedasZipp extends Ruedas{
    private String nombre;
    private int ancho;

    RuedasZipp(){
        nombre = "Zipp";
        ancho = 28;
        setModo("Offroad");
    }

    public void rodar() {
        System.out.println("Ruedas: " + nombre + " - " + ancho + " mm");
    }
}
