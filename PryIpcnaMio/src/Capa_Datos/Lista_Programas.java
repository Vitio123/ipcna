
package Capa_Datos;

import Capa_Logica.Programa;
import TListas.TLista;
import TListas.TListaDin;

public class Lista_Programas {
    private static TLista programas = new TListaDin();
    
    public static void registrarPrograma(Object a){
        programas.Adicionar(a);
    }
    
    public static TLista obtener(){
    return programas;}
    
    public static int buscarProgramas(String codPrograma){
        TLista datos = obtener();
        for (int i = 0; i < datos.Cantidad(); i++) {
            Programa pr = (Programa) datos.Obtener(i);
            if(pr.getCodPrograma().equalsIgnoreCase(codPrograma))
                return i;
        }
    return-1;}
    
    public static TLista filtroPrgrmas(String tipo){
        TLista listaFiltrada = new TListaDin();
        TLista datos = obtener();
        for (int i = 0; i < datos.Cantidad(); i++) {
            Programa pr = (Programa) datos.Obtener(i);
            if(pr.getTipoPrograma().equalsIgnoreCase(tipo))
                listaFiltrada.Adicionar(pr);
        }
    return listaFiltrada;}
}
