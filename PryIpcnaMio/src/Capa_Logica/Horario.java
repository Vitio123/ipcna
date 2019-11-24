package Capa_Logica;


public class Horario {

    public int getCodigoHorario() {
        return codigoHorario;
    }

    public void setCodigoHorario(int codigoHorario) {
        this.codigoHorario = codigoHorario;
    }
	private String diasEstudio;
        private String horaInicio;
	private String horaFin;
        private String tipo;
        private int codigoHorario;
        

    public String getDiasEstudio() {
        return diasEstudio;
    }

    public void setDiasEstudio(String diasEstudio) {
        this.diasEstudio = diasEstudio;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getHoraInicio() {
        return horaInicio;
    }

    public void setHoraInicio(String horaInicio) {
        this.horaInicio = horaInicio;
    }

    public String getHoraFin() {
        
   return horaFin;
    }

    public void setHoraFin(String horaFin) {
        this.horaFin = horaFin;
    }

   

}