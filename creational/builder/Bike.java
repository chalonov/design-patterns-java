public class Bike {
    private final int id;
    private final String tipo;
    private final String marca;
    private final String modelo;
    private final String color;

    Bike(int id, String tipo, String marca, String modelo, String color){
        this.id = id;
        this.tipo = tipo;
        this.marca = marca;
        this.modelo = modelo;
        this.color = color;
    }

    public String toString(){
        return """
                Bicicleta {
                    id=%s,
                    tipo=%s,
                    marca=%s,
                    modelo=%s,
                    color=%s
                }""".formatted(id, tipo, marca, modelo, color);
    }
}
