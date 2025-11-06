package ejerproducto;

import javax.swing.*;

public class MainVen {
    public static void main(String[] args) {
        String nombre;
        double precio;
        int stock;
        ProductoDigital pd = null;

        nombre = JOptionPane.showInputDialog("Ingrese el nombre");
        precio = Double.parseDouble(JOptionPane.showInputDialog("Ingrese el precio"));
        stock = Integer.parseInt(JOptionPane.showInputDialog("Ingrese el stock"));
        pd = new ProductoDigital(nombre,precio,stock);
        JOptionPane.showMessageDialog(null,"Datos del Producto Digital\n"+pd);

    }
}
