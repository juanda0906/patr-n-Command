/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package main;

/**
 *
 * @author Aprendiz
 */
public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // Crear el receptor
        Luz luz = new Luz();

        // Crear comandos concretos
        Comando comandoEncender = new EncenderLuz(luz);
        Comando comandoApagar = new ApagarLuz(luz);

        // Crear invocadores (botones)
        Boton botonEncender = new Boton(comandoEncender);
        Boton botonApagar = new Boton(comandoApagar);

        // Usar los botones
        botonEncender.presionar();  // La luz está ENCENDIDA.
        System.out.println("La luz está ENCENDIDA.");
        botonApagar.presionar();    // La luz está APAGADA.
         System.out.println("La luz está APAGADA.");
    }
}

    
    

