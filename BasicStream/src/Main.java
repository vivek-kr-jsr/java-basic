// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
//https://medium.com/dev-genius/java-8-coding-and-programming-interview-questions-and-answers-62512c44f062

import java.util.*;

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
        myList1.stream().max(Comparator.comparingInt(x -> x)).ifPresent(maxVal->System.out.println("Maximum value: "+ maxVal));

        //Output:
        //Maximum value: 98

        //Given a String, find the first non-repeated character in it using Stream functions?

        String input = "Java articles are Awesome";

        Map<Character,Long> charCount = input.chars()
                .mapToObj(c->(char) c).collect(
                        LinkedHashMap::new, (map,c) -> map.merge(c,1L,Long::sum),
                        LinkedHashMap::putAll
                );
        Optional<Character> firstNonRepeat = charCount
                .entrySet()
                .stream().filter(enrty->enrty.getValue() == 1)
                .map(Map.Entry::getKey)
                .findFirst();
        if (firstNonRepeat.isPresent()) {
            System.out.println("First non-repeated character: " + firstNonRepeat.get());
        } else {
            System.out.println("No non-repeated characters found.");
        }
        //Output: First non-repeated character: J

        //Given a String, find the first repeated character in it using Stream functions?

        Optional<Character> firstRepeat = charCount
                .entrySet()
                .stream().filter(enrty->enrty.getValue() > 1)
                .map(Map.Entry::getKey)
                .findFirst();
        if (firstNonRepeat.isPresent()) {
            System.out.println("First non-repeated character: " + firstRepeat.get());
        } else {
            System.out.println("No non-repeated characters found.");
        }

        //Output: First non-repeated character: a
    }
}
