

package Capa_Datos;

import TListas.TLista;

import TListas.TListaEn;


public class Lista_Matricula {
         private static TLista Matriculas = new TListaEn();
    
    public static void registrarMatricula(Object a){
        Matriculas.Adicionar(a);
    }
    
    public static TLista obtener(){
    return Matriculas;}
}
