package com.mycompany.interfaces;

import animales.*;
import habilidades.*;

public class Interfaces {
    public static void main(String[] args) {
        Perro perro = new Perro();
        perro.respirarAire();
        perro.caminar();

        Humano humano = new Humano();
        humano.respirarAire();
        humano.caminar();
        humano.hablar();

        Canario canario = new Canario();
        canario.respirarAire();
        canario.volar();

        PezPlata pez = new PezPlata();
        pez.respirarAgua();
        pez.nadar();

        Lagarto lagarto = new Lagarto();
        lagarto.respirarAire();
        lagarto.caminar();
        lagarto.nadar();

        Rana rana = new Rana();
        rana.respirarAire();
        rana.respirarAgua();
        rana.caminar();
        rana.nadar();
    }
}
