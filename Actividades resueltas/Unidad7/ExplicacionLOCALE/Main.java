package Unidad7.ExplicacionLOCALE;

import java.time.Duration;
import java.time.LocalDate;
import java.time.LocalTime;
import java.time.Period;
import java.time.format.DateTimeFormatter;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Locale;

public class Main {
    public static void main(String[] args) {
        //insertar una fecha
        LocalDate fecha=LocalDate.of(2024,05,04);
        //Fecha actual
        LocalDate fechaHoy=LocalDate.now();
        LocalDate fechaMas4=fechaHoy.plus(4, ChronoUnit.DAYS);
        System.out.println(fechaMas4);
        LocalDate fechaMenos5=fechaHoy.minus(5,ChronoUnit.DAYS);
        System.out.println(fechaMenos5);
        /********* Otra forma de hacer la suma a resta de valores *********/
        //Tambien se puede utilizar plusDays..plusMonths..plusYears /minusDays,minusMonths,minusYears
        fechaMenos5=fechaHoy.minusDays(5);
        System.out.println(fechaMenos5);
        //De una fecha podemos tomar un dato, por ejemplo, solo el dia, o solo el año, o solo el mes
        System.out.println("El dia de hoy es " + fechaHoy.getDayOfWeek());//Monday
        System.out.println("El dia de hoy es " + fechaHoy.getDayOfMonth());//la fecha de hoy (numeros)
        System.out.println("El dia de hoy es " + fechaHoy.getDayOfYear()); //indica el numero del dia en el año en el curso
        //Para el mes y para el año..
        LocalDate fechaDeNacimiento=LocalDate.of(1975,9,6);
        System.out.println("Florin tiene " + (LocalDate.now().getYear()-fechaDeNacimiento.getYear()));

        //Como saber si el año es bisiesto
        boolean bisiesto=fechaHoy.isLeapYear();
        System.out.println("Este año es Bisiesto-> " + bisiesto);

        //Comparar dos fechas -> boolean
        boolean despues=fechaDeNacimiento.isAfter(fechaHoy); //false
        System.out.println("La fecha de nacimiento de Florin es despues que la de hoy-> " + despues);
        boolean antes=fechaDeNacimiento.isBefore(fechaHoy); //false
        System.out.println("La fecha de nacimiento de Florin es Antes que la de hoy->" + antes);

        //Si necesitamos saber el perido de tiempo que ha pasado entre dos fechas->untill
        //El resultado no es de tipo LocalDate sino de tipo Period
        Period periodoF= fechaHoy.until(fechaDeNacimiento);
        System.out.println("Tiempo que ha pasado desde que Florin nacio-> " + periodoF.getDays() + " dias");
        System.out.println("Tiempo que ha pasado desde que Florin nacio-> " + periodoF.getMonths() + " meses");
        System.out.println("Tiempo que ha pasado desde que Florin nacio-> " + periodoF.getYears() + " años");

        //Mostrar fecha en formato Español
        DateTimeFormatter formato=DateTimeFormatter.ofPattern("dd-MM-yyyy");//definir el formato

        System.out.println("La fecha en formato Español es " + fechaDeNacimiento.format(formato));

        //Otra forma de dar formato
        DateTimeFormatter formato2=DateTimeFormatter.ofLocalizedDate(FormatStyle.SHORT).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato2));
        DateTimeFormatter formato3=DateTimeFormatter.ofLocalizedDate(FormatStyle.MEDIUM).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato3));
        DateTimeFormatter formato4=DateTimeFormatter.ofLocalizedDate(FormatStyle.LONG).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato4));
        DateTimeFormatter formato5=DateTimeFormatter.ofLocalizedDate(FormatStyle.FULL).withLocale(Locale.getDefault());
        System.out.println(fechaHoy.format(formato5).toUpperCase());

    /**HORAS**/
        LocalTime horaA=LocalTime.now();
        System.out.println("La hora actual es-> " + horaA);
        int hora= horaA.getHour();
        int minutos= horaA.getMinute();
        int segundos= horaA.getSecond();
        System.out.println("Horas-> " +hora);
        System.out.println("Minutos-> " +minutos);
        System.out.println("Segundos-> " +segundos);
        //Los mismo métodos..ejemplo, sumarle 5 horas a la hora actual
        LocalTime horaMas5=horaA.plus(5,ChronoUnit.HOURS);
        System.out.println("Dentro de cinco horas seran las " + horaMas5);

        //Calcular el periodo de tiempo entre dos horas
        //Duracion -> se utiliza para calcular la duracion entre dos horas

        Duration duracion= Duration.between(LocalTime.of(22,50,15),horaA);
        System.out.println("Tiempo entre las dos horas->" + duracion);
        duracion=Duration.between(LocalTime.now(),horaMas5);
        System.out.println("Tiempo entre las dos horas->" + duracion);

        DateTimeFormatter formato6=DateTimeFormatter.ofPattern("hh:mm:ss");
        System.out.println("La hora actual formateada-> " + horaA.format(formato6));



    }
}
