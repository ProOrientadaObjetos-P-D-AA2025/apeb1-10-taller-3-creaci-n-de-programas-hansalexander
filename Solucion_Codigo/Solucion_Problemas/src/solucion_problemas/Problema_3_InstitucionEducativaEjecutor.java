package solucion_problemas;

import java.util.Random;

/**
 *
 * @author hansa
 */
public class Problema_3_InstitucionEducativaEjecutor {

    public static void main(String[] args) {
        Random random = new Random();

        String[] tipos = {"Colegio", "Instituto", "Universidad", "Escuela Tecnica"};
        String nom = "Instituto Educativo Alfa";
        String tipoInstitucion = tipos[random.nextInt(tipos.length)];
        int numAlumnos = 100 + random.nextInt(900);
        int numDocentes = 10 + random.nextInt(90);
        int sedes = 1 + random.nextInt(5);
        double gastosE = 500 + random.nextDouble() * 1500;

        Problema_3_InstitucionEducativaBase institucion = new Problema_3_InstitucionEducativaBase(
                nom, tipoInstitucion, numAlumnos, numDocentes, sedes, gastosE);
        System.out.println(institucion);
    }
}
