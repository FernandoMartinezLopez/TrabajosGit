import java.util.Scanner;
public class ActividadGIT{
public static void main (String [] args) {
    Scanner teclado = new Scanner(System.in);
    int numero, numero2, numero3;
    System.out.print("Dime un número: ");
    numero2 = teclado.nextInt();
    System.out.print("Dime otro número: ");
    numero3 = teclado.nextInt();
    System.out.print("Dime un número del 1 al 4: ");
    numero = teclado.nextInt();
    switch(numero) {
    case 1:
        System.out.println("La suma es: " + (numero2 + numero3));
        break;
    case 2:
        System.out.println("La resta es: " + (numero2 - numero3));
        break;
    case 3:
        System.out.println("La multiplicación es: " + (numero2 * numero3));
        break;
    case 4:
        System.out.println("La división es: " + (numero2 / numero3));
        break;
    default:
        System.out.println("Erro");
    }











    }
}
