import java.util.ArrayList;
import java.util.List;

public class Universidad implements Facultad{

    private String nombre;
    private int id;

    private List<Facultad> facultades;

    public Universidad(String nombre, int id) {
        this.nombre = nombre;
        this.id = id;
        this.facultades = new ArrayList<>();
    }

    @Override
    public void mostrarNombreFacultad() {
        facultades.forEach(Facultad::mostrarNombreFacultad);
    }

    public void agregarFacultad(Facultad facultad) {
        facultades.add(facultad);
    }

    public void quitarFacultad(Facultad facultad) {
        facultades.remove(facultad);
    }
}
