/**
 * Created by Alumnos on 12/10/2017.
 */
import java.util.*;
import java.io.File;
import java.io.FileNotFoundException;
public class EjemploExcepciones {
    public static void main(String[] args) throws FileNotFoundException
    {   try {
        File archivo= new File("entrada.txt");
        Scanner teclado = new Scanner(System.in);
        System.out.println("Dame el primer numero:");
        int num = teclado.nextInt();
        System.out.println("Dame el 2o numero:");
        int num2 = teclado.nextInt();
        System.out.println("La division es :" + num / num2);
    }
    catch(ArithmeticException excepcionAritmetica)
    {
        System.out.println("Division por 0");
    }
    catch(InputMismatchException mismatchexcepcion)
    {
        System.out.println("entrada incorrecta");
    }
    /*catch(FileNotFoundException e)
    {
        System.out.println("no existe el archivo");
    }*/
    }
}
