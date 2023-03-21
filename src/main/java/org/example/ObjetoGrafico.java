package org.example;
import processing.core.PApplet;
import processing.core.PVector;
public class ObjetoGrafico extends PApplet {
    PApplet pap;
    PVector posicion;
    int color;
    Circulo c1;
    Goku g1;
    Accion a1;

    Aura aura;

    Boolean idle = true;

    public ObjetoGrafico() {
    }

    public ObjetoGrafico(PApplet pap, PVector posicion, int color) {
        this.pap = pap;
        this.posicion = posicion;
        this.color = color;
    }

    public void settings(){
        size(700,700);
    }
    public void setup(){
        frameRate(15);
        c1= new Circulo(this,posicion =new PVector(400,300),125,10,100,5);
        g1= new Goku(this,posicion = new PVector(350,350),0,0,0);
        a1= new Accion(this,posicion=new PVector(350,350),0,0,0);
        aura= new Aura(this,posicion=new PVector(335,330),0,0,0);
    }

    public void draw(){
        background(255);
    c1.pintar();
    g1.setup();
    g1.dibuja();

    if (idle){
        g1.setup();
        g1.dibuja();

    }
    if (idle==false){
        background(255);
        aura.setup();
        aura.dibujar();
        a1.setup();
        a1.dibujar();



    }
    }

    public static void main(String[] args) {
        ObjetoGrafico og = new ObjetoGrafico();
        ObjetoGrafico.runSketch(new String[]{"Tupac no esta muerto."},og);
    }

    //Con este metodo hace que con presionar Espacio realice una acción determinada
    //Mientras que si presiona la tecla B la animacion vuelve a estar default
    public void keyPressed(){
        if (key==' '){
            idle=false;
        }
        if (key =='b'){
            idle=true;
        }
    }
}