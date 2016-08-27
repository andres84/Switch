package pkgswitch;

import java.util.Scanner;

public class Switch {

    public static void main(String... andres) {

        Scanner sc = new Scanner(System.in);
        String resultado = sc.next();

        switch (resultado) {

            case "andres":
                System.out.println("Hola andres");
                break;

            case "fragozo":
                System.out.println("Hola fragozo");
                break;

            default:
                System.out.println("Hola por default");
                break;

        }
        
        System.out.println("Fin switch");

    }

}
