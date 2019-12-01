package Capa_Logica;
import Capa_Datos.Lista_Estudiantes;
import Capa_Datos.Lista_Matricula;
import Capa_Datos.Lista_Notas;
import TListas.TLista;
import TListas.TListaEn;
import java.util.Calendar;
public class Matricula {

   

	private double monto;
        private Calendar fechaPago;
	private String codEstudiante;
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

    public String getcodEstudiante() {
        return codEstudiante;
    }

    public void setcodEstudiante (String codEstudiante) {
        this.codEstudiante= codEstudiante;
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
    
  public static TLista matriculaAlumno (String codEstudiante){
  
  return Lista_Matricula.buscarMatricula(codEstudiante);}
  
  public static void eliminarMatricula (int index,String codEstudiante){
      Lista_Matricula.eliminar(index, codEstudiante);
  }
 public static TLista matriculaXGrupo(String codigoGrupo,Calendar fecha){
      TLista datos = Lista_Matricula.buscarGrupo(codigoGrupo,fecha);
  return datos;}
  
  
  public static TLista[] listasAprDesap (String codGrupo,Calendar fecha){
      TLista[] listas = new TListaEn[2]; 
        TLista datos  =matriculaXGrupo(codGrupo,fecha);
      TLista notas  = Lista_Notas.obtener();
      TLista listaFiltrada = new TListaEn();
        
      for (int i = 0; i < datos.Cantidad(); i++) {
          Matricula mrtl = (Matricula) datos.Obtener(i);
          if(mrtl.getFechaPago().before(fecha)||mrtl.getFechaPago().equals(fecha)){
              for (int j = 0; j < notas.Cantidad(); j++) {
                  Notas note = (Notas) notas.Obtener(j);
                  if(mrtl.getCodigoMatricula().equalsIgnoreCase(note.getCodigoMarticula()))
                      listaFiltrada.Adicionar(note);
              }
          }
             
      }
       TLista listaest =Lista_Estudiantes.obtener();
      for (int i = 0; i < listaFiltrada.Cantidad(); i++) {
          Notas nota = (Notas) listaFiltrada.Obtener(i);
           int est =Lista_Estudiantes.BuscarAlumno(nota.getCodigoEstudiante());
                 Estudiante estudent = (Estudiante) listaest.Obtener(est);
          if(nota.getEstado().equalsIgnoreCase("Aprobado")){
                listas[0].Adicionar(estudent);
            }
          else
              listas[1].Adicionar(estudent);
      }
  return listas;}
  
}