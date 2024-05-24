package Day_1.Conditional_Statements;

public class Main {
    public static void main(String[] args) {
        /*
         * Conditional
         * 
         * conditional statement means it is used to execute the statement if the condition is true otherwise it will not execute
         * 
         * there are two methods to achieve conditional statements
         * which are if-else and switch-case
         */

         int a = 10;
         if (a == 10) {
             System.out.println("a is equal to 10");
         }
         
         /*
          * It is a normal if condition which is check variable a is equal to 10 if yes then it print "a is equal to 10"
          */

         if (a == 20) {
             System.out.println("a is equal to 20");
         } else {
             System.out.println("a is not equal to 20");
         }
          
        /*
         * It is a if else statement it check the condition in the if statement if the condition satisfied it executes the statement inside the if block
         * suppose the condition is not satisfied it will executes the else block 
         */

        if (a < 10) {
            System.out.println("a is less than 10");
        } else if (a > 10) {
            System.out.println("a is greater than 10");
        } else {
            System.out.println("a is equal to 10");
        }
         
        /*
         * here i implement else-if which mean the if condition is checked, if it satisfies the condition it executes the statements inside if block.
         * suppose if condition is not satisfied then it check the second condition in the else if , it satisies the condition then it executes the statement inside the if-else block.
         * otherwise it will executes the else statement
         */

        switch (a) {
            case 1:
                System.out.println("a is equal to 1");
                break;
            case 2:
                System.out.println("a is equal to 2");
                break;
            case 10:
                System.out.println("a is equal to 10");
                break;
            default:
                System.out.println("No case is satisfied");
        }
         
        /*
                 * switch-case is used to check the value of a variable and execute the statement according to the value of a.
                 * it has default case if no case is satisfied then it executes.
                 * in the switch-case we don't have block scope so we have to mention break; to stop at a particular statement
                 * otherwise it will executed sequencially below conditions without checking the case.
                 */
    }
}
