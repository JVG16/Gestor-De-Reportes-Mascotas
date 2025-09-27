
/*

Descripción: 

En esta clase se declara el menú con sus múltiples opciones. El usuario deberá
ingresar los datos solicitados. En dado caso de que el usuario digite una opción 
que no esté incluida en el menú, el programa deberá mostrar un mensaje en 
pantalla de error.

 */

 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
/**
 *
 * @author Jimena
 */
import java.util.Scanner;

public class Menu {

    Scanner sc = new Scanner(System.in);

    public void SeeMenu() {

        System.out.println(" SISTEMA - REFUGIO HUELLAS FELICES ");
        System.out.println(" GESTOR DE REPORTES DE MASCOTAS ");
        System.out.println("------------------------------- ");
        System.out.println(" 1. Registrar mascota desaparecida ");
        System.out.println(" 2. Consultar por ID / Especie / Zona ");
        System.out.println(" 3. Reporte general ");
        System.out.println(" 4. Reporte agrupado");
        System.out.println(" 5. Ver coincidencias ");
        System.out.println(" 6. Actualizar reporte ");
        System.out.println(" 7. Salir ");
    }

    public int leerOption() {
        System.out.print("Seleccione una opción:");
        return sc.nextInt();
    }
}
