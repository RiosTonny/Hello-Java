import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int num1, num2, suma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número a sumar: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese otro número a sumar: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        System.out.println("La suma total es: "+ suma);
    }
}