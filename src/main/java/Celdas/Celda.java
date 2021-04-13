package Celdas;

/**
 * Representa la celda, compuesta por un tipo y un boton
 *
 * @author Marco Munguia <@markomannder>
 */
public class Celda {

    private TipoDeCelda tipoDeCelda;
    private CeldaJButton celdaJButton;

    /**
     * Crea la celda que se le asignara a cada boton con parametros
     * @param tipoDeCelda  el tipo de celda que sera
     * @param celdaJButton  el boton que se le asignara
     */
    public Celda(TipoDeCelda tipoDeCelda, CeldaJButton celdaJButton) {
        this.tipoDeCelda = tipoDeCelda;
        this.celdaJButton = celdaJButton;
    }

    public TipoDeCelda getTipoDeCelda() {
        return tipoDeCelda;
    }

    public void setTipoDeCelda(TipoDeCelda tipoDeCelda) {
        this.tipoDeCelda = tipoDeCelda;
    }

    public CeldaJButton getCeldaJButton() {
        return celdaJButton;
    }

    public void setCeldaJButton(CeldaJButton celdaJButton) {
        this.celdaJButton = celdaJButton;
    }

}
