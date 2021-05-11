/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package actividadcalculadora60326;

import java.util.Scanner;

/**
 *
 * @author Jun
 */
public class ActividadCalculadora60326 {

    public static void Encabezado(){
      
        System.out.println("------------------------------------------");
        System.out.println("*****Universidad Autónoma de Campeche*****");
        System.out.println("------------------------------------------");
        System.out.println("***********Facultad de Ingeniería*********");
        System.out.println("------------------------------------------");
        System.out.println("**Ingeniería en Sistemas Computacionales**");
        System.out.println("------------------------------------------");
    }

    public static void Cuerpo(){
        
        System.out.println("------------------------------------------");
        System.out.println("*****Nombre: Jorge Alberto Sulub Xool*****");
        System.out.println("*************Matricula: 60326*************");
        System.out.println("------------------------------------------");
        System.out.println("*****Profesor: Edgar D. Caamal Dzulu******");
        System.out.println("********Lenguaje de programación 1********");
        System.out.println("------------------------------------------");
        System.out.println("*********Segundo Semestre Grupo A*********");
        System.out.println("------------------------------------------");
        System.out.println("*********Actividad 5: Calculadora*********");
        System.out.println("------------------------------------------");
        System.out.println("");
    }

    public static void Pie(){
        
        System.out.println("");
        System.out.println("------------------------------------------");
        System.out.println("**************San Francisco de Campeche***");
        System.out.println("******************************Mayo 2021***");
    }
    
    public static void main(String[] args) {
        
        Encabezado();
        Cuerpo();
        int Operador;
            Scanner Usuario = new Scanner(System.in);
            System.out.println("Escriba dos números");
            System.out.println("");
            System.out.println("Primer número:");
            double a = Usuario.nextDouble();
            System.out.println("Segundo número:");
            double b = Usuario.nextDouble();
            Operaciones Opera = new Operaciones();
            Opera.Asignacion(a, b);
            System.out.println("");
            System.out.println("Elija un operador de la siguiente lista:");
            System.out.println("1)---------------Suma");
            System.out.println("2)--------------Resta");
            System.out.println("3)-----Multiplicación");
            System.out.println("4)-----------División");
            System.out.println("");
            Operador = Usuario.nextInt();
            System.out.println("");
               switch (Operador) {
            case 1:
                System.out.println("El resultado de la suma es: " + Opera.Suma());
                break;
            case 2:
                System.out.println("El resultado de la resta es: " + Opera.Resta());
                break;
            case 3:
                System.out.println("El resultado de la multiplicación es: " + Opera.Multiplicacion());
                break;
            case 4:
                System.out.println("El resultado de la división es: " + Opera.Division());
                break;
            default:    
            System.out.println("Verifique que el número escrito esté dentro de la lista:");
                break;    
            }    
         Pie();    
    }
    
}
