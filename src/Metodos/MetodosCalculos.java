/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Metodos;

/**
 *
 * @author jose
 */
public class MetodosCalculos {
    float num; // numero que vamos a devolver resultado de las operaciones que realizamos 
    /**
     * metodo que suma dos numeros y devuelve el resultado 
     * @param num1 numero 1 a sumar
     * @param num2 numero 2 a sumar 
     * @return num numero resultado de la suma de los dos anteriores
     */
    public float sumar(float num1,float num2){
         num=num1+num2;
        return num;
    }
    /**
     * metodo que resta dos numeros que le hemos pasado
     * @param num1 numero 1 a restar
     * @param num2 numero dos a restar 
     * @return num resultado de la resta de los dos numeros 
     */
    public float restar(float num1,float num2){
        num=num1-num2;
        return num;
    }
    /**
     * metodo que devuelve la multiplicacion entre dos numeros 
     * @param num1 numero 1 ha operar 
     * @param num2 numero 2 ha operar 
     * @return  num numero resultado de la multiplicacionn de los dos anteriores 
     */
    public float multiplicar(float num1,float num2){
        num=num1*num2;
        return num;
    }
    /**
     * metodo que devuelve la division entre dos numeros que pasamos como parametros 
     * @param num1 dividendo 
     * @param num2 divisor 
     * @return num resultado
     */
    public float dividir(float num1, float num2){
        num=num1/num2;
        return num;
        
    }
    /**
     * muestra el numero por el cual hay que multiplicar para calcular un tanto por ciento 
     * @param num1 porcentaje
     * @return num numero por el que tenemos que multiplicar para calcular el tanto por ciento 
     */
    public float tantoPorCiento(float num1){
        num=num1/100;
        return num;
    }
   
    
}
