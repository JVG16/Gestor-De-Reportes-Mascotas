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
            
            
        }
        }
        
    }
}
