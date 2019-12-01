package Capa_Logica;
import Capa_Datos.Lista_Grupos;
import TListas.TLista;
import java.util.Calendar;
public class Grupo {

	
	private Calendar fechaInicio;
	private int vacantes;
	private String codGrupo;
	private String codPrograma;
	private String asignatura;
	private String codigoHorario;
	private String codigoDocente;

    public int getVacantes() {
        return vacantes;
    }

    public void setVacantes(int vacantes) {
        this.vacantes = vacantes;
    }

    public String getCodigoGrupo() {
        return codGrupo;
    }

    public void setCodigoGrupo(String codigoGrupo) {
        this.codGrupo = codigoGrupo;
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

    public String getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario) {
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
    
    public static int buscarGrupo(Calendar fecha, String grupo,String asignatura){
         TLista datos = Lista_Grupos.obtener();
        for (int i = 0; i < datos.Cantidad(); i++) {
             Grupo g = (Grupo) datos.Obtener(i);
            if(g.getFechaInicio().equals(fecha)||g.getCodigoGrupo().equalsIgnoreCase(grupo))
                if(g.getAsignatura().equalsIgnoreCase(asignatura))
                    return i;
            
        }
    return-1;}
}