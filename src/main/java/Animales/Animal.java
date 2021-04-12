/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Animales;

/**
 * 
 * @author Marco Munguia <@markomannder>
 */
public class Animal {
    private int vidaAnimal;
    private String nombreAnimal;

    public Animal(int vidaAnimal, String nombreAnimal) {
        this.vidaAnimal = vidaAnimal;
        this.nombreAnimal = nombreAnimal;
    }

    public int getVidaAnimal() {
        return vidaAnimal;
    }

    public void setVidaAnimal(int vidaAnimal) {
        this.vidaAnimal = vidaAnimal;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }
    

}
