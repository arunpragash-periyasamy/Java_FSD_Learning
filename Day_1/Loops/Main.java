package Day_1.Loops;

public class Main {
    public static void main(String[] args) {
        // Loops are used to execute a set of instruction to a specific period
        // There are three loops are there -> for, while, do while

        //for loop
        for (int i = 0; i < 10; i++) {
            System.out.println(i);
        }

        /*
         * for loop has three things to execute
         * first one is initial statement which is executed only once before entering into the loop
         * so i have used the initial statement to initialize a value 0 to varibale i.
         * 
         * second one is conditional statement which is executed each iteration to check the condition is true or false.
         * If the condition is true the loop continues else exit from the loop.
         * 
         * third statement is a statement which is executed end of each iteration.
         */

         

        //while loop
        int j = 1;
        while (j < 5) {
            System.out.println(j);
            j++;
        }
         
        /*
         * While loop has single condition to check the condition is true or false
         * if the condition is true then it continues else exit from the iteration.
         * This loop will check the condition first then only iterate it
         */

        int k = 4;
         do{
             System.out.println(k);
             k++;
         } while (k < 3);

        /*
         * The do while loop is used to execute the statements once even the conditon is false. 
         * Here I have initialized the k as 4. 
         * Then I have an do while loop.
         * It executes the statement then it check the condition inside the while statement.
         */
    }
}
