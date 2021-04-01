package com.HAN.deeltijd.leerjaar1;

import processing.core.PApplet;

public class Damspel {
    private Damsteen[][] damspel;


    public Damspel(int aantalRijen, int aantalKolommen, PApplet p) {
        damspel = new Damsteen[aantalRijen][aantalKolommen];
        int kleur;

        for (int rij = 0; rij < damspel.length; rij++) {
            for (int kolom = 0; kolom < damspel[rij].length; kolom++) {
                if (rij % 2 == 0) {
                    kleur = 255;
                } else {
                    kleur = 0;
                }
                damspel[rij][kolom] = new Damsteen(kolom * 50, rij * 50, 50, kleur, p);
            }
        }
    }

    public void drawDamspel() {
        for (int rij = 0; rij < damspel.length; rij++) {
            for (int kolom = 0; kolom < damspel[rij].length; kolom++) {
                damspel[rij][kolom].drawDamsteen();
            }
        }
    }
}
