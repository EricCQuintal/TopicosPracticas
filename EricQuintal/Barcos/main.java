package EricQuintal.Barcos;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        simulacion sm = new simulacion();
        Scanner l = new Scanner(System.in);

        int semanas;

        System.out.println("Ingrese el numero de semanas para calcular");
        System.out.println("");

        semanas = l.nextInt();

        for(int n=1; n<=semanas;n++){
            System.out.println("");
            System.out.println("Numero de semana: "+n);
            System.out.println("----------------------------------------------------------------------------------------------------------");
            System.out.println("Dia         Num. Pseu.         Num. Cruceros       Num Pseu.         Num. turistas       Ingresos dia");
            sm.hacerSimulacion(semanas);
            System.out.println("----------------------------------------------------------------------------------------------------------");
        }

        sm.mostrarPromedioGen();

    }
}
