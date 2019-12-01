package Capa_Logica;

import Capa_Datos.Lista_Programas;
import TListas.TLista;

public class Programa {

	private String tipoPrograma;
	private String TipoNivel;
	private String subNivel;
	private String codPrograma;
        private float costo;

    public String getTipoPrograma() {
        return tipoPrograma;
    }

    public void setTipoPrograma(String tipoPrograma) {
        this.tipoPrograma = tipoPrograma;
    }

    public String getTipoNivel() {
        return TipoNivel;
    }

    public void setTipoNivel(String TipoNivel) {
        this.TipoNivel = TipoNivel;
    }

    public String getSubNivel() {
        return subNivel;
    }

    public void setSubNivel(String subNivel) {
        this.subNivel = subNivel;
    }

    public String getCodPrograma() {
        return codPrograma;
    }

    public void setCodPrograma(String codPrograma) {
        this.codPrograma = codPrograma;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    public static TLista filtroXtipo(String tipo){
    
    return Lista_Programas.filtroPrgrmas(tipo);
    }
    
    public static Object programaEncontrado(String codPrograma){
        Object programa;
        TLista datos =Lista_Programas.obtener();
        int pos=Lista_Programas.buscarProgramas(codPrograma);
       if(pos !=-1)
        programa = datos.Obtener(pos);
       else
           programa = null;
    return programa;}
    
}
