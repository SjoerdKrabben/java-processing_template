package com.HAN.deeltijd.leerjaar1;
// Als het goed is heb je hierin de Processing library ook mee

import processing.core.PApplet;


public class Main extends PApplet {

    public static void main(String[] args) {

        PApplet.main(new String[]{"com.HAN.deeltijd.leerjaar1.Main"});
    }
        final int aantalkolommen = 7;
        final int aantalrijen = 4;

    public void settings() {
        size(400, 400);
    }

    public void setup() {
            background(255);
            Damspel damspel = new Damspel(aantalrijen, aantalkolommen, this);
            damspel.drawDamspel();
    }


}

