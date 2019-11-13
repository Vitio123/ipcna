package Capa_Logica;

import java.util.Calendar;

public class Horario {

	private int codigoHorario;
	/**e
         * 
	 * lunes- viernes
	 * sabado-domingo
	 */
	private String diasEstudio;
        private Calendar horaInicio;
	private Calendar horaFin;

        
    public int getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }

    public String getDiasEstudio() {
        return diasEstudio;
    }

    public void setDiasEstudio(String diasEstudio) {
        this.diasEstudio = diasEstudio;
    }

}