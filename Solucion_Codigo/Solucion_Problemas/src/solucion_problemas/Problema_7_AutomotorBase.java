package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_7_AutomotorBase {

    protected String cedula;
    protected String marca;
    protected int fabricacion;
    protected double costovehiculo;
    protected double valorMatricula;

    public Problema_7_AutomotorBase(String cedula, String marca, int fabricacion, double costovehiculo) {
        this.cedula = cedula;
        this.marca = marca;
        this.fabricacion = fabricacion;
        this.costovehiculo = costovehiculo;
        calcularValorMatricula();
    }

    public void calcularValorMatricula() {
        int antiguedad = 2025 - fabricacion;
        valorMatricula = (0.002 / 100) * costovehiculo * antiguedad;
    }

    public String getCedulaDueño() {
        return cedula;
    }

    public String getMarca() {
        return marca;
    }

    public int getAnioFabricacion() {
        return fabricacion;
    }

    public double getcostoVehiculo() {
        return costovehiculo;
    }

    public double getValorMatricula() {
        return valorMatricula;
    }

    @Override
    public String toString() {
        return String.format("Cedula del duenio: %s\nMarca: %s\nAnio de fabricacion: %d\nValor del vehiculo: %.2f\nValor de la matricula: %.2f",
                cedula, marca, fabricacion, costovehiculo, valorMatricula);
    }
}
