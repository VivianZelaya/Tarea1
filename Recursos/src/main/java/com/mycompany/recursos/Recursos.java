/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.recursos;

/**
 *
 * @author Vivian Zelaya
 */
/**Los métodos debe retornar los siguientes tipos de valor, colocar nombres descriptivos para cada uno de ellos: 
**Primer método: Retornar un mensaje que diga: "Programación Orientada a Objetos 2021".
**Segundo método: Declarar una variable de tipo entero y asignarle un número X que represente la edad del estudiante. 
* Retornar un mensaje dependiendo de esa variable si es mayor o igual a 21, el mensaje debe decir Mayor de edad, 
* de lo contrario Menor de edad.
**Tercer método: Retornar el resultado de una Multiplicación de dos enteros que proporcionemos como parámetros.
**Cuarto método:  Debe retornar una lista de numeros del 1 al X. Donde X es un parámetro de entrada del método a crear.
*/
import java.util.Scanner;
public class Recursos {

    public static void main(String[] args) {
        
        Mensaje mensaje = new Mensaje();
        mensaje.men();
        
        Edad edad = new Edad();
        edad.age(20);
        
        Multiplicacion multiplicacion = new Multiplicacion();
        multiplicacion.mult(0,0);
        
        Lista lista = new Lista();
        lista.lis(0);
        
    }
    //Primer Método
    public static class Mensaje{
    public void men(){
        System.out.println("-----PRIMER MÉTODO-----");
        System.out.println("Programación Orientada a Objetos 2021");
    }
 }
    //Segundo Método
    public static class Edad{
        public void age(int n){
        System.out.println("\n-----SEGUNDO MÉTODO-----");   
        if (n>=21){
            System.out.println("Mayor de edad");
        }else{
            System.out.println("Menor de edad");
        }
    }
    }
    //Tercer Método
    public static class Multiplicacion{
        public void mult(int n1, int n2){
            System.out.println("\n-----TERCER MÉTODO-----");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese el priemro número");
            n1=entrada.nextInt();
            System.out.println("Ingrese el segundo número");
            n2=entrada.nextInt();
            System.out.println("La multiplicación es: " + (n1*n2));
        }
    } 
    //Cuarto Método
    public static class Lista{
        public void lis(int x){
            System.out.println("\n-----CUARTO MÉTODO-----");
            Scanner entrada = new Scanner(System.in);
            System.out.println("Ingrese un número");
            x=entrada.nextInt();
            System.out.println("\nNumeros del 1 al " + x + ": ");
            for (int i=1; i<=x; i++){
               System.out.println(i); 
            }
        }
    }
    

}


