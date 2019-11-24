
package Capa_Datos;

import TListas.TLista;
import TListas.TListaEn;

public class Lista_Horarios {
    private static TLista horarios = new TListaEn();
    
    public static void registrarHorario(Object a){
        horarios.Adicionar(a);
    }
    
    public static TLista obtener(){
    return horarios;}
}
