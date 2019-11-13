package Capa_Logica;
import java.util.Calendar;
public class Mensualidad {

	private String DocumentoIdentidad;
	private Calendar fechaPago;
	private double monto;

    public String getDocumentoIdentidad() {
        return DocumentoIdentidad;
    }

    public void setDocumentoIdentidad(String DocumentoIdentidad) {
        this.DocumentoIdentidad = DocumentoIdentidad;
    }

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

	
}