public abstract class Cuadro {
    private char talla;
    private String material;
    private String color;

    public void setTalla(char talla) {
        this.talla = talla;
    }
    public void setMaterial(String material) {
        this.material = material;
    }
    public void setColor(String color) {
        this.color = color;
    }

    public abstract void pedalear();
}
