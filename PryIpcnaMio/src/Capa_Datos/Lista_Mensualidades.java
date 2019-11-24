
package Capa_Datos;

import TListas.TLista;
import TListas.TListaEn;


public class Lista_Mensualidades {
      private static TLista mensualidades = new TListaEn();
    
    public static void registrarMatricula(Object a){
       mensualidades.Adicionar(a);
    }
    
    public static TLista obtener(){
    return mensualidades;}
}
