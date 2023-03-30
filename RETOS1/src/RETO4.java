import java.util.Scanner;

public class RETO4 {
     
    public static void main(String[]args) {
        String nombreJu;
        int dinero = 1000;
        int codigoJugador;
        int codigoMaquina;

        Scanner lectura=new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenido Al Juego Piedra, Papel O Tijera");
        System.out.println();
        System.out.println("Nombre Del Jugador");
        nombreJu=lectura.nextLine();
        System.out.println();
        System.out.println("Empiezas Con 1000K");
        System.out.println();
        System.out.println();
        System.out.println("Si Desea Escoger: Piedra = 3,   Papel = 2,    Tijeras = 1");
        System.out.println();
        codigoJugador=lectura.nextInt();
        System.out.println();
        System.out.println("La Maquina Escogió: ");
        codigoMaquina=(int) (Math.random()*3)+1;

        
        if(codigoMaquina==3 && codigoJugador==3){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Ambos Sacaron Piedra, Han Empatado");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==2 && codigoJugador==2){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Ambos Sacaron Papel, Han Empatado");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);
        }
        else if(codigoMaquina==1 && codigoJugador==1){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Ambos Sacaron Tijera, Han Empatado");
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);
            
        }
        else if(codigoMaquina==1 && codigoJugador==2){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("La Maquina Saco Tijeras Y "+nombreJu+" Ha sacado Papel Asi Que, Ha Perdido ;(");
            System.out.println();
            System.out.println();
            System.out.println();
            dinero =dinero-1000;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==3 && codigoJugador==1){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("La Maquina Saco Piedra Y "+nombreJu+" Ha Sacado Tijeras Asi Que, Ha Perdido ;(");
            System.out.println();
            System.out.println();
            System.out.println();
            dinero =dinero-1000;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==2 && codigoJugador==3){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("La Maquina Saco Papel Y "+nombreJu+" Ha Sacado Piedra Asi Que, Ha Perdido ;(");
            System.out.println();
            System.out.println();
            System.out.println();
            dinero =dinero-1000;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==3 && codigoJugador==2){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("La Maquina Saco Piedra Y "+nombreJu+" Ha Sacado Papel Asi Que, Ha !!Ganado¡¡");
            System.out.println();
            System.out.println();
            System.out.println();
            dinero =dinero+1000;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);

        }
        else if(codigoMaquina==2 && codigoJugador==1){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("La Maquina Saco Papel Y "+nombreJu+" Ha Sacado Tijeras Asi Que, Ha !!Ganado¡¡");
            System.out.println();
            System.out.println();
            System.out.println();
            dinero =dinero+1000;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);
            

        }
        else if(codigoMaquina==1 && codigoJugador==3){
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("La Maquina Saco Tijeras Y "+nombreJu+" Ha Sacado Piedra Asi Que, Ha !!Ganado¡¡");
            System.out.println();
            System.out.println();
            System.out.println();
            dinero=dinero+1000;
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Has Quedado Con: "+dinero);

        }




        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println("¡¡Espero Te Haya Gustado!!");

        lectura.close();
    }
}
