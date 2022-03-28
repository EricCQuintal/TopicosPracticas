package EricQuintal.Simulacion;

import java.util.Scanner;

public class main {
    
    public static void main(String[] args) {

        generador g = new generador();
        simulacion sm = new simulacion();
        Scanner l = new Scanner(System.in);

        int numpersonas;
        int dias;
        float np1;
        int horas1 = 11;
        int ocio=horas1*60;
		double minutos1 = 00;
		double horas2 = 00;

        System.out.println("Ingrese el numero de dias para calcular:");
        System.out.println("");
        dias = l.nextInt();
        System.out.println("Ingrese el numero de personas para el servicio:");
        System.out.println("");
        numpersonas = l.nextInt();
        for(int n=1; n<=dias;n++){
            System.out.println("Este es el dia: " + n);
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
            System.out.println("Num. pseu     T. llegadas     H. llegada     Num. pseu     T. servicio     H. inicio     H. termino     T. Espera     T. Ocio     L. cola");
            np1 = g.generarN();
            sm.obtenerCamionesIniciales(np1);
            for(int i=0;i<12;i++) {
                np1 = g.generarN();
                sm.obtenerTiempoLlegadas(np1);
                if(numpersonas ==3){
                    sm.obtenerTiempoServicio3P(np1);
                }else if(numpersonas == 4){
                    sm.obtenerTiempoServicio4P(np1);
                }else if(numpersonas == 5){
                    sm.obtenerTiempoServicio5P(np1);
                }else if(numpersonas == 6){
                    sm.obtenerTiempoServicio6P(np1);
                }

                float minutos2 = sm.obtenerTiempoLlegadas(np1);

				int h1=(int)horas1;
				int m1=(int)minutos1;
				int h2=(int)horas2;
				int m2=(int)minutos2;
				int minutos=h1*60+m1+h2*60+m2;
				int hora=minutos/60;
				int horaLlegadas=minutos%60;
				horas1=hora;
				minutos1=horaLlegadas;
				int llegada=hora;
				int min= horaLlegadas;
				int tiempo= (llegada*60+min+sm.tiemposervicio);
				int tiemp1=tiempo/60;
				int tiemp2=tiempo%60;
				int espera=((hora*60+horaLlegadas)-(llegada*60+min));
				int espera1=espera/60;
				int espera2=espera%60;

                if(hora==12){
                    hora = 0;
                }else if(hora==13){
                    hora = 1;
                }else if(hora==14){
                    hora = 2;
                }else if(hora==15){
                    hora = 3;
                }else if(hora==16){
                    hora = 4;
                }else if(hora==17){
                    hora = 5;
                }else if(hora==18){
                    hora = 6;
                }else if(hora==19){
                    hora = 7;
                }

                if(llegada==12){
                    llegada = 0;
                }else if(llegada==13){
                    llegada = 1;
                }else if(llegada==14){
                    llegada = 2;
                }else if(llegada==15){
                    llegada = 3;
                }else if(llegada==16){
                    llegada = 4;
                }else if(llegada==17){
                    llegada = 5;
                }else if(llegada==18){
                    llegada = 6;
                }else if(llegada==19){
                    llegada = 7;
                }

                int o1=(int)((minutos)-(ocio));
				int o2=o1/60;
				int o3=o1%60;
				
				if(o1<0) {
					o2=00;
					o3=00;
				}

                

                System.out.println(np1+"       "+sm.tiempollegada+"           "+hora+":"+horaLlegadas+"         "+np1+"          "+sm.tiemposervicio+"          "+llegada+":"+min+"          "+ tiemp1+":"+tiemp2+"          " +espera1+":"+espera2+"          "+o2+":"+o3+"         "+sm.longcola);
            }
            horas1 = 11;
		    minutos1 = 00;
		    horas2 = 00;
            System.out.println("-------------------------------------------------------------------------------------------------------------------------------------------");
        }
        

        System.out.println("");

    }
}