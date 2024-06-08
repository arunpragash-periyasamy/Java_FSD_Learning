package Java_Features;

@FunctionalInterface
public interface Predicate<T> {
    boolean test(T t);
}

// Predicate in java is a feature which is a functional interface which contains only one fucntion in the interface. 
// The function returns either true or false. So we can write a lambda function for the interface while initializing.
