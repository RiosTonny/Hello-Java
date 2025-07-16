import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        /*int num1, num2, suma;

        Scanner teclado = new Scanner(System.in);

        System.out.println("Ingrese un número a sumar: ");
        num1 = teclado.nextInt();
        System.out.println("Ingrese otro número a sumar: ");
        num2 = teclado.nextInt();

        suma = num1 + num2;
        System.out.println("La suma total es: "+ suma);

        // Ingreso de String por teclado
        String nombre;

        System.out.println("Ingrese su nombre: ");
        Scanner ingresarNombre = new Scanner(System.in);

        nombre = ingresarNombre.next();
        System.out.println("El nombre ingresado es: "+nombre);



        // Pedile al usuario que ingrese el precio de un producto y el porcentaje de descuento. Calculá el precio final con descuento y mostralo.

        double precioProducto, pocentajeDescuento, precioFinal;

        Scanner ingresarNumero = new Scanner(System.in);

        System.out.println("Ingrese el precio del producto: ");
        precioProducto = ingresarNumero.nextDouble();

        System.out.println("Ingrese el descuento: ");
        pocentajeDescuento = ingresarNumero.nextDouble();

        precioFinal = precioProducto - ((pocentajeDescuento / 100) * precioProducto) ;

        System.out.println("El precio final es $"+ precioFinal);

         */
        // Un grupo de chicos tiene un número total de golosinas. Cada uno debe recibir la misma cantidad, y las que sobren serán guardadas para después.

        int totalGolosinas, cantChicos, cantSobran, repartirGolosinas;

        Scanner ingrsarNum = new Scanner(System.in);

        System.out.println("Ingresar la cantidad de golosinas: ");
        totalGolosinas = ingrsarNum.nextInt();

        System.out.println("Ingrese la cantidadde chicos: ");
        cantChicos = ingrsarNum.nextInt();

        repartirGolosinas = totalGolosinas / cantChicos;
        cantSobran = totalGolosinas % repartirGolosinas;

        System.out.println("Hay "+ totalGolosinas+ " golosinas en total");
        System.out.println("Hay "+ cantChicos+ " chicos en total");
        System.out.println("Cada uno recibe "+ repartirGolosinas+ " golosinas");
        System.out.println("Sobran "+ cantSobran+ " golosinas");

    }
}