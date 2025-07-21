import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*
        //Do while
        int contador = 0;

        do{
            contador +=1;
            System.out.println("Estoy en la vuelta numero: "+ contador);

        } while (contador < 10);


        //While
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese su edad: ");
        int edad = teclado.nextInt();

        while (edad > 18){
            System.out.println("¡usted pudo ingresar a esta pagina!");

            System.out.println("Ingrese su edad: ");
            edad = teclado.nextInt();
        };

        int contador = 0;

        while (contador < 5){
            System.out.println("Soy el numero: "+ contador);
            contador +=1;
        }

        //While con centinela
        Scanner teclado = new Scanner(System.in);
        boolean condicion = true;
        String respuesta;

        while (condicion){
            System.out.println("    ¡Bienvenidos a su factura mensual!");
            System.out.println("    ¿Desea volver a escuchar el mensaje?");
            System.out.println("[1] para volver a escuchar el mensaje");
            System.out.println("[2] para cancelar");

            respuesta = teclado.next();

            while (!respuesta.equals("1") && !respuesta.equals("2")){
                System.out.println("    Opcion incorrecta. vuelva a intentarlo...");
                System.out.println("[1] para volver a escuchar el mensaje");
                System.out.println("[2] para cancelar");

                respuesta = teclado.next();
            }


            if (respuesta.equals("2")){
                condicion = false;
            }

        };
       */
        //For
        for (int i=0; i<10; i++){
            System.out.println("Numero: "+ (i+1));
        }

    }
}