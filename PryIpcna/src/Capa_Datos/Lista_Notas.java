
package Capa_Datos;

import TListas.TLista;
import TListas.TListaEn;


public class Lista_Notas {
    
       private static TLista notas = new TListaEn();
    
    public static void registrarMatricula(Object a){
       notas.Adicionar(a);
    }
    
    public static TLista obtener(){
    return notas;}
}
