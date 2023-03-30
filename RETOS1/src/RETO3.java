import java.util.Scanner;

public class RETO3 {
  
    public static void main(String[]args) {
        int codigoJugador;
        int Moneda;


        Scanner lectura=new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenido Al Juego De Cara O Sello");
        System.out.println();
        System.out.println("Si Desea Elegir:  Cara = 1,     Sello = 2");
        codigoJugador=lectura.nextInt();
        System.out.println("La Moneda Callo En: ");
        System.out.println();
        Moneda=(int) (Math.random()*2)+1;


        if(Moneda==1 && codigoJugador==1){
            System.out.println("A Caido Cara Has Sido El ¡¡Ganador!!");
        }
        else if(Moneda==2 && codigoJugador==2){
            System.out.println("A Caido Sello Has Sido El ¡¡Ganador!!");
        }
        else if(Moneda==1 && codigoJugador==2){
            System.out.println("A Caido Cara Has Sido El PERDEDOR ;(");
        }
        else if(Moneda==2 && codigoJugador==1){
            System.out.println("A Caido Sello Has Sido El PERDEDOR ;(");
        }
        

        System.out.println("¡¡Espero Te Haya Gustado!!");

        

    lectura.close();
    }
}
