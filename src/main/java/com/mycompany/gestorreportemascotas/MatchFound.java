/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorreportemascotas;

import java.util.List;

/**
 *
 * @author Jimena
 */
public class MatchFound {

    public static void Coincidences(List<Pet> pets) {
        
        System.out.println("\n");
        System.out.println("------------------------------------------");
        System.out.println("   REPORTE DE COINCIDENCIAS ENCONTRADAS   ");
        System.out.println("------------------------------------------");

        int sum = 0;

        for (Pet PDR : pets) {
            if (!PDR.getTypeReport().equalsIgnoreCase("PDR")) continue;
        
        for (Pet ENC : pets) {
            if (!ENC.getTypeReport().equalsIgnoreCase("ENC")) continue;
            
            
            int Similitudes = 0;
        
        if (PDR.getSpecies().equalsIgnoreCase(ENC.getSpecies()))Similitudes++;
        if (PDR.getColor().equalsIgnoreCase(ENC.getColor()))Similitudes++;
        if (PDR.getZone().equalsIgnoreCase(ENC.getZone()))Similitudes++;
        if (PDR.getReportDate().equalsIgnoreCase(ENC.getReportDate()))Similitudes++;
            
           if (Similitudes>=2){
               sum++;
               
               System.out.println("PDR-Pérdida");
               System.out.println("ID Reportante:"+ PDR.getIdentificationReporter());
               System.out.println("Nombre:"+ PDR.getFullName());
               System.out.println("Especie:"+ PDR.getSpecies());
               System.out.println("Color:"+ PDR.getColor());
               System.out.println("Zona:" +PDR.getZone());
               System.out.println("Fecha:"+PDR.getReportDate());
               
               
               System.out.println("ENC-Encontrada");
               System.out.println("ID Reportante:"+ ENC.getIdentificationReporter());
               System.out.println("Nombre:"+ ENC.getFullName());
               System.out.println("Especie:"+ ENC.getSpecies());
               System.out.println("Color:"+ ENC.getColor());
               System.out.println("Zona:" + ENC.getZone());
               System.out.println("Fecha:"+ ENC.getReportDate());
               System.out.println("------------------------------------------");
               
               
               
           }
               
        }
        }
        
        System.out.println("Coincidecias encontradas:"+ sum);
   }
}
