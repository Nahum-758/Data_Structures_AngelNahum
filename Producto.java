public class Producto {
    private String nombre;
    private double precio;
    private int codigo;
    private String marca;
    private int stock;

    public Producto(String nombre, double precio, int codigo, String marca, int stock) {
        this.nombre = nombre;
        this.precio = precio;
        this.codigo = codigo;
        this.marca = marca;
        this.stock = stock;
    }

    public String getNombre(){
        return nombre;
    }
    public double getPrecio(){
        return precio;
    }
    public int getCodigo(){
        return codigo;
    }
    public String getMarca(){
        return marca;
    }
    public int getStock(){
        return stock;
    }
}
