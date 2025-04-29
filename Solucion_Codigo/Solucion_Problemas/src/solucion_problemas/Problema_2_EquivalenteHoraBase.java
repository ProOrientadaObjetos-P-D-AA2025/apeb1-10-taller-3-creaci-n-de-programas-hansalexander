package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_2_EquivalenteHoraBase {

    protected double horas;
    protected double minutos;
    protected double segundos;
    protected double dias;

    public Problema_2_EquivalenteHoraBase(double horas) {
        this.horas = horas;
        calcularEquivalentes();
    }

    public void calcularEquivalentes() {
        minutos = horas * 60;
        segundos = horas * 3600;
        dias = horas / 24;
    }

    @Override
    public String toString() {
        return String.format("Horas: %.2f\nMinutos: %.2f\nSegundos: %.2f\nDias: %.2f", horas, minutos, segundos, dias);
    }
}
