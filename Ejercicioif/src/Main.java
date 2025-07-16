import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad =  teclado.nextInt();

        if (edad >= 18){
            System.out.println("Sos mayor de 18, ingreso autorizado!");
        }
        else{
            System.out.println("Sos menor de 18, ingreso rechazado!");
        }
    }
}