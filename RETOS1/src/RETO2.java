
import java.util.Scanner;

public class RETO2 {

    public static void main(String[] args){
        Scanner Lectura = new Scanner(System.in);
        String nomEnfer,nomMa,nomBebe;
        double pesoBebe,dosisVacuna;
        int mesesBebe;

        System.out.print("Nombre De La Enfermera: ");
        nomEnfer=Lectura.nextLine();
        System.out.print("Nombre De La Mamá: ");
        nomMa=Lectura.nextLine();
        System.out.print("Nombre Del Bebe: ");
        nomBebe=Lectura.nextLine();
        System.out.print("Peso Bebe: ");
        pesoBebe=Lectura.nextDouble();

        System.out.print("Meses Del Bebe:");
        mesesBebe=Lectura.nextInt();


        dosisVacuna=((pesoBebe+10)/(mesesBebe))*8;

        

        System.out.println("Nombre De La Enfermera:"+nomEnfer+", Nombre De La mamá:"+nomMa+", Nombre Del Bebe:"+nomBebe+", Dosis De La Vacuna Para El Bebe:"+dosisVacuna);

        Lectura.close();

    }
}