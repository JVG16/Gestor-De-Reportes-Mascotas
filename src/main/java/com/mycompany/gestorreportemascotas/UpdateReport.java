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

public class UpdateReport {
    public static void Update (List<Pet>pets){
        Scanner sc = new Scanner (System.in);
        
        System.out.println("\n");
        System.out.println("----------------------------------------");
        System.out.println("    ACTUALIZAR ESTADO DE UN REPORTE     ");
        System.out.println("----------------------------------------");
        System.out.print("Ingrese el ID del reporte (No editable):");
        String IdReport = sc.nextLine().trim();
        
        Pet found = null;
        for (Pet p: pets){
            if (p.getIdentificationReport().equalsIgnoreCase(IdReport)){
                found = p;
                break;
            }
        }
        
        if(found == null){
            System.out.println("No se encontró un reporte con el ID");
            return;
        }
        
        if(found != null){
        System.out.println("Reporte encontrado:");
        System.out.println("ID Reporte:" + found.getIdentificationReport());
        System.out.println("ID Reportante:" + found.getIdentificationReporter());
        System.out.println("Nombre:" + found.getFullName());
        System.out.println("Tipo:" + found.getTypeReport());
        System.out.println("Fecha:" + found.getReportDate());
        System.out.println("Zona:" + found.getZone());
        System.out.println("Especie:" + found.getSpecies());
        System.out.println("Color:" + found.getColor());
        System.out.println("Señas:" + found.getParticularSigns());
        System.out.println("Teléfono:" + found.getTelephoneNumber());
        System.out.println("Microchip:" + found.getMicrochip());
        }
        
        
        System.out.println("Seleccione nueva opción:");
        System.out.println("1. Editar un solo dato");
        System.out.println("2. Reingresar todos los datos");
        System.out.print("Ingrese una opción:");
        int Op = sc.nextInt();
                sc.nextLine();
        
                if (Op==1){
        System.out.println("¿Qué dato desea editar?");
        System.out.println("1. Nombre completo");
        System.out.println("2. Tipo de reporte (PDR/ENC)");
        System.out.println("3. Zona");
        System.out.println("4.Especie (DOG/CAT)");
        System.out.println("5. Color principal");
        System.out.println("6.Señas particulares");
        System.out.println("7.Teléfono de contacto");
        System.out.println("8. Microchip");
        System.out.println("Seleccione una de las opciones");
        int Edit = sc.nextInt();
                sc.nextLine();
                
                switch (Edit){
                    case 1:
                       System.out.println("Ingrese el nombre completo:"); 
                       found.setFullName(sc.nextLine());
                       break;
                       
                    case 2:
                       System.out.println("Ingrese el tipo de reporte (PDR/ENC):"); 
                       found.setTypeReport(sc.nextLine());
                       break;
                       
                    case 3:
                       System.out.println("Ingrese la zona:"); 
                       found.setZone(sc.nextLine());
                       break;
                       
                    case 4:
                       System.out.println("Ingrese la especie (DOG/CAT):"); 
                       found.setSpecies(sc.nextLine());
                       break;
                       
                    case 5:
                       System.out.println("Ingrese el color principal:"); 
                       found.setColor(sc.nextLine());
                       break;
                       
                    case 6:
                       System.out.println("Ingrese las señas particulares:"); 
                       found.setParticularSigns(sc.nextLine());
                       break;
                       
                    case 7:
                       System.out.println("Ingrese el número de teléfono:"); 
                       found.setTelephoneNumber(sc.nextLine());
                       break;
                       
                    case 8:
                       System.out.println("...:");
                       break;
                    default:
                       System.out.println("Opción inválida"); 
                }
                }else if (Op==2){
                    
                    System.out.println ("Reingresar todos los datos");
                    
                    found.IdentReporter();
                    found.Name();
                    found.Report();
                    found.Place();
                    found.Animal();
                    found.Aspect();
                    found.Signs();
                    found.Phone();
                    
                }else{
                    System.out.println ("Opción inválida");
                    return;
                }
    }   
}

 
    