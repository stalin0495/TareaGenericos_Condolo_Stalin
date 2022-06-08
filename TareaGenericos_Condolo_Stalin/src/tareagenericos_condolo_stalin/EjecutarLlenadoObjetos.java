package tareagenericos_condolo_stalin;

import java.util.Scanner;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author sscon
 */
public class EjecutarLlenadoObjetos {
    public static void main (String[] args){
        
        double a,b;
        Scanner sc = new Scanner(System.in);
        System.out.println("**** OPERACIONES BASICAS *****");
        System.out.println("");
        System.out.println("Ingrese el numero a: ");
        a=sc.nextDouble();
        System.out.println("Ingrese el numero b: ");
        b=sc.nextDouble();
        
        ArrayListG<Double, Double> suma = new ArrayListG<>(a,b);
        
        double sum = suma.getNumUno() + suma.getNumDos();
        double rest = suma.getNumUno() - suma.getNumDos();
        double mult = suma.getNumUno() * suma.getNumDos();
        double div = suma.getNumUno() / suma.getNumDos();
        
        System.out.println("");
        System.out.println("La SUMA es: "+sum);
        System.out.println("La RESTA es: "+rest);
        System.out.println("La MULTIPLICACION es: "+mult);
        System.out.println("La DIVISION es: "+div);
    }
}
