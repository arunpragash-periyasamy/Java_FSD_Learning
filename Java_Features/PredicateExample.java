package Java_Features;


public class PredicateExample implements Predicate<Integer> {

    @Override
    public boolean test(Integer t) {
        // return true if age is greater than 18 for an adult
        return t >= 18;
    }

    public static void main(String[] args) {
        PredicateExample isAdult = new PredicateExample();
        // Is the person is an adult or not
        System.out.println(isAdult.test(16));
        System.out.println(isAdult.test(19));


        Predicate<Integer> predicate = n -> n >= 40000;
        int salary = 25000;
        if (predicate.test(salary)) {
            System.out.println("It is good salary " +salary);
        }
        salary = 50000;
        if (predicate.test(salary)) {
            System.out.println("It is good salary " + salary);
        }



    }
    
}
