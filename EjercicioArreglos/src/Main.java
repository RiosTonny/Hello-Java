import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        //[1]
        Scanner teclado = new Scanner(System.in);
        String listNombres [] = new String[8];

        for (int i = 0; i < listNombres.length; i++) {
            System.out.println("Ingrese el nomombre: ");
            listNombres[i] = teclado.nextLine();
        }

        for (String nombres : listNombres){
            System.out.println("Nombre: "+nombres);
        }



        //[2]
        Scanner teclado = new Scanner(System.in);
        int[] listNumeros = new int[5];

        for (int i = 0; i < listNumeros.length; i++) {
            System.out.println("Ingrese el dato número ["+i+"] :");
            listNumeros[i] = teclado.nextInt();
        }

        int numMayor = listNumeros[0];
        int numMenor = listNumeros[0];

        for (int numero : listNumeros){
            if (numero > numMayor){
                numMayor = numero;
            }
            if (numero < numMenor) {
                numMenor = numero;
            }
        }


        System.out.println("El numero mayor es: "+ numMayor);
        System.out.println("El numero menor es: "+ numMenor);


        //[3]
        Scanner teclado = new Scanner(System.in);
        int contador = 0;

        int[] listNumeros = new int[5];

        for (int i = 0; i < listNumeros.length; i++) {
            System.out.println("Ingrese el dato número [" + i + "] :");
            listNumeros[i] = teclado.nextInt();
        }

        for (int numero : listNumeros){
            if (numero == 3){
                contador++;
            }
        }
        System.out.println("Se ingresaron "+contador+" veces el número 3.");

         */
        //[4]
        Scanner teclado = new Scanner(System.in);
        double sumSueldos = 0;
        double promedio;

        double[] listNumeros = new double[5];

        for (int i = 0; i < listNumeros.length; i++) {
            System.out.println("Ingrese su sueldo número [" + i + "] :");
            listNumeros[i] = teclado.nextDouble();
        }

        for (double numero : listNumeros){
            sumSueldos += numero;
        }

        promedio = sumSueldos / listNumeros.length;

        System.out.println("La suma total de tus sueldos es de: "+sumSueldos);
        System.out.println("El promedio de sueldo es de: "+ promedio);

    }
}