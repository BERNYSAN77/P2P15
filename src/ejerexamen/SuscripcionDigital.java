package ejerexamen;

import com.sun.security.jgss.GSSUtil;

public class SuscripcionDigital {
    private String nombreCliente;
    private String plan;
    private double costoMensual;
    private int mesesSuscritos;

    public SuscripcionDigital(String nombreCliente, String plan, double costoMensual, int mesesSuscritos) {
        this.nombreCliente = nombreCliente;
        this.plan = plan;
       setCostoMensual(costoMensual);
       setMesesSuscritos(mesesSuscritos);
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public String getPlan() {
        return plan;
    }

    public void setPlan(String plan) {
        this.plan = plan;
    }

    public double getCostoMensual() {
        return costoMensual;
    }

    public void setCostoMensual(double costoMensual) {
        if(costoMensual > 0)
            this.costoMensual = costoMensual;
        else
            System.out.println("El costo deber ser positivo");
    }

    public int getMesesSuscritos() {
        return mesesSuscritos;
    }

    public void setMesesSuscritos(int mesesSuscritos) {
        if(mesesSuscritos > 0)
            this.mesesSuscritos = mesesSuscritos;
        else
            System.out.println("Los meses deben ser un valor positivo");
    }

    public double calcularTotalPagado(){
        return costoMensual * mesesSuscritos;
    }

    public String evaluarRentabilidad(){
        if(calcularTotalPagado() > 500)
            return "Cliente rentable";
        else
            return "Cliente nuevo a fidelizar";
    }

    public void mostrarResumen(){
        System.out.println("Cliente: "+nombreCliente+"\nPlan: "+ plan+
                "\nCosto mensual: "+costoMensual+
                "\nMeses de suscripición: "+mesesSuscritos+
                "\nTotal pagado: "+calcularTotalPagado());
    }

}
