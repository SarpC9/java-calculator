
import java.util.*;

/**
* The class for making simple calculations
*/
public class Calculator {

    public static void main(String args[]) {

      Scanner reader = new Scanner(System.in);

        System.out.print("Enter first number:");

        int sayi1= reader.nextInt();



        System.out.print("Enter second number:");

        int sayi2= reader.nextInt();



        System.out.print("Enter the calculation mark:");

        char islem = reader.next().charAt(0);

        float sayi3;



        if(islem=='*'){

            sayi3=sayi1*sayi2;

            System.out.print(sayi3);

        }

        if(islem=='-'){

            sayi3=sayi1-sayi2;

            System.out.print(sayi3);

        }

        if(islem=='+'){

            sayi3=sayi1+sayi2;

            System.out.print(sayi3);

        }

        if(islem=='/'){

            sayi3=(float)sayi1/sayi2;

            System.out.print(sayi3);
          }
        }
      }
