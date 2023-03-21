package org.example;

import processing.core.PApplet;
import processing.core.PImage;
import processing.core.PVector;

public class Aura extends ObjetoGrafico {

    PImage[]frameaura1=new PImage[6];

    float vX,vY;

    int frameA=0;

    public Aura(PApplet pap, PVector posicion, int color, float vX, float vY) {
        super(pap, posicion, color);
        this.vX = vX;
        this.vY = vY;
    }
    public void setup(){
        for (int i=0;i<6;i++){
            frameaura1[i]=pap.loadImage("Archivos/aura/" + i + ".png");
            frameaura1[i].resize(185,185);
        }
    }
    public void dibujar(){
        PImage[] frame=frameaura1;
        pap.image(frame[frameA],posicion.x, posicion.y);
        frameA=(frameA+1)%frame.length;
    }
}
