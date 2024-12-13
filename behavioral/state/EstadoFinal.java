public class EstadoFinal implements Estado{
    @Override
    public void cambiarEstado(Contexto contexto) {
        System.out.println("Objeto está en el estado final");
        contexto.setEstado(this);
    }

    @Override
    public String toString() {
        return "Estado final";
    }
}
