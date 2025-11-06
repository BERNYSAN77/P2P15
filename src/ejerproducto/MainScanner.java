package ejerproducto;

import java.util.Scanner;

public class MainScanner {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String nombre;
        double precio;
        int stock;
       ProductoDigital pd = null;

        System.out.print("Ingrese el precio: ");
        precio = sc.nextDouble();
        sc.nextLine();
        System.out.print("Ingrese el nombre: ");
        nombre = sc.nextLine();
        System.out.print("Ingrese el stock: ");
        stock = sc.nextInt();
        pd = new ProductoDigital(nombre,precio,stock);
        pd.mostrarDatos();
        System.out.println("\nImpresion del objeto\n"+pd);


    }
}
