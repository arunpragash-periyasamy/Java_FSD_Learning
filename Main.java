import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        /*
         * In java there are two types of datatypes
         * Primitive and Non-Primitive data types.
         *  
         * 
         */

        //  Primitive data types

        int number = 200;
        System.out.println("int : " + number);
        /*
         * interger can store the values from -2147483648 to 2147483647
         * integer is a 32 bit signed value.
         * integer is not 
         */

        float marks = 80.6f;
        System.out.println("float : "+marks);
        /*
         * float can store the decimal values 1.4E-45 to 3.4028235E38
         * which is ended with charcter 'f' to represent the number is float
         * after a decimal it can store 6-7 digits.
         */

        long mobileNumber = 6382868122l;
        System.out.println("long : "+mobileNumber);
         /*
          * long can store the from -9,223,372,036,854,775,808 to 9,223,372,036,854,775,807
          * which is ended with charcter 'l' to represent the number is long
          * long does not supports decimal values.
          */

         double something = 3988922d;
         System.out.println("double : " + something);
        /*
         * double can store the     
         * double is ended with charcter 'd' to represent the number is double
         * double supports both decimal numbers and non decimal numbers
         * double can store 16 digits after decimal points.
         */

        char grade = 'A';
         System.out.println("char : " + grade);
         /*
         * char is datatype which store a single character.
         * char is wrapped inside a single quote.
         */
         //  Non-Primitives
         
         String name = "Arunpragash";
         System.out.println("String : " + name);
         /*
          * String is a datatype which can store the sequence of characters. 
          * Strings are wrapped in the double quotes.
          * String is an Object
          */

         //Arrays
          int[] numbers = {1,2,3,4,5,6,7,8,9,10};
          System.out.println("Array : " + numbers);
          /*
           * Array is a datatype which can store the sequence of values.
           * Arrays are wrapped in the curly braces.
           * Array can be initialized in many ways.
           * Array is an Object
           * Array can store only one datatype.
           * Arrays cannot print the values directly it prints the hash value.
           * */

          String[] names = new String[3];
          names[0] = "Arun";
          names[1] = "Pragash";
          names[2] = "A P";
          System.out.println("Array Value : " + Arrays.toString(names));
           
        /*
         * To print the values of an array we have toString method in the Arrays class. 
         * To use that first we need to import the class 'import java.util.Arrays' which is inside the util package
         */
        
    }

}
