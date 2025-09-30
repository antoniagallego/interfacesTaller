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
public class Rana implements RespirarAire, RespirarAgua, Caminador, Nadador {
    @Override
    public void respirarAire() {
        System.out.println("La rana puede respirar aire");
    }

    @Override
    public void respirarAgua() {
        System.out.println("La rana puede respirar abajo del agua");
    }

    @Override
    public void caminar() {
        System.out.println("La rana se mueve saltando");
    }

    @Override
    public void nadar() {
        System.out.println("La rana nada en el agua");
    }
}