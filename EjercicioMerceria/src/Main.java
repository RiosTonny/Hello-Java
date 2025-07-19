import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        int cantProductos, costoEnvios;
        double precioTotal, promocion, compraMin, compraMax, precioFinal;
        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese la cantidad de productos a comprar: ");
        cantProductos = teclado.nextInt();
        /*
        if (cantProductos < 5){
            System.out.println("¡La compra minima es de 5 productos!");
        } else if (cantProductos <= 15) {

            System.out.println("El costo de envio es de $10 USD");

        } else {
            System.out.println("El costo de envio es de GRATIS");
        } */

        if (cantProductos < 5){
            System.out.println("¡La compra minima es de 5 productos!");
        } else {

            System.out.println("Ingrese el precio total: ");
            teclado = new Scanner(System.in);
            precioTotal = teclado.nextDouble();

            compraMin = 100;
            compraMax = 300;

            costoEnvios = (cantProductos >=5 && cantProductos <= 15) ? 10 : 0;

            /*if (cantProductos <= 15){
                System.out.println("El costo de envio es de $10 USD");
            } else {
                System.out.println("El costo de envio es de GRATIS");
            } */
            precioTotal += costoEnvios;
            System.out.println("--- FACTURACION ---");
            System.out.println("Costo de envio: "+ costoEnvios);
            System.out.println("Precio Total: "+ precioTotal);

            if (precioTotal < compraMin){
                double resto = compraMin - precioTotal;
                System.out.println("Descuento: faltan "+ resto + "$ para obtener un descuento del 5%");
                precioFinal = precioTotal;
                //System.out.println("Precio final a pagar: "+ precioFinal);
            } else {
                promocion = (precioTotal < compraMax) ? 5 : 10;
                System.out.println("Descuento:"+ promocion+"%");
                precioFinal = precioTotal - (precioTotal * (promocion / 100));
                //System.out.println("Precio final a pagar: "+ precioFinal);
            }

            System.out.println("Precio final a pagar: "+ precioFinal);

        }







    }
}