package ejerproducto;

import java.io.*;

public class MainBuf {
    public static void main(String[] args) {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String nombre = null;
        double precio = 0.0;
        int stock = 0;

        ProductoDigital productos[] = new ProductoDigital[3];
        ProductoDigital pd = null;

        //ingreso el datos
        for(int i = 0; i < productos.length; i++){
            try{
                System.out.print("Ingrese el precio: ");
                precio = Double.parseDouble(br.readLine());

                System.out.print("Ingrese el nombre: ");
                nombre = br.readLine();

                System.out.print("Ingrese el stock: ");
                stock = Integer.parseInt(br.readLine());
            }catch(Exception e){
                System.out.println("Hubo un erro en el ingreso de datos");
            }
            pd = new ProductoDigital(nombre,precio,stock);
            productos[i] = pd;
            //forma alternativa, mejor alternativa
            //productos[i] = new ProductoDigital(nombre, precio, stock);
        }
        //imprimir el arreglo
        for(ProductoDigital pd1: productos){
            System.out.println(pd1);
        }







    }
}
