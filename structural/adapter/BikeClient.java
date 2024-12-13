import java.util.ArrayList;
import java.util.List;

public class BikeClient {
    public List<MtbBikeAssembly> getMtbBikeAssemblyList(){
        List<MtbBikeAssembly> mtbBikeAssemblies = new ArrayList<>();

        MtbBike mtbBike = new MtbBike("shimano mtb", "mavic mtb");
        FactoryBikeBridge roadBike =new FactoryBikeBridge("x component", "x wheels");

        mtbBikeAssemblies.add(mtbBike);
        mtbBikeAssemblies.add(new RoadBikeAdapter(roadBike));

        return mtbBikeAssemblies;
    }
}
