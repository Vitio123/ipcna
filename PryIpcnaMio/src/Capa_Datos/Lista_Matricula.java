

package Capa_Datos;

import Capa_Logica.Matricula;
import TListas.TLista;

import TListas.TListaEn;
import java.util.Calendar;


public class Lista_Matricula {
         private static TLista matriculas = new TListaEn();
    
    public static void registrarMatricula(Object a){
        matriculas.Adicionar(a);
    }
    
    public static TLista obtener(){
    return matriculas;}
    
   public static TLista buscarMatricula (String codEstudiante){
       TLista listafil = new TListaEn();
        TLista datos = obtener();
        for (int i = 0; i < datos.Cantidad(); i++) {
           Matricula mtrl = (Matricula) datos.Obtener(i);
           if(mtrl.getcodEstudiante().equalsIgnoreCase(codEstudiante))
               listafil.Adicionar(mtrl);
       }
   return listafil;} 
   
   public static TLista buscarGrupo (String codGrupo,Calendar fecha){
       TLista datos  = obtener();
       TLista listaMatriculas = new TListaEn();
       for (int i = 0; i < datos.Cantidad(); i++) {
           Matricula martl = (Matricula) datos.Obtener(i);
           if(martl.getCodigoGrupo().equalsIgnoreCase(codGrupo))
               listaMatriculas.Adicionar(martl);
       }
   return listaMatriculas;}
   public static void eliminar(int index , String codEstudiante){
       TLista datos = buscarMatricula(codEstudiante);
       datos.Eliminar(index);
   }           
    
}
