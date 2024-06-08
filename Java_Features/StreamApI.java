package Java_Features;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

public class StreamApI {
    public static void main(String[] args) {
        // Stream API
        // Stream API is a set of classes and interfaces in Java SE 8 that allow processing of elements on a stream basis.
        // A stream is an ongoing process of extracting data from a source.
        // A stream is a sequence of elements on which some operations can be performed.
        // Stream API is a collection of interfaces and classes that operate on streams.
        // Stream API is a part of Java SE 8.
        // It is a part of Java standard library.
        // once the stream is consumed it will be closed, we cannot use once again
        // streams will not change the values in the original list.

        List<Integer> list = Arrays.asList(60, 61, 62, 63, 64, 65, 66, 67, 68, 69, 70, 71, 72, 73, 74, 75, 76, 77, 78,
                79, 80, 81, 82, 83, 84, 85, 86, 87, 88, 89, 90, 91, 92, 93, 94, 95, 96, 97, 98, 99, 100, 101, 102, 1, 2,
                3, 4, 5, 6, 7, 8, 9, 10, 11, 12, 13, 14, 15, 16, 17, 18, 19, 20, 21, 22, 23, 24, 144, 145, 146, 147,
                148, 149, 150, 151, 152, 153, 154, 155, 156, 157, 158, 159, 160, 25, 26, 27, 28, 29, 30, 31, 32, 33, 34,
                35, 36, 37, 38, 39, 40, 41, 42, 43, 44, 45, 46, 47, 48, 49, 50, 51, 52, 53, 54, 55, 56, 57, 58, 59, 103,
                104, 105, 106, 107, 108, 109, 110, 111, 112, 113, 114, 115, 116, 117, 118, 119, 120, 121, 122, 123, 124,
                125, 126, 127, 128, 129, 130, 131, 132, 133, 134, 135, 136, 137, 138, 139, 140, 141, 142, 143, 161, 162,
                163, 164, 165, 166, 167, 168, 169, 170, 171, 172, 173, 174, 175, 176, 177, 178, 179, 180, 181, 182, 183,
                184, 185, 186, 187, 188, 189, 190, 191, 192, 193, 194);
        
        System.out.println("\n\nSorted List in parallel stream");
                // This will not be the sorted list because it uses the multiple threads so it will use multiple threads to process.
                list.parallelStream().sorted().forEach(item -> System.out.print(item + " "));
                
                System.out.println("Sorted List in stream");
                list.stream().sorted().forEach(item -> System.out.print(item+" "));
            System.out.println("\n\nFilter List");
            // Complete the code below to print out only even numbers from list
            list.stream().filter(n -> (n & 1) == 0).forEach(num -> System.out.print(num+" "));
            
            System.out.println("\n\nMap List");
            // Complete the code below to print out only even numbers from list
            list.stream().map(n -> n*10000).forEach(num -> System.out.print(num+" "));
            
            System.out.println("\n\nReduce List");
                // Complete the code below to print out the result of adding all numbers in list
                double reduceResult = list.stream().reduce(0, (c, e) -> c + e);

                System.out.println(reduceResult);
                
    }
}
