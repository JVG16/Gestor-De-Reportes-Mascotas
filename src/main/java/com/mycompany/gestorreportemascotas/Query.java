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

    public static void listOfQueries(List<Pet> pets) {
        Scanner sc = new Scanner(System.in);
        
        System.out.println("\n");
        System.out.println(" -------------------------------------------------------------------------- ");
        System.out.println("                       CONSULTA DE REPORTES POR CRITERIOS                   ");
        System.out.println(" -------------------------------------------------------------------------- ");
        System.out.println(" Seleccione criterio de búsqueda:");
        System.out.println(" 1. ID del reportante ");
        System.out.println(" 2. Especie ");
        System.out.println(" 3. Zona ");
        System.out.print(" Digite un criterio de búsqueda:");
        int Selection = sc.nextInt();
        sc.nextLine();

        String Written = "";

        String Word = "";

        if (Selection == 1) {
            System.out.print("Digite el ID del reportante:");
            Word = sc.nextLine().trim().toUpperCase();
        } else if (Selection == 2) {
            System.out.print("Digie la especie (DOG/CAT:");
            Word = sc.nextLine().trim().toUpperCase();
        } else if (Selection == 3) {
            System.out.print("Digite la zona:");
            Word = sc.nextLine().trim().toUpperCase();
        } else {
            System.out.println("Opción inválida");
            return;
        }

      
        
        boolean found = false;
        for (Pet p : pets) {
            boolean match = false;

            if (Selection == 1 && p.getIdentificationReporter().toUpperCase().equals(Word)) {
                match = true;
            } else if (Selection == 2 && p.getSpecies().toUpperCase().equals(Word)) {
                match = true;
            } else if (Selection == 3 && p.getZone().toUpperCase().equals(Word)) {
                match = true;
            }

            if (match){
                if (!found){
                    
                      System.out.println("\n");
                      System.out.println(" Resultados encontrados:");
        System.out.printf("%-10s | %-18s | %-8s | %-8s | %-8s%n",
                "ID Reportante", "Nombre Completo", "Fecha", "Zona", "Tipo");
                }
                
                found = true;
        System.out.printf("%-10s | %-18s | %-8s | %-8s | %-8s%n",
                p.getIdentificationReporter(), p.getFullName(), p.getReportDate(),
                p.getZone(), p.getTypeReport());
            }
        }

        if(!found){
            
            if (Selection == 1){
                System.out.print("Cédula no encontrada.");
            }
            else if (Selection == 2){
                System.out.print("Especie no encontrada.");
            }
            else if (Selection == 3){
                System.out.print("Zona no encontrada.");
            }
        }
    }

}
