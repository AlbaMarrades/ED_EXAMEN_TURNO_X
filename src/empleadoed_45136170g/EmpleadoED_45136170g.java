package empleadoed_45136170g;

import java.util.*;

/**
 * Ejercicio práctico examen EVAL 1 ED
 *
 * @author ALBA MARRADES DNI 45136170G
 * @version 1.0
 */
public class EmpleadoED_45136170g {

    static final double FACTOR_HORA_EXTRA = 1.2;
    private String nombreCompleto, dni;
    private double salarioBasePorHora = 10.56;

    /**
     * Constructor con tres parámetros
     *
     * @param nombreCompleto nombre completo en mayúsculas
     * @param dni documento nacional de identidad con letra y sin espacios
     */
    public EmpleadoED_45136170g(String nombreCompleto, String dni) {
        this.nombreCompleto = nombreCompleto;
        this.dni = dni;
    }

    /**
     * Calcula el salario bruto mensual en función del salario base por hora y
     * las horas extras El precio por hora de la hora extra se determina con la
     * constante FACTOR_HORA_EXTRA
     *
     * @param horasExtra número de horas extra dedicadas redondeado a la baja
     * (entero)
     *
     * @return devuelve el salario bruto mensual en euros con dos decimales
     */
    public double getSalarioEsteMes(int horasExtra) {
        double cantidadExtra, salarioFinal;
        cantidadExtra = horasExtra * this.salarioBasePorHora
                * FACTOR_HORA_EXTRA;
        salarioFinal = this.salarioBasePorHora * 40 * 4 + cantidadExtra;
        salarioFinal = (double) Math.round(salarioFinal * 100d) / 100d;
        return salarioFinal;
    }

    public static void main(String[] args) {
        EmpleadoED_45136170g emp = new EmpleadoED_45136170g("ALBA MARRADES", "45136170G");
        int horasExtra = 2;
        System.out.println("El salario de " + emp.nombreCompleto + " este mes será de " + emp.getSalarioEsteMes(horasExtra)
                + " euros, al hacer " + horasExtra + " horas extra.");
    }
}
