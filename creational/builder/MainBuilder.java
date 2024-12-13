public class MainBuilder {
    public static void main(String[] args) {

        Director director = new Director();
        BikeBuilder builder = new BikeBuilder();

        director.buildBike(builder);
        builder.tipo("Ruta");
        builder.color("Blanco");
        builder.modelo("Domane");
        System.out.println(builder.build());

    }
}
