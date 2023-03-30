import java.util.Scanner;
public class RETO5 {
    public static void main(String[]args){
        int producto;
        int producto1 = 2000 ;
        int producto2 = 5000;
        int producto3 = 3000;
        int producto4 = 3500;
        int producto5 = 2400;
        int suma = 0;
        int sumaProducto = 0;
        int NProducto,resultado = 0;

        Scanner lectura = new Scanner(System.in);
        System.out.println("Digite La Cantidad De Productos Que Desea Comprar");
        NProducto=lectura.nextInt();



        for(int i = 0;i < NProducto;i++){
        System.out.println("Elija El Producto Que Desea Comprar: 1 = Arroz Huila, 2 = Frijol, 3 = Lentejas, 4 = Garbanzo, 5 = Arroz Diana");
        producto = lectura.nextInt();

        if (producto==1){

            System.out.println("El Valor Del Producto Seleccionado Es: "+producto1);
            sumaProducto = sumaProducto + producto1;
            

        }else if(producto==2){

            System.out.println("El Valor Del Producto Seleccionado Es: "+producto2);
            sumaProducto = sumaProducto + producto2;

                
        }else if(producto==3){

            System.out.println("El Valor Del Producto Seleccionado Es: "+producto3);
            sumaProducto = sumaProducto + producto3;

                
        }else if(producto==4){

            System.out.println("El Valor Del Producto Seleccionado Es: "+producto4);
            sumaProducto = sumaProducto + producto4;

                
        }else if(producto==5){

            System.out.println("El Valor Del Producto Seleccionado Es: "+producto5);
            sumaProducto = sumaProducto + producto5;

                
        }else{

            System.out.println("Digite Uno De Los Numero Que Aparecen Al Principio");
        
        }

        
        
    }
        suma = suma + sumaProducto;
        resultado = suma;
        System.out.println("El Resultado De Su Compra Es: "+resultado);
        
        lectura.close();
    }
    
}
