/**
 * Esta nueva clase debe:
 * 1.- Tener 2 atributos de tipo NumberDisplay, uno para las horas y otro para los minutos.
 * 2.- Tener un atributo de tipo String donde se almacena la hora actual del reloj con 5 caracteres.
 * 3.- Tener 2 constructores: uno sin parámetros, que fija la hora a "00:00" y otro con 2 parámetros 
 * de tipo int, que representan las horas y los minutos a los que fijar la hora actual.
 * 4.- Tener un método setTime que acepte dos parámetros de tipo int, que representan horas y minutos,
 * y que fije dichos valores como el tiempo actual del reloj.
 * 5.- Tener un método getTime que devuelva la hora como String de 5 caracteres.
 * 6.- Tener un método timeTick que haga avanzar un minuto la hora actual (sea esta la que sea 
 * originalmente).
 */
public class ClockDisplay
{
    // Atributo horas
    private NumberDisplay horas;
    // Atributo minutos
    private NumberDisplay minutos;
    // Atributo para la hora actual
    private String horaac;
    
    /**
     * Fija horas y minutos a 0
     */
    public ClockDisplay()
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
    }
    
    /**
     * Horas y minutos a los que fijar la hora actual
     */
    public ClockDisplay (int horaac, int minutoac)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        horas.setValue(horaac);
        minutos.setValue(minutoac);
    }
}