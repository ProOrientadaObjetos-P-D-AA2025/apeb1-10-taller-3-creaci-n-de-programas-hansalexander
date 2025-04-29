package solucion_problemas;

import java.util.Scanner;

/**
 *
 * @author hansa
 */
public class Problema_7_AutomotorEjecutor {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese los datos del automotor:");
        System.out.print("Cedula del duenio: ");
        String cedula = sc.nextLine();

        System.out.print("Marca del vehiculo: ");
        String marca = sc.nextLine();

        System.out.print("Anio de fabricacion: ");
        int anio = sc.nextInt();

        System.out.print("Valor del vehiculo ($): ");
        double valor = sc.nextDouble();

        Problema_7_AutomotorBase auto = new Problema_7_AutomotorBase(cedula, marca, anio, valor);
        auto.calcularValorMatricula();
        System.out.println("\n--- Informacion del Automotor ---");
        System.out.println("Cédula del dueño: " + auto.getCedulaDueño());
        System.out.println("Marca: " + auto.getMarca());
        System.out.println("Anio de fabricacion: " + auto.getAnioFabricacion());
        System.out.println("Valor del vehiculo: $" + auto.getcostoVehiculo());
        System.out.println("Valor de matricula: $" + auto.getValorMatricula());
    }
}
