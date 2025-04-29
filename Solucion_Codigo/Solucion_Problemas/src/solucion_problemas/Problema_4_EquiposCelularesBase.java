package solucion_problemas;

/**
 *
 * @author hansa
 */
public class Problema_4_EquiposCelularesBase {

    protected String sistemaOperativo;
    protected double tamanioPantalla;
    protected double costo;
    protected String dirMac;
    protected String imei;
    protected double ivaPorcentaje;
    protected double ivaDelCostoInicial;
    protected double costoFinal;

    public Problema_4_EquiposCelularesBase(String sistemaOperativo, double tamanioPantalla, double costoInicial,
            double ivaPorcentaje, String direccionMac, String imei) {
        this.sistemaOperativo = sistemaOperativo;
        this.tamanioPantalla = tamanioPantalla;
        this.costo = costoInicial;
        this.ivaPorcentaje = ivaPorcentaje;
        this.dirMac = direccionMac;
        this.imei = imei;
    }

    public void calcularCostoFinal() {
        ivaDelCostoInicial = (ivaPorcentaje / 100) * costo;
        costoFinal = costo + ivaDelCostoInicial;
    }

    public String getSistemaOperativo() {
        return sistemaOperativo;
    }

    public double getTamanioPantalla() {
        return tamanioPantalla;
    }

    public double getCosto() {
        return costo;
    }

    public double getIvaPorcentaje() {
        return ivaPorcentaje;
    }

    public double getIvaDelCostoInicial() {
        return ivaDelCostoInicial;
    }

    public double getCostoFinal() {
        return costoFinal;
    }

    public String getDireccionMac() {
        return dirMac;
    }

    public String getImei() {
        return imei;
    }

    @Override
    public String toString() {
        return String.format("""
                Sistema Operativo: %s
                Tamaño de Pantalla: %.2f pulgadas
                Costo Inicial: %.2f
                IVA (%.2f%%): %.2f
                Costo Final: %.2f
                Dirección MAC: %s
                IMEI: %s
                """, sistemaOperativo, tamanioPantalla, costo,
                ivaPorcentaje, ivaDelCostoInicial, costoFinal, dirMac, imei);
    }
}
