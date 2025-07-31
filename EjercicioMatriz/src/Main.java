import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double[][] listNotas = new double[4][3];
        double[] listPromedios = new double[4];
        double sumaNotas;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < listNotas.length; i++) {
            System.out.println("Ingrese las notas del alumno nro: "+(i+1));
            sumaNotas = 0;

            for (int j = 0; j < listNotas[i].length; j++){
                System.out.println("Nota nro "+(j+1)+": ");
                listNotas[i][j] = teclado.nextDouble();
                sumaNotas += listNotas[i][j];
            }

            listPromedios[i] = sumaNotas/listNotas[i].length;
        }

        System.out.println("---NOTAS---");
        for (int i = 0; i < listNotas.length; i++) {
            System.out.println("Alumno nro ["+(i+1)+"]");

            for (double notas : listNotas[i]){
                System.out.println("Nota: "+notas);
            }
            System.out.println("Promedio: "+listPromedios[i]);

        }
    }
}