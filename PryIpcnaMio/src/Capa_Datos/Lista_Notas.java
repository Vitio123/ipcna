
package Capa_Datos;

import Capa_Logica.Notas;
import TListas.TLista;
import TListas.TListaEn;


public class Lista_Notas {
    
       private static TLista notas = new TListaEn();
    
    public static void registrarMatricula(Object a){
       notas.Adicionar(a);
    }

     public static int buscarMatEstudiante (String codMat,String codEstudiante){
        for (int i = 0; i < notas.Cantidad(); i++) {
            Notas obj = (Notas) notas.Obtener(i);
            if (obj.getCodigoMarticula().equalsIgnoreCase(codMat)&& obj.getCodigoEstudiante().equalsIgnoreCase(codEstudiante)) {
                return i; 
            }
        }
        return -1;
    }
    
    public static TLista obtener(){
    return notas;}
    
    public static void modificar (Object dato, int pos){
        notas.Modificar(dato, pos);
    }
    
    
}
