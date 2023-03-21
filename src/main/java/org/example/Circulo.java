package org.example;

import processing.core.PApplet;
import processing.core.PVector;

public class Circulo extends ObjetoGrafico{

    float radio;
    float velocidadX;
    float velocidadY;


    public Circulo(PApplet pap, PVector posicion, int color, float radio, float velocidadX, float velocidadY) {
        super(pap, posicion, color);
        this.radio = radio;
        this.velocidadX = velocidadX;
        this.velocidadY = velocidadY;
    }

    public void pintar(){ //Acciones de este objeto en concreto
        pap.fill(color);
        pap.noStroke();
        posicion.x+=velocidadX;
        posicion.y+=velocidadY;

        if(posicion.x<0||posicion.x+radio>pap.width){
            velocidadX*=-1;
        }
        if(posicion.y<0||posicion.y+radio>pap.height){
            velocidadY*=-1;
        }
        pap.ellipse(posicion.x,posicion.y,radio*2,radio*2);
    }


}
