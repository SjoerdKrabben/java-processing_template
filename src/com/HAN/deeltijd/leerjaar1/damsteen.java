package com.HAN.deeltijd.leerjaar1;

public class damsteen {

    int xPos, yPos, diameter, kleur;

    Damsteen (int xPos, int yPos, int diameter, int kleur) {
        this.xPos = xPos;
        this.yPos = yPos;
        this.diameter = diameter;
        this.kleur = kleur;
    }

    void drawDamsteen() {
        fill(kleur);
        ellipseMode(CORNER);
        ellipse(xPos, yPos, diameter, diameter);
    }
}
