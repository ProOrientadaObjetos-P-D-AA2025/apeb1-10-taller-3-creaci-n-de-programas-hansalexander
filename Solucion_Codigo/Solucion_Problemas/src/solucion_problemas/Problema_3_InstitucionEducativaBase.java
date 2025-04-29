package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_3_InstitucionEducativaBase {

    protected String nom;
    protected String institucion;
    protected int numAlumnos;
    protected int numDocentes;
    protected int sedes;
    protected double gastosE;
    protected double presupuesto;

    public Problema_3_InstitucionEducativaBase(String nombre, String tipoInstitucion,
            int numeroAlumnos, int numeroDocentes,
            int numeroSedes, double gastosProyectadosPorEstudiante) {
        this.nom = nombre;
        this.institucion = tipoInstitucion;
        this.numAlumnos = numeroAlumnos;
        this.numDocentes = numeroDocentes;
        this.sedes = numeroSedes;
        this.gastosE= gastosProyectadosPorEstudiante;
        calcularPresupuesto();
    }

    public void setNombre(String nombre) {
        this.nom = nombre;
    }

    public void setTipoInstitucion(String tipoInstitucion) {
        this.institucion = tipoInstitucion;
    }

    public void setNumeroAlumnos(int numeroAlumnos) {
        this.numAlumnos = numeroAlumnos;
        calcularPresupuesto();
    }

    public void setNumeroDocentes(int numeroDocentes) {
        this.numDocentes = numeroDocentes;
    }

    public void setNumeroSedes(int numeroSedes) {
        this.sedes = numeroSedes;
    }

    public void setGastosProyectadosPorEstudiante(double gastosPorEstudiante) {
        this.gastosE = gastosPorEstudiante;
        calcularPresupuesto();
    }

    public void calcularPresupuesto() {
        presupuesto = numAlumnos * gastosE;
    }

    public double getPresupuesto() {
        return presupuesto;
    }

    @Override
    public String toString() {
        return String.format(
                "Nombre: %s\nTipo de Institucion: %s\nNumero de Alumnos: %d\nNumero de Docentes: %d\nNumero de Sedes: %d\nGasto Proyectado por Estudiante: %.2f\nPresupuesto Total: %.2f",
                nom, institucion, numAlumnos, numDocentes, sedes,
                gastosE, presupuesto);
    }
}
