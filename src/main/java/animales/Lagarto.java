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

public class Lagarto implements RespirarAire, Caminador, Nadador {
    @Override
    public void respirarAire() {
        System.out.println("El lagarto puede respirar aire");
    }

    @Override
    public void caminar() {
        System.out.println("El lagarto camina lento");
    }

    @Override
    public void nadar() {
        System.out.println("El lagarto puede nadar");
    }
}