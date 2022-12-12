package Arrays;

import java.util.Arrays;

public class EjemplosArrays {
    public static void main(String[] args) {
        // Declarar un array
        // tipo[] nombre;
        double[] elementos;

        // Inicializar -> instanciar = crear un objeto de tipo array
        elementos = new double[5];

        // lo rellenamos
        elementos[0] = 10.8;
        elementos[1] = 14.3;
        elementos[2] = 13.5;
        elementos[3] = 12.1;
        elementos[4] = 9.7;

        // normalmente declaramos e inicializamos a la vez
        String[] diaslaborales = new String[5];
        diaslaborales[0] = "Lunes";
        diaslaborales[1] = "Martes";
        diaslaborales[2] = "Miércoles";
        diaslaborales[3] = "Jueves";
        diaslaborales[4] = "Viernes";

        // hay un caso en que puedo no decir el tamaño, si lo relleno directamente
        String[] meses = {"Ene" , "Feb" , "Mar" , "Abr" , "May" , "Jun" , "Jul" , "Ago" , "Sep" , "Oct" , "Nov" , "Dic"}; // en vez de new y tal pongo las llaves y dentro los valores separados por comas

        // para imprimirlos
        // a) Con un for
        for (int i = 0; i < elementos.length; i++) {
            System.out.print(elementos[i] + " ");
        }
        System.out.println();
        // b) con el método toString[] de la clase Arrays
        System.out.println("\n" + Arrays.toString(diaslaborales));

        // no funciona -> System.out.println(elementos);
        // no funciona -> System.out.println(diasLaborales);
        // no funciona -> System.out.println(meses);
    }
}
