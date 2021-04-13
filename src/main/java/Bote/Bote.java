/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bote;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Bote {

    private String nombreBote;
    private int vidaBote;

    public Bote(String nombreBote, int vidaBote) {
        this.nombreBote = nombreBote;
        this.vidaBote = vidaBote;
    }

    public String getNombreBote() {
        return nombreBote;
    }

    public void setNombreBote(String nombreBote) {
        this.nombreBote = nombreBote;
    }

    public int getVidaBote() {
        return vidaBote;
    }

    public void setVidaBote(int vidaBote) {
        this.vidaBote = vidaBote;
    }

}
