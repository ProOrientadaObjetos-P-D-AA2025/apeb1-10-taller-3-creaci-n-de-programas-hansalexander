package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_3_InstitucionEducativaEjecutor {

    public static void main(String[] args) {
        Problema_3_InstitucionEducativaBase institucion = new Problema_3_InstitucionEducativaBase(
                "Instituto Educativo Alfa",
                "Instituto",
                500,
                50,
                2,
                1200.0
        );

        System.out.println(institucion);
    }
}
