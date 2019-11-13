
package Capa_Datos;

import TListas.TLista;
import TListas.TListaDin;

public class Lista_Docentes {
    
    private static TLista docentes = new TListaDin();
    
    public static void registrarDoc(Object a){
        docentes.Adicionar(a);
    }
    
    public static TLista obtener(){
    return docentes;}
}
