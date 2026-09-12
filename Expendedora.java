public class Expendedora<T> implements IMExpendora<T> {
    private double saldoActual;
    private int cantidadProductos;
    private T productoActual;

    //Constructor
    public Expendedora() {
        this.saldoActual = 0.0;
        this.cantidadProductos =0;
        this.productoActual = null;

    }

    @Override
    public void ingresarDinero(double cantidad) {
        if (cantidad > 0){
            this.saldoActual += cantidad;
            System.out.println("Dinero ingresado: $" + cantidad + "| Saldo acumulado: $" + this.saldoActual);
        }   else {
            System.out.println("Monto invalido.");
        }
    }

    @Override
    public void agregarProducto(T producto) {
        this.productoActual = producto;
        this.cantidadProductos ++;
        System.out.println("Producto cargado correctamente 7w7");
    }
    @Override
    public void reabastecer(){
        this.cantidadProductos = 10;
        System.out.println("Inventario reabastecido ozizozi UwU");
    }
    @Override
    public void cancelarOperacion(){
        System.out.println("Operacion cancelada. Saldo devuelto: $" + this.saldoActual);
        this.saldoActual = 0.0;
    }
    @Override
    public T solicitarProducto(int codigo){
        if (this.cantidadProductos > 0) {
            this.cantidadProductos--;
            }
            System.out.println("Sin stock disponible");
            return null;
    }
    @Override
    public boolean hayStock(){
        return this.cantidadProductos > 0;
    }
}
