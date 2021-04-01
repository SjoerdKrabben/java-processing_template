package com.HAN.deeltijd.leerjaar1;

public class damspel {
    Damsteen[][] damspel;

    Damspel(int aantalRijen, int aantalKolommen) {
        damspel = new Damsteen[aantalRijen][aantalKolommen];

        int kleur;

        for(int rij = 0; rij < damspel.length; rij++) {
            for(int kolom = 0; kolom < damspel[rij].length; kolom++) {
                if(rij % 2 == 0)  {
                    kleur = #ffffff;
                } else {
                    kleur = #000000;
                }
                damspel[rij][kolom] = new Damsteen(kolom*50, rij*50, 50, kleur);
            }
        }
    }
