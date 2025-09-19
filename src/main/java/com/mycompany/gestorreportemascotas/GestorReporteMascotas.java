/*
UNIVERSIDAD ESTATAL A DISTANCIA
Estudiante: Jimena Velásquez Gómez.
Identificación: 1-1919-0417.
Docente: Gabriela Cervantes Jimenez.
Proyecto #1.
Temas 1 y 2.
Tercer cuatrimestre, 2025.

Descripción:


Referencias:
Canal de Promamación ATS: 


 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package com.mycompany.gestorreportemascotas;

import java.io.IOException;
import java.io.PrintStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

/**
 *
 * @author Jimena
 */
public class GestorReporteMascotas {

    public static void main(String[] args) throws IOException {  
        System.setOut(new PrintStream(System.out, true, StandardCharsets.UTF_8));
        Menu menu = new Menu();
        int option;

        List<Pet> pets = new ArrayList<>();

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
                    AA.Date();
                    AA.Place();
                    AA.Animal();
                    AA.Aspect();
                    AA.Signs();
                    AA.Phone();
                    AA.Micro();

                    pets.add(AA);
                    break;

                }

                case 2: {
                    Query.listOfQueries(pets);
                    break;
                }

                case 3: {
                    GeneralReport.General(pets);
                    break;
                }

                case 4: {
                    GroupedReport.Grouped(pets);
                    break;
                }

                case 5: {
                    MatchFound.Coincidences(pets);
                    break;
                }

                case 6: {
                    UpdateReport.Update(pets);
                    break;
                }

                case 7: {
                    System.out.println("Le agradecemos su aporte.");
                    break;
                }

                default: {
                    System.out.println(" Opción inválida, por favor vuelva a intentarlo. ");
                }

            }
        } while (option != 7);

    }
}
