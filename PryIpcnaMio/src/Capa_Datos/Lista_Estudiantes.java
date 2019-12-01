
package Capa_Datos;

import Capa_Logica.Estudiante;
import TListas.TLista;
import TListas.TListaEn;


public class Lista_Estudiantes {
    private static TLista estudiantes = new TListaEn();
    
    public static void registrarEst(Object a){
        estudiantes.Adicionar(a);
    }
     public static void eliminar(String codigo){ 
        int i = BuscarAlumno(codigo);
         estudiantes.Eliminar(i);
     };
    public static TLista obtener(){
    return estudiantes;}
    
    public static int BuscarAlumno(String codigo){
        TLista datillos = obtener();
        
        for (int i = 0; i <datillos.Cantidad(); i++) {
            Estudiante e = (Estudiante) datillos.Obtener(i);
            if(e.getCodigoEstudiante().equalsIgnoreCase(codigo))
                return i;
        }
    return -1;}
    
}
