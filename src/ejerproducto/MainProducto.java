package ejerproducto;

public class MainProducto {
    public static void main(String[] args) {
        ProductoDigital pd1 = new ProductoDigital();
        ProductoDigital pd2 = new ProductoDigital("e_comerce",-56.56,58);

        pd1.setNombre("Pagina web");
        pd1.setPrecio(20);
        pd1.setStock(5);

        System.out.println("Datos del objeto pd1");
        pd1.mostrarDatos();

        System.out.println("\nDatos del objeto pd2");
        pd2.mostrarDatos();

        pd1.setPrecio(-5);
        System.out.println("Datos del objeto pd1 despues del modificar el precio");
        pd1.mostrarDatos();

    }
}
