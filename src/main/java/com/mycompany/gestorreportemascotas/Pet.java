/*

Descripción:

En esta clase, se declaran los atributos. Es un paso muy importante ya que esos 
atributos serán claves en todo el proceso del registro. En la misma, se realizarán
las respectivas validaciones.


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.gestorreportemascotas;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jimena
 */
public class Pet {
    
    // Declaración de atributos.

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

    
    
    public Pet() {

        // Constructores.
        
        this.IdentificationReport = "";
        this.IdentificationReporter = "";
        this.FullName = "";
        this.TypeReport = "PDR"; // A diferencia de los demás, este por defecto debe ser PDR.
        this.ReportDate = "";
        this.Zone = "";
        this.Species = "";
        this.Color = "";
        this.ParticularSigns = "";
        this.TelephoneNumber = "";
        this.Microchip = "";

    }

    // Getters y Setters.
    
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

    // Métodos.
    
    // Validaciones para el ID de Reporte.
     
    public void IdentReport(List<Pet> pets) {

        System.out.println("\n");
        System.out.println("--------------------------------------------------");
        System.out.println("             REGISTRAR NUEVO REPORTE              ");
        System.out.println("--------------------------------------------------");

        Scanner sc = new Scanner(System.in);
        boolean One;

        do {

            One = true;
            System.out.print("Ingrese ID de reporte (ejemplo REP-0001):");
            this.IdentificationReport = sc.nextLine().trim().toUpperCase();

            if (IdentificationReport.length() != 8) {
                System.out.println("Formato inválido. Por favor, vuelva a intentarlo.");
                One = false;
            } else if (!IdentificationReport.startsWith("REP-")) {
                System.out.println("Se incluir primero el prefijo (REP-). Por favor, vuelva a intentarlo. ");
                One = false;
            } else if (!IdentificationReport.substring(4).matches("\\d{4}")) {
                System.out.println("No puede ingresar carácteres posterior al prefijo (REP-). Por favor, vuelva a intentarlo.");
                One = false;
            }

            for (Pet p : pets) {
                if (p.getIdentificationReport().equals(this.IdentificationReport)) {
                    System.out.println("El ID de reporte debe ser único. Por favor, ingrese uno nuevo. ");
                    One = false;
                }
            }
        } while (!One);
    }

    // Validaciones para el ID del Reportante.
    
    public void IdentReporter() {
        Scanner sc = new Scanner(System.in);
        boolean Two;

        do {

            Two = true;
            System.out.print("Ingrese ID del reportante (1-1111-1111):");
            this.IdentificationReporter = sc.nextLine().trim();

            if (IdentificationReporter.isEmpty()) {
                System.out.println("No puede dejar en vacío el número de cédula. Por favor, intente de nuevo.");
                Two = false;
            }

            if (IdentificationReporter.length() != 11) {
                System.out.println("Formato inválido. Por favor, vuelva a intentarlo.");
                Two = false;
            }

            if (!IdentificationReporter.matches("\\d-\\d{4}-\\d{4}")) {
                System.out.println("La cédula debe de contener únicamente números, no carácteres.Por favor, vuelva a intentarlo.");
                Two = false;
            }

        } while (!Two);

    }

    // Validaciones para el Nombre.
    
    public void Name() {
        Scanner sc = new Scanner(System.in);
        boolean Three;

        do {

            Three = true;
            System.out.print("Ingrese el nombre completo:");
            this.FullName = sc.nextLine().trim();

            if (FullName.isEmpty()) {
                System.out.println("No puede dejar vacío el nombre completo. Por favor, complete el espacio.");
                Three = false;
            }

            if (FullName.length() >= 7) {
                Three = true;
            } else {
                System.out.println("El nombre debe de contener como mínimo 7 carácteres. Por favor, vuelva a intentarlo.");
                Three = false;
            }
            boolean Numbers = false;
            for (int i = 0; i < FullName.length(); i++) {
                char c = FullName.charAt(i);
                if (Character.isDigit(c)) {
                    Numbers = true;
                    break;
                }
            }
            if (Numbers) {
                System.out.println("El nombre no debe contener números, solo carácteres.Por favor, vuelba a intentarlo.");
                Three = false;
            }
        } while (!Three);

    }

    // Tipo de Reporte.
    
    public void Report() {
        Scanner sc = new Scanner(System.in);
        this.TypeReport = "PDR";
        System.out.println("Ingrese el tipo de reporte (PDR/ENC)[Por defecto PDR]:" + this.TypeReport);
    }

    // Validaciones por el tipo de Reporte.
    
    public void ModifyReport() {
        Scanner sc = new Scanner(System.in);
        boolean Four;

        do {
            Four = true;
            System.out.print("Tipo de reporte (PDR/ENC):");
            String Modify = sc.nextLine().toUpperCase();
            if (Modify.equals("PDR") || Modify.equals("ENC")) {
                this.TypeReport = Modify;
                Four = true;
            } else {
                System.out.println("Solo puede ingresar una de esas dos opciones.");
                Four = false;
            }
            if (Modify.isEmpty()) {
                System.out.println("No puede dejar el campo vacío. Por favor, intente de nuevo.");
                Four = false;
            }
        } while (!Four);

    }

    // Validaciones para la Fecha.
    
    public void Date() {
        Scanner sc = new Scanner(System.in);
        boolean Five = true;

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        do {
            System.out.print("Ingrese la fecha del reporte(dd/MM/yyyy):");
            this.ReportDate = sc.nextLine().trim().toUpperCase();

            if (ReportDate.isEmpty()) {
                this.ReportDate = LocalDate.now().format(formato);
            }

            try {
                LocalDate.parse(ReportDate, formato);
                Five = true;
            } catch (DateTimeParseException e) {
                System.out.println("Fecha inválida. Por favor, vuelva a intentarlo");
                Five = false;
            }

        } while (!Five);

    }

    // Validaciones para la Zona.
    
    public void Place() {
        Scanner sc = new Scanner(System.in);
        boolean Six;

        do {

            Six = true;
            System.out.print("Ingrese la zona:");
            this.Zone = sc.nextLine().trim();

            if (Zone.length() <= 30) {
                Six = true;
            } else {
                System.out.println("El texto debe contener como máximo 30 carácteres. Por favor, vuelva a intentarlo.");
                Six = false;
            }

            if (Zone.matches("\\d+")) {
                System.out.println("La zona no puede tener solo números");
                Six = false;
            }

            if (Zone.isEmpty()) {
                System.out.println("No puede dejar vacío la zona. Por favor, complete el espacio.");
                Six = false;
            }

        } while (!Six);

    }

    // Validaciones tipo de Especie.
    
    public void Animal() {
        Scanner sc = new Scanner(System.in);
        boolean Seven;

        do {
            Seven = true;
            System.out.print("Ingrese especie (DOG/CAT):");
            this.Species = sc.nextLine().trim().toUpperCase();

            if (Species.equals("DOG") || Species.equals("CAT")) {
                Seven = true;
            } else {
                System.out.println("Debe ingresar una de las dos opciones mencionadas anteriormente.");
                Seven = false;
            }

            if (Species.isEmpty()) {
                System.out.println("No puede dejar vacío el tipo de especie. Por favor, intente de nuevo.");
                Seven = false;
            }

        } while (!Seven);

    }

    // Validaciones por el Color.
    
    public void Aspect() {
        Scanner sc = new Scanner(System.in);
        boolean Eight;
        do {

            Eight = true;
            System.out.print("Ingrese color principal:");
            this.Color = sc.nextLine().trim();

            if (Color.isEmpty()) {
                System.out.println("No puede dejar vacío el color. Por favor, complete el espacio.");
                Eight = false;
            }

            boolean Characters = false;
            for (int i = 0; i < Color.length(); i++) {
                char Letter = Color.charAt(i);
                if (Character.isDigit(Letter)) {
                    Characters = true;
                    break;

                }

            }

            if (Characters) {
                System.out.println("El color no debería de presentar números. Por favor, vuelva a intentarlo.");
                Eight = false;
            }

        } while (!Eight);

    }

    // Validaciones de las Señas.
    
    public void Signs() {
        Scanner sc = new Scanner(System.in);
        boolean Nine;

        do {
            Nine = true;
            System.out.print("Ingrese señas particulares (mínimo 10 carácteres):");
            this.ParticularSigns = sc.nextLine().trim();

            if (ParticularSigns.length() >= 10) {
                Nine = true;
            } else {
                System.out.println("Debe tener mínimo 10 carácteres. Por favor, vuelva a intentarlo.");
                Nine = false;
            }

            if (ParticularSigns.isEmpty()) {
                System.out.println("No puede dejar vacío las señas particulares de la mascota. Por favor, intente de nuevo.");
                Nine = false;
            }

            if (ParticularSigns.matches("\\d+")) {
                System.out.println("Las señas no pueden tener solo números. Por favor, vuelva a intentarlo.");
                Nine = false;
            }

        } while (!Nine);

    }

    // Validaciones Teléfono.
    
    public void Phone() {
        Scanner sc = new Scanner(System.in);
        boolean Ten;

        do {

            Ten = true;
            System.out.print("Ingrese teléfono de contacto (####-####):");
            this.TelephoneNumber = sc.nextLine().trim();

            if (TelephoneNumber.isEmpty()) {
                System.out.println("No puede dejar el campo vacío. Por favor, complete el espacio.");
                Ten = false;
            }

            if (TelephoneNumber.length() != 9) {
                System.out.println(" Formato inválido. Por favor, vuelva a intentarlo.");
                Ten = false;
            }

            if (!TelephoneNumber.matches("\\d{4}-\\d{4}")) {
                System.out.println("El número de teléfono no puede contener carácteres a excepción del guión (-). Por favor, vuelva a intentarlo.");
                Ten = false;
            }

        } while (!Ten);

    }

    public void Micro() {
        Scanner sc = new Scanner(System.in);
        boolean Eleven;

        do {

            Eleven = true;
            System.out.print("Ingrese microchip (opcional, deje en blanco si no tiene): ");
            this.Microchip = sc.nextLine().trim();

        } while (!Eleven);

    }

}
