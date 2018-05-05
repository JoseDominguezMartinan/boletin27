/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

import calculadora.Interfaz;

/**
 *
 * @author jose
 */
public class MetodosBotones {
    
    public static void imprimirNumero(String numero){
        if(Interfaz.pantalla.getText().equals("0")){
           Interfaz.pantalla.setText(numero);  
        }
        else{
        Interfaz.pantalla.setText(Interfaz.pantalla.getText()+numero);
        }
    }
    
}
