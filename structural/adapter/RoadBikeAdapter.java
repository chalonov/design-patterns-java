public class RoadBikeAdapter implements MtbBikeAssembly{
    private FactoryBikeBridge roadBike;

    public RoadBikeAdapter(FactoryBikeBridge roadBike){
        this.roadBike = roadBike;
    }

    @Override
    public String getComponents() {
        return this.roadBike.getComponents();
    }

    @Override
    public String getWheels() {
        return this.roadBike.getWheels();
    }
}
