package Capa_Logica;
import Capa_Datos.Lista_Matricula;
import TListas.TLista;
import java.util.Calendar;
public class Matricula {

	private double monto;
        private Calendar fechaPago;
	private String documentoIdentidad;
	private String codigoMatricula;
	private String codigoGrupo;
	private double cuotaMensual;
        private String codNivelEstudiado;

    public double getMonto() {
        return monto;
    }

    public void setMonto(double monto) {
        this.monto = monto;
    }

    public Calendar getFechaPago() {
        return fechaPago;
    }

    public void setFechaPago(Calendar fechaPago) {
        this.fechaPago = fechaPago;
    }

    public String getDocumentoIdentidad() {
        return documentoIdentidad;
    }

    public void setDocumentoIdentidad(String documentoIdentidad) {
        this.documentoIdentidad = documentoIdentidad;
    }

    public String getCodigoMatricula() {
        return codigoMatricula;
    }

    public void setCodigoMatricula(String codigoMatricula) {
        this.codigoMatricula = codigoMatricula;
    }

    public String getCodigoGrupo() {
        return codigoGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codigoGrupo = codigoGrupo;
    }

    public double getCuotaMensual() {
        return cuotaMensual;
    }

    public void setCuotaMensual(double cuotaMensual) {
        this.cuotaMensual = cuotaMensual;
    }

    public String getCodNivelEstudiado() {
        return codNivelEstudiado;
    }

    public void setCodNivelEstudiado(String codNivelEstudiado) {
        this.codNivelEstudiado = codNivelEstudiado;
    }
    
  
}