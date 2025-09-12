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
public class GeneralReport {

    public static void General(List<Pet> pets) {
        System.out.println("----------------------------------------------------");
        System.out.println("        REPORTE GENERAL DE MASCOTAS                 ");
        System.out.println("----------------------------------------------------");
        System.out.printf("%-10s | %-18s | %-8s | %-8s | %-8s%n",
                "ID Reportante", "Nombre Completo", "Fecha", "Zona", "Tipo");

        int Old = 0;
        for (Pet p : pets) {
        System.out.printf("%-10s | %-18s | %-8s | %-8s | %-8s%n",
                    p.getIdentificationReporter(), p.getFullName(), p.getReportDate(),
                    p.getZone(), p.getTypeReport());
            Old++;
        }

        System.out.println("----------------------------------------------------");
        System.out.println("\n\n");
        
        System.out.println("Total de Reportes:" + Old);
        System.out.println("\n\n");

    }
}
