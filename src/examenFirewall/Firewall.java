package examenFirewall;

public class Firewall {
    private String regla;
    private int puerto;
    private boolean estado;
    private int intentosBloqueo;

    public Firewall(String regla, int puerto) {
        this.regla = regla;
        //setPuerto(puerto);
        estado = false;
        intentosBloqueo = 0;
    }
}
