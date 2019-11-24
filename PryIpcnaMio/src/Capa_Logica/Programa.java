package Capa_Logica;

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
}