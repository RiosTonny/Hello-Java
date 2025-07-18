import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad =  teclado.nextInt();

        if (edad >= 18){
            System.out.println("Sos mayor de 18, ingreso autorizado!");
        }
        else{
            System.out.println("Sos menor de 18, ingreso rechazado!");
        }

    */

    int edad;

    Scanner ingreso = new Scanner(System.in);
    System.out.println("Ingrese la edad del alumno: ");
    edad = ingreso.nextInt();

    if(edad >= 4 && edad <= 6 ){
        System.out.println("Salon Kinder: Lunes y Miercoles de 16 a 17hs");
    } else if (edad <= 8) {
        System.out.println("Salon 1er año: Martes y Jueves de 16:30 a 17:30hs");
    } else if (edad <= 10) {
        System.out.println("Salon 2do año: Martes y Jueves de 17:30 a 19hs");
    } else if (edad <= 13) {
        System.out.println("Salon 3er año: Lunes y Miercoles de 17 a 18:30hs");
    } else {
        System.out.println("La edad ingresada es incorrecta! vuelva a intentarlo.");
    }

    }
}