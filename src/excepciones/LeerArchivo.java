/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author Sandra Martinez
 */
public class LeerArchivo {
   
    public static void main(String[] args) {

        try (BufferedReader lector = new BufferedReader(
                new FileReader("C:\\Users\\sandra\\Desktop\\Documentos\\Prueba1.txt"))) {

            String linea;
            while ((linea = lector.readLine()) != null) {
                System.out.println(linea);
            }

        } catch (IOException e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }
}