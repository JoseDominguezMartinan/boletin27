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

    public static void imprimirNumero(String numero) {
        if (Interfaz.pantalla.getText().equals("0")) {
            Interfaz.pantalla.setText(numero);
        } else {
            Interfaz.pantalla.setText(Interfaz.pantalla.getText() + numero);
        }
    }

    public float pulsarIgual(String operacion, float num1, float num2) {
        switch (operacion) {
            case "suma":
                numDevolver = obxCalculos.sumar(num1, num2);
                break;
        }
        return numDevolver;
    }

}
