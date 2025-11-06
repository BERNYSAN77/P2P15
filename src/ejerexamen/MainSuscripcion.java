package ejerexamen;

public class MainSuscripcion {
    public static void main(String[] args) {
        SuscripcionDigital sd = new SuscripcionDigital("Rodrigo","Familia",28.69,12);
        sd.mostrarResumen();
        System.out.println(sd.evaluarRentabilidad());

        sd.setMesesSuscritos(-52);
        System.out.println("\nDatos despuès de intentar modificar los meses");
        System.out.println("Meses de suscripción: "+sd.getMesesSuscritos());

        sd.setCostoMensual(-965);
        System.out.println("\nDatos despuès de intentar modificar el costo");
        System.out.println("Costo mensual: "+sd.getCostoMensual());
    }
}
