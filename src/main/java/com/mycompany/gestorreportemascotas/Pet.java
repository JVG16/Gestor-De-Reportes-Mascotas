/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorreportemascotas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
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
    private String Microchip;

    
    // Constructor.
    
    public Pet(String IdentificationReport, String IdentificationReporter, String FullName, String TypeReport, String ReportDate, String Zone, String Species, String Color, String ParticularSigns, String TelephoneNumber, String Microchip) {
        this.IdentificationReport = IdentificationReport;
        this.IdentificationReporter = IdentificationReporter;
        this.FullName = FullName;
        this.TypeReport = TypeReport;
        this.ReportDate = ReportDate;
        this.Zone = Zone;
        this.Species = Species;
        this.Color = Color;
        this.ParticularSigns = ParticularSigns;
        this.TelephoneNumber = TelephoneNumber;
        this.Microchip = Microchip;
    }

   
    public Pet (){
        
    this.IdentificationReport = "";
    this.IdentificationReporter = "";
    this.FullName = "";
    this.TypeReport = "PDR";
    this.ReportDate = "";
    this.Zone = "";
    this.Species = "";
    this.Color = "";
    this.ParticularSigns = "";
    this.TelephoneNumber = "";
    this.Microchip = "";
        
    }
     
    

    public String getIdentificationReport() {
        return IdentificationReport;
    }

    public void setIdentificationReport(String IdentificationReport) {
        this.IdentificationReport = IdentificationReport;
    }

    public String getIdentificationReporter() {
        return IdentificationReporter;
    }

    public void setIdentificationReporter(String IdentificationReporter) {
        this.IdentificationReporter = IdentificationReporter;
    }

    public String getFullName() {
        return FullName;
    }

    public void setFullName(String FullName) {
        this.FullName = FullName;
    }

    public String getTypeReport() {
        return TypeReport;
    }

    public void setTypeReport(String TypeReport) {
        this.TypeReport = TypeReport;
    }

    public String getReportDate() {
        return ReportDate;
    }

    public void setReportDate(String ReportDate) {
        this.ReportDate = ReportDate;
    }

    public String getZone() {
        return Zone;
    }

    public void setZone(String Zone) {
        this.Zone = Zone;
    }

    public String getSpecies() {
        return Species;
    }

    public void setSpecies(String Species) {
        this.Species = Species;
    }

    public String getColor() {
        return Color;
    }

    public void setColor(String Color) {
        this.Color = Color;
    }

    public String getParticularSigns() {
        return ParticularSigns;
    }

    public void setParticularSigns(String ParticularSigns) {
        this.ParticularSigns = ParticularSigns;
    }

    public String getTelephoneNumber() {
        return TelephoneNumber;
    }

    public void setTelephoneNumber(String TelephoneNumber) {
        this.TelephoneNumber = TelephoneNumber;
    }

    public String getMicrochip() {
        return Microchip;
    }

    public void setMicrochip(String Microchip) {
        this.Microchip = Microchip;
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
       
       if(IdentificationReporter.isEmpty()){
           System.out.println("No puede dejar en blanco el número de cédula");
           Two = false;
       }
       
       if (IdentificationReporter.length()!=11){
           System.out.println ("La cantidad esperada de carácteres en total es de 11. Por favor, vuelva a intentarlo.");
           Two = false; 
       }
       
       if (!IdentificationReporter.matches ("\\d-\\d{4}-\\d{4}")){
           System.out.println("La cédula debe contener únicamente números, no carácteres.");  
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
       
       if(FullName.isEmpty()){
           System.out.println("No puede dejar en blanco el nombre completo");
           Three = false;
       }
       
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
         
       System.out.println("Tipo de reporte (PDR/ENC):PDR");
       this.TypeReport = "PDR";
   } 
     
    // Validaciones para la Fecha.
    
    public void Date(){
         Scanner sc = new Scanner (System.in);
         boolean Five = true;
         
         DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");
         
         do{
       System.out.print("Ingrese la fecha del reporte(dd/MM/yyyy):");
       this.ReportDate = sc.nextLine().trim().toUpperCase();
       
       try {
             LocalDate.parse(ReportDate,formato);
             Five = true;
         }catch (DateTimeParseException e){
             System.out.println("Fecha inválida. Por favor, vuelva a intentarlo");
             Five = false;
         }
       
       if (ReportDate.isEmpty()){
           this.ReportDate = LocalDate.now(). format(formato);
       }
                 
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
       
       if(Zone.isEmpty()){
           System.out.println("No puede dejar en blanco la zona");
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
       
       if (Species.isEmpty()){
           System.out.println("No puede dejar en blanco el tipo de especie");
           Seven = false;
       }
       
   }while (!Seven);  
     
   }
    
    // Validaciones por el Color.
    
    public void Aspect (){
         Scanner sc = new Scanner (System.in);
         boolean Eight;
         do{
             
             Eight = true;
       System.out.print("Ingrese color principal:");
       this.Color = sc.nextLine().trim().toUpperCase();
       
       if (Color.isEmpty()){
           System.out.println("No puede dejar en blanco el color");
           Eight = false;
       }
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
       
       if (ParticularSigns.isEmpty()){
           System.out.println("No puede dejar en blanco las señas particulares de la mascota");
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
       
       if (TelephoneNumber.isEmpty()){
           System.out.println ("No puede dejar el campo vacío");
           Ten = false;
       }
               
       if(TelephoneNumber.charAt(4)!='-'){
          System.out.println("El formato del teléfono de contacto es incorrecto. Por favor, vuelva a intentarlo."); 
          Ten = false;
       }
       
       if(TelephoneNumber.length()!=9){
           System.out.println(" La longuitud debe ser de 9 incluyendo el guión");
           Ten = false;
       }
       
        if (!TelephoneNumber.matches ("\\d{4}-\\d{4}")){
           System.out.println("El número de teléfono no puede contener carácteres. Por favor, vuelva a intentarlo.");  
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
     }

