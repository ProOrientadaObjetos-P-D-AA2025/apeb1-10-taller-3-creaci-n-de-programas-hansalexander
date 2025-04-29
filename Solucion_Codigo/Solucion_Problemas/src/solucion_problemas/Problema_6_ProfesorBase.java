package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_6_ProfesorBase {

    protected String nombre;
    protected String ape;
    protected double sueldoBasico;
    protected double sueldoTotal;
    protected String cedula;

    public Problema_6_ProfesorBase(String nombre, String apellido, double sueldoBasico, String cedula) {
        this.nombre = nombre;
        this.ape = apellido;
        this.sueldoBasico = sueldoBasico;
        this.cedula = cedula;
        calcularSueldoTotal();
    }

    public void calcularSueldoTotal() {
        sueldoTotal = sueldoBasico + (sueldoBasico * 0.20);
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s %s\nSueldo Basico: %.2f\nSueldo Total: %.2f\nCedula: %s",
                nombre, ape, sueldoBasico, sueldoTotal, cedula);
    }
}
