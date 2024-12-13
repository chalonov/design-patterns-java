import java.util.ArrayList;
import java.util.List;

public class AdapterMain {
    public static void main(String[] args) {
        BikeClient client = new BikeClient();

        List<MtbBikeAssembly> mtbBikeAssemblyList = client.getMtbBikeAssemblyList();
        System.out.println(mtbBikeAssemblyList);
    }
}
