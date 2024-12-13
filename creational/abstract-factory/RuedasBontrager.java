public class RuedasBontrager extends Ruedas{
    private String nombre;
    private int ancho;

    RuedasBontrager(){
        nombre = "Bontrager";
        ancho = 25;
        setModo("Ruta");
    }

    public void rodar() {
        System.out.println("Ruedas: " + nombre + " - " + ancho + " mm");
    }
}
