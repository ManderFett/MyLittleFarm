package Componentes;

/**
 * Representa la bodega del jugador, esta es una clase parametrica.
 * @author Marco Munguia <@markomannder>
 */
public class Bodega<T> {

    private Object[] ItemBodega = new Object[50];
    private int contadorBodega;
    /**
     * Metodo que agregara el item al arreglo de la bodega
     * @param item el Objeto que se le asignara 
     */
    public void agregarItem(T item) {
        for (int i = 0; i < contadorBodega; i++) {
            ItemBodega[i] = ItemBodega;
        }
        contadorBodega++;
    }

    public T[] getItemBodega() {
        return (T[]) ItemBodega;
    }

}
