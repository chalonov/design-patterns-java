public class ComponentesShimano extends Componentes{
    private String marca;

    ComponentesShimano(){
        marca = "Shimano";
        setTipo("Mecánico");
    }

    public void cambiar() {
        System.out.println("Componentes " + marca + " para cambios de velocidad");
    }
    public void frenar() {
        System.out.println("Componentes " + marca + " para frenar");
    }
}
