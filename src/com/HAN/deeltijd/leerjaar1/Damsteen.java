package com.HAN.deeltijd.leerjaar1;

import processing.core.PApplet;

public class Damsteen {

   private int xPos, yPos, diameter, kleur;
   private PApplet window;


    public Damsteen (int xPos, int yPos, int diameter, int kleur, PApplet p) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.diameter = diameter;
        this.kleur = kleur;
        window = p;
    }

    public void drawDamsteen() {
        window.fill(kleur);
        window.ellipseMode(window.CORNER);
        window.ellipse(xPos, yPos, diameter, diameter);
    }
}
