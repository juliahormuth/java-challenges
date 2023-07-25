package HackerRank.Java8.LambdaExpressions;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;

public class LambdaForEach {
    public static void main(String[] args) {
        List<Integer> myList = new ArrayList<>();
        myList.add(1);
        myList.add(2);
        myList.add(3);

        Consumer<Integer> method = (n) -> myList.set(myList.indexOf(n), n * 10 );
        myList.forEach( method );
    }
}
