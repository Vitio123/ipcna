package Capa_Logica;

import Capa_Datos.Lista_Horarios;
import TListas.TLista;


public class Horario{

    public String getCodigoHorario(){
        return codigoHorario;
    }

    public void setCodigoHorario(String codigoHorario){
        this.codigoHorario = codigoHorario;
    }
	private String diasEstudio;
        private String horaInicio;
	private String horaFin;
        private String tipo;
        private String codigoHorario;
        

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

    public static TLista filtroTipo(String tipo){
        TLista listaFil = Lista_Horarios.filtroXtipo(tipo);
    return listaFil;}
    
    public static Object horarioEncontrado(String codigoHorario){
        Object horario;
        TLista datos = Lista_Horarios.obtener();
        int pos = Lista_Horarios.buscarHorario(codigoHorario);
        if(pos != -1)
      horario = datos.Obtener(pos);
        else horario=null;
    return horario;}
  
}