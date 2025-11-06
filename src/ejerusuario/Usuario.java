package ejerusuario;

public class Usuario {
    private String nombreUsuario;
    private String correo;
    private String contrasenia;

    public void setNombreUsuario(String nombreUsuario){
        this.nombreUsuario = nombreUsuario;
    }

    public void setCorreo(String correo){
        this.correo = correo;
    }

    public void setContrasenia(String contrasenia){
        if(contrasenia.length() >= 8)
            this.contrasenia = contrasenia;
    }

    public String getNombreUsuario(){
        return nombreUsuario;
    }

    public String getCorreo(){
        return correo;
    }

    public void mostrarDatos(){
        System.out.println("Usuario: "+nombreUsuario+"\nCorreo: "+correo);
        System.out.println("Contrasenia, no debo mostrar: "+contrasenia);
    }
}
