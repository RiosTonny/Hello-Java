import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int dia;
        String nombreDia;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número del 1 - 7: ");
        dia = teclado.nextInt();

        switch (dia){
            case 1: nombreDia = "Lunes";
                break;
            case 2: nombreDia = "Martes";
                break;
            case 3: nombreDia = "Miercoles";
                break;
            case 4: nombreDia = "Jueves";
                break;
            case 5: nombreDia = "Viernes";
                break;
            case 6: nombreDia = "Sabado";
                break;
            case 7: nombreDia = "Domingo";
                break;
            default: nombreDia = "Dia inexistente!" ;
        }

        System.out.println("El dia de la semana es: "+ nombreDia);
    }
}