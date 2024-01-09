// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//https://medium.com/dev-genius/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

import java.util.List;
import java.util.Arrays;

//Given a list of integers, find out all the even numbers that exist in the list using Stream functions?
public class Main {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,15,8,49,25,98,32);
        list.stream()
                .filter(n->n%2==0)
                .forEach(x->System.out.print(" "+x));
        System.out.println();

        //Given a list of integers, find out all the numbers starting with 1 using Stream functions?
        List<Integer> myList = Arrays.asList(10,15,8,49,25,98,32);
            myList.stream()
                    .map(s -> s + "")
                    .filter(s -> s.startsWith("1"))
                    .forEach(y->System.out.print(" "+y));

    }
}
