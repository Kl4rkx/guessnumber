import java.util.*;
import java.lang.Math;

public class hola {
    private static Random random = new Random();
    private static Scanner input = new Scanner(System.in);

    public static void main(String[] args) {
        int aleatorio;

        aleatorio = random.nextInt(99) + 1;
        int contador;

        contador = 1;
        int numero;

        numero = 0;
        System.out.println("Debes adivinar el número aleatorio entre 0 y 100.");
        numero = input.nextInt();
        if (numero == aleatorio) {
            System.out.println("Correcto, el número aleatorio es " + aleatorio + " y has acertado a la primera");
        } else {
            while (aleatorio != numero) {
                if (numero > aleatorio) {
                    System.out.println("El número " + numero + " es mayor que aleatorio");
                } else {
                    System.out.println("El número " + numero + " es menor que aleatorio");
                }
                contador = contador + 1;
                numero = input.nextInt();
            }
            System.out.println("Correcto, el número aleatorio es " + aleatorio + " y lo has intentado " + contador + " veces.");
        }
    }
}
