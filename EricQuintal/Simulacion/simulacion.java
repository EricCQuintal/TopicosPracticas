package EricQuintal.Simulacion;

public class simulacion{

    float npcamionesinicio;
    float nptiempollegada;
    int tiempollegada;
    double horallegada;
    float nptiemposervicio;
    int tiemposervicio;
    float horainicio;
    float horatermino;
    float tiempoespera;
    float tiempoocio;
    int longcola;
    int camionesinicio;

    public int obtenerCamionesIniciales(float np){
        if(np >= 0 && np < 0.5){
            camionesinicio = 0;
            horallegada = 0.00;
            System.out.println(0.);
        } else if(np >= 0.5 && np < 0.75){
            camionesinicio = 1;
            horallegada = 11.00;
        } else if(np >= 0.75 && np < 0.9){
            camionesinicio = 2;
            horallegada = 11.00;
        } else if(np >= 0.9 && np < 1.0){
            camionesinicio = 3;
            horallegada = 11.00;
        }
        return camionesinicio;
    }

    public int obtenerTiempoLlegadas(float np){
        if (np >= 0 && np <0.02) {
            tiempollegada = 20;
        }else if(np >= 0.02 && np < 0.1){
            tiempollegada = 25;
        }else if(np >= 0.1 && np < 0.22){
            tiempollegada = 30;
        }else if(np >= 0.22 && np < 0.47){
            tiempollegada = 35;
        }else if(np >= 0.47 && np < 0.67){
            tiempollegada = 40;
        }else if(np >= 0.67 && np < 0.82){
            tiempollegada = 45;
        }else if(np >= 0.82 && np < 0.92){
            tiempollegada = 50;
        }else if(np >= 0.92 && np < 0.97){
            tiempollegada = 55;
        }else if(np >= 0.97 && np < 1.0){
            tiempollegada = 60;
        }
        return tiempollegada;
    }

    public int obtenerTiempoServicio3P(float np){
        if(np>=0.0 && np<0.05){
            tiemposervicio = 20;
        }else if(np>=0.05 && np<0.15){
            tiemposervicio = 25;
        }else if(np>=0.15 && np<0.35){
            tiemposervicio = 30;
        }else if(np>=0.35 && np<0.60){
            tiemposervicio = 35;
        }else if(np>=0.60 && np<0.72){
            tiemposervicio = 40;
        }else if(np>=0.72 && np<0.82){
            tiemposervicio = 45;
        }else if(np>=0.82 && np<0.90){
            tiemposervicio = 50;
        }else if(np>=0.90 && np<0.96){
            tiemposervicio = 55;
        }else if(np>=0.96 && np<1.0){
            tiemposervicio = 60;
        }
        return tiemposervicio;
    }

    public int obtenerTiempoServicio4P(float np){
        if(np>=0.0 && np<0.05){
            tiemposervicio = 15;
        }else if(np>=0.05 && np<0.20){
            tiemposervicio = 20;
        }else if(np>=0.20 && np<0.40){
            tiemposervicio = 25;
        }else if(np>=0.40 && np<0.60){
            tiemposervicio = 30;
        }else if(np>=0.60 && np<0.75){
            tiemposervicio = 35;
        }else if(np>=0.75 && np<0.87){
            tiemposervicio = 40;
        }else if(np>=0.87 && np<0.95){
            tiemposervicio = 45;
        }else if(np>=0.95 && np<0.99){
            tiemposervicio = 50;
        }else if(np>=0.99 && np<1.0){
            tiemposervicio = 55;
        }
        return tiemposervicio;
    }

    public int obtenerTiempoServicio5P(float np){
        if(np>=0.0 && np<0.1){
            tiemposervicio = 10;
        }else if(np>=0.1 && np<0.28){
            tiemposervicio = 15;
        }else if(np>=0.28 && np<0.5){
            tiemposervicio = 20;
        }else if(np>=0.5 && np<0.68){
            tiemposervicio = 25;
        }else if(np>=0.68 && np<0.78){
            tiemposervicio = 30;
        }else if(np>=0.78 && np<0.86){
            tiemposervicio = 35;
        }else if(np>=0.86 && np<0.92){
            tiemposervicio = 40;
        }else if(np>=0.92 && np<0.97){
            tiemposervicio = 45;
        }else if(np>=0.97 && np<1.0){
            tiemposervicio = 50;
        }
        return tiemposervicio;
    }

    public int obtenerTiempoServicio6P(float np){
        if(np>=0.0 && np<0.12){
            tiemposervicio = 5;
        }else if(np>=0.12 && np<0.27){
            tiemposervicio = 10;
        }else if(np>=0.27 && np<0.53){
            tiemposervicio = 15;
        }else if(np>=0.53 && np<0.68){
            tiemposervicio = 20;
        }else if(np>=0.68 && np<0.8){
            tiemposervicio = 25;
        }else if(np>=0.8 && np<0.88){
            tiemposervicio = 30;
        }else if(np>=0.88 && np<0.94){
            tiemposervicio = 35;
        }else if(np>=0.94 && np<0.98){
            tiemposervicio = 40;
        }else if(np>=0.98 && np<1.0){
            tiemposervicio = 45;
        }
        return tiemposervicio;
    }
}