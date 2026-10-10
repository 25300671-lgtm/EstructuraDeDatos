

import javax.swing.*;

public class TestEmpleado {
    private static Empleado empl;

    public static void main(String[] args){
        iniciar();
    }

    public static void iniciar (){
        String numeroNomina = solicitarTexto("Numero Nomina");
        String nombre = solicitarTexto("Nombre Completo");

        empl = new Empleado(numeroNomina,
                nombre,
                "Masculino",
                3400.56,
                true);

        imprimir();
    }

    public static String solicitarTexto(String valor){
       return JOptionPane.showInputDialog(null, "Introduce el "+valor);
    }

    public static void imprimir(){
        String salida = "Datos del empleado"+empl.toString()+
                "Numero de Objetos creados: \n"+
                Empleado .getContarObjetos();
        JOptionPane.showInputDialog(null, salida);
    }
}