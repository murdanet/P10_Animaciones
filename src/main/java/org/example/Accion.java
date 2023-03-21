package org.example;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Accion extends ObjetoGrafico {
    PImage[] frameaccion1 = new PImage[16];

    float vX,vY;

    int frameA=0;

    public Accion(PApplet pap, PVector posicion, int color, float vX, float vY) {
        super(pap, posicion, color);
        this.vX = vX;
        this.vY = vY;
    }

    public void setup(){
        for (int i=0;i<16;i++){
            frameaccion1[i]=pap.loadImage("Archivos/accion/" + i + ".png");
        }
    }

    public void dibujar(){
        PImage[] frame=frameaccion1;
        pap.image(frame[frameA],posicion.x, posicion.y);
        frameA=(frameA+1)%frame.length;
    }
}
