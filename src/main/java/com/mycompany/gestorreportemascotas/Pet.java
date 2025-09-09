/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorreportemascotas;

import java.util.Scanner;

/**
 *
 * @author Jimena
 */
public class Pet {
    
    private String IdentificationReport;
    private String IdentificationReporter;
    private String FullName;
    private String TypeReport;
    private String ReportDate;
    private String Zone;
    private String Species;
    private String Color;
    private String ParticularSigns;
    private String TelephoneNumber;
    
    public Pet (){
        this.IdentificationReport = "";
        this.IdentificationReporter="";
        this.FullName="";
        this.TypeReport="";
    this.ReportDate ="";
    this.Zone="";
    this.Species="";
    this.Color="";
    this.ParticularSigns="";
    this.TelephoneNumber="";
    
        
    }
    
     public void IdentReport(){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese ID de reporte (ejemplo REP-0001):");
       this.IdentificationReport = sc.nextLine().trim().toUpperCase();
   }while (this.IdentificationReport== null);              
}
     
    public void IdentReporter(){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese ID del reportante (1-1111-1111):");
       this.IdentificationReporter= sc.nextLine().trim().toUpperCase();
   }while (this.IdentificationReporter== null);  
     
   }  
     
     public void Name(){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese el nombre completo :");
       this.FullName= sc.nextLine().trim().toUpperCase();
   }while (this.FullName== null);  
     
   }
     
    public void Report(){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Tipo de reporte (PDR/ENC) :");
       this.TypeReport = sc.nextLine().trim().toUpperCase();
   }while (this.TypeReport == null);  
     
   } 
     
    public void Place(){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese la zona :");
       this.Zone= sc.nextLine().trim().toUpperCase();
   }while (this.Zone == null);  
     
   } 
     
    public void Animal (){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese especie (DOG/CAT) :");
       this.Species= sc.nextLine().trim().toUpperCase();
   }while (this.Species == null);  
     
   }
    
    public void Aspect (){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese color principal :");
       this.Color = sc.nextLine().trim().toUpperCase();
   }while (this.Color == null);  
     
   }
    
    public void Signs (){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese señas particulares (mínimo 10 carácteres):");
       this.ParticularSigns = sc.nextLine().trim().toUpperCase();
   }while (this.ParticularSigns == null);  
     
   }
    
    public void Phone (){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese teléfono de contacto :");
       this.TelephoneNumber = sc.nextLine().trim().toUpperCase();
   }while (this.TelephoneNumber == null);  
     
   }
     
     }

