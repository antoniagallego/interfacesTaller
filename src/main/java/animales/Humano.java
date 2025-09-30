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

public class Humano implements RespirarAire, Caminador, Hablador {
    @Override
    public void respirarAire() {
        System.out.println("El humano respira aire");
    }

    @Override
    public void caminar() {
        System.out.println("El humano camina derecho");
    }

    @Override
    public void hablar() {
        System.out.println("El humano puede hablar");
    }
}