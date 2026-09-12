import java.util.Scanner;

public class MainExpendedora {
    public static void mostrarMenu() {
        System.out.println("\n ---MENU DE PRODUCTOS---");
        System.out.println("1. Ingresar dinero");
        System.out.println("2. Solicitar productos");
        System.out.println("3. Reabastecer maquina");
        System.out.println("4. Cancelar operacion");
        System.out.println("5. Salir");
    }
    
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Expendedora<Producto> expendedora = new Expendedora<>();

        while (true) { 
            mostrarMenu();
            System.out.println("Por favor ingresa el numero de la opcion deseada :3");
            int opcion = teclado.nextInt();

            switch (opcion) {
                case 1:
                System.out.print("Ingrese la cantidad de dinero: ");
                double dinero = teclado.nextDouble();
                expendedora.ingresarDinero(dinero);
                break;
                case 2:
                System.out.print("Ingrese el codigo del producto: ");
                int codigo = teclado.nextInt();
                Producto p = expendedora.solicitarProducto(codigo);
                if (p != null) {
                    System.out.println("Producto entregado: " + p.getNombre());
                }
                break;
                case 3:
                expendedora.reabastecer();
                break;
                case 4:
                expendedora.cancelarOperacion();
                break;
                case 5:
                System.out.println("Saliendo del sistema...");
                teclado.close();
                return;
                default:
                System.out.println("Opcion no valida");
                break;
            }
        }
    }
}
