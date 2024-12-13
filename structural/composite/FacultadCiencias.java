public class FacultadCiencias implements Facultad {

    private String nombre;
    private int id;

    public FacultadCiencias(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    @Override
    public void mostrarNombreFacultad() {
        System.out.println(getNombre());
    }
}
