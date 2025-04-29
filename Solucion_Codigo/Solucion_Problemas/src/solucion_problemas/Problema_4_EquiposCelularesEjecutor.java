package solucion_problemas;

import java.util.Scanner;

/**
 *
 * @author hansa
 */
public class Problema_4_EquiposCelularesEjecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del dispositivo celular:");
        System.out.print("Sistema Operativo: ");
        String sistema = sc.nextLine();

        System.out.print("Tamanio de pantalla (pulgadas): ");
        double pantalla = sc.nextDouble();

        System.out.print("Costo inicial ($): ");
        double costoInicial = sc.nextDouble();

        System.out.print("IVA (%): ");
        double iva = sc.nextDouble();
        sc.nextLine();

        System.out.print("Dirección MAC: ");
        String mac = sc.nextLine();

        System.out.print("IMEI: ");
        String imei = sc.nextLine();

        Problema_4_EquiposCelularesBase celular = new Problema_4_EquiposCelularesBase(sistema, pantalla, costoInicial, iva, mac, imei);
        celular.calcularCostoFinal();

        System.out.println("\n---------- Informacion del Equipo ----------");
        System.out.println("Sistema Operativo: " + celular.getSistemaOperativo());
        System.out.println("Tamanio de Pantalla: " + celular.getTamanioPantalla()+ " pulgadas");
        System.out.println("Costo Inicial: $" + celular.getCosto());
        System.out.println("IVA (" + celular.ivaPorcentaje + "%): $" + celular.ivaDelCostoInicial);
        System.out.println("Costo Final: $" + celular.getCostoFinal());
        System.out.println("Direccion MAC: " + celular.getDireccionMac());
        System.out.println("IMEI: " + celular.getImei());
        System.out.println("--------------------------------------------");

    }
}
