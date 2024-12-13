public class BikeBuilder implements Builder{
    private int id;
    private String tipo;
    private String marca;
    private String modelo;
    private String color;

    @Override
    public BikeBuilder id(int id) {
        this.id = id;
        return this;
    }

    @Override
    public BikeBuilder tipo(String tipo) {
        this.tipo = tipo;
        return this;
    }

    @Override
    public Builder marca(String marca) {
        this.marca = marca;
        return this;
    }

    @Override
    public Builder modelo(String modelo) {
        this.modelo = modelo;
        return this;
    }

    @Override
    public Builder color(String color) {
        this.color = color;
        return this;
    }

    public Bike build(){
        return new Bike(id, tipo, marca, modelo, color);
    }
}
