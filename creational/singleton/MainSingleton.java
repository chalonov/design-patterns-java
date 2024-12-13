public class MainSingleton {
    public static void main(String[] args) {

        System.out.println(Singleton.getInstance("Primero"));
        System.out.println(Singleton.getInstance("Segundo").getData());
        Singleton singleton = Singleton.getInstance("Tercero");
        System.out.println(singleton);
        System.out.println(singleton.getData());

    }
}
