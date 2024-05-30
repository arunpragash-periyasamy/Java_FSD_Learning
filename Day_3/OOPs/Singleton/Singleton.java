package Day_3.OOPs.Singleton;


public class Singleton {
    private static Singleton instance;
    
    private Singleton() {
        System.out.println("Singleton object is created only once. This constructor cannot be accessed outside this class because it is Private constructor.");
    }

    static Singleton getInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    void display() {
        System.out.println("This is a singleton class");
    }

}



// single ton class is used to create only one instance throughout the entire life cycle of an application. 

// It is used for database connection of an software. Or used to manage the log of an software. 