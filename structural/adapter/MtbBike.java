public class MtbBike implements MtbBikeAssembly {
    private String components;
    private String wheels;

    public MtbBike(String components, String wheels) {
        this.components = components;
        this.wheels = wheels;
    }

    @Override
    public String getComponents() {
        return components;
    }

    @Override
    public String getWheels() {
        return wheels;
    }
}
