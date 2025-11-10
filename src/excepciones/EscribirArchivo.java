/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package excepciones;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;
/**
 *
 * @author Sandra Martinez
 */
public class EscribirArchivo {
    public static void main(String[] args) {
        try {
            File archivo = new File("C:\\Users\\sandra\\Desktop\\Documentos\\Pruebas.txt");
            Scanner lector = new Scanner(archivo);

            while (lector.hasNextLine()) {
                String linea = lector.nextLine();
                System.out.println(linea);
            }

            lector.close();
        } catch (FileNotFoundException e) {
            System.out.println("Error: el archivo no fue encontrado.");
        }
    }
}