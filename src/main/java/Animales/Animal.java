package Animales;

/**
 * Clase padre Animal que tiene atributos muy generales del objeto animal.
 *
 * @author Marco Munguia <@markomannder>
 */
public class Animal {

    private int vidaAnimal;
    private int tiempoDeCrianza;
    private String nombreAnimal;

    /**
     * Crea un objeto animal con parametros
     *
     * @param vidaAnimal representa la vida del animal
     * @param tiempoDeCrianza representa el timepo de crianza para obtener sus
     * recursos
     * @param nombreAnimal representa el nombre del animal
     */
    public Animal(int vidaAnimal, int tiempoDeCrianza, String nombreAnimal) {
        this.vidaAnimal = vidaAnimal;
        this.tiempoDeCrianza = tiempoDeCrianza;
        this.nombreAnimal = nombreAnimal;
    }

    public int getVidaAnimal() {
        return vidaAnimal;
    }

    public void setVidaAnimal(int vidaAnimal) {
        this.vidaAnimal = vidaAnimal;
    }

    public int getTiempoDeCrianza() {
        return tiempoDeCrianza;
    }

    public void setTiempoDeCrianza(int tiempoDeCrianza) {
        this.tiempoDeCrianza = tiempoDeCrianza;
    }

    public String getNombreAnimal() {
        return nombreAnimal;
    }

    public void setNombreAnimal(String nombreAnimal) {
        this.nombreAnimal = nombreAnimal;
    }

}
