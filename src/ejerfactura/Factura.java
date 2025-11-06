package ejerfactura;

public class Factura {
    private int numFactura;
    private String producto;
    private int cantidad;
    private double precio;
    //atributo de clase
    private static int numFacturas;
    private static double IVA = 0.15;

    public Factura(){
        numFactura = ++numFacturas;
    }

    public Factura(String producto, int cantidad, double precio) {
        numFacturas++;
        this.numFactura = numFacturas;
        this.producto = producto;
        setCantidad(cantidad);
        setPrecio(precio);
    }

    public void setProducto(String producto) {
        this.producto = producto;
    }

    public void setCantidad(int cantidad) {
        if(cantidad > 0)
        this.cantidad = cantidad;
    }

    public void setPrecio(double precio) {
        if (precio > 0)
        this.precio = precio;
    }

    public static void setIVA(double IVA) {
        Factura.IVA = IVA;
    }

    public int getNumFactura() {
        return numFactura;
    }

    public String getProducto() {
        return producto;
    }

    public int getCantidad() {
        return cantidad;
    }

    public double getPrecio() {
        return precio;
    }

    public static int getNumFacturas() {
        return numFacturas;
    }

    public static double getIVA() {
        return IVA;
    }

    public double calcularValorPago(){
        return (cantidad * precio)*(1+IVA);
    }

    public void mostrarDatos(){
        System.out.println("Factura: "+numFactura+"\nProducto: "+producto+"\nCantidad: "+cantidad+
                "\nPrecio: "+precio);
        System.out.println("Valor a cancelar: "+calcularValorPago());
    }
}
