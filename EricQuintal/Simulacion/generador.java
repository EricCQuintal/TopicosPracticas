package EricQuintal.Simulacion;

public class generador {
    int a=5;
    int c=7;
    int Xn=4;
    int m=4096;
    int num;
    float num2;
    
    public float generarN(){

        num = (a*Xn+c)%m; 
        num2 = (float) num/(float) (m);
        Xn=num;
        return num2;

    }
    
}