/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestorreportemascotas;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jimena
 */
public class GestorReporteMascotas {

    public static void main(String[] args) throws IOException {
        Menu menu = new Menu();
        int option;

        List<Pet> pets = new ArrayList<>();

        try (Scanner sc = new Scanner(new File("Registro.txt"))) {
            while (sc.hasNextLine()) {
                String line = sc.nextLine();
                String[] campos = line.split(";");
                if (campos.length >= 10) {
                    Pet p = new Pet();
                    p.IdentificationReport = campos[0].trim();
                    p.IdentificationReporter = campos[1].trim();
                    p.FullName = campos[2].trim();
                    p.TypeReport = campos[3].trim();
                    p.ReportDate = campos[4].trim();
                    p.Zone = campos[5].trim();
                    p.Species = campos[6].trim();
                    p.Color = campos[7].trim();
                    p.ParticularSigns = campos[8].trim();
                    p.TelephoneNumber = campos[9].trim();

                }

            }

        } catch (Exception e) {
            System.out.println("Error" + e.getMessage());
        }

        do {
            menu.SeeMenu();
            option = menu.leerOption();

            switch (option) {

                case 1: {

                    Pet AA = new Pet();
                    AA.IdentReport();
                    AA.IdentReporter();
                    AA.Name();
                    AA.Report();
                    AA.Place();
                    AA.Animal();
                    AA.Aspect();
                    AA.Signs();
                    AA.Phone();

                    try {

                        FileWriter archive = new FileWriter("Registro.txt", true);
                        PrintWriter write = new PrintWriter(archive);

                        write.println(AA.Archive());
                        write.close();
                        write.close();

                    } catch (IOException e) {
                        System.out.println("No se guardó el registro correctamente" + e.getMessage());
                    }
                    pets.add(AA);
                    break;

                }

                case 2: {
                    Query.listOfQueries(pets);
                    break;
                }

                case 3: {
                    System.out.println("3");
                }

                case 4: {
                    System.out.println("4");
                }

                case 5: {
                    System.out.println("5");
                }

                case 6: {
                    System.out.println("6");
                }

                case 7: {
                    System.out.println("Le agradecemos su aporte.");
                }

                default: {
                    System.out.println("Opción inválida");
                }

            }
        } while (option != 7);

    }
}
