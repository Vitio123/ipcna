/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Capa_Datos;

import TListas.TLista;
import TListas.TListaDin;

/**
 *
 * @author USER
 */
public class Lista_Grupos {
      private static TLista grupos = new TListaDin();
    
    public static void registrarGroup(Object a){
        grupos.Adicionar(a);
    }
    
    public static TLista obtener(){
    return grupos;}
}
