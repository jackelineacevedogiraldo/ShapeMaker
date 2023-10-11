/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clases;

import interfase.Forma;

/**
 *
 * @author Jackeline
 */
public class ShapeMaker {
    private Forma circulo;
    private Forma rectangulo;
    private Forma cuadrado;

    public ShapeMaker() {
        circulo = new Circulo();
        rectangulo = new Rectangulo();
        cuadrado = new Cuadrado();
    }

    public void drawCircle() {
        circulo.draw();
    }

    public void drawRectangle() {
        rectangulo.draw();
    }

    public void drawSquare() {
        cuadrado.draw();
    }
    
}
