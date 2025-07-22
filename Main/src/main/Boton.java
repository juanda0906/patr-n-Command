/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package main;

/**
 *
 * @author Aprendiz
 */
public class Boton {
    private Comando comando;

    public Boton(Comando comando) {
        this.comando = comando;
    }

    public void presionar() {
        comando.ejecutar();
    }
}


