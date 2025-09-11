/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorreportemascotas;

import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jimena
 */
public class Query {
    public static void listOfQueries(List<Pet> pets){
        Scanner sc = new Scanner (System.in);
        System.out.println(" -------------------------------------------- ");
        System.out.println("     CONSULTA DE REPORTES POR CRITERIOS       ");
        System.out.println(" -------------------------------------------- ");
        System.out.println(" Seleccione criterio de búsqueda:");
        System.out.println(" 1. ID del reportante ");
        System.out.println(" 2. Especie ");
        System.out.println(" 3. Zona ");
        System.out.println(" Digite un criterio de búsqueda");
        int Selection = sc.nextInt();
        sc.nextLine();
        
        String Written = "";
        switch (Selection){
            
            case 1: {
                System.out.println(" 1. ID del reportante: ");
                 Written = sc.nextLine(). trim ().toUpperCase();
                 break;
            }  
            case 2:{
                System.out.println(" 2. Especie: ");
                Written = sc.nextLine(). trim ().toUpperCase();
                break;
            }
            case 3:{
                System.out.println(" 3. Zona: ");
                Written = sc.nextLine(). trim ().toUpperCase();
                break;
            }
            default: {
                 System.out.println("  Ha seleccionado un valor fuera de los criterios de búsqueda ");
                }
        
    }
       System.out.println(" Ingrese especie (DOG/CAT):");
        Written = sc.nextLine(). trim ().toUpperCase();
        System.out.println(" Resultados encontrados:"); 
        System.out.println(" ID Reportante       Nombre        Fecha          Zona          Tipo            ");
         System.out.println(" -------------------------------------------------------------------------------");
         
         boolean found = false;
        for (Pet p : pets) {
            boolean match = false;

            if (Selection == 1 && p.getIdentificationReporter().toUpperCase().equals(Written)) {
                match = true;
            } else if (Selection == 2 && p.getSpecies().toUpperCase().equals(Written)) {
                match = true;
            } else if (Selection == 3 && p.getZone().toUpperCase().equals(Written)) {
                match = true;
            }
            
           if(match){
               found = true;
               System.out.printf ("                 -                  -                     -                    -    ",
               p.getIdentificationReporter(), p.getFullName(),p.getReportDate(), p.getZone(), p.getTypeTeport());
                  
           }
            
         }
        
    }
     
} 


