public class EstadoInicial implements Estado{

    @Override
    public void cambiarEstado(Contexto contexto) {
        System.out.println("Objeto está en el estado inicial");
        contexto.setEstado(this);
    }

    @Override
    public String toString() {
        return "Estado inicial";
    }
}
