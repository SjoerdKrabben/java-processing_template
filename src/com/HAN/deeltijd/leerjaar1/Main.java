package com.HAN.deeltijd.leerjaar1;
// Als het goed is heb je hierin de Processing library ook mee

 import processing.core.PApplet;


public class Main extends PApplet {

    public static void main(String[] args) {

        PApplet.main(new String[] {Main});
        final int aantalkolommen = 7;
        final int aantalrijen = 4;

        void setup() {
            size(400, 400);
            background(#ff0000);

            Damspel damspel = new Damspel(aantalrijen, aantalkolommen);
            damspel.drawDamspel();
        }
    }
}
