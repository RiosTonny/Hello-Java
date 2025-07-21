import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        /*
        //Ejercicio 1
        for (int i=0; i<35; i++){
            System.out.println(i+1);
        }


        //Ejercicio 2
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese el número límite: ");
        int numeroLimite = teclado.nextInt();

        System.out.println("----Repetidor for----");
        for (int i=0; i<numeroLimite; i++){
            System.out.println("Numero: "+ (i+1));
        };

        int contador = 0;
        System.out.println("----Repetidor while----");
        while (contador < numeroLimite){
            System.out.println("Numero: "+ (contador + 1));
            contador ++;
        };

        //Ejercicio 3

        for (int i=200; i<=250; i += 2){
            System.out.println("Número: "+ i);
        };


        //Ejercicio 4

        int contador = 10;
        while (contador >= 1){
            System.out.println("Número: "+ contador);
            contador --;
        };

        System.out.println("----Bucle for----");
        for (int i = 10; i>=1; i--){
            System.out.println("Número: "+ i);
        };

         */
        //Ejercicio 5

        Scanner teclado = new Scanner(System.in);
        boolean condicion = true;

        while (condicion){
            System.out.println("Ingrese una palabra: ");
            String palabraIn = teclado.next();

            if (palabraIn.equalsIgnoreCase("salir")){
                condicion = false;
            }
        };


    }
}