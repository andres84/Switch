package pkgswitch;

import java.util.Scanner;

/*

dados dos numeros enteros y un operador +, -, *, /, devolver la operacion de los numeros
segun el operador ingresado, tenga encuenta que si el segundo numero es 0 y el operador es division
arrojar error matematico

 */
public class calculadoraSimple {

    public static void main(String... andres) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Calculadora Simple");
        System.out.println("1. suma");
        System.out.println("2. resta");
        System.out.println("3. multiplicacion");
        System.out.println("4. division");
        System.out.println("Escoja una opcion");
        int opc = sc.nextInt();

        switch (opc) {

            case 1:

                System.out.println("Digite el primer numero");
                int num1s = sc.nextInt();
                System.out.println("Digite el segundo numero");
                int num2s = sc.nextInt();

                int suma = num1s + num2s;

                System.out.println("La suma es " + suma);

                break;

            case 2:

                System.out.println("Digite el primer numero");
                int num1r = sc.nextInt();
                System.out.println("Digite el segundo numero");
                int num2r = sc.nextInt();

                int resta = num1r - num2r;

                System.out.println("La resta es " + resta);

                break;
                
            case 3:
                
                
                System.out.println("Digite el primer numero");
                int num1m = sc.nextInt();
                System.out.println("Digite el segundo numero");
                int num2m = sc.nextInt();
                
                int mult = num1m * num2m;
                
                System.out.println("La multiplicacion es " + mult);
                
                break;
                
            case 4:
                
                
                System.out.println("Digite el primer numero");
                int num1d = sc.nextInt();
                System.out.println("Digite el segundo numero");
                int num2d = sc.nextInt();
                
                if(num2d == 0){
                    
                    System.out.println("Error matematico no se puede dividir por cero");
                }else{
                    
                    int div = num1d / num2d;
                    System.out.println("La division es " + div);
                    
                }
                
                break;
                
                default:
                    
                    System.out.println("Error!!!, debe escojer un numero que se encuentre dentro del menu");

        }
        
        System.out.println("Fin de la operacion");

    }

}
