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
public class Maiz extends Semilla implements SemillaInterface {

    public Maiz(int vidaSemilla, int tiempoCosecha, String nombreSemilla) {
        super(vidaSemilla, tiempoCosecha, nombreSemilla);
    }

    @Override
    public void vidaSemilla() {
    }

    @Override
    public void planatarSemilla() {
    }

    @Override
    public void quitarSemilla() {
    }

    @Override
    public void alimentarSemilla() {
    }

}
