package ejerproducto;

public class ProductoDigital {
    private String nombre;
    private double precio;
    private int stock;

    //constructor
    public ProductoDigital(){

    }
    //constructor por parámetros
    public ProductoDigital(String nombre, double precio, int stock){
        this.nombre = nombre;
        setPrecio(precio);
        this.stock = stock;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }

    public void setStock(int stock){
        this.stock = stock;
    }

    public void setPrecio(double precio){
        if(precio > 0)
            this.precio = precio;
    }

    public String getNombre(){
        return nombre;
    }

    public void mostrarDatos(){
        System.out.println("Nombre: "+nombre+"\nPrecio: "+precio);
        System.out.println("Stock: "+stock);
    }
    @Override
    public String toString(){
        return "Nombre: "+nombre+"\nPrecio: "+precio+"\nStock: "+stock;
    }

}
