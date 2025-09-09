/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.gestorreportemascotas;



/**
 *
 * @author Jimena
 */
public class GestorReporteMascotas {
public static void main(String[] args) {
    Menu menu= new Menu ();
        int option;
        
        do{
           menu.SeeMenu();
            option= menu.leerOption();
            
            switch (option){
               case 1 -> System.out.println ("1");
                case 2 -> System.out.println ("2");
                case 3 -> System.out.println ("3");
                case 4 -> System.out.println ("4");
                case 5 -> System.out.println ("5");
                case 6 -> System.out.println ("6");
              case 7 -> System.out.println ("7");
              default -> System.out.println ("Opción fuera del rango");
            }           
        }while (option!=7);
                   
}
 }
