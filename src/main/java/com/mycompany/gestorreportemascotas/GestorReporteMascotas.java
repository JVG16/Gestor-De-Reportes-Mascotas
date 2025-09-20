/*
UNIVERSIDAD ESTATAL A DISTANCIA
Estudiante: Jimena Velásquez Gómez.
Identificación: 1-1919-0417.
Docente: Gabriela Cervantes Jimenez.
Proyecto #1.
Temas 1 y 2.
Tercer cuatrimestre, 2025.

Descripción:


Referencias:
Canal de Promamación ATS: 


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestorreportemascotas;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jimena
 */
public class GestorReporteMascotas {

    public static void main(String[] args) throws IOException {  
        
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Menu menu = new Menu();
        int option;
        boolean OrderExcecute = false;

        List<Pet> pets = new ArrayList<>();

        do {
            menu.SeeMenu();
            option = menu.leerOption();

            switch (option) {

                case 1: {

                    Pet AA = new Pet();
                    AA.IdentReport();
                    AA.IdentReporter();
                    AA.Name();
                    AA.Report();
                    AA.Date();
                    AA.Place();
                    AA.Animal();
                    AA.Aspect();
                    AA.Signs();
                    AA.Phone();
                    AA.Micro();

                    pets.add(AA);
                    OrderExcecute = true;
                    break;

                }

                case 2: {
                    
                    if (OrderExcecute){
                        Query.listOfQueries(pets);
                    }
                    else{
                      System.out.println("Debe de realizar el registro");
                    }
                    break;
                }

                case 3: {
                    
                    if(OrderExcecute){
                       GeneralReport.General(pets);
                    }
                    else{
                        System.out.println ("Debe de realizar el registro");
                    }
                    break;
                }

                case 4: {
                    
                    if(OrderExcecute){
                     GroupedReport.Grouped(pets);  
                    }
                    else {
                        System.out.println("Debe de realizar el registro");
                    }   
                    break;
                }

                case 5: {
                    
                    if(OrderExcecute){
                     MatchFound.Coincidences(pets);  
                    }
                    else {
                      System.out.println("Debe de realizar el registro");  
                    }
                    
                    break;
                }

                case 6: {
                    
                    if (OrderExcecute){
                     UpdateReport.Update(pets);
                    }
                    else{
                        System.out.println("Debe de realizar el registro");
                    }
                    break;
                }

                case 7: {
                    System.out.println("Le agradecemos su aporte.");
                    break;
                }

                default: {
                    System.out.println(" Opción inválida, por favor vuelva a intentarlo. ");
                }

            }
        } while (option != 7);

    }
}
