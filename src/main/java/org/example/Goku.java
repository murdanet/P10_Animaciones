package org.example;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Goku extends ObjetoGrafico{
    PImage[] frames1= new PImage[4]; //aura
    float vX,vY;
int frameA=0;

    public Goku(PApplet pap, PVector posicion, int color, float vX, float vY) {
        super(pap, posicion, color);
        this.vX = vX;
        this.vY = vY;
    }
    public void setup(){
        for (int i =0; i<4;i++){
            frames1[i]=pap.loadImage("Archivos/idle/"+ i + ".png");
        }
    }

    public void dibuja(){
        PImage[] frame = frames1;
        pap.image(frame[frameA],posicion.x,posicion.y);
        frameA=(frameA+1)% frame.length;
    }

}


