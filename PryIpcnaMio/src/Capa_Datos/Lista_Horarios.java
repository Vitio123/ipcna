
package Capa_Datos;

import Capa_Logica.Horario;
import TListas.TLista;
import TListas.TListaDin;
import TListas.TListaEn;

public class Lista_Horarios {
    private static TLista horarios = new TListaEn();
    
    public static void registrarHorario(Object a){
        horarios.Adicionar(a);
    }
    
    public static TLista obtener(){
    return horarios;}
    
    public static int buscarHorario(String codigo){
        TLista datos = obtener();
        for (int i = 0; i < datos.Cantidad(); i++) {
            Horario h = (Horario) datos.Obtener(i);
            if(h.getCodigoHorario().equalsIgnoreCase(codigo))
                return i;
        }
        
    return-1;} 
    
    public static TLista filtroXtipo(String tipo){
        TLista listaFiltrada = new TListaDin();
        TLista datos = obtener();
        for (int i = 0; i < datos.Cantidad(); i++) {
            Horario h = (Horario) datos.Obtener(i);
            if(h.getTipo().equalsIgnoreCase(tipo))
                listaFiltrada.Adicionar(h);
        }
        
    return listaFiltrada;}
}
