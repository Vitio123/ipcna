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
public class Lista_Programas {
    private static TLista programas = new TListaDin();
    
    public static void registrarPrograma(Object a){
        programas.Adicionar(a);
    }
    
    public static TLista obtener(){
    return programas;}
    
}
