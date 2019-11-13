
package Capa_Datos;

import TListas.TLista;
import TListas.TListaEn;


public class Lista_Estudiantes {
    private static TLista estudiantes = new TListaEn();
    
    public static void registrarEst(Object a){
        estudiantes.Adicionar(a);
    }
    
    public static TLista obtener(){
    return estudiantes;}
    
}
