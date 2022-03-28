package EricQuintal.Barcos;

public class simulacion{

    generador g = new generador();

    int numsemanas;
    int dias;
    int numdia;
    int numbarcos;
    int numturistas1;
    int numturistas2;
    int numturistas3;
    int turistastotales;
    int ingresosdia;
    int ingresostotales;
    int ingresosemanas;
    float numpseubarcos;
    float numpseuturistas0;
    float numpseuturistas1;
    float numpseuturistas2;
    float numpseuturistas3;
    float promingresos;
    float promediosemanas;

    public int calcularIngresos(int ingdia){

        ingresostotales = ingresostotales+ingdia;

        return ingresostotales;
    }

    public void hacerSimulacion(int numsem){

        numsemanas = numsem;
        dias = 7;
        numdia = 0;
        
        for(int i=1; i <= dias; i++){

            numpseubarcos = g.generarN();

            if (numpseubarcos >= 0 && numpseubarcos < 0.2) {
                numpseuturistas0 = 0;
                numbarcos = 0;
                turistastotales = 0;
                ingresosdia = 0;
                System.out.println(i+"           "+numpseubarcos+"             "+numbarcos+"                 "+ numpseuturistas0 +"                "+turistastotales+"                   $"+ingresosdia);

            } else if(numpseubarcos >= 0.2 && numpseubarcos < 0.7){

                numbarcos = 1;
                numpseuturistas1 = g.generarN();
                if (numpseuturistas1 >= 0 && numpseuturistas1 < 0.15) {
                    numturistas1 = 500;
                } else if(numpseuturistas1 >= 0.15 && numpseuturistas1 < 0.55){
                    numturistas1 = 1000;
                } else if(numpseuturistas1 >= 0.55 && numpseuturistas1 < 0.90){
                    numturistas1 = 1500;
                }else if(numpseuturistas1 >= 0.90 && numpseuturistas1 < 1.0){
                    numturistas1 = 2000;
                }
                ingresosdia = numturistas1*5;
                calcularIngresos(ingresosdia);
                System.out.println(i+"           "+numpseubarcos+"             "+numbarcos+"               "+ numpseuturistas1 +"             "+numturistas1+"              $"+ingresosdia);

            } else if(numpseubarcos >= 0.7 && numpseubarcos < 0.9){

                numbarcos = 2;
                numpseuturistas1 = g.generarN();
                if (numpseuturistas1 >= 0 && numpseuturistas1 < 0.15) {
                    numturistas1 = 500;
                } else if(numpseuturistas1 >= 0.15 && numpseuturistas1 < 0.55){
                    numturistas1 = 1000;
                } else if(numpseuturistas1 >= 0.55 && numpseuturistas1 < 0.90){
                    numturistas1 = 1500;
                }else if(numpseuturistas1 >= 0.90 && numpseuturistas1 < 1.0){
                    numturistas1 = 2000;
                }
                ingresosdia = numturistas1*5;
                calcularIngresos(ingresosdia);
                System.out.println(i+"           "+numpseubarcos+"              "+numbarcos+"             "+ numpseuturistas1 +"             "+numturistas1+"              $"+ingresosdia);

                numpseuturistas2 = g.generarN();
                if (numpseuturistas2 >= 0 && numpseuturistas2 < 0.15) {
                    numturistas2 = 500;
                } else if(numpseuturistas2 >= 0.15 && numpseuturistas2 < 0.55){
                    numturistas2 = 1000;
                } else if(numpseuturistas2 >= 0.55 && numpseuturistas2 < 0.90){
                    numturistas2 = 1500;
                }else if(numpseuturistas2 >= 0.90 && numpseuturistas2 < 1.0){
                    numturistas2 = 2000;
                }
                ingresosdia = numturistas2*5;
                calcularIngresos(ingresosdia);
                System.out.println("                                                   "+ numpseuturistas2 +"            "+numturistas2+"              $"+ingresosdia);

            } else if(numpseubarcos >= 0.9 && numpseubarcos < 1.0){

                numbarcos = 3;
                numpseuturistas1 = g.generarN();
                if (numpseuturistas1 >= 0 && numpseuturistas1 < 0.15) {
                    numturistas1 = 500;
                } else if(numpseuturistas1 >= 0.15 && numpseuturistas1 < 0.55){
                    numturistas1 = 1000;
                } else if(numpseuturistas1 >= 0.55 && numpseuturistas1 < 0.90){
                    numturistas1 = 1500;
                }else if(numpseuturistas1 >= 0.90 && numpseuturistas1 < 1.0){
                    numturistas1 = 2000;
                }
                ingresosdia = numturistas1*5;
                calcularIngresos(ingresosdia);
                System.out.println(i+"           "+numpseubarcos+"              "+numbarcos+"             "+numpseuturistas1+"             "+numturistas1+"              $"+ingresosdia);

                numpseuturistas2 = g.generarN();
                if (numpseuturistas2 >= 0 && numpseuturistas2 < 0.15) {
                    numturistas2 = 500;
                } else if(numpseuturistas2 >= 0.15 && numpseuturistas2 < 0.55){
                    numturistas2 = 1000;
                } else if(numpseuturistas2 >= 0.55 && numpseuturistas2 < 0.90){
                    numturistas2 = 1500;
                }else if(numpseuturistas2 >= 0.90 && numpseuturistas2 < 1.0){
                    numturistas2 = 2000;
                }
                ingresosdia = numturistas2*5;
                calcularIngresos(ingresosdia);
                System.out.println("                                                   "+ numpseuturistas2 +"            "+numturistas2+"              $"+ingresosdia);

                numpseuturistas3 = g.generarN();
                if (numpseuturistas3 >= 0 && numpseuturistas3 < 0.15) {
                    numturistas3 = 500;
                } else if(numpseuturistas3 >= 0.15 && numpseuturistas3 < 0.55){
                    numturistas3 = 1000;
                } else if(numpseuturistas3 >= 0.55 && numpseuturistas3 < 0.90){
                    numturistas3 = 1500;
                }else if(numpseuturistas3 >= 0.90 && numpseuturistas3 < 1.0){
                    numturistas3 = 2000;
                }
                ingresosdia = numturistas3*5;
                calcularIngresos(ingresosdia);
                System.out.println("                                                   "+ numpseuturistas3 +"            "+numturistas3+"              $"+ingresosdia);

            }

        }

        promingresos = (float)ingresostotales/(float)dias;

        System.out.println("Los ingresos totales de la semana son: $" + ingresostotales);
        System.out.println("El promedio de ingresos totales por semana son: $" + promingresos);
        sacarPromedioGen(ingresostotales);
        ingresostotales = 0;
        
    }

    public void sacarPromedioGen(int ingresosemana){
        ingresosemanas = ingresosemanas + ingresosemana;
        promediosemanas = ((float)ingresosemanas/(float)numsemanas);
    }

    public void mostrarPromedioGen(){
        System.out.println("");
        System.out.println("El promedio de ingresos por semanas son: $" + promediosemanas );
        System.out.println("");
    }

}