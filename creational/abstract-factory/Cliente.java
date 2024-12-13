import java.util.Scanner;

public class Cliente {
    public static void main(String[] args) {
        Bicicleta bici1;
        Vendedor vendedor1 = new Vendedor();

        Scanner lectura = new Scanner(System.in);
        System.out.println("Ingrese 1 para Trek, 2 para Specialized: ");
        int resultado = lectura.nextInt();
        if (resultado == 1) {
            bici1 = vendedor1.comprarBicicleta(new FabricaTrek());
        }else {
            bici1 = vendedor1.comprarBicicleta(new FabricaSpecialized());
        }
        bici1.pedalear();
        bici1.cambiar();
        bici1.frenar();
        bici1.rodar();
    }
}