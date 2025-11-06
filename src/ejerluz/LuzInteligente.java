package ejerluz;

public class LuzInteligente {
    private boolean encendido;


    public void mostrarDatos(){
        //utilizar operador ternario
        // condición?valor_si_v:valor_si_f
        //cuando solo hay una instrucciòn a realizar
        //se asigna a una variable el resultado
        String estado = encendido?"Prendido":"Apagado";
        System.out.println("La luz se encuentra "+estado);

    }
}
