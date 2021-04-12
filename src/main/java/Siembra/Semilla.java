/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Siembra;

/**
 * 
 * @author Marco Munguia <@markomannder>
 */
public class Semilla {
    private int vidaSemilla;
    private String nombreSemilla;

    public Semilla(int vidaSemilla, String nombreSemilla) {
        this.vidaSemilla = vidaSemilla;
        this.nombreSemilla = nombreSemilla;
    }

    public int getVidaSemilla() {
        return vidaSemilla;
    }

    public void setVidaSemilla(int vidaSemilla) {
        this.vidaSemilla = vidaSemilla;
    }

    public String getNombreSemilla() {
        return nombreSemilla;
    }

    public void setNombreSemilla(String nombreSemilla) {
        this.nombreSemilla = nombreSemilla;
    }
    

}
