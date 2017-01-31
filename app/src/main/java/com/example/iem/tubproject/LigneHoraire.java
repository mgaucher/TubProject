package com.example.iem.tubproject;

import java.util.ArrayList;

/**
 * Created by iem on 08/11/2016.
 */

public class LigneHoraire {
    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public ArrayList<String> getListe() {
        return liste;
    }

    public void setListe(ArrayList<String> liste) {
        this.liste = liste;
    }

    private String nom;
    private ArrayList<String> liste;

    public LigneHoraire(String nom,ArrayList<String> liste)
    {
        this.nom = nom;
        this.liste = liste;
    }
}
