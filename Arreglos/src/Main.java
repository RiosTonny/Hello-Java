import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //Vectores -> Arrays unidimencional

        int listNumeros [] = new int [5];

        listNumeros [0] = 4;
        listNumeros [1] = 0;
        listNumeros [2] = 1;
        listNumeros [3] = 2;
        listNumeros [4] = 3;
        /*
        for (int i=0; i<listNumeros.length; i++){
            System.out.println(listNumeros[i]);
        }

        for (int i : listNumeros) {
            System.out.println(i);
        }
        */
        //Carga por teclado
        Scanner teclado = new Scanner(System.in);

        int listEdad [] = new int [3];

        for (int i=0; i<listEdad.length; i++){
            System.out.println("Ingrese su edad numero: "+ (i + 1));
            listEdad[i] = teclado.nextInt();
        }

        System.out.println("Los valores ingresados fueron: ");
        for (int edades : listEdad){
            System.out.println(edades);
        }
    }
}