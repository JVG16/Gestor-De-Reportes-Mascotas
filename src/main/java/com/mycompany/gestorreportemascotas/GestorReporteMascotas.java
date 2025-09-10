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
        Menu menu = new Menu();
        int option;

        do {
            menu.SeeMenu();
            option = menu.leerOption();

            switch (option) {
                case 1:{
                    
                    Pet AA = new Pet ();
                    AA.IdentReport ();
                    
                    Pet BB = new Pet ();
                    BB.IdentReporter ();
                    
                    Pet CC = new Pet ();
                    CC.Name ();
                    
                    Pet DD = new Pet ();
                    DD.Report ();
                    
                    Pet EE = new Pet ();
                    EE.Place ();
                    
                     Pet FF = new Pet ();
                    FF.Animal ();
                    
                     Pet GG = new Pet ();
                    GG.Aspect ();
                    
                    Pet HH = new Pet ();
                    HH.Signs ();
                    
                    Pet II = new Pet ();
                    II.Phone ();
                    
                    
                    break;
                    
                }
                       
                case 2:{
                    System.out.println("2");
                }
                    
                case 3:{
                  System.out.println("3");  
                }
                    
                case 4:{
                    System.out.println("4");
                }
                    
                case 5:{
                    System.out.println("5");
                }
                    
                case 6:{
                    System.out.println("6");
                }
                    
                case 7:{
                    System.out.println("Le agradecemos su aporte.");
                }
                
                default: {
                    System.out.println("Opción inválida");
                }   
                
            }
        } while (option != 7);

    }
}
