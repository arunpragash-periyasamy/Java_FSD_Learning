package Java_Features;

import java.util.function.Predicate;

// Predicate from the java util package.
public class PredicateExample2 {
    public static void main(String[] args) {
        Predicate<Integer> isAdult = n -> n >= 18;
        Predicate<Integer> notASeniorCitizen = n -> n < 60;
        Predicate<Integer> middleAgePerson = isAdult.and(notASeniorCitizen);
        Predicate<Integer> adultOrSeniorCitizen = isAdult.or(notASeniorCitizen);
        System.out.println(middleAgePerson.test(25));
        System.out.println(middleAgePerson.test(65));
        System.out.println(middleAgePerson.test(16));
        System.out.println("Senior citizen");
        System.out.println(adultOrSeniorCitizen.test(19));
        System.out.println(adultOrSeniorCitizen.test(75));
        System.out.println(adultOrSeniorCitizen.test(18));
    }
}
