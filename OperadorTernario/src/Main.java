import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //programa que dependiendo el promedio de un alumno, nos diga si aprobo o no.
        double nota1, nota2, promedio, notaFinal;
        String condicionFinal;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingresar la primera nota: ");
        nota1 = teclado.nextDouble();

        System.out.println("Ingresar la segunda nota: ");
        nota1 = nota1 + teclado.nextDouble();

        promedio = nota1/2;

        condicionFinal = (promedio >= 6) ? "APROBADO" : "DESAPROBADO";

        System.out.println("Nota: "+ promedio);
        System.out.println("El alumno esta "+ condicionFinal);


    }
}