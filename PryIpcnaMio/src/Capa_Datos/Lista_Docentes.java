
package Capa_Datos;

import Capa_Logica.Docente;
import TListas.TLista;
import TListas.TListaDin;

public class Lista_Docentes {
    
    private static TLista docentes = new TListaDin();
    
    public static void registrarDoc(Object a){
        docentes.Adicionar(a);
    }
    public static void Modificar(Object dato,int pos){
        docentes.Modificar(dato,pos);
    }
     public static TLista Consultar(){
        return docentes;
    }
     public static void eliminar(String codigo){ 
        int i = BuscarDocente(codigo);
         docentes.Eliminar(i);
     }
   
    public static int BuscarDocente(String codDocente){
        for(int i=0; i<docentes.Cantidad();i++){
            Docente objDocente = (Docente)docentes.Obtener(i);
            if(objDocente.getCodigoDocente().equalsIgnoreCase(codDocente)){
                return i ; 
            }
        }
        return -1;
    }
}
