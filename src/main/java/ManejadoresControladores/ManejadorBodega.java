/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ManejadoresControladores;

/**
 *
 * @author Marco Munguia <@markomannder>
 */
public class ManejadorBodega<T> {

    private int contadorBodega;
    private Object[] arregloBodega = new Object[10];

    public void contadorArreglos() {
        for (int i = 0; i < contadorBodega; i++) {

        }
    }

    public int getContadorBodega() {
        return contadorBodega;
    }

    public void setContadorBodega(int contadorBodega) {
        this.contadorBodega = contadorBodega;
    }

    public Object[] getArregloBodega() {
        return arregloBodega;
    }

    public void setArregloBodega(Object[] arregloBodega) {
        this.arregloBodega = arregloBodega;
    }

}
