package Capa_Logica;
import java.util.Calendar;
public class NivelEstudiado {

	
	private Calendar fechaInicio;
	private int vacantes;
	private String Grupo;
	private String codPrograma;
	/**
	 * estudios de
	 * espa�ol
	 * ingles
	 */
	private String asignatura;
	private int codigoHorario;
	private String codigoDocente;

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public String getCodigoGrupo() {
        return Grupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.Grupo = codigoGrupo;
    }

    public String getCodPrograma() {
        return codPrograma;
    }

    public void setCodPrograma(String codPrograma) {
        this.codPrograma = codPrograma;
    }

    public String getAsignatura() {
        return asignatura;
    }

    public void setAsignatura(String asignatura) {
        this.asignatura = asignatura;
    }

    public int getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public String getCodigoDocente() {
        return codigoDocente;
    }

    public void setCodigoDocente(String codigoDocente) {
        this.codigoDocente = codigoDocente;
    }

    public Calendar getFechaInicio() {
        return fechaInicio;
    }

    public void setFechaInicio(Calendar fechaInicio) {
        this.fechaInicio = fechaInicio;
    }

}