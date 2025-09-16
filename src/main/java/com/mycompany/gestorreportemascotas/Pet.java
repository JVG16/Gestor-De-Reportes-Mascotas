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
    public String Microchip;
    
    public Pet (){
        
    this.IdentificationReport = "";
    this.IdentificationReporter = "";
    this.FullName = "";
    this.TypeReport = "";
    this.ReportDate = "";
    this.Zone = "";
    this.Species = "";
    this.Color = "";
    this.ParticularSigns = "";
    this.TelephoneNumber = "";
    this.Microchip = "";
        
    }
    
    
    // Validaciones ID del Reporte.
    
     public void IdentReport(){
         
    System.out.println("\n");
    System.out.println("--------------------------------------------------");
    System.out.println("             REGISTRAR NUEVO REPORTE              ");
    System.out.println("--------------------------------------------------");
    
         Scanner sc = new Scanner (System.in);
         boolean One;
         
         do{
             
       One = true;
       System.out.print("Ingrese ID de reporte (ejemplo REP-0001):");
       this.IdentificationReport = sc.nextLine().trim().toUpperCase();
       
       if (IdentificationReport.length()!=8){
           System.out.println ("La cantidad esperada de carácteres en total es de 8. Por favor, vuelva a intentarlo.");
           One = false; 
       }
       else if (!IdentificationReport.startsWith("REP-")){
           System.out.println ("Se incluir primero el prefijo (REP-). Por favor, vuelva a intentarlo. ");
           One = false;
       }
       
   }while (!One);              
}
      
     // Validaciones para el ID del Reportante.
     
    public void IdentReporter(){
         Scanner sc = new Scanner (System.in);
         boolean Two;
         
         do{
             
       Two = true;
       System.out.print("Ingrese ID del reportante (1-1111-1111):");
       this.IdentificationReporter= sc.nextLine().trim().toUpperCase();
       
       if(IdentificationReporter.charAt(1)!='-'|| IdentificationReporter.charAt(6)!= '-'){
           
           System.out.println("El formato es incorrecto, por favor vuelva a intentarlo.");
           Two = false;
       }
       
       if (IdentificationReporter.matches ("\\d+")){
           System.out.println("La cédula debe contener únicamente números, no carácteres.");  
           Two = false;
       }
       if (IdentificationReporter.length()!=11){
           System.out.println ("La cantidad esperada de carácteres en total es de 11. Por favor, vuelva a intentarlo.");
           Two = false; 
       }
           
   }while (!Two);  
     
   }  
     
    // Validaciones para el Nombre.
    
     public void Name(){
         Scanner sc = new Scanner (System.in);
         boolean Three;
         
         do{
             
       Three = true;
       System.out.print("Ingrese el nombre completo:");
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
     
     // Validaciones para el tipo de Reporte.
     
    public void Report(){
         Scanner sc = new Scanner (System.in);
         boolean Four;
         
         do{
       Four = true;
       System.out.print("Tipo de reporte (PDR/ENC):");
       this.TypeReport = sc.nextLine().trim().toUpperCase();
   }while (this.TypeReport == null);  
     
   } 
     
    // Validaciones para la Fecha.
    
    public void Date(){
         Scanner sc = new Scanner (System.in);
         boolean Five = true;
         
         do{
       System.out.print("Ingrese la fecha del reporte:");
       this.ReportDate = sc.nextLine().trim().toUpperCase();
       
   }while (!Five);
         }
    
    // Validaciones para la Zona.
    
    public void Place(){
         Scanner sc = new Scanner (System.in);
         boolean Six;
         
         do{
             
       Six = true;
       System.out.print("Ingrese la zona:");
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
    
    // Validaciones tipo de Especie.
     
    public void Animal (){
         Scanner sc = new Scanner (System.in);
         boolean Seven;
         
         do{
       Seven = true;
       System.out.print("Ingrese especie (DOG/CAT):");
       this.Species= sc.nextLine().trim().toUpperCase();
       if (Species.equals("DOG")||Species.equals("CAT")){
           Seven = true;
       }
       else{
           System.out.println("Debe ingresar una de las dos opciones mencionadas anteriormente.");
           Seven = false;
       }
   }while (!Seven);  
     
   }
    
    // Validaciones por el Color.
    
    public void Aspect (){
         Scanner sc = new Scanner (System.in);
         do{
       System.out.print("Ingrese color principal:");
       this.Color = sc.nextLine().trim().toUpperCase();
   }while (this.Color == null);  
     
   }
    
    // Validaciones de las Señas.
    
    public void Signs (){
         Scanner sc = new Scanner (System.in);
         boolean Nine;
         
         do{
       Nine = true;
       System.out.print("Ingrese señas particulares (mínimo 10 carácteres):");
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
    
    // Validaciones Teléfono.
    
    public void Phone (){
         Scanner sc = new Scanner (System.in);
         boolean Ten;
         
         do{
             
       Ten = true;
       System.out.print("Ingrese teléfono de contacto (####-####):");
       this.TelephoneNumber = sc.nextLine().trim().toUpperCase();
       if(TelephoneNumber.charAt(4)!='-'){
          System.out.println("El formato del teléfono de contacto es incorrecto. Por favor, vuelva a intentarlo."); 
          Ten = false;
       }
       
       if (TelephoneNumber.matches ("\\d+")){
           System.out.println("El número de teléfono u contacto solo debe contener números. Por favor, vuelva a intentarlo.");  
           Ten = false;
       }
       
   }while (!Ten);  
     
   }
    
    public void Micro (){
         Scanner sc = new Scanner (System.in);
         boolean Eleven;
         
         do{
             
       Eleven = true;
       System.out.print("Ingrese microchip (opcional, deje en blanco si no tiene): ");
       this.Microchip = sc.nextLine().trim().toUpperCase();
       
   }while (!Eleven);  
     
   }
    
   // Creación de get.
    
    public String getIdentificationReport() {
        return IdentificationReport;
    }
    public String getIdentificationReporter() {
        return IdentificationReporter;
    }
    public String getFullName() {
        return FullName;
    }
    public String getTypeReport() {
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
     
     }

