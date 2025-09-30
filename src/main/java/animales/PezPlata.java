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

public class PezPlata implements RespirarAgua, Nadador {
    @Override
    public void respirarAgua() {
        System.out.println("El pez plata puede respirar debajo del agua");
    }

    @Override
    public void nadar() {
        System.out.println("El pez plata nada rapido");
    }
}
