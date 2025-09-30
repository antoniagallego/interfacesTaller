/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package animales;

/**
 *
 * @author galle
 */
import habilidades.*;

public class Canario implements RespirarAire, Volador {
    @Override
    public void respirarAire() {
        System.out.println("El canario respira aire");
    }

    @Override
    public void volar() {
        System.out.println("El canario vuela alto");
    }
}