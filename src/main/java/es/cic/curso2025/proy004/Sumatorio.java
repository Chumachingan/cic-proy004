package es.cic.curso2025.proy004;

public class Sumatorio {
   
    int s1[];

    public void lanzar() {

        int a = 0;
        a = 5;

        s1 = new int[10];

        for (int i = 0; i < s1.length; i++) {
            s1[i] = i + 1;
        }
        int suma = 0;
        for (int i = 0; i < s1.length; i++) {
            suma += s1[i];
        }
        
    }

}
