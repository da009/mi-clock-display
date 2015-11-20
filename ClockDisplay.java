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
    // Atributo horas.
    private NumberDisplay horas;
    // Atributo minutos.
    private NumberDisplay minutos;
    // Atributo para la hora actual.
    private String horaac;
    // Atributo para el reloj de 24 horas.
    private boolean formhora;
    // Atributo para el año.
    private NumberDisplay ano;
    // Atributo para el mes(30 dias).
    private NumberDisplay mes;
    // Atributo para el dia.
    private NumberDisplay dia;
    // Atributo para la fecha(día/mes/año).
    private String fecha;
    
    /**
     * Fija horas y minutos a 0
     */
    public ClockDisplay(boolean formh)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        dia = new NumberDisplay(31);
        mes = new NumberDisplay(13);
        ano = new NumberDisplay(99);
        dia.setValue(20);
        mes.setValue(11);
        ano.setValue(15);
        formhora = formh;
        horaac = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        if (dia.getValue() == 0)
        {
            dia.increment();
        }
        if (mes.getValue() == 0)
        {
            mes.increment();
        }
        fecha = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue();
    }
    
    /**
     * Horas y minutos a los que fijar la hora actual
     */
    public ClockDisplay (int horaAct, int minutoAct,int diaAct, int mesAct, int anoAct , boolean formh)
    {
        horas = new NumberDisplay(24);
        minutos = new NumberDisplay(60);
        horas.setValue(horaAct);
        minutos.setValue(minutoAct);
        dia = new NumberDisplay(31);
        mes = new NumberDisplay(13);
        ano = new NumberDisplay(99);
        dia.setValue(diaAct);
        mes.setValue(mesAct);
        ano.setValue(anoAct);
        formhora = formh;
        horaac = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        if (dia.getValue() == 0)
        {
            dia.increment();
        }
        if (mes.getValue() == 0)
        {
            mes.increment();
        }
        fecha = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue();
    }
    
    /**
     * Tener un método setTime que acepte dos parámetros de tipo int, que representan horas y
     * minutos, y que fije dichos valores como el tiempo actual del reloj
     */
    public void setTime(int horaAct, int minutoAct, int diaAct, int mesAct, int anoAct)
    {
        horas.setValue(horaAct);
        minutos.setValue(minutoAct);
        dia.setValue(diaAct);
        mes.setValue(mesAct);
        ano.setValue(anoAct);
        horaac = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        fecha = dia.getDisplayValue() + "/" + mes.getDisplayValue() + "/" + ano.getDisplayValue();
        if (dia.getValue() == 0)
        {
            dia.increment();
        }
        if (mes.getValue() == 0)
        {
            mes.increment();
        }
    }
    
    /**
     * Tener un método getTime que devuelva la hora como String de 5 caracteres
     */
    public String getTime()
    {
        String fecha = dia.getValue() + "/" + mes.getValue() + "/" + ano.getValue();
        if (formhora == false) // Formato de 12 horas.
        {
            if (dia.getValue() == 0)
        {
            dia.increment();
        }
        int horaac = horas.getValue();
        String suffix;
        if (horaac < 12)
        {
            suffix = "am";
            if (horaac == 0)
            {
                horaac = 12;
            }
        }
        else
        {
            suffix = "pm";
            if (horaac > 12)
            {
                horaac -= 12;
            }
        }
        if (dia.getValue() == 0)
        {
            dia.increment();
        }
        if (mes.getValue() == 0)
        {
            mes.increment();
        }
        return horaac + ":" + minutos.getDisplayValue() + suffix + " - " + fecha;
        }
        else // Formato de 24 horas.
        {
            return horaac + " - " + fecha;
        }
    }
    
    /**
     * Tener un método timeTick que haga avanzar un minuto la hora actual (sea esta la que sea
     * originalmente)
     */
    public void timeTick()
    {
        minutos.increment();
        if (minutos.getValue() == 0)
        {
            horas.increment();
        }
        
        if (horas.getValue() == 0)
        {
            dia.increment();
            if (dia.getValue() == 0)
            {
                dia.increment();
            }
            
            if (dia.getValue() == 1)
            {
                mes.increment();
            }
            
            if (mes.getValue() == 0)
            {
                mes.increment();
            }
        
            if (mes.getValue() == 1)
            {
                ano.increment();
            }
        }
        horaac = horas.getDisplayValue() + ":" + minutos.getDisplayValue();
        fecha = dia.getValue() + "/" + mes.getValue() + "/" + ano.getValue();
    }
    
    /**
     * Permite alternar entre formato de 12 horas y de 24
     */
    public void formato(boolean formatohora)
    {
        if (formatohora == false)
        {
            formhora = false;
        }
        else
        {
            formhora = true;
        }
    }
}