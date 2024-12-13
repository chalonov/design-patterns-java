public class FacultadEnfermeria implements Facultad {

    private String nombre;
    private int id;

    public FacultadEnfermeria(String nombre, int id) {
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
