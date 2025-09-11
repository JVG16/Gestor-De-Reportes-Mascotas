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
    
    public String IdentificationReport;
    public String IdentificationReporter;
    public String FullName;
    public String TypeReport;
    public String ReportDate;
    public String Zone;
    public String Species;
    public String Color;
    public String ParticularSigns;
    public String TelephoneNumber;
    
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
         boolean One = true;
         
         do{
       System.out.println("Ingrese ID de reporte (ejemplo REP-0001):");
       this.IdentificationReport = sc.nextLine().trim().toUpperCase();
       
       if (IdentificationReport.length()!=8){
           System.out.println ("La cantidad esperada de carácteres en total es de 8. Por favor, vuelva a intentarlo");
           One = false; 
       }
       else{
           One = true;
       }
       
   }while (!One);              
}
      
    public void IdentReporter(){
         Scanner sc = new Scanner (System.in);
         boolean Two = true;
         
         do{
       System.out.println("Ingrese ID del reportante (1-1111-1111):");
       this.IdentificationReporter= sc.nextLine().trim().toUpperCase();
       
       
       if (IdentificationReporter.length()!=11){
           System.out.println ("La cantidad esperada de carácteres en total es de 11. Por favor, vuelva a intentarlo");
           Two = false; 
       }
       
       if(IdentificationReporter.charAt(1)!='-'|| IdentificationReporter.charAt(6)!= '-'){
           
           System.out.println("El formato es incorrecto, por favor vuelva a intentarlo");
           Two = false;
       }
       
   }while (!Two);  
     
   }  
     
     public void Name(){
         Scanner sc = new Scanner (System.in);
         boolean Three = true;
         
         do{
       System.out.println("Ingrese el nombre completo:");
       this.FullName= sc.nextLine().trim().toUpperCase();
       if (FullName.length()>=7){
           Three = true;
       }
       else{
          System.out.println("El nombre debe contener como mínimo 7 carácteres"); 
          Three = false;
       } 
                      
   }while (!Three);  
     
   }
     
    public void Report(){
         Scanner sc = new Scanner (System.in);
         boolean Four = true;
         
         do{
       System.out.println("Tipo de reporte (PDR/ENC):");
       this.TypeReport = sc.nextLine().trim().toUpperCase();
   }while (this.TypeReport == null);  
     
   } 
     
    public void Date(){
         Scanner sc = new Scanner (System.in);
         boolean Five = true;
         
         do{
       System.out.println("Ingrese la fecha del reporte:");
       this.ReportDate = sc.nextLine().trim().toUpperCase();
       
   }while (!Five);
         }
    
    public void Place(){
         Scanner sc = new Scanner (System.in);
         boolean Six = true;
         
         do{
       System.out.println("Ingrese la zona:");
       this.Zone = sc.nextLine().trim().toUpperCase();
       if (Zone.length()<= 30){
           Six = true;
       }
       else{
           System.out.println("El texto debe contener como máximo 30 carácteres");
           Six = false;
       }
       
   }while (!Six);  
         
     
   } 
     
    public void Animal (){
         Scanner sc = new Scanner (System.in);
         boolean Seven = true;
         
         do{
       System.out.println("Ingrese especie (DOG/CAT):");
       this.Species= sc.nextLine().trim().toUpperCase();
       if (Species.equals("DOG")||Species.equals("CAT")){
           Seven = true;
       }
       else{
           System.out.println("Ingrese una de las dos opciones mencionadas anteriormente");
           Seven = false;
       }
   }while (!Seven);  
     
   }
    
    public void Aspect (){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.println("Ingrese color principal:");
       this.Color = sc.nextLine().trim().toUpperCase();
   }while (this.Color == null);  
     
   }
    
    public void Signs (){
         Scanner sc = new Scanner (System.in);
         boolean Nine = true;
         
         do{
       System.out.println("Ingrese señas particulares (mínimo 10 carácteres):");
       this.ParticularSigns = sc.nextLine().trim().toUpperCase();
       if (ParticularSigns.length()>=10){
           Nine = true;
       }
       else{
          System.out.println("Debe tener mínimo 10 carácteres"); 
          Nine = false;
       } 
       
   }while (!Nine);  
     
   }
    
    public void Phone (){
         Scanner sc = new Scanner (System.in);
         boolean Ten = true;
         
         do{
       System.out.println("Ingrese teléfono de contacto (####-####):");
       this.TelephoneNumber = sc.nextLine().trim().toUpperCase();
       if(TelephoneNumber.charAt(4)!='-'){
          System.out.println("El formato del teléfono de contacto es incorrecto"); 
          Ten = false;
       }
       
   }while (!Ten);  
     
   }
    
    public String Archive (){
        return " ID Reporte:" + IdentificationReport + 
               " ID reportante:" + IdentificationReporter+
               " Tipo de Reporte:"+ TypeReport+
               " Zona:" + Zone+
                " Especie:"+ Species+
                " Color:" + Color +
                " Señales Particulares:" + ParticularSigns +
                " Teléfono:" + TelephoneNumber;
                
    }
     
    public String getIdentificationReport() {
        return IdentificationReport;
    }
    public String getIdentificationReporter() {
        return IdentificationReporter;
    }
    public String getFullName() {
        return FullName;
    }
    public String getTypeTeport() {
        return TypeReport;
    }
    public String getReportDate() {
        return ReportDate;
    }
    public String getZone() {
        return Zone;
    }
    public String getSpecies() {
        return Species;
    }
    public String getColor() {
        return Color;
    }
    public String getParticularSigns() {
        return ParticularSigns;
    }
    public String getTelephoneNumber() {
        return TelephoneNumber;
    }
     }

