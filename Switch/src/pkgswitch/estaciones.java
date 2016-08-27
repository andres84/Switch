package pkgswitch;

import java.util.Scanner;

/*

al ingresar un numero entre 1 y 4 devolver la estacion del año de acuerdo a la siguiente tabla:

numero  estacion
1       verano
2       otoño
3       invierno
4       primavera

 */
public class estaciones {

    public static void main(String... andres) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Digite de 1 a 4 la estacion del año");
        int est = sc.nextInt();

        switch (est) {

            case 1:
                System.out.println("verano");
                break;

            case 2:
                System.out.println("otoño");
                break;

            case 3:
                System.out.println("invierno");
                break;

            case 4:
                System.out.println("primavera");
                break;

            default:
                System.out.println("no escogio ninguna opcion de 1 a 4");
                break;

        }
        
        System.out.println("Fin del programa");

    }

}
