//package Data_Structures_AngelNahum;

public interface IMExpendora<T> {
    void ingresarDinero(double cantidad);
    void agregarProducto(T producto);
    void reabastecer();
    void cancelarOperacion();

    //numProducto();
    T solicitarProducto (int codigo);
    boolean hayStock(); 
    
}
