package solucion_problemas;

import java.util.Random;

/**
 *
 * @author hansa
 */
public class Problema_5_ReporteEstudianteBase {

    protected String nombre;
    protected double materia1;
    protected double materia2;
    protected double materia3;
    protected double promedio;
    protected String estado;

    public Problema_5_ReporteEstudianteBase(String nombre) {
        Random rand = new Random();
        this.nombre = nombre;
        this.materia1 = rand.nextDouble() * 10;
        this.materia2 = rand.nextDouble() * 10;
        this.materia3 = rand.nextDouble() * 10;
        calcularPromedio();
        determinarEstado();
    }

    public void calcularPromedio() {
        promedio = (materia1 + materia2 + materia3) / 3;
    }

    public void determinarEstado() {
        if (promedio >= 6.5) {
            estado = "Aprobado";
        } else {
            estado = "Reprobado";
        }
    }

    @Override
    public String toString() {
        return String.format("Nombre: %s\nCalificación Materia 1: %.2f\nCalificación Materia 2: %.2f\nCalificación Materia 3: %.2f\nPromedio: %.2f\nEstado: %s",
                nombre, materia1, materia2, materia3, promedio, estado);
    }
}
