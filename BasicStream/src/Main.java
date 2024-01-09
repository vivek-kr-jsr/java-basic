// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//https://medium.com/dev-genius/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

import java.util.HashSet;
import java.util.List;
import java.util.Arrays;
import java.util.Set;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
                .filter(n->n%2==0)
                .forEach(x->System.out.print(" "+x));
        System.out.println();
        //Output:
        //10, 8, 98, 32

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                    .map(s -> s + "")
                    .filter(s -> s.startsWith("1"))
                    .forEach(y->System.out.print(" "+y));
        //Output:
        //10, 15

        System.out.println();
        //How to find duplicate elements in a given integers list in java using Stream functions?
        List<Integer> myList1 = Arrays.asList(10,15,8,49,25,98,98,32,15);
        Set<Integer> set = new HashSet<>();


        myList1.stream().filter(n-> !set.add(n)).forEach(y->System.out.print(" "+y));

        System.out.println();

        //Given the list of integers, find the first element of the list using Stream functions?

        myList1.stream().limit(1).forEach(System.out::println);
        //Output:
        //10

        //Given a list of integers, find the total number of elements present in the list using Stream functions?
        System.out.println(myList1.stream().count());

        //Given a list of integers, find the maximum value element present in it using Stream functions?
        myList1.stream().max((x,y)->Integer.compare(x,y)).ifPresent(maxVal->System.out.println("Maximum value: "+ maxVal));

    }
}
