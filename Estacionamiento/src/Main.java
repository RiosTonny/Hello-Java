import javax.swing.plaf.synth.SynthOptionPaneUI;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        double totalPagar = 0, descuento = 0, ingresoTotal = 0;
        int horasUsadas = 0, estacionamientoPorHora = 0, estacionamientoPorMedia = 0, estacionamientoPorCompleta = 0;
        boolean funcionando = true;

        //Precios
        int porHora= 3;
        int mediaJornada = porHora * 5;
        int jornadaCompleta = porHora * 10;

        Scanner teclado = new Scanner(System.in);

        while (funcionando){
            System.out.println("---GESTION DE ESTACIONAMIENTO---");

            System.out.println("Ingrese la patente del vehiculo: ");
            //"fin" para concelar

            String patente = teclado.nextLine();

            if (patente.equalsIgnoreCase("Fin")){
                System.out.println("[CERRANDO PROGRAMA]...");
                funcionando = false;

            } else {
                System.out.println("Ingrese el tipo de estacionamineto: ");
                System.out.println("[A]   POR HORA");
                System.out.println("[B]   MEDIA JORNADA");
                System.out.println("[C]   JORNADA COMPLETA");

                String tipoEstacionamiento = teclado.nextLine();

                if (tipoEstacionamiento.equalsIgnoreCase("a")) {
                    System.out.println("Ingrese la cantidad de horas usadas: ");
                    teclado = new Scanner(System.in);

                    horasUsadas = teclado.nextInt();
                    totalPagar = horasUsadas * porHora;

                    estacionamientoPorHora ++;
                    ingresoTotal += totalPagar;
                } else if (tipoEstacionamiento.equalsIgnoreCase("b")) {
                    descuento = mediaJornada * 0.05;
                    totalPagar = mediaJornada - descuento;

                    estacionamientoPorMedia ++;
                    ingresoTotal += totalPagar;
                } else if (tipoEstacionamiento.equalsIgnoreCase("c")) {
                    descuento = jornadaCompleta * 0.1;
                    totalPagar = jornadaCompleta - descuento;

                    estacionamientoPorCompleta ++;
                    ingresoTotal += totalPagar;
                } else {
                    System.out.println("[ERROR] El dato ingresado es incorrecto, vuelva a inentarlo...");

                    //funcionando = false;
                    //break;

                    totalPagar = 0;
                };

                System.out.println("Total a pagar: "+ totalPagar+"USD");

                teclado = new Scanner(System.in);
            };
        };

        System.out.println("---RESUMEN---");
        System.out.println("Estacionamientos por HORA:             "+ estacionamientoPorHora);
        System.out.println("Estacionamientos por MEDIA JORNADA:    "+ estacionamientoPorMedia);
        System.out.println("Estacionamientos por JORNADA COMPLETA: "+ estacionamientoPorCompleta);
        System.out.println("Ingreso total del dia: "+ ingresoTotal);

    }
}