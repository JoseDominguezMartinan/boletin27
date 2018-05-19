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

    MetodosCalculos obxCalculos = new MetodosCalculos(); // obxeto para devolver aos metodos da clase MetodosCalculos cando sexa necesario
    float numDevolver; // variable donde se almacena el numero resultado de las operaciones 
    /**
     * metodo que imprime un numero determinado al pulsar un boton o la tecla correspondiente 
     * @param numero numero que hemos presionado 
     * @param imprimir variabnle que indica si hay que concatenar con el string anterior o no 
     */

    public static void imprimirNumero(String numero, boolean imprimir) {
        if (imprimir==false) {
            Interfaz.pantalla.setText(numero);
            Interfaz.imprimir=true;
        } else {
            Interfaz.pantalla.setText(Interfaz.pantalla.getText() + numero);
        }
    }
    /**
     * metodo para realizar los calculos pendientes a la hora de pulsar el boton igual 
     * @param operacion indica la operacion pendiente de realizar 
     * @param num1 numero con el que vamos a operar 
     * @param num2 segundo numero de la operacion que vamos a realizar 
     * @return numDevolver numero que viene de la operacion pendiente de realizar 
     */

    public float pulsarIgual(String operacion, float num1, float num2) {
        switch (operacion) {
            case "mas":
                numDevolver = obxCalculos.sumar(num1, num2);
                break;
            case "menos":
                numDevolver=obxCalculos.restar(num1, num2);
                break;
            case "por":
                numDevolver=obxCalculos.multiplicar(num1, num2);
                break;
            case "entre":
                numDevolver=obxCalculos.dividir(num1, num2);
        }
        return numDevolver;
    }
    /**
     * metodo que pone una coma en la pantalla en el momento que es pulsado el boton coma 
     */
    public void pulsarComa(){
        Interfaz.pantalla.setText(Interfaz.pantalla.getText()+".");
    }
    /**
     * metodo para cambiar el signo del numero con el que vamos a operar al pulsar el boton correspondiente 
     * @param signo signo actual del numero, true es positivo y false negativo 
     * @return signo una vez cambiado sera el opuesto que el que hemos recibido 
     */
    public boolean cambiarSigno(boolean signo){
        if(signo==true){
            Interfaz.pantalla.setText("-"+Interfaz.pantalla.getText()); // cambiamos la informacion de pantalla por el numero con un menos delante
            signo=false; // ahora el signo es negativo 
        }
        else{
            Interfaz.pantalla.setText((Interfaz.pantalla.getText().substring(1,Interfaz.pantalla.getText().length()))); // en el caso de que sea positivo queremos imprimir en pantalla todo menos el signo, para eso cogemos la cadena y le quitamos el primer caracter con el substring 
            signo=true; // devolvemos que ahora el signo es positivo 
        }
            return signo;
    }

}
