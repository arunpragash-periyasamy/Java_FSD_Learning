package Java_Features;
import java.util.function.Predicate;

public class PredicateChainingWithAnd {
	public static void main(String[] args) {
		Predicate<Integer> isAdult = age -> age >= 18;
		Predicate<Integer> notASeniorCitizen = age -> age < 60;
		Predicate<Integer> combinedPredicateForAge = isAdult.and(notASeniorCitizen);
        
		System.out.println(combinedPredicateForAge.test(25));
		System.out.println(combinedPredicateForAge.test(65));
	}
}
 
