package ejerusuario;

public class MainUsuario {
    public static void main(String[] args) {
        Usuario u1 = new Usuario();
        u1.setNombreUsuario("BSandoval");
        u1.setCorreo("Bsandoval@udla");
        u1.setContrasenia("123");
        System.out.println("*****Datos usuario 1*******");
        u1.mostrarDatos();
        u1.setContrasenia("sandoval123");
        System.out.println("*****Datos usuario 1 después de intentar cambiar contrasenia*******");
        u1.mostrarDatos();

    }
}
