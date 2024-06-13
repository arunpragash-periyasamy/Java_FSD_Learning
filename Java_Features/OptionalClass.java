package Java_Features;

import java.util.Optional;
public class OptionalClass {
    String name;
    String name1;

    public static void main(String[] args) {
        OptionalClass optionalClass = new OptionalClass();
        optionalClass.name = "Arunpragash";
        Optional<String> name = Optional.ofNullable(optionalClass.name);
        Optional<String> name1 = Optional.ofNullable(optionalClass.name1);
        if (name.isPresent()) {
            // isPresent method will return true if object is present.
            // if object is null then is present will return false;
            System.out.println(optionalClass.name.charAt(0));
        } else {
            System.out.println("name Object is null");
        }
        if (name1.isPresent()) {
            // isPresent method will return true if object is present.
            // if object is null then is present will return false;
            System.out.println(optionalClass.name.charAt(0));
        } else {
            System.out.println("name 1 Object is null");
        }

        // ifPresent method will execute only the object is not null
        name.ifPresent(n -> {
            System.out.println(n);
        });

        // this will not execute, because it is null
        name1.ifPresent(n -> {
            System.out.println(n);
        });

        Optional<String> fname = Optional.of("Arunpragash");
        Optional<String> lname = Optional.empty();

        // orElse method set new object if the object is null.
        String other = fname.orElse("A P");
        System.out.print(other + " ");
        other = lname.orElse("A P");
        System.out.println(other);


        // if suppose the value is null then it will be taken from some other function or use lambda function to get the value or use scanner to get the input from the user.
        other = lname.orElseGet(() -> getValue());
    }
    
    static String getValue() {
        return "Getting New Value";
    }
}