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

    MetodosCalculos obxCalculos = new MetodosCalculos();
    float numDevolver;

    public static void imprimirNumero(String numero, boolean imprimir) {
        if (imprimir==false) {
            Interfaz.pantalla.setText(numero);
            Interfaz.imprimir=true;
        } else {
            Interfaz.pantalla.setText(Interfaz.pantalla.getText() + numero);
        }
    }

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

}
