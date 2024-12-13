public class StateMain {
    public static void main(String[] args) {
        Contexto contexto = new Contexto();

        EstadoInicial estadoInicial = new EstadoInicial();
        estadoInicial.cambiarEstado(contexto);

        System.out.println(contexto.getEstado().toString());

        EstadoFinal estadoFinal = new EstadoFinal();
        estadoFinal.cambiarEstado(contexto);

        System.out.println(contexto.getEstado().toString());
    }
}
