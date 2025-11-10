/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.util.Scanner;

/**
 *
 * @author Sandra Martinez
 */
public class VerificarEdad {
   public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        try {
            System.out.print("Ingrese su edad: ");
            int edad = scanner.nextInt();

            if (edad < 0 || edad > 120) {
                throw new EdadInvalidaException("Error: la edad debe estar entre 0 y 120 años.");
            }

            System.out.println("Edad válida: " + edad);

        } catch (EdadInvalidaException e) {
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Fin.");
            scanner.close();
        }
    }
}