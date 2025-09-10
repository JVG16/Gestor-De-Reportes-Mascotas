/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestorreportemascotas;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 *
 * @author Jimena
 */
public class GestorReporteMascotas {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        int option;

        do {
            menu.SeeMenu();
            option = menu.leerOption();

            switch (option) {
                
                case 1:{
                    
                    Pet AA = new Pet ();
                    AA.IdentReport ();
                    AA.IdentReporter ();
                    AA.Name ();
                    AA.Report();
                    AA.Place ();
                    AA.Animal ();
                    AA.Aspect ();
                    AA.Signs ();
                    AA.Phone ();
                    
                    try{
                        
                        FileWriter archivo = new FileWriter ("Registro.txt", true);
                        PrintWriter escribir = new PrintWriter (archivo);
                        
                        escribir.println(AA.Archive());
                       escribir.close();
                       archivo.close();
                        
                    }catch (IOException e){
                        System.out.println ("No se guardó el registro correctamente" + e.getMessage());
                    }
                    
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
