/**
 * Crea un nuevo repositorio en GitHub llamado mi-clock-display.
 * Luego codifica en BlueJ la clase NumberDisplay realizando los commits que creas oportunos.
 * A continuación se indica qué es necesario que, como mínimo, implemente dicha clase:

 * Un constructor que recibe por parámetro el límite del display y que fija el valor actual del display
 * a 0.
 * Un método setter que fija el valor actual del display al valor pasado como parámetro
 * (nombre del método: setValue).
 * Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres
 * (nombre del método: getDisplayValue).
 * Un método que devuelve el valor actual del display como entero (nombre del método: getValue),
 * Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite
 * (nombre del método: increment)
 * Una vez que hayas comprobado que funciona, sube el repositorio a GitHub e indica la URL del último
 * commit como respuesta de esta actividad.
 */

public class NumberDisplay
{
    // Valor para Display
    private int valor;
    // Valor limite para Display
    private int limite;
    
    /**
     * Un constructor que recibe por parámetro el límite del display y que fija el valor actual
     * del display a 0.
     */
    public NumberDisplay(int ValorLimite)
    {
        valor = 0;
        limite = ValorLimite;
    }
    
    /**
     * Un método setter que fija el valor actual del display al valor pasado como parámetro.
     */
    public void setValue(int nuevoValor)
    {
        if ((nuevoValor >= 0) && (nuevoValor < limite))
        {
            valor = nuevoValor;
        }
        else 
        {
            System.out.print("El valor no está permitido");
        }
    }
    
    /**
     * Un método que devuelve el valor actual del display en forma de cadena de 2 caracteres.
     */
    public String getDisplayValue()
    {
        String valorDisplay = "" + valor;
        if (valor < 10)
        {
            valorDisplay = "0" + valor;
        }
        return valorDisplay;
    }
    
    /**
     * Un método que devuelve el valor actual del display como entero.
     */
    public int getValue()
    {
        return valor;
    }
    
    /**
     * Un método que incrementa en 1 al display y lo hace volver al principio si alcanza el límite. 
     */
    public void increment()
    {
        valor = valor + 1;
        if (valor == limite)
        {
            valor = 0;
        }
    }
}
