import java.util.Scanner;

public class RETO6 {
  
    public static void main(String[]args) {
        String nombreJu;
        int codigoJugador,VecesInfinitas = 9999;
        int Moneda,vida=5,Saldo = 2000;
        int apuesta=0;
        int i;

        Scanner lectura=new Scanner(System.in);
        System.out.println();
        System.out.println("Bienvenido Al Juego De Cara O Sello");
        System.out.println();
        System.out.println("Porfavor Dijite Su Nombre");
        nombreJu = lectura.nextLine();
        System.out.println();
        System.out.println("Recuerde Que Tiene 2000K Para Apostar Y Recuerde Que Solo Tiene 5 Vidas");
        System.out.println();


        for (i=1;i <= VecesInfinitas;i++) {
        
        System.out.println("Cuanto Desea Apostar");
        apuesta=lectura.nextInt();
        System.out.println("Si Deseas Elegir:  Cara = 1,     Sello = 2");
        codigoJugador=lectura.nextInt();
        System.out.println("La Moneda Callo En: ");
        System.out.println();
        Moneda=(int) (Math.random()*2)+1;
        if(Moneda==1 && codigoJugador==1){
            System.out.println("Cara,  "+nombreJu+" Ha Sido El ¡¡Ganador!!");
            apuesta = Saldo + apuesta;
            Saldo = apuesta;
        }
        else if(Moneda==2 && codigoJugador==2){
            System.out.println("Sello,  "+nombreJu+" Ha Sido El ¡¡Ganador!!");
            apuesta = Saldo + apuesta;
            Saldo = apuesta;

        }
        else if(Moneda==1 && codigoJugador==2){
            System.out.println("Cara,  "+nombreJu+" Ha Sido El PERDEDOR ;(");
            apuesta = Saldo - apuesta;
            Saldo = apuesta;
            vida = vida - 1;
        }
        else if(Moneda==2 && codigoJugador==1){
            System.out.println("Sello,  "+nombreJu+" Ha Sido El PERDEDOR ;(");
            apuesta = Saldo - apuesta;
            Saldo = apuesta;
            vida = vida - 1;
        }


        if (apuesta <= 0) {
        
            
            System.out.println();
            System.out.println();
            System.out.println();
            System.out.println("Lo Siento No puede Continuar No Tienes Suficiente Dinero ");
            System.out.println();
            System.out.println();
            System.out.println();
            VecesInfinitas = 0;

        } else {
            
        }


        if (vida == 0) {

            VecesInfinitas = 0;
            
        } else {

            
        
        }


        System.out.println();
        System.out.println();
        System.out.println("Ronda: "+i+", Tienes "+vida+" Vidas "+"Y Quedaste Con "+apuesta+" Para Apostar");
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        System.out.println();
        
    }
        
        System.out.println(nombreJu+" Tenias 2000 Y Quedo Con: "+apuesta+", Intentos "+i);
        System.out.println("¡¡Espero Te Haya Gustado!!");
        lectura.close();
        

    
    }

}
