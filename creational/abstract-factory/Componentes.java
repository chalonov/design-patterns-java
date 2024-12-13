public abstract class Componentes {
    private String tipo;

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public abstract void cambiar();
    public abstract void frenar();
}
