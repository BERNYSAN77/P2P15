package ejerfactura;

public class MainFactura {
    public static void main(String[] args) {
        System.out.println("Actualmente tiene "+Factura.getNumFacturas());
        Factura f1 = new Factura();
        System.out.println("\nActualmente tiene "+Factura.getNumFacturas());
        Factura f2 = new Factura("manzanas",5,0.35);
        f2.mostrarDatos();

    }
}
