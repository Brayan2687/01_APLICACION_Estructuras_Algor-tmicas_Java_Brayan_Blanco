
import java.util.Scanner;


public class RETO8 {
    public static void main(String[] args) {
        int numAleatorio;
        int numUsuario;
        int i,Intentos,VecesInfinitas = 9999,aciertos = 0;


        Scanner lectura=new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenido A Adivina El Numero");
        System.out.println();
        System.out.println("Recuerda Que Tienes Solo 10 Oportunidades");
        System.out.println();
        System.out.println("Dijite El Numero De Intentos Para Adivinar el Numero");
        Intentos=lectura.nextInt();
        
        if (Intentos > 10) {

            VecesInfinitas = 0;
            System.out.println("Lo Siento No Puede Elegir Mas De 10 Intentos");
        } else {
            
        }

        for (i=1;i <= VecesInfinitas;i++) {

            System.out.println("Dijite El Numero");
            numUsuario=lectura.nextInt();
            System.out.println();
            System.out.println();
            System.out.println("El Sistema Encontro Un Numero: ");
            numAleatorio=(int) (Math.random()*100)+1;
            System.out.println();

           
            if (numUsuario == numAleatorio) {
                
                System.out.println("Felicidades Adivinastes El Numero");
                System.out.println();
                aciertos = aciertos + 1;
                

            } else {
                
                Intentos= Intentos - 1;
                System.out.println("Lo Siento El Numero Era "+numAleatorio);
                System.out.println();
                System.out.println("Te Quedan "+Intentos+" Intentos");
                System.out.println();

            }
            if (numAleatorio < numUsuario) {

                System.out.println("El Numero Que Salio Es Menor Que El Que Dijitaste El Cual Es:"+numUsuario);
                System.out.println();
                
            } else if (numAleatorio > numUsuario) {
                
                System.out.println("El Numero Que Salio Es Mayor Que El Que Dijitaste El Cual Es:"+numUsuario);
                System.out.println();

            } else {
                
            }

            if (Intentos == 0) {
                
                VecesInfinitas = Intentos;

            } else {
                
            }

            System.out.println("Siguiente Ronda: "+i+"/"+Intentos);
            System.out.println();


        }

        System.out.println("Aciertos: "+aciertos+" De "+i+" Intentos");

        lectura.close();

    }
    
}
