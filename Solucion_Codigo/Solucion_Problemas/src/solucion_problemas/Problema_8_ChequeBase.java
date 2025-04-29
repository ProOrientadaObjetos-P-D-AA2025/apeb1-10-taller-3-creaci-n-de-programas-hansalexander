package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_8_ChequeBase {

    protected String nombreCliente;
    protected String nombreBanco;
    protected double valorCheque;
    protected double comisionBanco;

    public Problema_8_ChequeBase(String nombreCliente, String Banco, double valorCheque) {
        this.nombreCliente = nombreCliente;
        this.nombreBanco = Banco;
        this.valorCheque = valorCheque;
        calcularComisionBanco();
    }

    public void calcularComisionBanco() {
        comisionBanco = valorCheque * (0.003 / 100);
    }
    @Override
    public String toString() {
        return String.format("---Cheque---\n"
                + "Cliente: %s\n"
                + "Banco: %s\n"
                + "Valor del cheque: $%.2f\n"
                + "Comisión del banco: $%.4f",
                nombreCliente, nombreBanco, valorCheque, comisionBanco);
    }
}
