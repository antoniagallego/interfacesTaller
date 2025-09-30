/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;
import habilidades.*;

/**
 *
 * @author galle
 */
public class Perro implements RespirarAire, Caminador {
    @Override
    public void respirarAire() {
        System.out.println("El perro puede respirar aire");
    }

    @Override
    public void caminar() {
        System.out.println("El perro camina en cuatro patas");
    }
}