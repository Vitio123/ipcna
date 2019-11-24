

package Capa_Datos;

import Capa_Logica.Matricula;
import TListas.TLista;

import TListas.TListaEn;


public class Lista_Matricula {
         private static TLista matriculas = new TListaEn();
    
    public static void registrarMatricula(Object a){
        matriculas.Adicionar(a);
    }
    
    public static TLista obtener(){
    return matriculas;}
    
   
    
}
