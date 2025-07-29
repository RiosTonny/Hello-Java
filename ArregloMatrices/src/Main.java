import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int matriz [][] = new int[3][2];

        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < matriz.length; i++) {

            for (int j = 0; j < matriz[0].length; j++) {
                System.out.println("Agrega un número en la fila ["+(i+1)+"] y columna ["+(j+1)+"]");
                matriz[i][j] = teclado.nextInt();
            };

        }

        System.out.println("---Matriz---");
        //mi variavle fila, va a representar un arreglo de enteros
        for (int[] fila : matriz){
            for (int columma : fila){
                System.out.print(columma);
            }
            System.out.println();
        }
    }
}