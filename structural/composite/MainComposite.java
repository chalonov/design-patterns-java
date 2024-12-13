public class MainComposite {
    public static void main(String[] args) {

        Facultad facultadIngenieria = new FacultadIngenieria("Facultad de Ingeniería", 1);
        Facultad facultadEnfermeria = new FacultadEnfermeria("Facultad de Enfermería", 2);
        Facultad facultadCiencias = new FacultadCiencias("Facultad de Ciencias", 3);

        Universidad universidad = new Universidad("Universidad ACME", 0);

        universidad.agregarFacultad(facultadIngenieria);
        universidad.agregarFacultad(facultadEnfermeria);
        universidad.agregarFacultad(facultadCiencias);

        universidad.mostrarNombreFacultad();

    }
}
