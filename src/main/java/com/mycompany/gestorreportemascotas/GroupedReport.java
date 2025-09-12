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
public class GroupedReport {
   public static void Grouped (List<Pet> pets){
       System.out.println("---------------------------------------");
       System.out.println("       REPORTE AGRUPADO DE MASCOTAS    "); 
       System.out.println("---------------------------------------");
       System.out.println("Conteo por tipo:");
       
       int PDR = 0;
       int ENC =0;
       
       for (Pet p: pets){
       if (p.getTypeReport().equalsIgnoreCase("PDR")){
           PDR++;   
       } 
       else if (p.getTypeReport().equalsIgnoreCase("PENC")){
           ENC++;
       }
   }
       System.out.println("PDR:"+PDR);
       System.out.println("ENC:"+ENC);
       
       int Dog = 0;
       int Cat = 0;
       
       for (Pet p: pets){
       if (p.getTypeReport().equalsIgnoreCase("DOG")){
           Dog++;   
       } 
       else if (p.getTypeReport().equalsIgnoreCase("CAT")){
           Cat++;
       }
   }
       System.out.println("DOG:"+Dog);
       System.out.println("CAT:"+Cat); 
    }
}

