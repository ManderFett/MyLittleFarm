/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Componentes;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class Bodega<T> {

    private Object[] ItemBodega = new Object[50];
    private int contadorBodega;

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
