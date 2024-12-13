public class Singleton {
    private final String data;
    private static volatile Singleton instance;

    // El constructor Singleton tiene que ser "private"
    private Singleton(String data) {
        this.data = data;
    }
    // se accede al "private Singleton" via public static con un getter
    public static Singleton getInstance(String data) {
        Singleton result = instance;
        if (result == null) {
            synchronized (Singleton.class){
                result = instance;
                // se garantiza que solo se pueda "instanciar" la misma clase Singleton todas las veces con un "if statement"
                if (instance == null){
                    instance = result = new Singleton(data);
                }
            }
        }
        return result;
    }

    public String getData() {
        return data;
    }
}
