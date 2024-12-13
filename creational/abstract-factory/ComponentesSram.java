public class ComponentesSram extends Componentes{
    private String marca;

    ComponentesSram(){
        marca = "SRAM";
        setTipo("Electrónico");
    }

    public void cambiar() {
        System.out.println("Componentes " + marca + " para cambios de velocidad");
    }

    public void frenar() {
        System.out.println("Componentes " + marca + " para frenar");
    }
}
