package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_8_ChequeEjecutor {

    public static void main(String[] args) {
        Problema_8_ChequeBase cheque = new Problema_8_ChequeBase(
                "Julian Alvarez",
                "Banco de Loja",
                100 + Math.random() * 9900
        );

        System.out.println(cheque);
    }
}
